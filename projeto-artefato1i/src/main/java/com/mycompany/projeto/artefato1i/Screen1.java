/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.artefato1i;

import controller.ControleComponente;
import models.Componente;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author João Henrique
 */
public class Screen1 extends javax.swing.JFrame {

  
   
    public Screen1() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCopyr = new javax.swing.JLabel();
        prgMem = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        prgDisk = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        prgProc = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblMaxCPUFixa = new javax.swing.JLabel();
        lblUsoCpuVar = new javax.swing.JLabel();
        lblUsoCpuMinFixa = new javax.swing.JLabel();
        lblUsoCpuMinVar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblMaxDiskFixa = new javax.swing.JLabel();
        lblUsoDiskVar = new javax.swing.JLabel();
        lblUsoDiskMinFixa = new javax.swing.JLabel();
        lblUsoDiskMinVar = new javax.swing.JLabel();
        lblMaxMemFixa = new javax.swing.JLabel();
        lblUsoMemVar = new javax.swing.JLabel();
        lblUsoMemMinFixa = new javax.swing.JLabel();
        lblUsoMemMinVar = new javax.swing.JLabel();
        lblMediaProc = new javax.swing.JLabel();
        lblMediaCPUFixa = new javax.swing.JLabel();
        lblMediaDiscoFixa1 = new javax.swing.JLabel();
        lblMediaMemFixa = new javax.swing.JLabel();
        lblMediaDisk = new javax.swing.JLabel();
        lblMediaMem = new javax.swing.JLabel();
        lblAlertaCPUFixa = new javax.swing.JLabel();
        lblAlertaDiskFixa = new javax.swing.JLabel();
        lblAlertaMemFixa = new javax.swing.JLabel();
        lblAlertaCPU = new javax.swing.JLabel();
        lblAlertaDisk = new javax.swing.JLabel();
        lblAlertaMem = new javax.swing.JLabel();
        lblDicaFixa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCopyr.setText("Copyright - Equipe Paymoon. e Bandtec 2021");

        prgMem.setStringPainted(true);

        jLabel1.setText("Uso da Memória (%):");

        prgDisk.setStringPainted(true);

        jLabel2.setText("Uso do disco (%): ");

        prgProc.setStringPainted(true);

        jLabel3.setText("Uso da CPU (%): ");

        jButton1.setText("Ler dados ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblMaxCPUFixa.setText("Uso Máximo");

        lblUsoCpuVar.setText("xxx");

        lblUsoCpuMinFixa.setText("Uso Mínimo");

        lblUsoCpuMinVar.setText("xxx");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("PayMoon");

        lblMaxDiskFixa.setText("Uso Máximo");

        lblUsoDiskVar.setText("xxx");

        lblUsoDiskMinFixa.setText("Uso Mínimo");

        lblUsoDiskMinVar.setText("xxx");

        lblMaxMemFixa.setText("Uso Máximo");

        lblUsoMemVar.setText("xxx");

        lblUsoMemMinFixa.setText("Uso Mínimo");

        lblUsoMemMinVar.setText("xxx");

        lblMediaProc.setText("xxx");

        lblMediaCPUFixa.setText("Media Uso CPU:");

        lblMediaDiscoFixa1.setText("Media Uso Disco:");

        lblMediaMemFixa.setText("Media Uso Disco:");

        lblMediaDisk.setText("xxx");

        lblMediaMem.setText("xxx");

        lblAlertaCPUFixa.setText("Nível de Alerta:");

        lblAlertaDiskFixa.setText("Nível de Alerta:");

        lblAlertaMemFixa.setText("Nível de Alerta:");

        lblAlertaCPU.setText("null");

        lblAlertaDisk.setText("null");

        lblAlertaMem.setText("null");

        lblDicaFixa.setText("Dica:");

        lblDica.setColumns(20);
        lblDica.setRows(5);
        jScrollPane1.setViewportView(lblDica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxMemFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoMemVar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUsoMemMinFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoMemMinVar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMediaMemFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMediaMem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaDiskFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaDisk))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxDiskFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoDiskVar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUsoDiskMinFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoDiskMinVar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMediaDiscoFixa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMediaDisk))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgProc, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaCPUFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaCPU)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaxCPUFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoCpuVar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUsoCpuMinFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsoCpuMinVar)
                                .addGap(13, 13, 13)
                                .addComponent(lblMediaCPUFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDicaFixa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblMediaProc)))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prgMem, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaMemFixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAlertaMem))
                            .addComponent(lblCopyr))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDicaFixa)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxCPUFixa)
                    .addComponent(lblUsoCpuVar)
                    .addComponent(lblUsoCpuMinFixa)
                    .addComponent(lblUsoCpuMinVar)
                    .addComponent(lblMediaProc)
                    .addComponent(lblMediaCPUFixa)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prgProc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAlertaCPUFixa)
                        .addComponent(lblAlertaCPU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxDiskFixa)
                    .addComponent(lblUsoDiskVar)
                    .addComponent(lblUsoDiskMinFixa)
                    .addComponent(lblUsoDiskMinVar)
                    .addComponent(lblMediaDiscoFixa1)
                    .addComponent(lblMediaDisk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prgDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAlertaDiskFixa)
                        .addComponent(lblAlertaDisk)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxMemFixa)
                    .addComponent(lblUsoMemVar)
                    .addComponent(lblUsoMemMinFixa)
                    .addComponent(lblUsoMemMinVar)
                    .addComponent(lblMediaMemFixa)
                    .addComponent(lblMediaMem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prgMem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAlertaMemFixa)
                        .addComponent(lblAlertaMem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCopyr))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //A main (view) nao sabe da existencia da model. Portanto chamarei a 
    //classe de controle para pegarmos os dados filtrados 
        
    ControleComponente controle1 = new ControleComponente();
    //controle1.setAll();
    prgProc.setValue(controle1.getUsoAtualCpu().intValue());
    prgDisk.setValue(controle1.getUsoAtualDisco().intValue());
    prgMem.setValue(controle1.getUsoAtualRam().intValue());
    
    
       /*
    70> Extremo
    50 - 69 - Moderado
    0 - 49 - Estável
    */
    lblAlertaCPU.setText(controle1.getNivelDeAlertaCpu());
    lblAlertaDisk.setText(controle1.getNivelDeAlertaDisco());
    lblAlertaMem.setText(controle1.getNivelDeAlertaRam());
 
    
    
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlertaCPU;
    private javax.swing.JLabel lblAlertaCPUFixa;
    private javax.swing.JLabel lblAlertaDisk;
    private javax.swing.JLabel lblAlertaDiskFixa;
    private javax.swing.JLabel lblAlertaMem;
    private javax.swing.JLabel lblAlertaMemFixa;
    private javax.swing.JLabel lblCopyr;
    private javax.swing.JTextArea lblDica;
    private javax.swing.JLabel lblDicaFixa;
    private javax.swing.JLabel lblMaxCPUFixa;
    private javax.swing.JLabel lblMaxDiskFixa;
    private javax.swing.JLabel lblMaxMemFixa;
    private javax.swing.JLabel lblMediaCPUFixa;
    private javax.swing.JLabel lblMediaDiscoFixa1;
    private javax.swing.JLabel lblMediaDisk;
    private javax.swing.JLabel lblMediaMem;
    private javax.swing.JLabel lblMediaMemFixa;
    private javax.swing.JLabel lblMediaProc;
    private javax.swing.JLabel lblUsoCpuMinFixa;
    private javax.swing.JLabel lblUsoCpuMinVar;
    private javax.swing.JLabel lblUsoCpuVar;
    private javax.swing.JLabel lblUsoDiskMinFixa;
    private javax.swing.JLabel lblUsoDiskMinVar;
    private javax.swing.JLabel lblUsoDiskVar;
    private javax.swing.JLabel lblUsoMemMinFixa;
    private javax.swing.JLabel lblUsoMemMinVar;
    private javax.swing.JLabel lblUsoMemVar;
    private javax.swing.JProgressBar prgDisk;
    private javax.swing.JProgressBar prgMem;
    private javax.swing.JProgressBar prgProc;
    // End of variables declaration//GEN-END:variables
}
