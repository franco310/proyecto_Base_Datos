/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import java.text.SimpleDateFormat;
import java.util.Date;
import entidades.Periodos;
import funciones.FPeriodos;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Franco-Pc
 */
public class periodos extends javax.swing.JFrame {

    /** Creates new form periodos */
    public periodos() {
        initComponents();
        Desabilitar();
        Habilitar();
    
    }

      String Item="";
    private void limpiarControl() {
        textFieldCodigo.setText("");
        textFieldName.setText("");
        jDateInicio.setDateFormatString("yyyy-MM-dd");
        jDateFin.setDateFormatString("");
//        jComboBoxTipo.setUI();
//        jComboBoxEstado.setTex("");
        jTextArea1.setText("");
        jTextFieldSicoa.setText("");
    }
     public void Desabilitar(){
         textFieldCodigo.setEditable(false);
        textFieldName.setEditable(false);
        jDateInicio.setEnabled(false);
        jDateFin.setEnabled(false);
//        jComboBoxTipo.setUI();
//        jComboBoxEstado.setTex("");
        jTextArea1.setEditable(false);
        jTextFieldSicoa.setEditable(false);  
         
         
     }
    
    public void Habilitar(){
        textFieldCodigo.requestFocus();
        textFieldName.setEditable(true);
        jDateInicio.setEnabled(true);
        jDateFin.setEnabled(true);
//        jComboBoxTipo.setUI();
//        jComboBoxEstado.setTex("");
        jTextArea1.setEditable(true);
        jTextFieldSicoa.setEditable(true);  
         
     }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textFieldCodigo = new java.awt.TextField();
        textFieldName = new java.awt.TextField();
        Volver = new java.awt.Button();
        jLabel10 = new javax.swing.JLabel();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jDateFin = new com.toedter.calendar.JDateChooser();
        BtnAcept2 = new javax.swing.JButton();
        btnAcep1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jTextFieldSicoa = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        BtnNuevo = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Periodo");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha de Inicio");

        jLabel5.setText("Fecha de Finalizacion  ");

        jLabel6.setText("Tipo");

        jLabel7.setText("Observaciones");

        jLabel8.setText("Codigo Sicoa");

        jLabel9.setText("Estado");

        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });

        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNameActionPerformed(evt);
            }
        });

        Volver.setActionCommand("btnvolver");
        Volver.setLabel("Menu");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel10.setText("Datos ");

        BtnAcept2.setText("Aceptar");
        BtnAcept2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcept2ActionPerformed(evt);
            }
        });

        btnAcep1.setText("Aceptar");
        btnAcep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcep1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Periodo1", "Periodo2", " " }));
        jComboBoxTipo.setToolTipText("");
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");

        BtnEliminar.setText("Eliminar");

        BtnBuscar.setText("jButton1");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnAcep1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addComponent(BtnAcept2)))
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(BtnNuevo)
                .addGap(88, 88, 88)
                .addComponent(BtnModificar)
                .addGap(95, 95, 95)
                .addComponent(BtnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(BtnBuscar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)
                        .addComponent(jTextFieldSicoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel4)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAcept2)
                    .addComponent(btnAcep1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSicoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNuevo)
                    .addComponent(BtnModificar)
                    .addComponent(BtnEliminar))
                .addGap(37, 37, 37)
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal obj= new MenuPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void btnAcep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcep1ActionPerformed
     Date date =jDateInicio.getDate();
     
     long da =date.getTime();
     java.sql.Date fechaB= new  java.sql.Date (da);
     JOptionPane.showMessageDialog(null,fechaB);
    


      
    }//GEN-LAST:event_btnAcep1ActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void BtnAcept2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcept2ActionPerformed
        // TODO add your handling code here:
        Date date= jDateFin.getDate();
        long d =date.getTime();
        java.sql.Date fecha= new  java.sql.Date (d);
        JOptionPane.showMessageDialog(null,fecha);
    


    }//GEN-LAST:event_BtnAcept2ActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        // TODO add your handling code here:
       jComboBoxTipo =new JComboBox();
       jComboBoxTipo.addItem("Periodo1");
       jComboBoxTipo.addItem("Periodo2");
       
       
    
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        
         limpiarControl();
        Habilitar();
        if (BtnNuevo.getText().compareTo("Nuevo")==0) {
            limpiarControl();
            BtnNuevo.setText("Registrar");
        }else{
            if(BtnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Periodos periodos = new Periodos();
                    FPeriodos fperiodos = new FPeriodos();
                    periodos.setNombre(textFieldName.getText());
                    periodos.setCodigo(Integer.parseInt(textFieldCodigo.getText()));
//                    periodos.setFecha_inicio(java.sql.Date.valueOf(getName()));
//                    periodos.setFecha_fin(java.sql.Date.valueOf(getName()));
                    Item= jComboBoxTipo.getSelectedItem().toString();
//                    periodos.setTipo(Integer.parseInt(jComboBoxTipo.getItemAt(1-2)));
//                    periodos.setCodigo_sicoa(Integer.parseInt(jTextFieldSicoa.getText()));
//                    Item= jComboBoxEstado.getSelectedItem().toString();
//                    periodos.setEstado(Integer.parseInt(jComboBoxEstado.getItemAt(0-1)));
                    periodos.setObservaciones(jTextArea1.getText());
                    
                        if (fperiodos.Insertar(periodos) ){
                            limpiarControl();
                            JOptionPane.showMessageDialog(this,"Ingreso correcto",
                                    "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                            BtnNuevo.setText("Nuevo");
                        }
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
        }
                    
//            
//                   
        
        
        
        
        
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void textFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNameActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
         limpiarControl();
     FPeriodos fperiodos = new FPeriodos();
        try {
            
            
            if (periodos != null) {
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR EL PERIODO NO EXISTE",
                "Error", JOptionPane.ERROR_MESSAGE);
             
        }                     
    }//GEN-LAST:event_BtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(periodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(periodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(periodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(periodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new periodos().setVisible(true);
            }
        });
    }

    
    Periodos periodos;
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcept2;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private java.awt.Button Volver;
    private javax.swing.JButton btnAcep1;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private com.toedter.calendar.JDateChooser jDateFin;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldSicoa;
    private java.awt.TextField textFieldCodigo;
    private java.awt.TextField textFieldName;
    // End of variables declaration//GEN-END:variables

}
