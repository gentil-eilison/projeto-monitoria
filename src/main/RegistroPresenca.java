/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Aluno;
import classes.Monitoria;
import classes.Turma;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GentileKadson
 */
public class RegistroPresenca extends javax.swing.JInternalFrame {
    private Monitoria m;
    
    
    /**
     * Creates new form RegistroPresenca
     */
    public RegistroPresenca() {
        initComponents();
        JOptionPane.showMessageDialog(this, "Com o aluno selecionado, pressione P para presença e F"
                + " para falta!");
    }
    
    public void setMonitoria(Monitoria m){
        this.m = m;
    }
    
    public void preencherBox(){
        for (int i = 0; i < m.getTurmas().size(); i++) {
            cbConsultarTurma.addItem(m.getTurmas().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbConsultarTurma = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lAlunos = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setTitle("Registro de Presenças");

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel1.setText("Selecione a turma");

        cbConsultarTurma.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        cbConsultarTurma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "..." }));
        cbConsultarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultarTurmaActionPerformed(evt);
            }
        });

        lAlunos.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        lAlunos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lAlunosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(lAlunos);

        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jButton1.setText("Presença");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jButton2.setText("Falta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbConsultarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbConsultarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbConsultarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultarTurmaActionPerformed
        DefaultListModel lista = new DefaultListModel();
        lAlunos.setModel(lista);
        for (int i = 0; i < m.getMonitor().consultarAlunos((Turma)cbConsultarTurma.getSelectedItem()).size(); i++) {
            lista.addElement(m.getMonitor().consultarAlunos((Turma)cbConsultarTurma.getSelectedItem()).get(i));
        }
    }//GEN-LAST:event_cbConsultarTurmaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m.getMonitor().registrarPresenca((Aluno)lAlunos.getSelectedValue());
        JOptionPane.showMessageDialog(this, "Presença registrada!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       m.getMonitor().registrarFalta((Aluno)lAlunos.getSelectedValue());
       JOptionPane.showMessageDialog(this, "Falta registrada!");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lAlunosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lAlunosKeyPressed
            if (evt.getKeyCode() == KeyEvent.VK_P) {
                m.getMonitor().registrarPresenca((Aluno) lAlunos.getSelectedValue());
                JOptionPane.showMessageDialog(this, "Presença registrada!");
            }else if(evt.getKeyCode() == KeyEvent.VK_F){
                 m.getMonitor().registrarFalta((Aluno)lAlunos.getSelectedValue());
                  JOptionPane.showMessageDialog(this, "Falta registrada!");
            }else{
                JOptionPane.showMessageDialog(this, "Comando inválido!");
            }
    }//GEN-LAST:event_lAlunosKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbConsultarTurma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lAlunos;
    // End of variables declaration//GEN-END:variables
}
