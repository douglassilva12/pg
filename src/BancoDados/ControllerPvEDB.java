package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ModelPvE;

public class ControllerPvEDB extends ControllerDBPadrao {

    public ModelPvE getPvE(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelPvE pveBancoDados = new ModelPvE();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " pveid, "
                    + " pvepc1, "
                    + " pveps1"
                    + " from tbpve "
                    + " where pveid = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("pveid");
                String pc1BancoDados = rs.getString("pvepc1");
                String ps1BancoDados = rs.getString("pveps1");
                // Setar no modelo
                pveBancoDados.setId(idBancoDados);
                pveBancoDados.setPc1(pc1BancoDados);
                pveBancoDados.setPs1(ps1BancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return pveBancoDados;
    }

    public boolean gravarAlteracao(ModelPvE pve) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbpve set "
                    + " pveid = ?, "
                    + " pvepc1 = ?, "
                    + " pveps1 = ?, "
                    + " where pveid = ?");
            pstmt.setInt(1, pve.getId());
            pstmt.setString(2, pve.getPc1());
            pstmt.setString(12, pve.getPs1());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    public boolean gravarInsercao(ModelPvE pve) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbpve ("
                    + " pvepc1, "
                    + " pveps1"
                    + ") values("
                    + " ?, ?"
                    + ")");
            pstmt.setInt(1, pve.getId());
            pstmt.setString(2, pve.getPc1());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }    
}
