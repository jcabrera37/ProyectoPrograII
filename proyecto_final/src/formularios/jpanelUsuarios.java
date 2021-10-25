package formularios;

import clases.ConexionBD;
import clases.Usuarios;
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
public class jpanelUsuarios extends javax.swing.JPanel {
    ConexionBD cn = new ConexionBD(); 
    DefaultTableModel modelo; // EL MODELO PARA PODER TRABAJAR CON EL JTABLE
    Connection con;
    Statement st;
    ResultSet rs;
    /**
     * Creates new form jpanelUsuarios
     */
    public jpanelUsuarios() {
        initComponents();
        mostrarDatos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jbtnGuardarr = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbEstatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcbTipoUsuario = new javax.swing.JComboBox<>();
        lbl_id = new javax.swing.JLabel();

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Usuario", "Nombre", "Apellido", "Usuario", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");

        txtNombre.setMinimumSize(new java.awt.Dimension(6, 35));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Usuario");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Estatus");

        jcbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Desactivado" }));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tipo de Usuario");

        jcbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEstatus, 0, 223, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(txtApellido)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbl_id.setForeground(new java.awt.Color(220, 220, 226));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jbtnGuardarr, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGuardarr, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int item = tablaUsuarios.getSelectedRow();

        lbl_id.setText(tablaUsuarios.getValueAt(item, 0).toString());
        txtNombre.setText(tablaUsuarios.getValueAt(item, 1).toString());
        txtApellido.setText(tablaUsuarios.getValueAt(item, 2).toString());
        txtUsuario.setText(tablaUsuarios.getValueAt(item, 3).toString());
        txtPass.setText(tablaUsuarios.getValueAt(item, 4).toString());

    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        eliminarRegistro();
        limpiarModelo();
        mostrarDatos();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnGuardarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarrActionPerformed
        Usuarios usuario = new Usuarios();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String user = txtUsuario.getText();
        String pass = txtPass.getText();

        int tipo = 0;
        int tipo_rol = 0;

        if ("Activo".equals(jcbEstatus.getSelectedItem().toString())){
            tipo = 1;
        }
        if ("Desactivado".equals(jcbEstatus.getSelectedItem().toString())){
            tipo = 0;
        }
        if ("Administrador".equals(jcbTipoUsuario.getSelectedItem().toString())){
            tipo_rol = 1;
        }
        if ("Usuario".equals(jcbTipoUsuario.getSelectedItem().toString())){
            tipo_rol = 2;
        }
        usuario.setNombre(nombre);
        usuario.setApellidos(apellido);
        usuario.setUsuario(user);
        usuario.setPass(pass);
        
        agregarRegistro(nombre,apellido,user, pass,tipo,tipo_rol);
        mostrarDatos();

    }//GEN-LAST:event_jbtnGuardarrActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed

        Usuarios usuario = new Usuarios();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String user = txtUsuario.getText();
        String pass = txtPass.getText();

        int tipo = 0;
        int tipo_rol = 0;

        if ("Activo".equals(jcbEstatus.getSelectedItem().toString())){
            tipo = 1;
        }
        if ("Desactivado".equals(jcbEstatus.getSelectedItem().toString())){
            tipo = 0;
        }
        if ("Administrador".equals(jcbTipoUsuario.getSelectedItem().toString())){
            tipo_rol = 1;
        }
        if ("Usuario".equals(jcbTipoUsuario.getSelectedItem().toString())){
            tipo_rol = 2;
        }
        usuario.setNombre(nombre);
        usuario.setApellidos(apellido);
        usuario.setUsuario(user);
        usuario.setPass(pass);

        actualizarRegistro(nombre,apellido,user, pass,tipo,tipo_rol);

        mostrarDatos();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtnSalirActionPerformed

    
     //LIMPIAR TABLA
    public void limpiarTabla(){
       modelo  = new DefaultTableModel();
       tablaUsuarios.setModel(modelo);
       
       modelo.addColumn("Id");
       modelo.addColumn("Descripcion");       
       modelo.addColumn("Estado");
       modelo.addColumn("Tipo");
    }
    
     //LIMPIAR MODELO
    public void limpiarModelo(){
        for (int i = 0; i < tablaUsuarios.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }//fin metodo limpiartabla
    
    //LIMPIAR JTEXTFIELD
    public void limpiarText(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtPass.setText("");
        txtNombre.requestFocus();
    }
    
      //ACTUALIZAR UN REGISTRO
    public void actualizarRegistro(String nombre, String apellidos, String usuario, String pass, int status, int id_rol){
        int id = Integer.parseInt(lbl_id.getText());
        
         String sql_actualizar;
        
        sql_actualizar = "UPDATE `usuarios` SET `nombres`='"+nombre+"',"
                + "`apellidos`='"+apellidos+"',"
                + "`usuario`='"+usuario+"',"
                + "`pass`='"+pass+"',"
                + "`status`="+status+","
                + "`id_rol`="+id_rol+" "
                + "WHERE id =" + id;
               
        System.out.println(sql_actualizar);
        
        try {
            con = cn.getConection();
            st = con.createStatement();
            st.execute(sql_actualizar);
            
            System.out.println(sql_actualizar);
            
            limpiarModelo();
            limpiarText();
            JOptionPane.showMessageDialog(null,"Usuario actualizado exitosamente!!");
             
             
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        limpiarModelo();
    }
    
    //AGREGAR REGISTROS
    public void agregarRegistro(String nombre, String apellidos, String usuario, String pass, int status, int id_rol){
               
        String sql_guardar;
        
        sql_guardar = "INSERT INTO usuarios VALUES (NULL,'"
                + nombre + "', '"
                + apellidos + "', '"
                + usuario +"', '"
                + pass + "', "
                + status + ", "
                + id_rol + ")";
       
        System.out.println(sql_guardar);
        try {
            con = cn.getConection();
            st = con.createStatement();
            st.execute(sql_guardar);
            
            System.out.println(sql_guardar);
            
            
            JOptionPane.showMessageDialog(null, "Usuario Registrado exitosamente!!");
            limpiarModelo();
            limpiarText();
             
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
      
    }//fin metodo agregar
    
      //ELIMINAR REGISTRO
    public void eliminarRegistro(){
    
        int id = Integer.parseInt(lbl_id.getText());
        
        String sql_eliminar = "delete from usuarios where id = " + id; 
        System.out.println(sql_eliminar);
        JOptionPane.showMessageDialog(null, sql_eliminar);
        
                try {
                    con = cn.getConection();
                    st = con.createStatement();
                    st.executeUpdate(sql_eliminar);
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                    limpiarModelo();
                    limpiarText();
                    
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
               
        
    }
    
    //MOSTRAR REGISTROS
    public void mostrarDatos(){
        String query = "SELECT * FROM usuarios  WHERE status = 1";
        
         try {
            con = cn.getConection();
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            Object[] usuarios = new Object[6];
            modelo = (DefaultTableModel) tablaUsuarios.getModel();
            while (rs.next()) {
                usuarios[0] = rs.getInt("id");
                usuarios[1] = rs.getString("nombres");
                usuarios[2] = rs.getString("apellidos");
                usuarios[3] = rs.getString("usuario");
                usuarios[4] = rs.getString("pass");
                usuarios[5] = rs.getString("status");
                
                
                modelo.addRow(usuarios);
            }
            tablaUsuarios.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//fin metodo mostrar
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnGuardarr;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcbEstatus;
    private javax.swing.JComboBox<String> jcbTipoUsuario;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}