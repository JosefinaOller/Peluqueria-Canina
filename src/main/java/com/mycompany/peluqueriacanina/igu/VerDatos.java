package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.Controladora;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;
    public VerDatos() {
        control = new Controladora();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TextoPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bttn_eliminar = new javax.swing.JButton();
        bttn_modificiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Visualización de datos");

        javax.swing.GroupLayout TextoPrincipalLayout = new javax.swing.GroupLayout(TextoPrincipal);
        TextoPrincipal.setLayout(TextoPrincipalLayout);
        TextoPrincipalLayout.setHorizontalGroup(
            TextoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        TextoPrincipalLayout.setVerticalGroup(
            TextoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 918, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(TextoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(64, 64, 64)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(TextoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Datos de mascotas:");

        bttn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josef\\Documents\\Java\\Todo Code\\Imagenes\\icon_destroy.png")); // NOI18N
        bttn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_eliminarActionPerformed(evt);
            }
        });

        bttn_modificiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\josef\\Documents\\Java\\Todo Code\\Imagenes\\icon_modi.png")); // NOI18N
        bttn_modificiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttn_modificiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bttn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttn_modificiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(bttn_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bttn_modificiar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_eliminarActionPerformed
        //Controlo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //Controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow()!=-1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                control.eliminarMascota(num_cliente);
                mostrarMensaje("Se eliminó correctamente","Eliminación exitosa de mascota","Info");
                cargarTabla();
            }
            else{
                mostrarMensaje("No se seleccinó ninguna mascota","Error al eliminar mascota","Error");
            }
            
        }
        else{
            mostrarMensaje("No hay nada para eliminar en la tabla","Error al eliminar mascota","Error");
        }
        
    }//GEN-LAST:event_bttn_eliminarActionPerformed

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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void bttn_modificiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttn_modificiarActionPerformed
        //Controlo que la tabla no esté vacía
        if (tablaMascotas.getRowCount() > 0) {
            //Controlo que se haya seleccionado a una mascota
            if (tablaMascotas.getSelectedRow()!=-1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0)));
                
                ModificarDatos pantallaModifi = new ModificarDatos(num_cliente);
                pantallaModifi.setVisible(true);
                pantallaModifi.setLocationRelativeTo(null);
                this.dispose();
                
                cargarTabla();
            }
            else{
                mostrarMensaje("No se seleccinó ninguna mascota","Error al editar mascota","Error");
            }
            
        }
        else{
            mostrarMensaje("No hay nada para editar en la tabla","Error al editar mascota","Error");
        }
    }//GEN-LAST:event_bttn_modificiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TextoPrincipal;
    private javax.swing.JButton bttn_eliminar;
    private javax.swing.JButton bttn_modificiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
       //definir el modelo que queremos que tenga la tabla
       DefaultTableModel modeloTabla = new DefaultTableModel(){
           
            //que filas y columnas no sean editables
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       
       //establecemos los nombres de las columnas 
       String titulos[] = {"Nº","Nombre","Color","Raza","Alergico","At. Esp.", "Observaciones", "Dueño", "Celular"};
       modeloTabla.setColumnIdentifiers(titulos);
    
       List <Mascota> listaMascotas = control.traerListaMascotas();
       
       //recorrer la lista y mostrar cada uno de los elementos en la tabla
        if (listaMascotas!=null) {
            for (Mascota mascota : listaMascotas) {
                Object[] objeto = {mascota.getNum_cliente(),mascota.getNombre(),mascota.getColor(),
                mascota.getRaza(),mascota.getAlergico(),mascota.getAtencion_especial(),
                mascota.getObservaciones(),mascota.getDuenio().getNombre(),mascota.getDuenio().getCelular()};
                
                modeloTabla.addRow(objeto);
                
            }
            
        }
        
        tablaMascotas.setModel(modeloTabla);
    }
}
