package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModificarDatos extends javax.swing.JFrame {
    
    Controladora control = null;
    private int num_cliente;
    Mascota mascota;
    
    public ModificarDatos(int num_cliente) {
        control = new Controladora();
        initComponents();
        cargarDatos(num_cliente);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Central = new javax.swing.JPanel();
        Imagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre_perro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_raza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_color = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nombre_duenio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        box_alergico = new javax.swing.JComboBox<>();
        box_atencion_especial = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JPanel();
        btn_guardarCambios = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peluquería Canina");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Modificación de datos");

        javax.swing.GroupLayout TextoPrincipalLayout = new javax.swing.GroupLayout(TextoPrincipal);
        TextoPrincipal.setLayout(TextoPrincipalLayout);
        TextoPrincipalLayout.setHorizontalGroup(
            TextoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextoPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        TextoPrincipalLayout.setVerticalGroup(
            TextoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\josef\\Documents\\Java\\Todo Code\\Imagenes\\PetShop1.png")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout ImagenLayout = new javax.swing.GroupLayout(Imagen);
        Imagen.setLayout(ImagenLayout);
        ImagenLayout.setHorizontalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        ImagenLayout.setVerticalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        txt_nombre_perro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("Raza:");

        txt_raza.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Color:");

        txt_color.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Alérgico:");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Atención Especial:");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setText("Nombre Dueño:");

        txt_nombre_duenio.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setText("Cel. Dueño:");

        txt_celular.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("Observaciones:");

        txt_observaciones.setColumns(20);
        txt_observaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txt_observaciones.setRows(5);
        jScrollPane1.setViewportView(txt_observaciones);

        box_alergico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        box_alergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No", "Sí" }));
        box_alergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_alergicoActionPerformed(evt);
            }
        });

        box_atencion_especial.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        box_atencion_especial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "No", "Sí" }));

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_nombre_perro)
                                .addComponent(txt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(box_alergico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_atencion_especial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(39, 39, 39)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombre_duenio)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_celular))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre_perro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(box_alergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(box_atencion_especial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_nombre_duenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CentralLayout = new javax.swing.GroupLayout(Central);
        Central.setLayout(CentralLayout);
        CentralLayout.setHorizontalGroup(
            CentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentralLayout.createSequentialGroup()
                .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CentralLayout.setVerticalGroup(
            CentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn_guardarCambios.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_guardarCambios.setIcon(new javax.swing.ImageIcon("C:\\Users\\josef\\Documents\\Java\\Todo Code\\Imagenes\\icon_save.png")); // NOI18N
        btn_guardarCambios.setText("  Guardar cambios");
        btn_guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarCambiosActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josef\\Documents\\Java\\Todo Code\\Imagenes\\icon_clean.png")); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setActionCommand("  Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubmitLayout = new javax.swing.GroupLayout(Submit);
        Submit.setLayout(SubmitLayout);
        SubmitLayout.setHorizontalGroup(
            SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SubmitLayout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(520, Short.MAX_VALUE)))
        );
        SubmitLayout.setVerticalGroup(
            SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardarCambios)
                .addGap(35, 35, 35))
            .addGroup(SubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubmitLayout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(btn_limpiar)
                    .addGap(33, 33, 33)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextoPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Central, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TextoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Central, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarCambiosActionPerformed
        
        
        control.modificarMascota(mascota,txt_nombre_perro.getText(),txt_celular.getText(),
        txt_color.getText(),txt_nombre_duenio.getText(),txt_raza.getText(),
        txt_observaciones.getText(),(String) box_alergico.getSelectedItem(),(String) box_atencion_especial.getSelectedItem());
        mostrarMensaje("Se editó correctamente","Edición exitosa de mascota","Info");
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        this.dispose();
          
    }//GEN-LAST:event_btn_guardarCambiosActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void box_alergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_alergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_alergicoActionPerformed

    private void limpiarTodo(){
        txt_nombre_perro.setText("");
        txt_celular.setText("");
        txt_color.setText("");
        txt_nombre_duenio.setText("");
        txt_raza.setText("");
        txt_observaciones.setText("");
        box_alergico.setSelectedIndex(0);
        box_atencion_especial.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Central;
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel Imagen;
    private javax.swing.JPanel Submit;
    private javax.swing.JPanel TextoPrincipal;
    private javax.swing.JComboBox<String> box_alergico;
    private javax.swing.JComboBox<String> box_atencion_especial;
    private javax.swing.JButton btn_guardarCambios;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_nombre_duenio;
    private javax.swing.JTextField txt_nombre_perro;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JTextField txt_raza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {
        mascota = control.traerMascota(num_cliente);
        
        //Muestro en la pantalla los datos actuales
        txt_nombre_perro.setText(mascota.getNombre());
        txt_celular.setText(mascota.getDuenio().getCelular());
        txt_nombre_duenio.setText(mascota.getDuenio().getNombre());
        txt_raza.setText(mascota.getRaza());
        txt_observaciones.setText(mascota.getObservaciones());
        
        if(mascota.getAlergico().equalsIgnoreCase("No")){
            box_alergico.setSelectedIndex(1);
        }
        else if(mascota.getAlergico().equalsIgnoreCase("Si")){
           box_alergico.setSelectedIndex(2); 
        }
        
        if (mascota.getAtencion_especial().equalsIgnoreCase("No")) {
            box_atencion_especial.setSelectedIndex(1);
        }
        else if(mascota.getAtencion_especial().equalsIgnoreCase("Si")){
            box_atencion_especial.setSelectedIndex(2);
        }
        
    }
    
    public void mostrarMensaje (String mensaje, String titulo, String tipo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if (tipo.equals("Error")) {
                    optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
