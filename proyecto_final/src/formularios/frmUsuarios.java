package formularios;
import clases.ConexionBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julio Cabrera
 */
public final class frmUsuarios extends javax.swing.JFrame {
    ConexionBD cn = new ConexionBD(); 
    DefaultTableModel modelo; // EL MODELO PARA PODER TRABAJAR CON EL JTABLE
    Connection con;
    Statement st;
    ResultSet rs;
    
    
    public frmUsuarios() {
        initComponents();
        mostrarDatos();
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescrip = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescrip7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescrip1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDescrip3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescrip5 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtDescrip2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDescrip4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescrip6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDescrip8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRoles = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jbtnGuardarr = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(3, 4));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Descripción:");
        jPanel1.add(jLabel1);
        jPanel1.add(txtDescrip);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo de Usuario:");
        jPanel1.add(jLabel2);
        jPanel1.add(txtDescrip7);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Tipo de Usuario:");
        jPanel1.add(jLabel9);
        jPanel1.add(txtDescrip1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripción:");
        jPanel1.add(jLabel5);
        jPanel1.add(txtDescrip3);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descripción:");
        jPanel1.add(jLabel6);
        jPanel1.add(txtDescrip5);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Descripción:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel1.add(txtDescrip2);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Descripción:");
        jPanel1.add(jLabel7);
        jPanel1.add(txtDescrip4);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tipo de Usuario:");
        jPanel1.add(jLabel4);
        jPanel1.add(txtDescrip6);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Descripción:");
        jPanel1.add(jLabel10);
        jPanel1.add(txtDescrip8);

        tablaRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Rol", "Descripción", "Estado", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRolesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRoles);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Actualizacion de usuarios");

        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnGuardarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        jbtnGuardarr.setText("Guardar");
        jbtnGuardarr.setPreferredSize(new java.awt.Dimension(100, 40));
        jbtnGuardarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarrActionPerformed(evt);
            }
        });

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setPreferredSize(new java.awt.Dimension(100, 40));
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        lbl_id.setForeground(new java.awt.Color(220, 220, 226));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_id))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jbtnGuardarr, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGuardarr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarrActionPerformed
        //agregarRegistro();
        mostrarDatos();
        
    }//GEN-LAST:event_jbtnGuardarrActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
       // actualizarRegistro();
        mostrarDatos();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void tablaRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRolesMouseClicked
      int item = tablaRoles.getSelectedRow(); 
      
      lbl_id.setText(tablaRoles.getValueAt(item, 0).toString());
      txtDescrip.setText(tablaRoles.getValueAt(item, 1).toString());
      
    }//GEN-LAST:event_tablaRolesMouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        eliminarRegistro();
        limpiarModelo();
        mostrarDatos();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    
    //LIMPIAR TABLA
    public void limpiarTabla(){
       modelo  = new DefaultTableModel();
       tablaRoles.setModel(modelo);
       
       modelo.addColumn("Id");
       modelo.addColumn("Descripcion");       
       modelo.addColumn("Estado");
       modelo.addColumn("Tipo");
    }
    /*
    //AGREGAR REGISTROS
    public void agregarRegistro(){
        String tipo = "";
        
        String nombre = txtDescrip.getText();
        
        if ("Administrador".equals(jcbRol.getSelectedItem().toString())){
            tipo = "Admin";
        }
        if ("Usuario".equals(jcbRol.getSelectedItem().toString())){
            tipo = "User";
        }
        
        if("".equals(nombre)){
            JOptionPane.showMessageDialog(rootPane, "No se a ingresado ningun dato!");
            limpiarTabla();
            
        }else{
            try {
                
                String query = "INSERT INTO `rol` (`id_rol`, `nombre`, tipo ) VALUES (NULL, '"+ nombre +"','"+ tipo +"');";
                con = cn.getConection();
                st = con.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(rootPane, "Usuario Registrado!");
                limpiarModelo();
                limpiarText();
                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        
        
    }//fin metodo agregar*/
    
      //ELIMINAR REGISTRO
    public void eliminarRegistro(){
    
        int id = Integer.parseInt(lbl_id.getText());
        
        String sql = "delete from rol where id_rol=" + id;        
        JOptionPane.showMessageDialog(rootPane, sql);
                try {
                    con = cn.getConection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                    
                    
                } catch (HeadlessException | SQLException e) {
                    
                }
               
        
    }
    
    //MOSTRAR REGISTROS
    public void mostrarDatos(){
        String query = "SELECT * FROM rol";
        
         try {
            con = cn.getConection();
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            Object[] rol = new Object[4];
            modelo = (DefaultTableModel) tablaRoles.getModel();
            while (rs.next()) {
                rol[0] = rs.getInt("id_rol");
                rol[1] = rs.getString("nombre");
                rol[2] = rs.getString("status");
                rol[3] = rs.getString("tipo");
                modelo.addRow(rol);
            }
            tablaRoles.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        

    }//fin metodo mostrar
   
    //LIMPIAR MODELO
    public void limpiarModelo(){
        for (int i = 0; i < tablaRoles.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }//fin metodo limpiartabla
    
    //LIMPIAR JTEXTFIELD
    public void limpiarText(){
        txtDescrip.setText("");
        txtDescrip.requestFocus();
    }
    
/*
    //ACTUALIZAR UN REGISTRO
    public void actualizarRegistro(){
        int id = Integer.parseInt(lbl_id.getText());
        String nombre;
        String  rol;
        
        nombre = txtDescrip.getText();
        rol = jcbRol.getSelectedItem().toString();
        
        String sql = "UPDATE rol SET nombre  = '"+ nombre +"' WHERE id_rol =" + id;
        JOptionPane.showMessageDialog(rootPane, sql);
        try {
                    con = cn.getConection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    
                    
                } catch (HeadlessException | SQLException e) {
                    
                }
        limpiarModelo();
    }
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
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardarr;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tablaRoles;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtDescrip1;
    private javax.swing.JTextField txtDescrip2;
    private javax.swing.JTextField txtDescrip3;
    private javax.swing.JTextField txtDescrip4;
    private javax.swing.JTextField txtDescrip5;
    private javax.swing.JTextField txtDescrip6;
    private javax.swing.JTextField txtDescrip7;
    private javax.swing.JTextField txtDescrip8;
    // End of variables declaration//GEN-END:variables
}