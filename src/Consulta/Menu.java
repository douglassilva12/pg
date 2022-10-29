package Consulta;

import Cadastro.Cad_Ataque;
import Cadastro.Cad_Status;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1CadastroAtaque = new javax.swing.JMenuItem();
        jMenuItem2CadastroClima = new javax.swing.JMenuItem();
        jMenuItem3CadastroPokemon = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4ConsultaAtaque = new javax.swing.JMenuItem();
        jMenuItem5ConsultaClima = new javax.swing.JMenuItem();
        jMenuItem6ConsultaPvE = new javax.swing.JMenuItem();
        jMenuItem7ConsultaPvP = new javax.swing.JMenuItem();
        jMenuItem8ConsultaTipagem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jMenuItem1CadastroAtaque.setText("Ataque");
        jMenuItem1CadastroAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CadastroAtaqueActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1CadastroAtaque);

        jMenuItem2CadastroClima.setText("Clima");
        jMenuItem2CadastroClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CadastroClimaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2CadastroClima);

        jMenuItem3CadastroPokemon.setText("Pokemon");
        jMenuItem3CadastroPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3CadastroPokemonActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3CadastroPokemon);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        jMenuItem4ConsultaAtaque.setText("Ataque");
        jMenuItem4ConsultaAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ConsultaAtaqueActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4ConsultaAtaque);

        jMenuItem5ConsultaClima.setText("Clima");
        jMenuItem5ConsultaClima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ConsultaClimaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5ConsultaClima);

        jMenuItem6ConsultaPvE.setText("PvE");
        jMenuItem6ConsultaPvE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ConsultaPvEActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6ConsultaPvE);

        jMenuItem7ConsultaPvP.setText("PvP");
        jMenuItem7ConsultaPvP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ConsultaPvPActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7ConsultaPvP);

        jMenuItem8ConsultaTipagem.setText("Tipagem");
        jMenuItem8ConsultaTipagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ConsultaTipagemActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8ConsultaTipagem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1CadastroAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CadastroAtaqueActionPerformed
        Cad_Ataque cadAtaque = new Cad_Ataque();
        jDesktopPane1.add(cadAtaque);
        cadAtaque.show();
        cadAtaque.setClosable(true);
        cadAtaque.setIconifiable(true);
    }//GEN-LAST:event_jMenuItem1CadastroAtaqueActionPerformed

    private void jMenuItem2CadastroClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CadastroClimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2CadastroClimaActionPerformed

    private void jMenuItem3CadastroPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3CadastroPokemonActionPerformed
        Cad_Status cadStatus = new Cad_Status();
        jDesktopPane1.add(cadStatus);
        cadStatus.show();
        cadStatus.setClosable(true);
        cadStatus.setIconifiable(true);
    }//GEN-LAST:event_jMenuItem3CadastroPokemonActionPerformed

    private void jMenuItem4ConsultaAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ConsultaAtaqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ConsultaAtaqueActionPerformed

    private void jMenuItem5ConsultaClimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ConsultaClimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ConsultaClimaActionPerformed

    private void jMenuItem6ConsultaPvEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ConsultaPvEActionPerformed
        Con_PvE conPvE = new Con_PvE();
        jDesktopPane1.add(conPvE);
        conPvE.show();
        conPvE.setClosable(true);
        conPvE.setIconifiable(true);
    }//GEN-LAST:event_jMenuItem6ConsultaPvEActionPerformed

    private void jMenuItem7ConsultaPvPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ConsultaPvPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ConsultaPvPActionPerformed

    private void jMenuItem8ConsultaTipagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ConsultaTipagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ConsultaTipagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1CadastroAtaque;
    private javax.swing.JMenuItem jMenuItem2CadastroClima;
    private javax.swing.JMenuItem jMenuItem3CadastroPokemon;
    private javax.swing.JMenuItem jMenuItem4ConsultaAtaque;
    private javax.swing.JMenuItem jMenuItem5ConsultaClima;
    private javax.swing.JMenuItem jMenuItem6ConsultaPvE;
    private javax.swing.JMenuItem jMenuItem7ConsultaPvP;
    private javax.swing.JMenuItem jMenuItem8ConsultaTipagem;
    // End of variables declaration//GEN-END:variables
}
