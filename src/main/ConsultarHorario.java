/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Aluno;
import classes.Horario;
import classes.Monitor;
import classes.Monitoria;
import classes.Turma;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 20181094010018
 */
public class ConsultarHorario extends javax.swing.JInternalFrame {
    private Monitoria m;
    private Monitor monitor = new Monitor(null, null, null, null);
    
    /**
     * Creates new form ConsultarHorario
     */
    public ConsultarHorario() {
        initComponents();
    }
    
    public void setMonitoria(Monitoria m){
        this.m = m;
    }
    
    public void preencherBox(){
        for (int i = 0; i < m.getTurmas().size(); i++) {
            cbConsultarHorario.addItem(m.getTurmas().get(i));
        };
    }

    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbConsultarHorario = new javax.swing.JComboBox<Object>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setClosable(true);
        setTitle("Consultar Horário");

        cbConsultarHorario.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        cbConsultarHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a turma..." }));
        cbConsultarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultarHorarioActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Dia da semana", "Horário"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 379, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbConsultarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbConsultarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultarHorarioActionPerformed
        
    }//GEN-LAST:event_cbConsultarHorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel horarios = new DefaultTableModel();
        jTable1.setModel(horarios);
        horarios.addColumn("Dia");
        horarios.addColumn("Horário"); 
        for (int i = 0; i < m.getMonitor().consultarHorario((Turma) cbConsultarHorario.getSelectedItem()).size(); i++) {
            
            horarios.addRow(new Object []{m.getMonitor().consultarHorario((Turma) cbConsultarHorario.getSelectedItem()).get(i).getDia(), m.getMonitor().consultarHorario((Turma) cbConsultarHorario.getSelectedItem()).get(i).getHora() });
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> cbConsultarHorario;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}