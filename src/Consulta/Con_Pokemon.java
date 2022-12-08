package Consulta;

import PainelPesquisa.Painel_pve;
import BancoDados.ControllerStatusDB;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.ModelStatus;

public class Con_Pokemon extends javax.swing.JInternalFrame {

    Painel_pve painelpve = new Painel_pve(null, true);
    ControllerStatusDB statusdb = new ControllerStatusDB();

    public Con_Pokemon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1Consultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1ID = new javax.swing.JTextField();
        jTextField3Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4ATK = new javax.swing.JTextField();
        jTextField5DEF = new javax.swing.JTextField();
        jTextField6PS = new javax.swing.JTextField();
        jButton2Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Numero = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setPreferredSize(new java.awt.Dimension(475, 350));

        jLabel1.setText("ID:");

        jButton1Consultar.setText("CONSULTAR");
        jButton1Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ConsultarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jTextField1ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1IDKeyPressed(evt);
            }
        });

        jLabel4.setText("Ataque:");

        jLabel5.setText("Defesa:");

        jLabel6.setText("Stamina:");

        jButton2Limpar.setText("LIMPAR");
        jButton2Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimparActionPerformed(evt);
            }
        });

        jLabel2.setText("Número:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2Limpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Consultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4ATK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5DEF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6PS, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Consultar)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2Limpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4ATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5DEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConsultarActionPerformed
        painelpve.setVisible(true);
        jTextField1ID.setText(String.valueOf(painelpve.getId()));
        jTextField1ID.requestFocus();
        habilitaCampos2(true);
    }//GEN-LAST:event_jButton1ConsultarActionPerformed

    private void jButton2LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimparActionPerformed
        limpaCampos();
        habilitaCampos2(true);
        jTextField1ID.requestFocus();
    }//GEN-LAST:event_jButton2LimparActionPerformed

    private void jTextField1IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1IDKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (jTextField1ID.getText().equals("")) {
                jTextField1ID.setText(String.valueOf(statusdb.getUltimoCodigo("tbstatus", "id")));
                habilitaCampos(true);
                jTextField2Numero.requestFocus();
            } else {
                int id = Integer.parseInt(jTextField1ID.getText());
                ModelStatus modelStatus = statusdb.getStatus(id);
                if (modelStatus.getId() > 0) {
                    // se existe produto no banco de dados
                    // seta os dados na tela
                    jTextField2Numero.setText(modelStatus.getNumero());
                    jTextField3Nome.setText(modelStatus.getNome());
                    jTextField4ATK.setText(modelStatus.getAtk());
                    jTextField5DEF.setText(modelStatus.getDef());
                    jTextField6PS.setText(modelStatus.getSta());
                    habilitaCampos(true);
                    jTextField2Numero.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não existe!");
                    habilitaCampos(false);
                    jTextField1ID.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_jTextField1IDKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JButton jButton2Limpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField2Numero;
    private javax.swing.JTextField jTextField3Nome;
    private javax.swing.JTextField jTextField4ATK;
    private javax.swing.JTextField jTextField5DEF;
    private javax.swing.JTextField jTextField6PS;
    // End of variables declaration//GEN-END:variables

    public void habilitaCampos(boolean habilita) {
        jTextField2Numero.setEnabled(habilita);
        jTextField3Nome.setEnabled(habilita);
        jTextField4ATK.setEnabled(habilita);
        jTextField5DEF.setEnabled(habilita);
        jTextField6PS.setEnabled(habilita);
        jButton2Limpar.setEnabled(habilita);

        jTextField1ID.setEnabled(!habilita);
    }

    public void habilitaCampos2(boolean habilita) {
        jTextField1ID.setEnabled(habilita);
        jTextField2Numero.setEnabled(habilita);
        jTextField3Nome.setEnabled(habilita);
        jTextField4ATK.setEnabled(habilita);
        jTextField5DEF.setEnabled(habilita);
        jTextField6PS.setEnabled(habilita);
        jButton2Limpar.setEnabled(habilita);
    }

    public void limpaCampos() {
        jTextField1ID.setText("");
        jTextField2Numero.setText("");
        jTextField3Nome.setText("");
        jTextField4ATK.setText("");
        jTextField5DEF.setText("");
        jTextField6PS.setText("");
    }
}
