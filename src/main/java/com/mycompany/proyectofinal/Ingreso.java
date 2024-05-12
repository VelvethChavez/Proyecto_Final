package com.mycompany.proyectofinal;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ingreso extends javax.swing.JFrame {
    /// Creación de la COLA ///
    public ProyectoFinal.Nodo colaOrdenes = new ProyectoFinal.Nodo(); // El código de la cola viene del archivo ProyectoFinal.java
    
    public Ingreso() {
        initComponents(); // Óptimamente poner esto de primero siempre
        
        ButtonGroup grpTurnoMesero = new ButtonGroup(); // Esto sirve para que se seleccione un radio button a la vez
        grpTurnoMesero.add(rbMatutina);                 // y no se pueda deseleccionar o seleccionar más de un radioButton.
        grpTurnoMesero.add(rbVespertina);               // Básicamente sirve para agrupar los radioButtons y asegurar el
        grpTurnoMesero.add(rbTodoDia);                      // funcionamiento correcto de los radioButtons.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        panelOrden = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbPlatillos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMesero = new javax.swing.JTextField();
        btnEstado = new javax.swing.JButton();
        btnRealizarOrden = new javax.swing.JButton();
        rbMatutina = new javax.swing.JRadioButton();
        rbVespertina = new javax.swing.JRadioButton();
        rbTodoDia = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegresar.setBackground(new java.awt.Color(255, 102, 102));
        btnRegresar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setToolTipText("");
        btnRegresar.setPreferredSize(new java.awt.Dimension(116, 59));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        panelOrden.setPreferredSize(new java.awt.Dimension(235, 157));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Platillo:");
        jLabel1.setToolTipText("");

        cmbPlatillos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbPlatillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lasaña", "Pizza Italiana", "Tiramisú" }));
        cmbPlatillos.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("ORDEN");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Cliente:");
        jLabel3.setToolTipText("");

        txtCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCliente.setMinimumSize(new java.awt.Dimension(79, 23));
        txtCliente.setPreferredSize(new java.awt.Dimension(79, 23));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Mesero:");
        jLabel4.setToolTipText("");

        txtMesero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMesero.setMinimumSize(new java.awt.Dimension(79, 23));
        txtMesero.setPreferredSize(new java.awt.Dimension(79, 23));

        javax.swing.GroupLayout panelOrdenLayout = new javax.swing.GroupLayout(panelOrden);
        panelOrden.setLayout(panelOrdenLayout);
        panelOrdenLayout.setHorizontalGroup(
            panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOrdenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(cmbPlatillos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdenLayout.createSequentialGroup()
                        .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(panelOrdenLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel2)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelOrdenLayout.setVerticalGroup(
            panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbPlatillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnEstado.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnEstado.setText("<html>Estado<br>Ordenes</html>");
        btnEstado.setToolTipText("");
        btnEstado.setPreferredSize(new java.awt.Dimension(90, 59));
        btnEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoActionPerformed(evt);
            }
        });

        btnRealizarOrden.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        btnRealizarOrden.setText("<html>Realizar<br>Orden</html>");
        btnRealizarOrden.setToolTipText("");
        btnRealizarOrden.setPreferredSize(new java.awt.Dimension(90, 59));
        btnRealizarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarOrdenActionPerformed(evt);
            }
        });

        rbMatutina.setSelected(true);
        rbMatutina.setText("Matutina");
        rbMatutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatutinaActionPerformed(evt);
            }
        });

        rbVespertina.setText("Vespertina");
        rbVespertina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVespertinaActionPerformed(evt);
            }
        });

        rbTodoDia.setText("Todo el día");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRealizarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMatutina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbVespertina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbTodoDia)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(panelOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMatutina)
                    .addComponent(rbVespertina)
                    .addComponent(rbTodoDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRealizarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnRegresar.getAccessibleContext().setAccessibleName("btnRegresar");
        panelOrden.getAccessibleContext().setAccessibleName("pnlOrden");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal principal = new Principal();
        
        Dimension tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanioPantalla.width - principal.getWidth()) / 2;
        int y = (tamanioPantalla.height - principal.getHeight()) / 2;
        
        setVisible(false);
        principal.setVisible(true);
        principal.setLocation(x,y);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoActionPerformed
        Estado estado = new Estado();
        
        Dimension tamanioPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamanioPantalla.width - estado.getWidth()) / 2;
        int y = (tamanioPantalla.height - estado.getHeight()) / 2;
        
        setVisible(false);
        estado.setVisible(true);
        estado.setLocation(x,y);
    }//GEN-LAST:event_btnEstadoActionPerformed

    private void btnRealizarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarOrdenActionPerformed
        /*
        Obtenemos los valores los textBox que contienen el nombre del cliente y del mesero. A su vez, obtenemos el valor
        del comboBox que contiene los platillos (´.getSelectedItem()´ nos retorna un Object, lo convertimos a String.
        El valor de turnoMesero está dado por la función ´ObtenerTurnoMesero()´.
        */
        String platilloSeleccionado = (String) cmbPlatillos.getSelectedItem();
        String cliente = txtCliente.getText().trim();
        String mesero = txtMesero.getText().trim();
        String turnoMesero = ObtenerTurnoMesero();
        
        // Verificamos que los campos no estén vacíos
        if(!platilloSeleccionado.trim().isEmpty() & !cliente.isEmpty() & !mesero.isEmpty() & !turnoMesero.isEmpty()){
            colaOrdenes.push(platilloSeleccionado.trim(), cliente, mesero, turnoMesero);           // Pusheamos a la cola
            JOptionPane.showMessageDialog(null, "Orden realizada", "", JOptionPane.PLAIN_MESSAGE); // Mensaje de "Orden realizada"
            LimpiarCampos();                                                                       // Limpiamos los campos
        } else {
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRealizarOrdenActionPerformed

    private void rbMatutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatutinaActionPerformed
        
    }//GEN-LAST:event_rbMatutinaActionPerformed

    private void rbVespertinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVespertinaActionPerformed
        
    }//GEN-LAST:event_rbVespertinaActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }
    
    public String ObtenerTurnoMesero(){
        /*
        Verificamos cuál de los radioButtons está seleccionado usando su propiedad ´isSelected()´.
        Luego obtenemos el texto que contiene dicho radioButton y ese es el turno del mesero.
        */
        if(rbMatutina.isSelected()){
            return rbMatutina.getText();
        } else if(rbVespertina.isSelected()){
            return rbVespertina.getText();
        } else {
            return rbTodoDia.getText();
        }
    }
    
    public void LimpiarCampos(){
        // Ponemos el texto de los textBox como una cadena vacía
        txtCliente.setText("");
        txtMesero.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnRealizarOrden;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbPlatillos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelOrden;
    private javax.swing.JRadioButton rbMatutina;
    private javax.swing.JRadioButton rbTodoDia;
    private javax.swing.JRadioButton rbVespertina;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMesero;
    // End of variables declaration//GEN-END:variables
}
