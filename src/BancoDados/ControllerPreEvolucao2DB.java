package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelPreEvolucao2;

public class ControllerPreEvolucao2DB extends ControllerDBPadrao {

    public ModelPreEvolucao2 getPreEvolucao2(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelPreEvolucao2 pe2BancoDados = new ModelPreEvolucao2();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " pe2id, "
                    + " pe2stanome, "
                    + " pe2staatk, "
                    + " pe2stadef, "
                    + " pe2stasta"
                    + " from tbpreevolucao2 "
                    + " where pe2id = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("pe2id");
                String nomeBancoDados = rs.getString("pe2stanome");
                String atkBancoDados = rs.getString("pe2staatk");
                String defBancoDados = rs.getString("pe2stadef");
                String staBancoDados = rs.getString("pe2stasta");
                // Setar no modelo
                pe2BancoDados.setId(idBancoDados);
                pe2BancoDados.setNome(nomeBancoDados);
                pe2BancoDados.setAtk(atkBancoDados);
                pe2BancoDados.setDef(defBancoDados);
                pe2BancoDados.setSta(staBancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return pe2BancoDados;
    }

    public boolean gravarAlteracao(ModelPreEvolucao2 pe2) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbpreevolucao2 set "
                    + " pe2id = ?, "
                    + " pe2stanome = ?, "
                    + " pe2staatk = ?, "
                    + " pe2stadef = ?, "
                    + " pe2stasta = ?, "
                    + " where pe2id = ?");
            pstmt.setInt(1, pe2.getId());
            pstmt.setString(2, pe2.getNome());
            pstmt.setString(3, pe2.getAtk());
            pstmt.setString(4, pe2.getDef());
            pstmt.setString(5, pe2.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    public boolean gravarInsercao(ModelPreEvolucao2 pe2) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbpreevolucao2 ("
                    + " pe2id, "
                    + " pe2stanome, "
                    + " pe2staatk, "
                    + " pe2stadef, "
                    + " pe2stasta"
                    + ") values("
                    + " ?, ?, ?, ?"
                    + ")");
            pstmt.setInt(1, pe2.getId());
            pstmt.setString(2, pe2.getNome());
            pstmt.setString(3, pe2.getAtk());
            pstmt.setString(4, pe2.getDef());
            pstmt.setString(5, pe2.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    private static final String sqlTodos = "select * from public.tbpreevolucao2 order by pe2id";

    public ArrayList<ModelPreEvolucao2> getTodos() {
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
                int id = rs.getInt("pe2id");

                // Pega valores String(texto)
                String nome = rs.getString("pe2stanome");
                String atk = rs.getString("pe2staatk");
                String def = rs.getString("pe2stadef");
                String sta = rs.getString("pe2stasta");

                ModelPreEvolucao2 pe2 = new ModelPreEvolucao2(id, nome, atk, def, sta);

                listaDados.add(pe2);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }
}
