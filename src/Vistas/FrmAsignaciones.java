/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Modelos.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sala221
 */
public class FrmAsignaciones extends javax.swing.JFrame {

    /**
     * Creates new form FrmAsignaciones
     */
    public FrmAsignaciones() {
        initComponents();
         
    }
    
    
  
    
        
   
    
     


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbEm = new javax.swing.JLabel();
        jLbListado = new javax.swing.JLabel();
        jComboListado = new javax.swing.JComboBox();
        jLbEstudiante = new javax.swing.JLabel();
        jTxtdocu = new javax.swing.JTextField();
        jLbNumeroCaso = new javax.swing.JLabel();
        jTFNumeroCaso = new javax.swing.JTextField();
        jLBFechaAsignacion = new javax.swing.JLabel();
        jLbFechaRevocacion = new javax.swing.JLabel();
        jDateAsignacion = new com.toedter.calendar.JDateChooser();
        jDateRevocacion = new com.toedter.calendar.JDateChooser();
        jLBAsunto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAsunto = new javax.swing.JTextArea();
        jBTAsignar = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jBTReasignar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblListado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLbEm.setText("Uso exclusivo del monitor");

        jLbListado.setText("Listado Usuarios");

        jComboListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboListadoActionPerformed(evt);
            }
        });

        jLbEstudiante.setText("Documento:");

        jTxtdocu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtdocuKeyTyped(evt);
            }
        });

        jLbNumeroCaso.setText("Numero del caso");

        jTFNumeroCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumeroCasoKeyTyped(evt);
            }
        });

        jLBFechaAsignacion.setText("Fecha de asignacion");

        jLbFechaRevocacion.setText("Fecha de revocacion");

        jLBAsunto.setText("Asunto");

        jTAsunto.setColumns(20);
        jTAsunto.setRows(5);
        jTAsunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTAsuntoKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTAsunto);

        jBTAsignar.setText("ASIGNAR");

        jBtSalir.setText("SALIR");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jBTReasignar.setText("REASIGNAR");

        jTblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTblListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbListado)
                                .addGap(95, 95, 95)
                                .addComponent(jComboListado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbEstudiante)
                                    .addComponent(jLbNumeroCaso)
                                    .addComponent(jLBFechaAsignacion)
                                    .addComponent(jLbFechaRevocacion))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNumeroCaso)
                                    .addComponent(jDateAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jDateRevocacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtdocu)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLbEm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLBAsunto)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jBTAsignar)
                        .addGap(84, 84, 84)
                        .addComponent(jBtSalir)
                        .addGap(89, 89, 89)
                        .addComponent(jBTReasignar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLBAsunto)
                    .addComponent(jLbEm))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbListado)
                            .addComponent(jComboListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbEstudiante)
                            .addComponent(jTxtdocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbNumeroCaso)
                            .addComponent(jTFNumeroCaso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLBFechaAsignacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jDateAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateRevocacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbFechaRevocacion))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTAsignar)
                    .addComponent(jBtSalir)
                    .addComponent(jBTReasignar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jBtSalirActionPerformed

    private void jComboListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboListadoActionPerformed
        // TODer.getLogger(FrmAsignaciones.class.getName()).log(Level.SEVERE, null, ex);
    
    
    }//GEN-LAST:event_jComboListadoActionPerformed

    private void jTFNumeroCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumeroCasoKeyTyped
        // TODO add your handling code here:
        char  c = evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();

        String cadena = jTFNumeroCaso.getText();
        if (cadena.length() >= 7) evt.consume();
    }//GEN-LAST:event_jTFNumeroCasoKeyTyped

    private void jTAsuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAsuntoKeyTyped
        // TODO add your handling code here:
        char  c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_jTAsuntoKeyTyped

    private void jTxtdocuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtdocuKeyTyped
        // TODO add your handling code here:
          char  c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_jTxtdocuKeyTyped

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
            java.util.logging.Logger.getLogger(FrmAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAsignaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBTAsignar;
    public javax.swing.JButton jBTReasignar;
    public javax.swing.JButton jBtSalir;
    public javax.swing.JComboBox jComboListado;
    public com.toedter.calendar.JDateChooser jDateAsignacion;
    public com.toedter.calendar.JDateChooser jDateRevocacion;
    private javax.swing.JLabel jLBAsunto;
    private javax.swing.JLabel jLBFechaAsignacion;
    private javax.swing.JLabel jLbEm;
    private javax.swing.JLabel jLbEstudiante;
    private javax.swing.JLabel jLbFechaRevocacion;
    private javax.swing.JLabel jLbListado;
    private javax.swing.JLabel jLbNumeroCaso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTAsunto;
    public javax.swing.JTextField jTFNumeroCaso;
    public javax.swing.JTable jTblListado;
    public javax.swing.JTextField jTxtdocu;
    // End of variables declaration//GEN-END:variables
}
