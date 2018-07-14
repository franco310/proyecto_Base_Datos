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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Franco-Pc
 */
public class periodos extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection con;
    Statement sent;

    
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
        textFieldCodigo.setEditable(true);
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
    
    public void Llenar(){  
        try{
         //con=AccesoDatos.get();
         String[] titulos={"COD","NOMBRE","FECHA_INICIO","FECHA_FIN","TIPO","COD_SICOA","ESTADO","OBSERVACIONES"};
         String sql ="select *from contactos";
         model = new DefaultTableModel(null,titulos);
         ResultSet rs=sent.executeQuery(sql);
         String []fila=new String[8];
         while(rs.next()){
         fila[0]=rs.getString("COD");
         fila[1]=rs.getString("NOMBRE");
         fila[2]=rs.getString("FECHA_INICIO");
         fila[3]=rs.getString("FECHA_FIN");
         fila[4]=rs.getString("TIPO");
         fila[5]=rs.getString("COD_SICOA");
         fila[6]=rs.getString("ESTADO");
         fila[7]=rs.getString("OBSERVACIONES");
        
        
         model.addRow(fila);
         }
         Tabla.setModel(model);
     }catch(Exception e){
  e.printStackTrace();
 }

 
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PERIODO");

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
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        Tabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD", "NOMBRE", "FECHA INICIO", "FECHA FIN", "TIPO", "COD SICOA", "ESTADO", "OBSERVACIONES"
            }
        ));
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(520, 520, 520))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(BtnNuevo)
                .addGap(69, 69, 69)
                .addComponent(BtnModificar)
                .addGap(64, 64, 64)
                .addComponent(BtnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnAcep1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAcept2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel8)
                                .addGap(9, 9, 9)
                                .addComponent(jTextFieldSicoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BtnBuscar))
                                        .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNuevo)
                            .addComponent(BtnModificar)
                            .addComponent(BtnEliminar))
                        .addGap(80, 80, 80)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
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

        Habilitar();
        if (BtnNuevo.getText().compareTo("Nuevo")==0) {
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
//                    Item= jComboBoxTipo.getSelectedItem().toString();
//                    periodos.setTipo(Integer.parseInt(jComboBoxTipo.getItemAt(1-2)));
                    periodos.setCodigo_sicoa(Integer.parseInt(jTextFieldSicoa.getText()));
//                    Item= jComboBoxEstado.getSelectedItem().toString();
//                    periodos.setEstado(Integer.parseInt(jComboBoxEstado.getItemAt(0-1)));
                    periodos.setObservaciones(jTextArea1.getText());
                    
                        if (fperiodos.Insertar(periodos) ){
                            JOptionPane.showMessageDialog(this,"Ingreso correcto",
                                    "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                            BtnNuevo.setText("Nuevo");
                        }
                    } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                    }
                limpiarControl();
                
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

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        FPeriodos fPeriodos= new FPeriodos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "DESEA MODIFCAR EL PERIODO","ACEPTE",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_NO_OPTION){

            try{
                periodos.setCodigo(Integer.parseInt(textFieldCodigo.getText()));
                periodos.setNombre(textFieldName.getText());
                periodos.setCodigo_sicoa(Integer.parseInt(jTextFieldSicoa.getText()));
                periodos.setObservaciones(jTextArea1.getText());
                
                
                if (fPeriodos.actualizar(periodos)){
                    JOptionPane.showMessageDialog(this,"PERIODO MODIFICADO",
                            "MODIFICACION EXITOSA",JOptionPane.INFORMATION_MESSAGE);
                    
                    limpiarControl();
                    
                }
                
        }catch (Exception ex ){
            JOptionPane.showMessageDialog(this,"ERROR DESCONOCIDO : "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        }
       
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
         FPeriodos fPeriodos= new FPeriodos();
        int confirmacion = JOptionPane.showConfirmDialog(this,
                "DESEA ELIMINAR EL PERIODO","ACEPTE",
                JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_NO_OPTION){
            try{
                periodos.setCodigo(Integer.parseInt(textFieldCodigo.getText()));
                periodos.setNombre(textFieldName.getText());
                periodos.setCodigo_sicoa(Integer.parseInt(jTextFieldSicoa.getText()));
                periodos.setObservaciones(jTextArea1.getText());
                
                
                if (fPeriodos.eliminar(periodos)){
                    JOptionPane.showMessageDialog(this,"PERIODO ELIMINADO",
                            "MODIFICACION EXITOSA",JOptionPane.INFORMATION_MESSAGE);
                    
                    limpiarControl();
                    
                }
                
        }catch (Exception ex ){
            JOptionPane.showMessageDialog(this,"ERROR DESCONOCIDO : "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
            
        }
        
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
    private javax.swing.JTable Tabla;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldSicoa;
    private java.awt.TextField textFieldCodigo;
    private java.awt.TextField textFieldName;
    // End of variables declaration//GEN-END:variables

}
