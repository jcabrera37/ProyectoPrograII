package formularios;

import java.awt.Color;

/**
 *
 * @author Julio Cabrera
 */
public class frmMenu extends javax.swing.JFrame {
    jpanelSelecciones panelSelecciones;
    jpanelUsuarios panelUsuarios;
    jpanelRoles panelRoles;
    jpanelJugadores panelJugadores;
    jpanelPaisess panelPaises;
    jpanelAreas panelAreas;
    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        //panelSelecciones.setBackground(Color.WHITE);
        panelSelecciones = new jpanelSelecciones();
        getContentPane().add(panelSelecciones);
        panelSelecciones.setBounds(200,0,800,500);
        panelSelecciones.setVisible(false);
        
        panelUsuarios = new jpanelUsuarios();
        getContentPane().add(panelUsuarios);
        panelUsuarios.setBounds(200,0,800,600);
        panelUsuarios.setVisible(false);
        
        panelRoles = new jpanelRoles();
        getContentPane().add(panelRoles);
        panelRoles.setBounds(200, 0, 800, 500);
        panelRoles.setVisible(false);
        
        panelJugadores = new jpanelJugadores();
        getContentPane().add(panelJugadores);
        panelJugadores.setBounds(200, 0, 800, 600);
        panelJugadores.setVisible(false);
        
        
        panelAreas = new jpanelAreas();
        getContentPane().add(panelAreas);
        panelAreas.setBounds(200,0,800,500);
        //panelSelecciones.setBackground(Color.WHITE);
        panelAreas.setVisible(false);
        
        
        panelPaises = new jpanelPaisess();
        getContentPane().add(panelPaises);
        panelPaises.setBounds(200,0,800,500);
        //panelSelecciones.setBackground(Color.WHITE);
        panelPaises.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbtnUsuarios = new javax.swing.JButton();
        jbtnPaises = new javax.swing.JButton();
        jbtnArea = new javax.swing.JButton();
        jbtnRoles = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoFifa.png"))); // NOI18N

        jbtnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users.png"))); // NOI18N
        jbtnUsuarios.setText("Control de Usuarios");
        jbtnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUsuariosActionPerformed(evt);
            }
        });

        jbtnPaises.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/world.png"))); // NOI18N
        jbtnPaises.setText("Paises");
        jbtnPaises.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnPaises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPaisesActionPerformed(evt);
            }
        });

        jbtnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trofeo.png"))); // NOI18N
        jbtnArea.setText("Areas");
        jbtnArea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAreaActionPerformed(evt);
            }
        });

        jbtnRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rol.png"))); // NOI18N
        jbtnRoles.setText("Control de Accesos");
        jbtnRoles.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9))
                    .addComponent(jbtnRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnPaises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem10.setText("Cerrar Sesión");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu11.setText("Jugadores");

        jMenuItem7.setText("Gestion de Jugadores");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenuBar1.add(jMenu11);

        jMenu3.setText("Selecciones");

        jMenuItem3.setText("Gestion de selecciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu10.setText("Encuentros");

        jMenuItem8.setText("Nuevo Encuentro");
        jMenu10.add(jMenuItem8);

        jMenuItem9.setText("Ver Resultados");
        jMenu10.add(jMenuItem9);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 700, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.dispose();
        frmLogin login = new frmLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        panelUsuarios.setVisible(false);
        panelRoles.setVisible(false);
        panelSelecciones.setVisible(true);
        panelJugadores.setVisible(false);
        panelPaises.setVisible(false);
        panelAreas.setVisible(false);
       
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jbtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUsuariosActionPerformed
        panelUsuarios.setVisible(true);
        panelRoles.setVisible(false);
        panelSelecciones.setVisible(false);
        panelJugadores.setVisible(false);
        panelPaises.setVisible(false);
        panelAreas.setVisible(false);
    }//GEN-LAST:event_jbtnUsuariosActionPerformed

    private void jbtnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRolesActionPerformed
        panelUsuarios.setVisible(false);
        panelRoles.setVisible(true);
        panelSelecciones.setVisible(false);
        panelJugadores.setVisible(false);
        panelPaises.setVisible(false);
        panelAreas.setVisible(false);
    }//GEN-LAST:event_jbtnRolesActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        panelUsuarios.setVisible(false);
        panelRoles.setVisible(false);
        panelSelecciones.setVisible(false);
        panelJugadores.setVisible(true);
        panelPaises.setVisible(false);
        panelAreas.setVisible(false);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jbtnPaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPaisesActionPerformed
        panelUsuarios.setVisible(false);
        panelRoles.setVisible(false);
        panelSelecciones.setVisible(false);
        panelJugadores.setVisible(false);
        panelPaises.setVisible(true);
        panelAreas.setVisible(false);
       
    }//GEN-LAST:event_jbtnPaisesActionPerformed

    private void jbtnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAreaActionPerformed
        panelUsuarios.setVisible(false);
        panelRoles.setVisible(false);
        panelSelecciones.setVisible(false);
        panelJugadores.setVisible(false);
        panelPaises.setVisible(false);
        panelAreas.setVisible(true);
    }//GEN-LAST:event_jbtnAreaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnArea;
    private javax.swing.JButton jbtnPaises;
    private javax.swing.JButton jbtnRoles;
    private javax.swing.JButton jbtnUsuarios;
    // End of variables declaration//GEN-END:variables
}
