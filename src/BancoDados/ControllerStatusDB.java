package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelStatus;

public class ControllerStatusDB extends ControllerDBPadrao {

    public ModelStatus getStatus(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelStatus statusBancoDados = new ModelStatus();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " staid, "
                    + " stanumero, "
                    + " stanome, "
                    + " statipo1, "
                    + " statipo2, "
                    + " staataque, "
                    + " stadefesa, "
                    + " stastamina"
                    + " from tbstatus "
                    + " where staid = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("staid");
                String numeroBancoDados = rs.getString("stanumero");
                String nomeBancoDados = rs.getString("stanome");
                String tipo1BancoDados = rs.getString("statipo1");
                String tipo2BancoDados = rs.getString("statipo2");
                String atkBancoDados = rs.getString("staataque");
                String defBancoDados = rs.getString("stadefesa");
                String staBancoDados = rs.getString("stastamina");
                // Setar no modelo
                statusBancoDados.setId(idBancoDados);
                statusBancoDados.setNumero(numeroBancoDados);
                statusBancoDados.setNome(nomeBancoDados);
                statusBancoDados.setTipo1(tipo1BancoDados);
                statusBancoDados.setTipo2(tipo2BancoDados);
                statusBancoDados.setAtk(atkBancoDados);
                statusBancoDados.setDef(defBancoDados);
                statusBancoDados.setSta(staBancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return statusBancoDados;
    }

    public boolean gravarAlteracao(ModelStatus status) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbstatus set "
                    + " staid = ?, "
                    + " stanumero = ?, "
                    + " stanome = ?, "
                    + " statipo1 = ?, "
                    + " statipo2 = ?, "
                    + " staataque = ?, "
                    + " stadefesa = ?, "
                    + " stastamina = ?, "
                    + " where staid = ?");
            pstmt.setInt(1, status.getId());
            pstmt.setString(2, status.getNumero());
            pstmt.setString(3, status.getNome());
            pstmt.setString(4, status.getTipo1());
            pstmt.setString(5, status.getTipo2());
            pstmt.setString(6, status.getAtk());
            pstmt.setString(7, status.getDef());
            pstmt.setString(8, status.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    public boolean gravarInsercao(ModelStatus status) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbstatus ("
                    + " staid, "
                    + " stanumero, "
                    + " stanome, "
                    + " statipo1, "
                    + " statipo2, "
                    + " staataque, "
                    + " stadefesa, "
                    + " stastamina"
                    + ") values("
                    + " ?, ?, ?, ?, "
                    + " ?, ?, ?, ?"
                    + ")");
            pstmt.setInt(1, status.getId());
            pstmt.setString(2, status.getNumero());
            pstmt.setString(3, status.getNome());
            pstmt.setString(4, status.getTipo1());
            pstmt.setString(5, status.getTipo2());
            pstmt.setString(6, status.getAtk());
            pstmt.setString(7, status.getDef());
            pstmt.setString(8, status.getSta());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    private static final String sqlTodos = "select * from public.tbstatus order by staid";

    public ArrayList<ModelStatus> getTodos() {
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
                int id = rs.getInt("staid");

                // Pega valores String(texto)
                String numero = rs.getString("stanumero");
                String nome = rs.getString("stanome");
                String tipo1 = rs.getString("statipo1");
                String tipo2 = rs.getString("statipo2");
                String atk = rs.getString("staataque");
                String def = rs.getString("stadefesa");
                String sta = rs.getString("stastamina");

                ModelStatus status = new ModelStatus(id, numero, nome, tipo1, tipo2, atk, def, sta);

                listaDados.add(status);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }

    public ArrayList<ModelStatus> getNumero(String numeroPokemon) {
        String sqlNumero = "select * from public.tbstatus where stanumero ilike '" + numeroPokemon + "' order by staid";
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
                int id = rs.getInt("staid");

                // Pega valores String(texto)
                String numero = rs.getString("stanumero");
                String nome = rs.getString("stanome");
                String tipo1 = rs.getString("statipo1");
                String tipo2 = rs.getString("statipo2");
                String atk = rs.getString("staataque");
                String def = rs.getString("stadefesa");
                String sta = rs.getString("stastamina");

                ModelStatus status = new ModelStatus(id, numero, nome, tipo1, tipo2, atk, def, sta);

                listaDados.add(status);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }
}
