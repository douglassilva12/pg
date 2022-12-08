package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelPreEvolucao1;

public class ControllerPreEvolucao1DB extends ControllerDBPadrao {
    
    public ModelPreEvolucao1 getPreEvolucao1(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelPreEvolucao1 pe1BancoDados = new ModelPreEvolucao1();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " pe1id, "
                    + " pe1stanome, "
                    + " pe1staatk, "
                    + " pe1stadef, "
                    + " pe1stasta"
                    + " from tbpreevolucao1 "
                    + " where pe1id = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("pe1id");
                String nomeBancoDados = rs.getString("pe1stanome");
                String atkBancoDados = rs.getString("pe1staatk");
                String defBancoDados = rs.getString("pe1stadef");
                String staBancoDados = rs.getString("pe1stasta");
                // Setar no modelo
                pe1BancoDados.setId(idBancoDados);
                pe1BancoDados.setNome(nomeBancoDados);
                pe1BancoDados.setAtk(atkBancoDados);
                pe1BancoDados.setDef(defBancoDados);
                pe1BancoDados.setSta(staBancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return pe1BancoDados;
    }
    
    public boolean gravarAlteracao(ModelPreEvolucao1 pe1) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbpreevolucao1 set "
                    + " pe1id = ?, "
                    + " pe1stanome = ?, "
                    + " pe1staatk = ?, "
                    + " pe1stadef = ?, "
                    + " pe1stasta = ?, "
                    + " where pe1id = ?");
            pstmt.setInt(1, pe1.getId());
            pstmt.setString(2, pe1.getNome());
            pstmt.setString(3, pe1.getAtk());
            pstmt.setString(4, pe1.getDef());
            pstmt.setString(5, pe1.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }
    
    public boolean gravarInsercao(ModelPreEvolucao1 pe1) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbpreevolucao1 ("
                    + " pe1id, "
                    + " pe1stanome, "
                    + " pe1staatk, "
                    + " pe1stadef, "
                    + " pe1stasta"
                    + ") values("
                    + " ?, ?, ?, ?"
                    + ")");
            pstmt.setInt(1, pe1.getId());
            pstmt.setString(2, pe1.getNome());
            pstmt.setString(3, pe1.getAtk());
            pstmt.setString(4, pe1.getDef());
            pstmt.setString(5, pe1.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }
    
    private static final String sqlTodos = "select * from public.tbpreevolucao1 order by pe1id";
    
    public ArrayList<ModelPreEvolucao1> getTodos() {
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
                int id = rs.getInt("pe1id");

                // Pega valores String(texto)
                String nome = rs.getString("pe1stanome");
                String atk = rs.getString("pe1staatk");
                String def = rs.getString("pe1stadef");
                String sta = rs.getString("pe1stasta");
                
                ModelPreEvolucao1 pe1 = new ModelPreEvolucao1(id, nome, atk, def, sta);
                
                listaDados.add(pe1);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }
}
