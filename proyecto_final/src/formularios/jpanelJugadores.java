package formularios;

import clases.ConexionBD;
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
public class jpanelJugadores extends javax.swing.JPanel {
    ConexionBD cn = new ConexionBD(); 
    DefaultTableModel modelo; // EL MODELO PARA PODER TRABAJAR CON EL JTABLE
    Connection con;
    Statement st;
    ResultSet rs;
    
    /**
     * Creates new form jpanelJugadores
     */
    public jpanelJugadores() {
        initComponents();
         mostrarDatos();
         mostrarComboSelecciones();
         
    }

    
    
     //MOSTRAR REGISTROS
    public void mostrarDatos(){
        String query = "SELECT id_jugador, nombre, apellidos, edad, Habilidades, pierna_habil, nacionalizado, camisola, tipo, seleccion, valor_mercado, marca_patrocinador\n" +
                        "FROM jugador\n" +
                        "INNER JOIN tipo_jugador\n" +
                        "on jugador.id_tipo = tipo_jugador.id_tipo\n" +
                        "INNER JOIN seleccion\n" +
                        "on jugador.id_seleccion = seleccion.id_seleccion;";
        
         try {
            con = cn.getConection();
            st = con.createStatement();
            rs = st.executeQuery(query);
        
            Object[] usuarios = new Object[12];
            modelo = (DefaultTableModel) tablaUsuarios.getModel();
            while (rs.next()) {
                usuarios[0] = rs.getInt("id_jugador");
                usuarios[1] = rs.getString("nombre");
                usuarios[2] = rs.getString("apellidos");
                usuarios[3] = rs.getString("edad");
                usuarios[4] = rs.getString("Habilidades");
                usuarios[5] = rs.getString("pierna_habil");
                usuarios[6] = rs.getString("nacionalizado");
                usuarios[7] = rs.getString("camisola");
                usuarios[8] = rs.getString("tipo");
                usuarios[9] = rs.getString("seleccion");
                usuarios[10] = rs.getString("valor_mercado");
                usuarios[11] = rs.getString("marca_patrocinador");
                
                
                modelo.addRow(usuarios);
            }
            tablaUsuarios.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        

    }//fin metodo mostrar
    
    
    //mostrar datos en combobox
    public void mostrarComboSelecciones(){
        String query = "SELECT seleccion FROM `seleccion`;";
        
         try {
            con = cn.getConection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            
             while (rs.next()) {
                 jcbSelecciones.addItem((String) rs.getObject("seleccion"));
                 
             }
                       
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jcbSelecciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lista de jugadores");

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Jugador", "Nombre", "Apellido", "Edad", "Habilidades", "Pierna Hábil", "Nacionalizado", "Camisola", "Posición", "Selección", "Valor En Mercado", "Patrocinar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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

        jcbSelecciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Elija selección a mostrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbSelecciones, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbSelecciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jcbSelecciones.getAccessibleContext().setAccessibleName("jcb");
    }// </editor-fold>//GEN-END:initComponents

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int item = tablaUsuarios.getSelectedRow();
/*
        lbl_id.setText(tablaUsuarios.getValueAt(item, 0).toString());
        txtNombre.setText(tablaUsuarios.getValueAt(item, 1).toString());
        txtApellido.setText(tablaUsuarios.getValueAt(item, 2).toString());
        txtUsuario.setText(tablaUsuarios.getValueAt(item, 3).toString());
        txtPass.setText(tablaUsuarios.getValueAt(item, 4).toString());*/
    }//GEN-LAST:event_tablaUsuariosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbSelecciones;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
