
package vistas;

import entidades.Usuario;
import funciones.FUsuario;;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class usuario extends javax.swing.JFrame {

    public usuario() {
        initComponents();
    }
    private static SimpleDateFormat sdf =new SimpleDateFormat("yyy-MM-dd");
    public static java.sql.Timestamp FechaDadoString(String fecha) {
    //java.util.Date utilDate = new java.util.Date(fecha); //fecha actual
        long lnMilisegundos = 0;
        try {
            java.util.Date date = sdf.parse(fecha);
            lnMilisegundos = date.getTime();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
        return sqlTimestamp;
        //long lnMilisegundos = utilDate.getTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtidentificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnombre_corto = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        txtclave_pregunta = new javax.swing.JTextField();
        txtclave_respuesta = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        txtcodigo_salt = new javax.swing.JTextField();
        txtultima_ip = new javax.swing.JTextField();
        txtruta_firma = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtestado = new javax.swing.JTextField();
        txtprimer_acceso = new javax.swing.JTextField();
        txtultimo_acceso = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtulima_modificacion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnLimpiarControl = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Del Usuario");

        btnVolver_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        btnVolver_menu.setText("Menu Principal");
        btnVolver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver_menuActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Identificacion:");

        txtcodigo.setEnabled(false);

        jLabel5.setText("DATOS DEL USUARIO");

        jLabel6.setText("Nonmbre Corto:");

        jLabel7.setText("Clave:");

        jLabel8.setText("Clave Pregunta:");

        jLabel9.setText("Clave Respuesta:");

        jLabel10.setText("Mail:");

        jLabel13.setText("Ultima ip:");

        jLabel14.setText("Codigo Salt:");

        jLabel15.setText("Ruta firma:");

        txtnombre_corto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_cortoActionPerformed(evt);
            }
        });

        txtultima_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtultima_ipActionPerformed(evt);
            }
        });

        txtruta_firma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtruta_firmaActionPerformed(evt);
            }
        });

        jLabel11.setText("OPCIONES");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diag.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/list.png"))); // NOI18N
        btnlistar.setText("LISTAR");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        txtbuscar.setToolTipText("Codigo a Buscar");

        jLabel12.setText("Estado:");

        jLabel16.setText("Primer Acceso:");

        jLabel17.setText("Ultimo Acceso:");

        txtestado.setEnabled(false);

        txtprimer_acceso.setEnabled(false);

        txtultimo_acceso.setEnabled(false);
        txtultimo_acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtultimo_accesoActionPerformed(evt);
            }
        });

        jLabel18.setText("Ultima Modificacion:");

        txtulima_modificacion.setEnabled(false);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deleted.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiarControl.setText("LIMPIAR");
        btnLimpiarControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarControlActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busq.png"))); // NOI18N
        btnbuscar.setText("buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(9, 9, 9))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel17))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtnombre_corto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtclave_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtclave_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14)))
                            .addComponent(jLabel18))
                        .addGap(1, 1, 1)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo_salt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtruta_firma, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtultima_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtulima_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprimer_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtultimo_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(55, 55, 55)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(335, 335, 335))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnmodificar)
                .addGap(53, 53, 53)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver_menu)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiarControl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtprimer_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtnombre_corto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtultimo_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtultima_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtulima_modificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtclave_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtcodigo_salt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtclave_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtruta_firma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnmodificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnlistar)
                    .addComponent(btnVolver_menu)
                    .addComponent(btnLimpiarControl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver_menuActionPerformed
        // TODO add your handling code here:
        MenuPrincipal obj =new MenuPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolver_menuActionPerformed

    private void txtnombre_cortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_cortoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_cortoActionPerformed

    private void txtultima_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtultima_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtultima_ipActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().compareTo("Nuevo")==0) {
            btnNuevo.setText("Registrar");
        }else{
            if(btnNuevo.getText().compareTo("Registrar")==0){
                try {
                    Usuario usuario = new Usuario();
                    FUsuario fusuario = new FUsuario();    
                    usuario.setApellidos(txtapellido.getText());
                    usuario.setNombres(txtnombre.getText());
                    usuario.setIdentificacion(txtidentificacion.getText());
                    usuario.setNombre_corto(txtnombre_corto.getText());
                    usuario.setClave(txtclave.getText());
                    usuario.setClave_pregunta(txtclave_pregunta.getText());
                    usuario.setClave_respuesta(txtclave_respuesta.getText());
                    usuario.setMail(txtmail.getText());
                    usuario.setCodigo(Integer.parseInt(txtestado.getText()));              
                    txtprimer_acceso.setText(usuario.getPrimer_acceso().toString());
                    txtultimo_acceso.setText(usuario.getUtimo_acceso().toString());
                    txtulima_modificacion.setText(usuario.getFecha_modificacion().toString());
                    usuario.setUltima_ip(txtultima_ip.getText());
                    usuario.setCodigo_salt(txtcodigo_salt.getText());
                    usuario.setRuta_firma(txtruta_firma.getText());
                    if(fusuario.Insertar(usuario) ){
                        JOptionPane.showMessageDialog(this,"Registrado correctamente!!",
                            "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                        btnNuevo.setText("Nuevo");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        FUsuario fusurio = new FUsuario();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Desea Eliminar al Usuario?", "Confirar",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (fusurio.eliminar(usuario) ) {
                    JOptionPane.showMessageDialog(this,
                        "Usuario eliminado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el usuario!!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtultimo_accesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtultimo_accesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtultimo_accesoActionPerformed

    private void txtruta_firmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtruta_firmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtruta_firmaActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
       
    }//GEN-LAST:event_btnlistarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        FUsuario fusuario = new FUsuario();
        int confirmacion = JOptionPane.showConfirmDialog(this,
            "¿Quiere modificar el Usuario?", "Confirme",
            JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                    usuario.setCodigo(Integer.parseInt(txtcodigo.getText()));
                    usuario.setApellidos(txtapellido.getText());
                    usuario.setNombres(txtnombre.getText());
                    usuario.setIdentificacion(txtidentificacion.getText());
                    usuario.setNombre_corto(txtnombre_corto.getText());
                    usuario.setClave(txtclave.getText());
                    usuario.setClave_pregunta(txtclave_pregunta.getText());
                    usuario.setClave_respuesta(txtclave_respuesta.getText());
                    usuario.setMail(txtmail.getText());
                    usuario.setUltima_ip(txtestado.getText());
                    txtprimer_acceso.setText(usuario.getPrimer_acceso().toString());
                    txtultimo_acceso.setText(usuario.getUtimo_acceso().toString());
                    txtulima_modificacion.setText(usuario.getFecha_modificacion().toString());
                    usuario.setCodigo_salt(txtcodigo_salt.getText());
                    usuario.setRuta_firma(txtruta_firma.getText());
                    
                if(fusuario.actualizar(usuario) ){
                    JOptionPane.showMessageDialog(this,"Usuario modificado correctamente!!",
                        "Transacción correcta", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this,"Error desconocido: "+ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
          
        }
         
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnLimpiarControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarControlActionPerformed
        txtcodigo.setText("");
        txtapellido.setText("");
        txtnombre.setText("");
        txtidentificacion.setText("");
        txtnombre_corto.setText("");
        txtclave.setText("");
        txtclave_pregunta.setText("");
        txtclave_respuesta.setText("");
        txtmail.setText("");
        txtestado.setText("");
        txtprimer_acceso.setText("");
        txtultimo_acceso.setText("");
        txtultima_ip.setText("");
        txtulima_modificacion.setText("");
        txtcodigo_salt.setText("");
        txtruta_firma.setText("");
    }//GEN-LAST:event_btnLimpiarControlActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
         FUsuario  fusuario  = new FUsuario ();
        try { 
                usuario  = fusuario.ObtenerUsuarioDadoCodigo(
                Long.parseLong(txtbuscar.getText()));
                if (usuario != null) {
                txtcodigo.setText(Long.toString(usuario.getCodigo()));
                txtapellido.setText(usuario.getApellidos());
                txtnombre.setText(usuario.getNombres());
                txtidentificacion.setText(usuario.getIdentificacion());
                txtnombre_corto.setText(usuario.getNombre_corto());
                txtclave.setText(usuario.getClave());
                txtclave_pregunta.setText(usuario.getClave_pregunta());
                txtclave_respuesta.setText(usuario.getClave_respuesta());
                txtmail.setText(usuario.getMail());
                txtestado.setText(Integer.toString(usuario.getEstado()));
                txtprimer_acceso.setText(usuario.getPrimer_acceso().toString());
                txtultimo_acceso.setText(usuario.getUtimo_acceso().toString());
                txtulima_modificacion.setText(usuario.getFecha_modificacion().toString());
                txtultima_ip.setText(usuario.getUltima_ip());
                txtcodigo_salt.setText(usuario.getCodigo_salt());
                txtruta_firma.setText(usuario.getRuta_firma());                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el usuario !!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }
    
    Usuario usuario;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarControl;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver_menu;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtclave_pregunta;
    private javax.swing.JTextField txtclave_respuesta;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcodigo_salt;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombre_corto;
    private javax.swing.JTextField txtprimer_acceso;
    private javax.swing.JTextField txtruta_firma;
    private javax.swing.JTextField txtulima_modificacion;
    private javax.swing.JTextField txtultima_ip;
    private javax.swing.JTextField txtultimo_acceso;
    // End of variables declaration//GEN-END:variables
}
