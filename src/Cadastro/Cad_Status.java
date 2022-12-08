package Cadastro;

import BancoDados.ControllerStatusDB;
import javax.swing.JOptionPane;
import model.ModelStatus;

public class Cad_Status extends javax.swing.JInternalFrame {

    ControllerStatusDB statusDB = new ControllerStatusDB();

    public Cad_Status() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2Alterar = new javax.swing.JButton();
        jButton3Sair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4Tipo1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5Tipo2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1ID = new javax.swing.JTextField();
        jTextField2Numero = new javax.swing.JTextField();
        jTextField3Nome = new javax.swing.JTextField();
        jTextField6ATK = new javax.swing.JTextField();
        jTextField7DEF = new javax.swing.JTextField();
        jTextField8STA = new javax.swing.JTextField();
        jButton1Adicionar = new javax.swing.JButton();

        setBorder(null);

        jButton2Alterar.setText("ALTERAR");
        jButton2Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2AlterarActionPerformed(evt);
            }
        });

        jButton3Sair.setText("SAIR");
        jButton3Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3SairActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo 1:");

        jLabel5.setText("Tipo 2:");

        jLabel1.setText("ID:");

        jLabel2.setText("Número:");

        jLabel3.setText("Nome:");

        jLabel6.setText("ATK:");

        jLabel7.setText("DEF:");

        jLabel8.setText("STA:");

        jButton1Adicionar.setText("ADICIONAR");
        jButton1Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1Adicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2Alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6ATK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7DEF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8STA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1Adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2Alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3Sair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4Tipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5Tipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6ATK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7DEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8STA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AdicionarActionPerformed
        String auxID = jTextField1ID.getText();
        String auxNumero = jTextField2Numero.getText();
        String auxNome = jTextField3Nome.getText();
        String auxTipo1 = jTextField4Tipo1.getText();
        String auxTipo2 = jTextField5Tipo2.getText();
        String auxAtk = jTextField6ATK.getText();
        String auxDef = jTextField7DEF.getText();
        String auxSta = jTextField8STA.getText();

        if (validaCamposVazios(auxID,auxTipo2)) {
            int id = Integer.parseInt(auxID);

            ModelStatus status = new ModelStatus(
                    id,
                    auxNumero,
                    auxNome,
                    auxTipo1,
                    auxTipo2,
                    auxAtk,
                    auxDef,
                    auxSta);

            ModelStatus statusBanco = statusDB.getStatus(id);

            if (statusBanco.getId() > 0) {
                if (statusDB.gravarAlteracao(status)) {
                    JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
                    limpaCampos();
                    habilitaCampos(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao gravar alteração!");
                    habilitaCampos(false);
                    jTextField1ID.requestFocus();
                }
            } else {
                if (statusDB.gravarInsercao(status)) {
                    JOptionPane.showMessageDialog(null, "Registro inserido com sucesso!");
                    limpaCampos();
                    habilitaCampos(true);
                    jTextField1ID.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir registro!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existem campos nao preenchidos!");
        }
    }//GEN-LAST:event_jButton1AdicionarActionPerformed

    private void jButton2AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2AlterarActionPerformed

    }//GEN-LAST:event_jButton2AlterarActionPerformed

    private void jButton3SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3SairActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Adicionar;
    private javax.swing.JButton jButton2Alterar;
    private javax.swing.JButton jButton3Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField2Numero;
    private javax.swing.JTextField jTextField3Nome;
    private javax.swing.JTextField jTextField4Tipo1;
    private javax.swing.JTextField jTextField5Tipo2;
    private javax.swing.JTextField jTextField6ATK;
    private javax.swing.JTextField jTextField7DEF;
    private javax.swing.JTextField jTextField8STA;
    // End of variables declaration//GEN-END:variables

    private boolean validaCamposVazios(String auxID, String auxTipo2) {
        if (auxID.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o ID!!");
        } else {
            int id = Integer.parseInt(auxID);
            if (id > 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preencha o ID!!");
            }
        }
        if (auxTipo2.equals("")) {
            auxTipo2.equals(null);
        }
        return true;
    }

    private void limpaCampos() {
        jTextField1ID.setText("");
        jTextField2Numero.setText("");
        jTextField3Nome.setText("");
        jTextField4Tipo1.setText("");
        jTextField5Tipo2.setText("");
        jTextField6ATK.setText("");
        jTextField7DEF.setText("");
        jTextField8STA.setText("");
    }

    private void habilitaCampos(boolean habilita) {
        jTextField1ID.setEnabled(habilita);
        jTextField2Numero.setEnabled(habilita);
        jTextField3Nome.setEnabled(habilita);
        jTextField4Tipo1.setEnabled(habilita);
        jTextField5Tipo2.setEnabled(habilita);
        jTextField6ATK.setEnabled(habilita);
        jTextField7DEF.setEnabled(habilita);
        jTextField8STA.setEnabled(habilita);
    }
}
