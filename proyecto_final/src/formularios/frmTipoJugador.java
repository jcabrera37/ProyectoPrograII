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
public class frmTipoJugador extends javax.swing.JFrame {

    /**
     * Creates new form frmTipoJugador
     */
    
    ConexionBD cn = new ConexionBD(); 
    DefaultTableModel modelo; // EL MODELO PARA PODER TRABAJAR CON EL JTABLE
    Connection con;
    Statement st;
    ResultSet rs;
    public frmTipoJugador() {
        initComponents();
        limpiarModelo();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoJugador = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clasificacion de plantel");

        jLabel2.setText("Tipo:");

        tablaTipoJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo de Jugador/Integrante"
            }
        ));
        tablaTipoJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTipoJugadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTipoJugador);
        if (tablaTipoJugador.getColumnModel().getColumnCount() > 0) {
            tablaTipoJugador.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbl_id.setForeground(new java.awt.Color(220, 220, 226));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(113, 113, 113)
                        .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //AGREGAR REGISTROS
        agregarRegistro();
        limpiarModelo();
        mostrarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //ELIMINAR REGISTRO
        eliminarRegistro();
        limpiarModelo();
        mostrarDatos();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //ACTUALIZAR REGISTRO
        actualizarRegistro();
        limpiarModelo();
        mostrarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaTipoJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTipoJugadorMouseClicked
        int item = tablaTipoJugador.getSelectedRow();

        lbl_id.setText(tablaTipoJugador.getValueAt(item, 0).toString());
        txtTipo.setText(tablaTipoJugador.getValueAt(item, 1).toString());
    }//GEN-LAST:event_tablaTipoJugadorMouseClicked

    //LIMPIAR MODELO
    public void limpiarModelo(){
        for (int i = 0; i < tablaTipoJugador.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }//fin metodo limpiartabla
    //MOSTRAR REGISTROS
    public void mostrarDatos(){
        String query = "SELECT * FROM tipo_jugador";
        
         try {
            con = cn.getConection();
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            Object[] rol = new Object[2];
            modelo = (DefaultTableModel) tablaTipoJugador.getModel();
            while (rs.next()) {
                rol[0] = rs.getInt("id_tipo");
                rol[1] = rs.getString("tipo");
                modelo.addRow(rol);
            }
            tablaTipoJugador.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//fin metodo mostrar
    //AGREGAR REGISTRO
    public void agregarRegistro(){
               
        String nombre = txtTipo.getText();
        
        
        if("".equals(nombre)){
            JOptionPane.showMessageDialog(null, "No se a ingresado ningun dato!");
            limpiarModelo();
            
        }else{
            try {
                
                String query = "INSERT INTO `tipo_jugador` (`id_tipo`, `tipo`) VALUES (NULL, '"+ nombre +"');";
                con = cn.getConection();
                st = con.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Registro realizado exitosamente");
                limpiarModelo();
                txtTipo.setText("");
                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    //ACTUALIZAR UN REGISTRO
    public void actualizarRegistro(){
        int id = Integer.parseInt(lbl_id.getText());
        String nombre;
        
        nombre = txtTipo.getText();
        
        String sql = "UPDATE tipo_jugador SET tipo  = '"+ nombre +"' WHERE id_tipo =" + id;
        
        try {
                    con = cn.getConection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                    
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e);
                }
        limpiarModelo();
    }
    //ELIMINAR REGISTRO
    public void eliminarRegistro(){
    
        int id = Integer.parseInt(lbl_id.getText());
        
        String sql = "delete from tipo_jugador where id_tipo=" + id;        
        JOptionPane.showMessageDialog(null, sql);
                try {
                    con = cn.getConection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    
                    
                } catch (HeadlessException | SQLException e) {
                    System.out.println(e);
                }
               
        
    }
    
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
            java.util.logging.Logger.getLogger(frmTipoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTipoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTipoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTipoJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTipoJugador().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tablaTipoJugador;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
