
package clases;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VerTabla {
    
public void visualizar_tabla(JTable tabla){
    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar();
    //Image img = null;   
    tabla.setDefaultRenderer(Object.class, new TablaImagen());
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Nombre");
    dt.addColumn("Bandera");
    
    
    try{
        
        while(rs.next()){
                Object[] fila = new Object[3];
                fila[0] = rs.getObject("Nombre");
                //fila[2] = rs.getObject("estadio");
                Blob blob = rs.getBlob(3);
                
                if(blob != null){
                   try{
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try{
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        }catch(Exception ex){
                        System.out.println(ex.getMessage());
                        }
                    ImageIcon icono = new ImageIcon(img);
                    fila[1] = new JLabel(icono);
                        }catch(Exception ex){
                            fila[1] = "No Imagen";
                        }
                }
                else{
                    fila[1] = "No Imagen";
                }
                
                dt.addRow(fila);  
            }
        
        tabla.setModel(dt);
        tabla.setRowHeight(48);
    }catch(Exception ex){
        System.out.println(ex.getMessage());
        ex.printStackTrace();   
    }  
}

//tabla selecciones
public void visualizar_tabla_selecciones(JTable tabla){
    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar_seleccion();
    //Image img = null;   
    tabla.setDefaultRenderer(Object.class, new TablaImagen());
    
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Codigo");
    dt.addColumn("Uniforme");
    dt.addColumn("Nombre");
    dt.addColumn("Ranking");
    
    try{
       while(rs.next()){
                Object[] fila = new Object[4];
                fila[0] = rs.getObject(1);
                Blob blob = rs.getBlob(3);
                fila[2] = rs.getObject(2);
                fila[3] = rs.getObject("ranking");
                if(blob != null){
                   try{
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try{
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        }catch(Exception ex){
                        System.out.println(ex.getMessage());
                        }
                    ImageIcon icono = new ImageIcon(img);
                    fila[1] = new JLabel(icono);
                        }catch(Exception ex){
                            fila[1] = "No Imagen";
                        }
                }
                else{
                    fila[1] = "No Imagen";
                }
                
                dt.addRow(fila);  
            }
        
        tabla.setModel(dt);
        tabla.setRowHeight(128);
    }catch(Exception ex){
        System.out.println(ex.getMessage());
        ex.printStackTrace();   
    }  
}

//tabla selecciones
public void visualizar_tabla_Jugador(JTable tabla){
    ConexionBD conn = new ConexionBD();
    Connection con = conn.conectar();
    ResultSet rs = conn.visualizar();
    //Image img = null;   
    tabla.setDefaultRenderer(Object.class, new TablaImagen());
    DefaultTableModel dt = new DefaultTableModel();
    dt.addColumn("Nombre");
    dt.addColumn("Foto");
    dt.addColumn("Camisola");
    
    try{
       while(rs.next()){
                Object[] fila = new Object[3];
                fila[0] = rs.getObject(2);
                //fila[2] = rs.getObject(4);
                Blob blob = rs.getBlob(3);
                
                if(blob != null){
                   try{
                        byte[] data = blob.getBytes(1, (int)blob.length());
                        BufferedImage img = null;
                        try{
                        img = ImageIO.read(new ByteArrayInputStream(data));
                        }catch(Exception ex){
                        System.out.println(ex.getMessage());
                        }
                    ImageIcon icono = new ImageIcon(img);
                    fila[1] = new JLabel(icono);
                        }catch(Exception ex){
                            fila[1] = "No Imagen";
                        }
                }
                else{
                    fila[1] = "No Imagen";
                }
                
                dt.addRow(fila);  
            }
        
        tabla.setModel(dt);
        tabla.setRowHeight(128);
    }catch(Exception ex){
        System.out.println(ex.getMessage());
        ex.printStackTrace();   
    }  
}



    
}//fin clase
