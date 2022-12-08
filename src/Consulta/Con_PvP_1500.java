package Consulta;

import BancoDados.ControllerCpmDB;
import BancoDados.ControllerPreEvolucao1DB;
import BancoDados.ControllerPreEvolucao2DB;
import BancoDados.ControllerPvP1500StatusDB;
import BancoDados.ControllerStatusDB;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCpm;
import model.ModelPreEvolucao1;
import model.ModelPreEvolucao2;
import model.ModelPvP1500Status;
import model.ModelStatus;
import PainelPesquisa.Painel_pvp1500;

public class Con_PvP_1500 extends javax.swing.JInternalFrame {

    ControllerCpmDB cpmdb = new ControllerCpmDB();
    ControllerPreEvolucao1DB pe1db = new ControllerPreEvolucao1DB();
    ControllerPreEvolucao2DB pe2db = new ControllerPreEvolucao2DB();
    ControllerPvP1500StatusDB pvp1500db = new ControllerPvP1500StatusDB();
    ControllerStatusDB statusdb = new ControllerStatusDB();
    ModelCpm cpmBanco = new ModelCpm();
    ModelPreEvolucao1 pe1Banco = new ModelPreEvolucao1();
    ModelPreEvolucao2 pe2Banco = new ModelPreEvolucao2();
    ModelPvP1500Status pvp1500Banco = new ModelPvP1500Status();
    ModelStatus statusBanco = new ModelStatus();
    Painel_pvp1500 iframe = new Painel_pvp1500(null, true);

    public Con_PvP_1500() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1Consultar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1ID = new javax.swing.JTextField();
        jTextField3Nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5ATK1 = new javax.swing.JTextField();
        jTextField6DEF1 = new javax.swing.JTextField();
        jTextField7PS1 = new javax.swing.JTextField();
        jButton2Limpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField8Level1 = new javax.swing.JTextField();
        jButton3Copiar1 = new javax.swing.JButton();
        jTextField9Filtro1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4Ranking1 = new javax.swing.JTextField();
        jTextField4Ranking2 = new javax.swing.JTextField();
        jTextField4Ranking3 = new javax.swing.JTextField();
        jTextField4Ranking4 = new javax.swing.JTextField();
        jTextField4Ranking5 = new javax.swing.JTextField();
        jTextField4Ranking6 = new javax.swing.JTextField();
        jTextField4Ranking7 = new javax.swing.JTextField();
        jTextField4Ranking8 = new javax.swing.JTextField();
        jTextField4Ranking9 = new javax.swing.JTextField();
        jTextField4Ranking10 = new javax.swing.JTextField();
        jTextField8Level2 = new javax.swing.JTextField();
        jButton3Copiar2 = new javax.swing.JButton();
        jTextField9Filtro2 = new javax.swing.JTextField();
        jTextField5ATK2 = new javax.swing.JTextField();
        jTextField6DEF2 = new javax.swing.JTextField();
        jTextField7PS2 = new javax.swing.JTextField();
        jTextField8Level3 = new javax.swing.JTextField();
        jButton3Copiar3 = new javax.swing.JButton();
        jTextField9Filtro3 = new javax.swing.JTextField();
        jTextField5ATK3 = new javax.swing.JTextField();
        jTextField6DEF3 = new javax.swing.JTextField();
        jTextField7PS3 = new javax.swing.JTextField();
        jTextField6DEF4 = new javax.swing.JTextField();
        jTextField7PS4 = new javax.swing.JTextField();
        jTextField8Level4 = new javax.swing.JTextField();
        jButton3Copiar4 = new javax.swing.JButton();
        jTextField9Filtro4 = new javax.swing.JTextField();
        jTextField5ATK4 = new javax.swing.JTextField();
        jTextField7PS5 = new javax.swing.JTextField();
        jTextField8Level5 = new javax.swing.JTextField();
        jButton3Copiar5 = new javax.swing.JButton();
        jTextField6DEF5 = new javax.swing.JTextField();
        jTextField9Filtro5 = new javax.swing.JTextField();
        jTextField5ATK5 = new javax.swing.JTextField();
        jTextField7PS6 = new javax.swing.JTextField();
        jTextField8Level6 = new javax.swing.JTextField();
        jButton3Copiar6 = new javax.swing.JButton();
        jTextField6DEF6 = new javax.swing.JTextField();
        jTextField9Filtro6 = new javax.swing.JTextField();
        jTextField5ATK6 = new javax.swing.JTextField();
        jTextField7PS7 = new javax.swing.JTextField();
        jTextField8Level7 = new javax.swing.JTextField();
        jButton3Copiar7 = new javax.swing.JButton();
        jTextField6DEF7 = new javax.swing.JTextField();
        jTextField9Filtro7 = new javax.swing.JTextField();
        jTextField5ATK7 = new javax.swing.JTextField();
        jTextField7PS8 = new javax.swing.JTextField();
        jTextField8Level8 = new javax.swing.JTextField();
        jTextField9Filtro8 = new javax.swing.JTextField();
        jButton3Copiar8 = new javax.swing.JButton();
        jTextField6DEF8 = new javax.swing.JTextField();
        jTextField5ATK8 = new javax.swing.JTextField();
        jTextField8Level9 = new javax.swing.JTextField();
        jTextField5ATK9 = new javax.swing.JTextField();
        jTextField9Filtro9 = new javax.swing.JTextField();
        jTextField6DEF9 = new javax.swing.JTextField();
        jButton3Copiar9 = new javax.swing.JButton();
        jTextField7PS9 = new javax.swing.JTextField();
        jTextField5ATK10 = new javax.swing.JTextField();
        jTextField9Filtro10 = new javax.swing.JTextField();
        jButton3Copiar10 = new javax.swing.JButton();
        jTextField6DEF10 = new javax.swing.JTextField();
        jTextField7PS10 = new javax.swing.JTextField();
        jTextField8Level10 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField5ATK11 = new javax.swing.JTextField();
        jTextField9Filtro11 = new javax.swing.JTextField();
        jButton3Copiar11 = new javax.swing.JButton();
        jTextField6DEF11 = new javax.swing.JTextField();
        jTextField7PS11 = new javax.swing.JTextField();
        jTextField8Level11 = new javax.swing.JTextField();
        jButton1Calcular = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1spe = new javax.swing.JRadioButton();
        jRadioButton2pe1 = new javax.swing.JRadioButton();
        jRadioButton3pe2 = new javax.swing.JRadioButton();
        jButton1Filtrar = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Filtro PvP 1500");
        setPreferredSize(new java.awt.Dimension(610, 535));

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

        jLabel4.setText("ATAQUE:");

        jLabel5.setText("STAMINA:");

        jLabel6.setText("DEFESA:");

        jButton2Limpar.setText("LIMPAR");
        jButton2Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimparActionPerformed(evt);
            }
        });

        jLabel2.setText("Nº:");

        jLabel7.setText("LEVEL:");

        jButton3Copiar1.setText("COPIAR");
        jButton3Copiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar1ActionPerformed(evt);
            }
        });

        jLabel8.setText("FLTRO:");

        jLabel9.setText("RANKING:");

        jButton3Copiar2.setText("COPIAR");
        jButton3Copiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar2ActionPerformed(evt);
            }
        });

        jButton3Copiar3.setText("COPIAR");
        jButton3Copiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar3ActionPerformed(evt);
            }
        });

        jButton3Copiar4.setText("COPIAR");
        jButton3Copiar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar4ActionPerformed(evt);
            }
        });

        jButton3Copiar5.setText("COPIAR");
        jButton3Copiar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar5ActionPerformed(evt);
            }
        });

        jButton3Copiar6.setText("COPIAR");
        jButton3Copiar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar6ActionPerformed(evt);
            }
        });

        jButton3Copiar7.setText("COPIAR");
        jButton3Copiar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar7ActionPerformed(evt);
            }
        });

        jButton3Copiar8.setText("COPIAR");
        jButton3Copiar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar8ActionPerformed(evt);
            }
        });

        jButton3Copiar9.setText("COPIAR");
        jButton3Copiar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar9ActionPerformed(evt);
            }
        });

        jButton3Copiar10.setText("COPIAR");
        jButton3Copiar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar10ActionPerformed(evt);
            }
        });

        jLabel10.setText("ALEATÓRIO:");

        jButton3Copiar11.setText("COPIAR");
        jButton3Copiar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3Copiar11ActionPerformed(evt);
            }
        });

        jButton1Calcular.setText("CALCULAR");
        jButton1Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CalcularActionPerformed(evt);
            }
        });

        jLabel11.setText("FILTRO:");

        buttonGroup1.add(jRadioButton1spe);
        jRadioButton1spe.setSelected(true);
        jRadioButton1spe.setText("Sem pré-evolução");
        jRadioButton1spe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1speItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton2pe1);
        jRadioButton2pe1.setText("1ª pré-evolução");
        jRadioButton2pe1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2pe1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton3pe2);
        jRadioButton3pe2.setText("2ª pré-evolução");
        jRadioButton3pe2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3pe2ItemStateChanged(evt);
            }
        });

        jButton1Filtrar.setText("FILTRAR");
        jButton1Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1FiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField4Ranking1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5ATK1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jTextField6DEF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField7PS1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField8Level1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1Consultar)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextField9Filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton2Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3Copiar1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro6, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4Ranking10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5ATK10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6DEF10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7PS10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8Level10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9Filtro10, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3Copiar10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField9Filtro11, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3Copiar11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField5ATK11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6DEF11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField7PS11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField8Level11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1Calcular))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jRadioButton1spe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2pe1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3pe2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Filtrar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1Consultar)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1Filtrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1spe)
                            .addComponent(jRadioButton2pe1)
                            .addComponent(jRadioButton3pe2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4Ranking1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5ATK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6DEF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7PS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField8Level1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField9Filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3Copiar1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4Ranking2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5ATK2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6DEF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7PS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField8Level2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField9Filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3Copiar2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField4Ranking3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5ATK3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6DEF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7PS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField8Level3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField9Filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton3Copiar3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4Ranking4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField5ATK4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6DEF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7PS4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField8Level4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField9Filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3Copiar4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4Ranking5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5ATK5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6DEF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7PS5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8Level5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9Filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3Copiar5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4Ranking6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5ATK6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6DEF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7PS6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8Level6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9Filtro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3Copiar6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4Ranking7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5ATK7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6DEF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7PS7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8Level7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9Filtro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3Copiar7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4Ranking8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField5ATK8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6DEF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7PS8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField8Level8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9Filtro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3Copiar8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4Ranking9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5ATK9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6DEF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7PS9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8Level9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9Filtro9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3Copiar9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4Ranking10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5ATK10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6DEF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7PS10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8Level10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9Filtro10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3Copiar10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5ATK11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField6DEF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7PS11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8Level11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1Calcular))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3Copiar11)
                            .addComponent(jTextField9Filtro11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jButton2Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CalcularActionPerformed
        calculo11();
    }//GEN-LAST:event_jButton1CalcularActionPerformed

    private void jButton3Copiar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar11ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro11.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar11ActionPerformed

    private void jButton3Copiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar1ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro1.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar1ActionPerformed

    private void jButton3Copiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar2ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro2.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar2ActionPerformed

    private void jButton3Copiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar3ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro3.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar3ActionPerformed

    private void jButton3Copiar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar4ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro4.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar4ActionPerformed

    private void jButton3Copiar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar5ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro5.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar5ActionPerformed

    private void jButton3Copiar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar6ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro6.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar6ActionPerformed

    private void jButton3Copiar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar7ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro7.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar7ActionPerformed

    private void jButton3Copiar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar8ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro8.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar8ActionPerformed

    private void jButton3Copiar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar9ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro9.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar9ActionPerformed

    private void jButton3Copiar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3Copiar10ActionPerformed
        Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner selection = new StringSelection(jTextField9Filtro10.getText());
        board.setContents((Transferable) selection, selection);
    }//GEN-LAST:event_jButton3Copiar10ActionPerformed

    private void jTextField1IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1IDKeyPressed
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)) {
            if (jTextField1ID.getText().equals("")) {
                jTextField1ID.setText(String.valueOf(pvp1500db.getUltimoCodigo("tbpvp1500status", "id")));
                jTextField2Numero.requestFocus();
            } else {
                int id = Integer.parseInt(jTextField1ID.getText());
                pe1Banco = pe1db.getPreEvolucao1(id);
                pe2Banco = pe2db.getPreEvolucao2(id);
                pvp1500Banco = pvp1500db.getPvP(id);
                statusBanco = statusdb.getStatus(id);
                if (pvp1500Banco.getId() > 0) {
                    jTextField1ID.setText(String.valueOf(pvp1500Banco.getId()));
                    jTextField2Numero.setText(pvp1500Banco.getNumero());
                    jTextField3Nome.setText(pvp1500Banco.getNome());
                    if (pvp1500Banco.getId()==pe1Banco.getId()){
                        jRadioButton2pe1.setVisible(true);
                    }else{
                        jRadioButton2pe1.setVisible(false);
                    }
                    if (pvp1500Banco.getId()==pe2Banco.getId()){
                        jRadioButton3pe2.setVisible(true);
                    }else{
                        jRadioButton3pe2.setVisible(false);
                    }
                    preencher();
                    calcular();
                    jTextField2Numero.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Pokemon não existe!");
                    jTextField1ID.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_jTextField1IDKeyPressed

    private void jButton1FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1FiltrarActionPerformed
        if (jTextField1ID.getText().equals("")) {
            jTextField1ID.setText(String.valueOf(pvp1500db.getUltimoCodigo("tbpvp1500status", "id")));
            jTextField2Numero.requestFocus();
        } else {
            int id = Integer.parseInt(jTextField1ID.getText());
            pe1Banco = pe1db.getPreEvolucao1(id);
            pe2Banco = pe2db.getPreEvolucao2(id);
            pvp1500Banco = pvp1500db.getPvP(id);
            statusBanco = statusdb.getStatus(id);
            if (pvp1500Banco.getId() > 0) {
                jTextField1ID.setText(String.valueOf(pvp1500Banco.getId()));
                jTextField2Numero.setText(pvp1500Banco.getNumero());
                jTextField3Nome.setText(pvp1500Banco.getNome());
                if (pvp1500Banco.getId()==pe1Banco.getId()){
                    jRadioButton2pe1.setVisible(true);
                }else{
                    jRadioButton2pe1.setVisible(false);
                }
                if (pvp1500Banco.getId()==pe2Banco.getId()){
                    jRadioButton3pe2.setVisible(true);
                }else{
                    jRadioButton3pe2.setVisible(false);
                }
                preencher();
                calcular();
                jTextField2Numero.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Pokemon não existe!");
                jTextField1ID.requestFocus();
            }
        }
    }//GEN-LAST:event_jButton1FiltrarActionPerformed

    private void jButton1ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConsultarActionPerformed
        iframe.setVisible(true);
        jTextField1ID.setText(String.valueOf(iframe.getId()));
        int id = Integer.parseInt(jTextField1ID.getText());
        pe1Banco = pe1db.getPreEvolucao1(id);
        pe2Banco = pe2db.getPreEvolucao2(id);
        pvp1500Banco = pvp1500db.getPvP(id);
        statusBanco = statusdb.getStatus(id);
        if (pvp1500Banco.getId() > 0) {
            jTextField1ID.setText(String.valueOf(pvp1500Banco.getId()));
            jTextField2Numero.setText(pvp1500Banco.getNumero());
            jTextField3Nome.setText(pvp1500Banco.getNome());
            if (pvp1500Banco.getId()==pe1Banco.getId()){
                jRadioButton2pe1.setVisible(true);
                jRadioButton2pe1.setText(pe1Banco.getNome());
            }else{
                jRadioButton2pe1.setVisible(false);
            }
            if (pvp1500Banco.getId()==pe2Banco.getId()){
                jRadioButton3pe2.setVisible(true);
            }else{
                jRadioButton3pe2.setVisible(false);
            }
            preencher();
            calcular();
            jTextField2Numero.requestFocus();
        }
    }//GEN-LAST:event_jButton1ConsultarActionPerformed

    private void jButton2LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimparActionPerformed
        limpaCampos();
        jTextField1ID.requestFocus();
    }//GEN-LAST:event_jButton2LimparActionPerformed

    private void jRadioButton1speItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1speItemStateChanged
        calcular();
    }//GEN-LAST:event_jRadioButton1speItemStateChanged

    private void jRadioButton2pe1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2pe1ItemStateChanged
        calcular();
    }//GEN-LAST:event_jRadioButton2pe1ItemStateChanged

    private void jRadioButton3pe2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3pe2ItemStateChanged
        calcular();
    }//GEN-LAST:event_jRadioButton3pe2ItemStateChanged

    public void preencher() {
        jTextField4Ranking1.setText(pvp1500Banco.getRank1()); jTextField5ATK1.setText(pvp1500Banco.getIndAtk1()); jTextField6DEF1.setText(pvp1500Banco.getIndDef1()); jTextField7PS1.setText(pvp1500Banco.getIndSta1()); jTextField8Level1.setText(pvp1500Banco.getLevel1());
        jTextField4Ranking2.setText(pvp1500Banco.getRank2()); jTextField5ATK2.setText(pvp1500Banco.getIndAtk2()); jTextField6DEF2.setText(pvp1500Banco.getIndDef2()); jTextField7PS2.setText(pvp1500Banco.getIndSta2()); jTextField8Level2.setText(pvp1500Banco.getLevel2());
        jTextField4Ranking3.setText(pvp1500Banco.getRank3()); jTextField5ATK3.setText(pvp1500Banco.getIndAtk3()); jTextField6DEF3.setText(pvp1500Banco.getIndDef3()); jTextField7PS3.setText(pvp1500Banco.getIndSta3()); jTextField8Level3.setText(pvp1500Banco.getLevel3());
        jTextField4Ranking4.setText(pvp1500Banco.getRank4()); jTextField5ATK4.setText(pvp1500Banco.getIndAtk4()); jTextField6DEF4.setText(pvp1500Banco.getIndDef4()); jTextField7PS4.setText(pvp1500Banco.getIndSta4()); jTextField8Level4.setText(pvp1500Banco.getLevel4());
        jTextField4Ranking5.setText(pvp1500Banco.getRank5()); jTextField5ATK5.setText(pvp1500Banco.getIndAtk5()); jTextField6DEF5.setText(pvp1500Banco.getIndDef5()); jTextField7PS5.setText(pvp1500Banco.getIndSta5()); jTextField8Level5.setText(pvp1500Banco.getLevel5());
        jTextField4Ranking6.setText(pvp1500Banco.getRank6()); jTextField5ATK6.setText(pvp1500Banco.getIndAtk6()); jTextField6DEF6.setText(pvp1500Banco.getIndDef6()); jTextField7PS6.setText(pvp1500Banco.getIndSta6()); jTextField8Level6.setText(pvp1500Banco.getLevel6());
        jTextField4Ranking7.setText(pvp1500Banco.getRank7()); jTextField5ATK7.setText(pvp1500Banco.getIndAtk7()); jTextField6DEF7.setText(pvp1500Banco.getIndDef7()); jTextField7PS7.setText(pvp1500Banco.getIndSta7()); jTextField8Level7.setText(pvp1500Banco.getLevel7());
        jTextField4Ranking8.setText(pvp1500Banco.getRank8()); jTextField5ATK8.setText(pvp1500Banco.getIndAtk8()); jTextField6DEF8.setText(pvp1500Banco.getIndDef8()); jTextField7PS8.setText(pvp1500Banco.getIndSta8()); jTextField8Level8.setText(pvp1500Banco.getLevel8());
        jTextField4Ranking9.setText(pvp1500Banco.getRank9()); jTextField5ATK9.setText(pvp1500Banco.getIndAtk9()); jTextField6DEF9.setText(pvp1500Banco.getIndDef9()); jTextField7PS9.setText(pvp1500Banco.getIndSta9()); jTextField8Level9.setText(pvp1500Banco.getLevel9());
        jTextField4Ranking10.setText(pvp1500Banco.getRank10()); jTextField5ATK10.setText(pvp1500Banco.getIndAtk10()); jTextField6DEF10.setText(pvp1500Banco.getIndDef10()); jTextField7PS10.setText(pvp1500Banco.getIndSta10()); jTextField8Level10.setText(pvp1500Banco.getLevel10());
    }
    
    public void calcular(){
        calculo1();calculo2();calculo3();calculo4();calculo5();calculo6();calculo7();calculo8();calculo9();calculo10();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1Calcular;
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JButton jButton1Filtrar;
    private javax.swing.JButton jButton2Limpar;
    private javax.swing.JButton jButton3Copiar1;
    private javax.swing.JButton jButton3Copiar10;
    private javax.swing.JButton jButton3Copiar11;
    private javax.swing.JButton jButton3Copiar2;
    private javax.swing.JButton jButton3Copiar3;
    private javax.swing.JButton jButton3Copiar4;
    private javax.swing.JButton jButton3Copiar5;
    private javax.swing.JButton jButton3Copiar6;
    private javax.swing.JButton jButton3Copiar7;
    private javax.swing.JButton jButton3Copiar8;
    private javax.swing.JButton jButton3Copiar9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1spe;
    private javax.swing.JRadioButton jRadioButton2pe1;
    private javax.swing.JRadioButton jRadioButton3pe2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1ID;
    private javax.swing.JTextField jTextField2Numero;
    private javax.swing.JTextField jTextField3Nome;
    private javax.swing.JTextField jTextField4Ranking1;
    private javax.swing.JTextField jTextField4Ranking10;
    private javax.swing.JTextField jTextField4Ranking2;
    private javax.swing.JTextField jTextField4Ranking3;
    private javax.swing.JTextField jTextField4Ranking4;
    private javax.swing.JTextField jTextField4Ranking5;
    private javax.swing.JTextField jTextField4Ranking6;
    private javax.swing.JTextField jTextField4Ranking7;
    private javax.swing.JTextField jTextField4Ranking8;
    private javax.swing.JTextField jTextField4Ranking9;
    private javax.swing.JTextField jTextField5ATK1;
    private javax.swing.JTextField jTextField5ATK10;
    private javax.swing.JTextField jTextField5ATK11;
    private javax.swing.JTextField jTextField5ATK2;
    private javax.swing.JTextField jTextField5ATK3;
    private javax.swing.JTextField jTextField5ATK4;
    private javax.swing.JTextField jTextField5ATK5;
    private javax.swing.JTextField jTextField5ATK6;
    private javax.swing.JTextField jTextField5ATK7;
    private javax.swing.JTextField jTextField5ATK8;
    private javax.swing.JTextField jTextField5ATK9;
    private javax.swing.JTextField jTextField6DEF1;
    private javax.swing.JTextField jTextField6DEF10;
    private javax.swing.JTextField jTextField6DEF11;
    private javax.swing.JTextField jTextField6DEF2;
    private javax.swing.JTextField jTextField6DEF3;
    private javax.swing.JTextField jTextField6DEF4;
    private javax.swing.JTextField jTextField6DEF5;
    private javax.swing.JTextField jTextField6DEF6;
    private javax.swing.JTextField jTextField6DEF7;
    private javax.swing.JTextField jTextField6DEF8;
    private javax.swing.JTextField jTextField6DEF9;
    private javax.swing.JTextField jTextField7PS1;
    private javax.swing.JTextField jTextField7PS10;
    private javax.swing.JTextField jTextField7PS11;
    private javax.swing.JTextField jTextField7PS2;
    private javax.swing.JTextField jTextField7PS3;
    private javax.swing.JTextField jTextField7PS4;
    private javax.swing.JTextField jTextField7PS5;
    private javax.swing.JTextField jTextField7PS6;
    private javax.swing.JTextField jTextField7PS7;
    private javax.swing.JTextField jTextField7PS8;
    private javax.swing.JTextField jTextField7PS9;
    private javax.swing.JTextField jTextField8Level1;
    private javax.swing.JTextField jTextField8Level10;
    private javax.swing.JTextField jTextField8Level11;
    private javax.swing.JTextField jTextField8Level2;
    private javax.swing.JTextField jTextField8Level3;
    private javax.swing.JTextField jTextField8Level4;
    private javax.swing.JTextField jTextField8Level5;
    private javax.swing.JTextField jTextField8Level6;
    private javax.swing.JTextField jTextField8Level7;
    private javax.swing.JTextField jTextField8Level8;
    private javax.swing.JTextField jTextField8Level9;
    private javax.swing.JTextField jTextField9Filtro1;
    private javax.swing.JTextField jTextField9Filtro10;
    private javax.swing.JTextField jTextField9Filtro11;
    private javax.swing.JTextField jTextField9Filtro2;
    private javax.swing.JTextField jTextField9Filtro3;
    private javax.swing.JTextField jTextField9Filtro4;
    private javax.swing.JTextField jTextField9Filtro5;
    private javax.swing.JTextField jTextField9Filtro6;
    private javax.swing.JTextField jTextField9Filtro7;
    private javax.swing.JTextField jTextField9Filtro8;
    private javax.swing.JTextField jTextField9Filtro9;
    // End of variables declaration//GEN-END:variables

    public void limpaCampos() {
        jTextField1ID.setText("");
        jTextField2Numero.setText("");
        jTextField3Nome.setText("");
        jTextField4Ranking1.setText(""); jTextField5ATK1.setText(""); jTextField6DEF1.setText(""); jTextField7PS1.setText(""); jTextField8Level1.setText(""); jTextField9Filtro1.setText("");
        jTextField4Ranking2.setText(""); jTextField5ATK2.setText(""); jTextField6DEF2.setText(""); jTextField7PS2.setText(""); jTextField8Level2.setText(""); jTextField9Filtro2.setText("");
        jTextField4Ranking3.setText(""); jTextField5ATK3.setText(""); jTextField6DEF3.setText(""); jTextField7PS3.setText(""); jTextField8Level3.setText(""); jTextField9Filtro3.setText("");
        jTextField4Ranking4.setText(""); jTextField5ATK4.setText(""); jTextField6DEF4.setText(""); jTextField7PS4.setText(""); jTextField8Level4.setText(""); jTextField9Filtro4.setText("");
        jTextField4Ranking5.setText(""); jTextField5ATK5.setText(""); jTextField6DEF5.setText(""); jTextField7PS5.setText(""); jTextField8Level5.setText(""); jTextField9Filtro5.setText("");
        jTextField4Ranking6.setText(""); jTextField5ATK6.setText(""); jTextField6DEF6.setText(""); jTextField7PS6.setText(""); jTextField8Level6.setText(""); jTextField9Filtro6.setText("");
        jTextField4Ranking7.setText(""); jTextField5ATK7.setText(""); jTextField6DEF7.setText(""); jTextField7PS7.setText(""); jTextField8Level7.setText(""); jTextField9Filtro7.setText("");
        jTextField4Ranking8.setText(""); jTextField5ATK8.setText(""); jTextField6DEF8.setText(""); jTextField7PS8.setText(""); jTextField8Level8.setText(""); jTextField9Filtro8.setText("");
        jTextField4Ranking9.setText(""); jTextField5ATK9.setText(""); jTextField6DEF9.setText(""); jTextField7PS9.setText(""); jTextField8Level9.setText(""); jTextField9Filtro9.setText("");
        jTextField4Ranking10.setText(""); jTextField5ATK10.setText(""); jTextField6DEF10.setText(""); jTextField7PS10.setText(""); jTextField8Level10.setText(""); jTextField9Filtro10.setText("");
        jTextField5ATK11.setText(""); jTextField6DEF11.setText(""); jTextField7PS11.setText(""); jTextField8Level11.setText(""); jTextField9Filtro11.setText("");
    }
    
    DecimalFormat df = new DecimalFormat("0");
    public void calculo1() {
        double level = (Double.parseDouble(jTextField8Level1.getText()) * 2);
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK1.getText());
        int id = Integer.parseInt(jTextField6DEF1.getText());
        int is = Integer.parseInt(jTextField7PS1.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro1.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro1.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo2() {
        double level = Double.parseDouble(jTextField8Level2.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK2.getText());
        int id = Integer.parseInt(jTextField6DEF2.getText());
        int is = Integer.parseInt(jTextField7PS2.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro2.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro2.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo3() {
        double level = Double.parseDouble(jTextField8Level3.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK3.getText());
        int id = Integer.parseInt(jTextField6DEF3.getText());
        int is = Integer.parseInt(jTextField7PS3.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro3.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro3.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo4() {
        double level = Double.parseDouble(jTextField8Level4.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK4.getText());
        int id = Integer.parseInt(jTextField6DEF4.getText());
        int is = Integer.parseInt(jTextField7PS4.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro4.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro4.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo5() {
        double level = Double.parseDouble(jTextField8Level5.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK5.getText());
        int id = Integer.parseInt(jTextField6DEF5.getText());
        int is = Integer.parseInt(jTextField7PS5.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro5.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro5.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo6() {
        double level = Double.parseDouble(jTextField8Level6.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK6.getText());
        int id = Integer.parseInt(jTextField6DEF6.getText());
        int is = Integer.parseInt(jTextField7PS6.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro6.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro6.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo7() {
        double level = Double.parseDouble(jTextField8Level7.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK7.getText());
        int id = Integer.parseInt(jTextField6DEF7.getText());
        int is = Integer.parseInt(jTextField7PS7.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro7.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro7.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo8() {
        double level = Double.parseDouble(jTextField8Level8.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK8.getText());
        int id = Integer.parseInt(jTextField6DEF8.getText());
        int is = Integer.parseInt(jTextField7PS8.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro8.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro8.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo9() {
        double level = Double.parseDouble(jTextField8Level9.getText()) * 2;
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK9.getText());
        int id = Integer.parseInt(jTextField6DEF9.getText());
        int is = Integer.parseInt(jTextField7PS9.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro9.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro9.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo10() {
        double level = (Double.parseDouble(jTextField8Level10.getText()) * 2);
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK10.getText());
        int id = Integer.parseInt(jTextField6DEF10.getText());
        int is = Integer.parseInt(jTextField7PS10.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro10.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro10.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
    public void calculo11() {
        double level = (Double.parseDouble(jTextField8Level11.getText()) * 2);
        int ba = 0;
        int bd = 0;
        int bs = 0;
        if(jRadioButton1spe.isSelected()){
            ba = Integer.parseInt(statusBanco.getAtk());
            bd = Integer.parseInt(statusBanco.getDef());
            bs = Integer.parseInt(statusBanco.getSta());
        }else if(jRadioButton2pe1.isSelected()){
            ba = Integer.parseInt(pe1Banco.getAtk());
            bd = Integer.parseInt(pe1Banco.getDef());
            bs = Integer.parseInt(pe1Banco.getSta());
        }else if(jRadioButton3pe2.isSelected()){
            ba = Integer.parseInt(pe2Banco.getAtk());
            bd = Integer.parseInt(pe2Banco.getDef());
            bs = Integer.parseInt(pe2Banco.getSta());
        }
        int ia = Integer.parseInt(jTextField5ATK11.getText());
        int id = Integer.parseInt(jTextField6DEF11.getText());
        int is = Integer.parseInt(jTextField7PS11.getText());
        int ataque = 0, defesa = 0, stamina = 0;
        int estrela = ia + id + is;
        String nivelPokemon = String.valueOf(df.format(level));
        // Lista todos registros da tabela
        ArrayList<ModelCpm> getMulti = cpmdb.getMulti(nivelPokemon);
        String teste = null, teste2 = null;
        for (ModelCpm auxCpm : getMulti) {
            double cp = (ba + ia) * Math.pow((bd + id), 0.5) * Math.pow((bs + is), 0.5) * Math.pow((Double.parseDouble(auxCpm.getMultiplicar())), 2) / 10;
            if (cp < 10) {
                cp = 10;
            }
            if (cp > 500) {
                break;
            }
            if (teste == null) {
                teste = String.valueOf("pc" + df.format(Math.floor(cp)));
            } else {
                teste = teste + ",pc" + String.valueOf(df.format(Math.floor(cp)));
            }
        }
        for (ModelCpm auxCpm : getMulti) {
            double ps = (bs + is) * (Double.parseDouble(auxCpm.getMultiplicar()));
            if (ps < 10) {
                ps = 10;
            }
            if (teste2 == null) {
                teste2 = String.valueOf("&ps" + df.format(Math.floor(ps)));
            } else {
                teste2 = teste2 + ",ps" + String.valueOf(df.format(Math.floor(ps)));
            }
        }
        if (ia == 15 & id == 15 & is == 15) {
            jTextField9Filtro11.setText(jTextField2Numero.getText() + "&4*&" + String.valueOf(teste + "" + teste2));
        } else {
            if (ia == 0) {
                ataque = 0;
            } else if (ia <= 5) {
                ataque = 1;
            } else if (ia <= 10) {
                ataque = 2;
            } else if (ia <= 14) {
                ataque = 3;
            } else if (ia == 15) {
                ataque = 4;
            }
            if (id == 0) {
                defesa = 0;
            } else if (id <= 5) {
                defesa = 1;
            } else if (id <= 10) {
                defesa = 2;
            } else if (id <= 14) {
                defesa = 3;
            } else if (id == 15) {
                defesa = 4;
            }
            if (is == 0) {
                stamina = 0;
            } else if (is <= 5) {
                stamina = 1;
            } else if (is <= 10) {
                stamina = 2;
            } else if (is <= 14) {
                stamina = 3;
            } else if (is == 15) {
                stamina = 4;
            }
            if ((ia + id + is) < 23) {
                estrela = 0;
            } else if ((ia + id + is) < 30) {
                estrela = 1;
            } else if ((ia + id + is) < 37) {
                estrela = 2;
            } else if ((ia + id + is) < 45) {
                estrela = 3;
            } else {
                estrela = 4;
            }
            jTextField9Filtro11.setText(jTextField2Numero.getText() + "&" + estrela + "*&" + ataque + "ataque&" + defesa + "defesa&" + stamina + "ps&" + String.valueOf(teste + "" + teste2));
        }
    }
}
