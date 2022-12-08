package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCpm;

public class ControllerCpmDB extends ControllerDBPadrao {

    public ModelCpm getCpm(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelCpm cpmBancoDados = new ModelCpm();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " cpmid, "
                    + " cpmmultiplicar"
                    + " from tbcpm "
                    + " where cpmid = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("cpmid");
                String multiplicarBancoDados = rs.getString("cpmmultiplicar");
                // Setar no modelo
                cpmBancoDados.setId(idBancoDados);
                cpmBancoDados.setMultiplicar(multiplicarBancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return cpmBancoDados;
    }

    public boolean gravarAlteracao(ModelCpm cpm) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbcpm set "
                    + " cpmid = ?, "
                    + " cpmmultiplicar = ?, "
                    + " where cpmid = ?");
            pstmt.setInt(1, cpm.getId());
            pstmt.setString(2, cpm.getMultiplicar());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    public boolean gravarInsercao(ModelCpm cpm) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbcpm ("
                    + " cpmid, "
                    + " cpmmultiplicar"
                    + ") values("
                    + " ?, ?"
                    + ")");
            pstmt.setInt(1, cpm.getId());
            pstmt.setString(2, cpm.getMultiplicar());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    private static final String sqlTodos = "select * from public.tbcpm order by cpmid";

    public ArrayList<ModelCpm> getTodos() {
        ArrayList listaDados = new ArrayList();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);

            while (rs.next()) {
                // Pega valor inteiro
                int id = rs.getInt("cpmid");

                // Pega valores String(texto)
                String multiplicar = rs.getString("cpmmultiplicar");

                ModelCpm cpm = new ModelCpm(id, multiplicar);

                listaDados.add(cpm);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }

    public ArrayList<ModelCpm> getMulti(String todosCpm) {
        String sqlNumero = "select cpmmultiplicar,cpmid from public.tbcpm where cpmid < '" + todosCpm + "' order by cpmid";
        ArrayList listaDados = new ArrayList();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlNumero);

            while (rs.next()) {
                // Pega valor inteiro
                int id = rs.getInt("cpmid");

                // Pega valores String(texto)
                String multiplicar = rs.getString("cpmmultiplicar");

                ModelCpm cpm = new ModelCpm(id, multiplicar);

                listaDados.add(cpm);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getMulti():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }
}
