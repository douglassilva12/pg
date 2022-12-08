package BancoDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelPvP500Status;

public class ControllerPvP500StatusDB extends ControllerDBPadrao {

    public ModelPvP500Status getPvP(int id) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ModelPvP500Status pvpBancoDados = new ModelPvP500Status();
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(
                    "select "
                    + " pvpid, " + " pvpnumero, " + " pvpnome, " + " pvptipo1, " + " pvptipo2, "
                    + " pvprank1, " + " pvpindatk1, " + " pvpinddef1, " + " pvpindsta1, " + " pvplevel1, "
                    + " pvprank2, " + " pvpindatk2, " + " pvpinddef2, " + " pvpindsta2, " + " pvplevel2, "
                    + " pvprank3, " + " pvpindatk3, " + " pvpinddef3, " + " pvpindsta3, " + " pvplevel3, "
                    + " pvprank4, " + " pvpindatk4, " + " pvpinddef4, " + " pvpindsta4, " + " pvplevel4, "
                    + " pvprank5, " + " pvpindatk5, " + " pvpinddef5, " + " pvpindsta5, " + " pvplevel5, "
                    + " pvprank6, " + " pvpindatk6, " + " pvpinddef6, " + " pvpindsta6, " + " pvplevel6, "
                    + " pvprank7, " + " pvpindatk7, " + " pvpinddef7, " + " pvpindsta7, " + " pvplevel7, "
                    + " pvprank8, " + " pvpindatk8, " + " pvpinddef8, " + " pvpindsta8, " + " pvplevel8, "
                    + " pvprank9, " + " pvpindatk9, " + " pvpinddef9, " + " pvpindsta9, " + " pvplevel9, "
                    + " pvprank10, " + " pvpindatk10, " + " pvpinddef10, " + " pvpindsta10, " + " pvplevel10"
                    + " from tbpvp500status "
                    + " where pvpid = " + id);
            if (rs.next()) {
                // Pega valor inteiro
                int idBancoDados = rs.getInt("pvpid");
                String numeroBancoDados = rs.getString("pvpnumero");
                String nomeBancoDados = rs.getString("pvpnome");
                String tipo1BancoDados = rs.getString("pvptipo1");
                String tipo2BancoDados = rs.getString("pvptipo2");
                String rank1BancoDados = rs.getString("pvprank1"); String indAtk1BancoDados = rs.getString("pvpindatk1"); String indDef1BancoDados = rs.getString("pvpinddef1"); String indSta1BancoDados = rs.getString("pvpindsta1"); String level1BancoDados = rs.getString("pvplevel1");
                String rank2BancoDados = rs.getString("pvprank2"); String indAtk2BancoDados = rs.getString("pvpindatk2"); String indDef2BancoDados = rs.getString("pvpinddef2"); String indSta2BancoDados = rs.getString("pvpindsta2"); String level2BancoDados = rs.getString("pvplevel2");
                String rank3BancoDados = rs.getString("pvprank3"); String indAtk3BancoDados = rs.getString("pvpindatk3"); String indDef3BancoDados = rs.getString("pvpinddef3"); String indSta3BancoDados = rs.getString("pvpindsta3"); String level3BancoDados = rs.getString("pvplevel3");
                String rank4BancoDados = rs.getString("pvprank4"); String indAtk4BancoDados = rs.getString("pvpindatk4"); String indDef4BancoDados = rs.getString("pvpinddef4"); String indSta4BancoDados = rs.getString("pvpindsta4"); String level4BancoDados = rs.getString("pvplevel4");
                String rank5BancoDados = rs.getString("pvprank5"); String indAtk5BancoDados = rs.getString("pvpindatk5"); String indDef5BancoDados = rs.getString("pvpinddef5"); String indSta5BancoDados = rs.getString("pvpindsta5"); String level5BancoDados = rs.getString("pvplevel5");
                String rank6BancoDados = rs.getString("pvprank6"); String indAtk6BancoDados = rs.getString("pvpindatk6"); String indDef6BancoDados = rs.getString("pvpinddef6"); String indSta6BancoDados = rs.getString("pvpindsta6"); String level6BancoDados = rs.getString("pvplevel6");
                String rank7BancoDados = rs.getString("pvprank7"); String indAtk7BancoDados = rs.getString("pvpindatk7"); String indDef7BancoDados = rs.getString("pvpinddef7"); String indSta7BancoDados = rs.getString("pvpindsta7"); String level7BancoDados = rs.getString("pvplevel7");
                String rank8BancoDados = rs.getString("pvprank8"); String indAtk8BancoDados = rs.getString("pvpindatk8"); String indDef8BancoDados = rs.getString("pvpinddef8"); String indSta8BancoDados = rs.getString("pvpindsta8"); String level8BancoDados = rs.getString("pvplevel8");
                String rank9BancoDados = rs.getString("pvprank9"); String indAtk9BancoDados = rs.getString("pvpindatk9"); String indDef9BancoDados = rs.getString("pvpinddef9"); String indSta9BancoDados = rs.getString("pvpindsta9"); String level9BancoDados = rs.getString("pvplevel9");
                String rank10BancoDados = rs.getString("pvprank10"); String indAtk10BancoDados = rs.getString("pvpindatk10"); String indDef10BancoDados = rs.getString("pvpinddef10"); String indSta10BancoDados = rs.getString("pvpindsta10"); String level10BancoDados = rs.getString("pvplevel10");
                // Setar no modelo
                pvpBancoDados.setId(idBancoDados);
                pvpBancoDados.setNumero(numeroBancoDados);
                pvpBancoDados.setNome(nomeBancoDados);
                pvpBancoDados.setTipo1(tipo1BancoDados);
                pvpBancoDados.setTipo2(tipo2BancoDados);
                pvpBancoDados.setRank1(rank1BancoDados); pvpBancoDados.setIndAtk1(indAtk1BancoDados); pvpBancoDados.setIndDef1(indDef1BancoDados); pvpBancoDados.setIndSta1(indSta1BancoDados); pvpBancoDados.setLevel1(level1BancoDados);
                pvpBancoDados.setRank2(rank2BancoDados); pvpBancoDados.setIndAtk2(indAtk2BancoDados); pvpBancoDados.setIndDef2(indDef2BancoDados); pvpBancoDados.setIndSta2(indSta2BancoDados); pvpBancoDados.setLevel2(level2BancoDados);
                pvpBancoDados.setRank3(rank3BancoDados); pvpBancoDados.setIndAtk3(indAtk3BancoDados); pvpBancoDados.setIndDef3(indDef3BancoDados); pvpBancoDados.setIndSta3(indSta3BancoDados); pvpBancoDados.setLevel3(level3BancoDados);
                pvpBancoDados.setRank4(rank4BancoDados); pvpBancoDados.setIndAtk4(indAtk4BancoDados); pvpBancoDados.setIndDef4(indDef4BancoDados); pvpBancoDados.setIndSta4(indSta4BancoDados); pvpBancoDados.setLevel4(level4BancoDados);
                pvpBancoDados.setRank5(rank5BancoDados); pvpBancoDados.setIndAtk5(indAtk5BancoDados); pvpBancoDados.setIndDef5(indDef5BancoDados); pvpBancoDados.setIndSta5(indSta5BancoDados); pvpBancoDados.setLevel5(level5BancoDados);
                pvpBancoDados.setRank6(rank6BancoDados); pvpBancoDados.setIndAtk6(indAtk6BancoDados); pvpBancoDados.setIndDef6(indDef6BancoDados); pvpBancoDados.setIndSta6(indSta6BancoDados); pvpBancoDados.setLevel6(level6BancoDados);
                pvpBancoDados.setRank7(rank7BancoDados); pvpBancoDados.setIndAtk7(indAtk7BancoDados); pvpBancoDados.setIndDef7(indDef7BancoDados); pvpBancoDados.setIndSta7(indSta7BancoDados); pvpBancoDados.setLevel7(level7BancoDados);
                pvpBancoDados.setRank8(rank8BancoDados); pvpBancoDados.setIndAtk8(indAtk8BancoDados); pvpBancoDados.setIndDef8(indDef8BancoDados); pvpBancoDados.setIndSta8(indSta8BancoDados); pvpBancoDados.setLevel8(level8BancoDados);
                pvpBancoDados.setRank9(rank9BancoDados); pvpBancoDados.setIndAtk9(indAtk9BancoDados); pvpBancoDados.setIndDef9(indDef9BancoDados); pvpBancoDados.setIndSta9(indSta9BancoDados); pvpBancoDados.setLevel9(level9BancoDados);
                pvpBancoDados.setRank10(rank10BancoDados); pvpBancoDados.setIndAtk10(indAtk10BancoDados); pvpBancoDados.setIndDef10(indDef10BancoDados); pvpBancoDados.setIndSta10(indSta10BancoDados); pvpBancoDados.setLevel10(level10BancoDados);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return pvpBancoDados;
    }

    public boolean gravarAlteracao(ModelPvP500Status pvp) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" update tbpvp500status set "
                    + " pvpid = ?, "
                    + " pvpnumero = ?, "
                    + " pvpnome = ?, "
                    + " pvptipo1 = ?, "
                    + " pvptipo2 = ?, "
                    + " pvprank1 = ?, " + " pvpindatk1 = ?, " + " pvpinddef1 = ?, " + " pvpindsta1 = ?, " + " pvplevel1 = ?, "
                    + " pvprank2 = ?, " + " pvpindatk2 = ?, " + " pvpinddef2 = ?, " + " pvpindsta2 = ?, " + " pvplevel2 = ?, "
                    + " pvprank3 = ?, " + " pvpindatk3 = ?, " + " pvpinddef3 = ?, " + " pvpindsta3 = ?, " + " pvplevel3 = ?, "
                    + " pvprank4 = ?, " + " pvpindatk4 = ?, " + " pvpinddef4 = ?, " + " pvpindsta4 = ?, " + " pvplevel4 = ?, "
                    + " pvprank5 = ?, " + " pvpindatk5 = ?, " + " pvpinddef5 = ?, " + " pvpindsta5 = ?, " + " pvplevel5 = ?, "
                    + " pvprank6 = ?, " + " pvpindatk6 = ?, " + " pvpinddef6 = ?, " + " pvpindsta6 = ?, " + " pvplevel6 = ?, "
                    + " pvprank7 = ?, " + " pvpindatk7 = ?, " + " pvpinddef7 = ?, " + " pvpindsta7 = ?, " + " pvplevel7 = ?, "
                    + " pvprank8 = ?, " + " pvpindatk8 = ?, " + " pvpinddef8 = ?, " + " pvpindsta8 = ?, " + " pvplevel8 = ?, "
                    + " pvprank9 = ?, " + " pvpindatk9 = ?, " + " pvpinddef9 = ?, " + " pvpindsta9 = ?, " + " pvplevel9 = ?, "
                    + " pvprank10 = ?, " + " pvpindatk10 = ?, " + " pvpinddef10 = ?, " + " pvpindsta10 = ?, " + " pvplevel10 = ?, "
                    + " where pvpid = ?");
            pstmt.setInt(1, pvp.getId());
            pstmt.setString(2, pvp.getNumero());
            pstmt.setString(3, pvp.getNome());
            pstmt.setString(4, pvp.getTipo1());
            pstmt.setString(5, pvp.getTipo2());
            pstmt.setString(6,pvp.getRank1()); pstmt.setString(7,pvp.getIndAtk1()); pstmt.setString(8,pvp.getIndDef1()); pstmt.setString(9,pvp.getIndSta1()); pstmt.setString(10,pvp.getLevel1());
            pstmt.setString(11,pvp.getRank2()); pstmt.setString(12,pvp.getIndAtk2()); pstmt.setString(13,pvp.getIndDef2()); pstmt.setString(14,pvp.getIndSta2()); pstmt.setString(15,pvp.getLevel2());
            pstmt.setString(16,pvp.getRank3()); pstmt.setString(17,pvp.getIndAtk3()); pstmt.setString(18,pvp.getIndDef3()); pstmt.setString(19,pvp.getIndSta3()); pstmt.setString(20,pvp.getLevel3());
            pstmt.setString(21,pvp.getRank4()); pstmt.setString(22,pvp.getIndAtk4()); pstmt.setString(23,pvp.getIndDef4()); pstmt.setString(24,pvp.getIndSta4()); pstmt.setString(25,pvp.getLevel4());
            pstmt.setString(26,pvp.getRank5()); pstmt.setString(27,pvp.getIndAtk5()); pstmt.setString(28,pvp.getIndDef5()); pstmt.setString(29,pvp.getIndSta5()); pstmt.setString(30,pvp.getLevel5());
            pstmt.setString(31,pvp.getRank6()); pstmt.setString(32,pvp.getIndAtk6()); pstmt.setString(33,pvp.getIndDef6()); pstmt.setString(34,pvp.getIndSta6()); pstmt.setString(35,pvp.getLevel6());
            pstmt.setString(36,pvp.getRank7()); pstmt.setString(37,pvp.getIndAtk7()); pstmt.setString(38,pvp.getIndDef7()); pstmt.setString(39,pvp.getIndSta7()); pstmt.setString(40,pvp.getLevel7());
            pstmt.setString(41,pvp.getRank8()); pstmt.setString(42,pvp.getIndAtk8()); pstmt.setString(43,pvp.getIndDef8()); pstmt.setString(44,pvp.getIndSta8()); pstmt.setString(45,pvp.getLevel8());
            pstmt.setString(46,pvp.getRank9()); pstmt.setString(47,pvp.getIndAtk9()); pstmt.setString(48,pvp.getIndDef9()); pstmt.setString(49,pvp.getIndSta9()); pstmt.setString(50,pvp.getLevel9());
            pstmt.setString(51,pvp.getRank10()); pstmt.setString(52,pvp.getIndAtk10()); pstmt.setString(53,pvp.getIndDef10()); pstmt.setString(54,pvp.getIndSta10()); pstmt.setString(55,pvp.getLevel10());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    public boolean gravarInsercao(ModelPvP500Status pvp) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        boolean executou = false;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            pstmt = conn.prepareStatement(" insert into tbpvp500status ("
                    + " pvpnumero, " + " pvpnome, " + " pvptipo1, " + " pvptipo2, "
                    + " pvprank1, " + " pvpindatk1, " + " pvpinddef1, " + " pvpindsta1, " + " pvplevel1, "
                    + " pvprank2, " + " pvpindatk2, " + " pvpinddef2, " + " pvpindsta2, " + " pvplevel2, "
                    + " pvprank3, " + " pvpindatk3, " + " pvpinddef3, " + " pvpindsta3, " + " pvplevel3, "
                    + " pvprank4, " + " pvpindatk4, " + " pvpinddef4, " + " pvpindsta4, " + " pvplevel4, "
                    + " pvprank5, " + " pvpindatk5, " + " pvpinddef5, " + " pvpindsta5, " + " pvplevel5, "
                    + " pvprank6, " + " pvpindatk6, " + " pvpinddef6, " + " pvpindsta6, " + " pvplevel6, "
                    + " pvprank7, " + " pvpindatk7, " + " pvpinddef7, " + " pvpindsta7, " + " pvplevel7, "
                    + " pvprank8, " + " pvpindatk8, " + " pvpinddef8, " + " pvpindsta8, " + " pvplevel8, "
                    + " pvprank9, " + " pvpindatk9, " + " pvpinddef9, " + " pvpindsta9, " + " pvplevel9, "
                    + " pvprank10, " + " pvpindatk10, " + " pvpinddef10, " + " pvpindsta10, " + " pvplevel10"
                    + ") values("
                    + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?, ?,?, ?, ?, ?, ?,"
                    + " ?, ?, ?, ?"
                    + ")");
            pstmt.setInt(1, pvp.getId());
            pstmt.setString(2, pvp.getNumero());
            pstmt.setString(3, pvp.getNome());
            pstmt.setString(4, pvp.getTipo1());
            pstmt.setString(5, pvp.getTipo2());
            pstmt.setString(6,pvp.getRank1()); pstmt.setString(7,pvp.getIndAtk1()); pstmt.setString(8,pvp.getIndDef1()); pstmt.setString(9,pvp.getIndSta1()); pstmt.setString(10,pvp.getLevel1());
            pstmt.setString(11,pvp.getRank2()); pstmt.setString(12,pvp.getIndAtk2()); pstmt.setString(13,pvp.getIndDef2()); pstmt.setString(14,pvp.getIndSta2()); pstmt.setString(15,pvp.getLevel2());
            pstmt.setString(16,pvp.getRank3()); pstmt.setString(17,pvp.getIndAtk3()); pstmt.setString(18,pvp.getIndDef3()); pstmt.setString(19,pvp.getIndSta3()); pstmt.setString(20,pvp.getLevel3());
            pstmt.setString(21,pvp.getRank4()); pstmt.setString(22,pvp.getIndAtk4()); pstmt.setString(23,pvp.getIndDef4()); pstmt.setString(24,pvp.getIndSta4()); pstmt.setString(25,pvp.getLevel4());
            pstmt.setString(26,pvp.getRank5()); pstmt.setString(27,pvp.getIndAtk5()); pstmt.setString(28,pvp.getIndDef5()); pstmt.setString(29,pvp.getIndSta5()); pstmt.setString(30,pvp.getLevel5());
            pstmt.setString(31,pvp.getRank6()); pstmt.setString(32,pvp.getIndAtk6()); pstmt.setString(33,pvp.getIndDef6()); pstmt.setString(34,pvp.getIndSta6()); pstmt.setString(35,pvp.getLevel6());
            pstmt.setString(36,pvp.getRank7()); pstmt.setString(37,pvp.getIndAtk7()); pstmt.setString(38,pvp.getIndDef7()); pstmt.setString(39,pvp.getIndSta7()); pstmt.setString(40,pvp.getLevel7());
            pstmt.setString(41,pvp.getRank8()); pstmt.setString(42,pvp.getIndAtk8()); pstmt.setString(43,pvp.getIndDef8()); pstmt.setString(44,pvp.getIndSta8()); pstmt.setString(45,pvp.getLevel8());
            pstmt.setString(46,pvp.getRank9()); pstmt.setString(47,pvp.getIndAtk9()); pstmt.setString(48,pvp.getIndDef9()); pstmt.setString(49,pvp.getIndSta9()); pstmt.setString(50,pvp.getLevel9());
            pstmt.setString(51,pvp.getRank10()); pstmt.setString(52,pvp.getIndAtk10()); pstmt.setString(53,pvp.getIndDef10()); pstmt.setString(54,pvp.getIndSta10()); pstmt.setString(55,pvp.getLevel10());
            pstmt.executeUpdate();
            executou = true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conexão! " + erro);
        } finally {
            Conexao.closeAll(conn);
        }
        return executou;
    }

    private static final String sqlTodos = "select * from public.tbpvp500status order by pvpid";

    public ArrayList<ModelPvP500Status> getTodos() {
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
                int id = rs.getInt("pvpid");

                // Pega valores String(texto)
                String numero = rs.getString("pvpnumero");
                String nome = rs.getString("pvpnome");
                String tipo1 = rs.getString("pvptipo1");
                String tipo2 = rs.getString("pvptipo2");
                String rank1 = rs.getString("pvprank1"); String indAtk1 = rs.getString("pvpindatk1"); String indDef1 = rs.getString("pvpinddef1"); String indSta1 = rs.getString("pvpindsta1"); String level1 = rs.getString("pvplevel1");
                String rank2 = rs.getString("pvprank2"); String indAtk2 = rs.getString("pvpindatk2"); String indDef2 = rs.getString("pvpinddef2"); String indSta2 = rs.getString("pvpindsta2"); String level2 = rs.getString("pvplevel2");
                String rank3 = rs.getString("pvprank3"); String indAtk3 = rs.getString("pvpindatk3"); String indDef3 = rs.getString("pvpinddef3"); String indSta3 = rs.getString("pvpindsta3"); String level3 = rs.getString("pvplevel3");
                String rank4 = rs.getString("pvprank4"); String indAtk4 = rs.getString("pvpindatk4"); String indDef4 = rs.getString("pvpinddef4"); String indSta4 = rs.getString("pvpindsta4"); String level4 = rs.getString("pvplevel4");
                String rank5 = rs.getString("pvprank5"); String indAtk5 = rs.getString("pvpindatk5"); String indDef5 = rs.getString("pvpinddef5"); String indSta5 = rs.getString("pvpindsta5"); String level5 = rs.getString("pvplevel5");
                String rank6 = rs.getString("pvprank6"); String indAtk6 = rs.getString("pvpindatk6"); String indDef6 = rs.getString("pvpinddef6"); String indSta6 = rs.getString("pvpindsta6"); String level6 = rs.getString("pvplevel6");
                String rank7 = rs.getString("pvprank7"); String indAtk7 = rs.getString("pvpindatk7"); String indDef7 = rs.getString("pvpinddef7"); String indSta7 = rs.getString("pvpindsta7"); String level7 = rs.getString("pvplevel7");
                String rank8 = rs.getString("pvprank8"); String indAtk8 = rs.getString("pvpindatk8"); String indDef8 = rs.getString("pvpinddef8"); String indSta8 = rs.getString("pvpindsta8"); String level8 = rs.getString("pvplevel8");
                String rank9 = rs.getString("pvprank9"); String indAtk9 = rs.getString("pvpindatk9"); String indDef9 = rs.getString("pvpinddef9"); String indSta9 = rs.getString("pvpindsta9"); String level9 = rs.getString("pvplevel9");
                String rank10 = rs.getString("pvprank10"); String indAtk10 = rs.getString("pvpindatk10"); String indDef10 = rs.getString("pvpinddef10"); String indSta10 = rs.getString("pvpindsta10"); String level10 = rs.getString("pvplevel10");

                ModelPvP500Status pvp500 = new ModelPvP500Status(id, numero, nome, rank1, rank2, rank1, indAtk1, indDef1, indSta1, level1, rank2, indAtk2, indDef2, indSta2, level2, rank3, indAtk3, indDef3, indSta3, level3, rank4, indAtk4, indDef4, indSta4, level4, rank5, indAtk5, indDef5, indSta5, level5, rank6, indAtk6, indDef6, indSta6, level6, rank7, indAtk7, indDef7, indSta7, level7, rank8, indAtk8, indDef8, indSta8, level8, rank9, indAtk9, indDef9, indSta9, level9, rank10, indAtk10, indDef10, indSta10, level10);

                listaDados.add(pvp500);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }

    public ArrayList<ModelPvP500Status> getNumero(String numeroPokemon) {
        String sqlNumero = "select * from public.tbpvp500status where pvpnumero ilike '" + numeroPokemon + "' order by pvpid";
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
                int id = rs.getInt("pvpid");

                // Pega valores String(texto)
                String numero = rs.getString("pvpnumero");
                String nome = rs.getString("pvpnome");
                String tipo1 = rs.getString("pvptipo1");
                String tipo2 = rs.getString("pvptipo2");
                String rank1 = rs.getString("pvprank1"); String indAtk1 = rs.getString("pvpindatk1"); String indDef1 = rs.getString("pvpinddef1"); String indSta1 = rs.getString("pvpindsta1"); String level1 = rs.getString("pvplevel1");
                String rank2 = rs.getString("pvprank2"); String indAtk2 = rs.getString("pvpindatk2"); String indDef2 = rs.getString("pvpinddef2"); String indSta2 = rs.getString("pvpindsta2"); String level2 = rs.getString("pvplevel2");
                String rank3 = rs.getString("pvprank3"); String indAtk3 = rs.getString("pvpindatk3"); String indDef3 = rs.getString("pvpinddef3"); String indSta3 = rs.getString("pvpindsta3"); String level3 = rs.getString("pvplevel3");
                String rank4 = rs.getString("pvprank4"); String indAtk4 = rs.getString("pvpindatk4"); String indDef4 = rs.getString("pvpinddef4"); String indSta4 = rs.getString("pvpindsta4"); String level4 = rs.getString("pvplevel4");
                String rank5 = rs.getString("pvprank5"); String indAtk5 = rs.getString("pvpindatk5"); String indDef5 = rs.getString("pvpinddef5"); String indSta5 = rs.getString("pvpindsta5"); String level5 = rs.getString("pvplevel5");
                String rank6 = rs.getString("pvprank6"); String indAtk6 = rs.getString("pvpindatk6"); String indDef6 = rs.getString("pvpinddef6"); String indSta6 = rs.getString("pvpindsta6"); String level6 = rs.getString("pvplevel6");
                String rank7 = rs.getString("pvprank7"); String indAtk7 = rs.getString("pvpindatk7"); String indDef7 = rs.getString("pvpinddef7"); String indSta7 = rs.getString("pvpindsta7"); String level7 = rs.getString("pvplevel7");
                String rank8 = rs.getString("pvprank8"); String indAtk8 = rs.getString("pvpindatk8"); String indDef8 = rs.getString("pvpinddef8"); String indSta8 = rs.getString("pvpindsta8"); String level8 = rs.getString("pvplevel8");
                String rank9 = rs.getString("pvprank9"); String indAtk9 = rs.getString("pvpindatk9"); String indDef9 = rs.getString("pvpinddef9"); String indSta9 = rs.getString("pvpindsta9"); String level9 = rs.getString("pvplevel9");
                String rank10 = rs.getString("pvprank10"); String indAtk10 = rs.getString("pvpindatk10"); String indDef10 = rs.getString("pvpinddef10"); String indSta10 = rs.getString("pvpindsta10"); String level10 = rs.getString("pvplevel10");

                ModelPvP500Status pvp500 = new ModelPvP500Status(id, numero, nome, rank1, rank2, rank1, indAtk1, indDef1, indSta1, level1, rank2, indAtk2, indDef2, indSta2, level2, rank3, indAtk3, indDef3, indSta3, level3, rank4, indAtk4, indDef4, indSta4, level4, rank5, indAtk5, indDef5, indSta5, level5, rank6, indAtk6, indDef6, indSta6, level6, rank7, indAtk7, indDef7, indSta7, level7, rank8, indAtk8, indDef8, indSta8, level8, rank9, indAtk9, indDef9, indSta9, level9, rank10, indAtk10, indDef10, indSta10, level10);

                listaDados.add(pvp500);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no sql, getTodos():\n" + erro.getMessage());
        } finally {
            Conexao.closeAll(conn);
        }
        return listaDados;
    }
}
