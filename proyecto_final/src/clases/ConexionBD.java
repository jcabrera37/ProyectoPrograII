package clases;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Julio Cabrera
 */
public class ConexionBD {
    Connection conn;
    
    public ConexionBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema", "root","");
            System.out.println("Conexión establecida!");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion a la base de datos!!", "Error en la conexión!", JOptionPane.ERROR_MESSAGE);
            
        }
        
        }
    
    public Connection getConection(){
            return conn;
        }
    
   
    
 public ResultSet visualizar(){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `pais`");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
    
  public ResultSet visualizar_seleccion(){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `seleccion`");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
  
  public ResultSet visualizar_encuentros(String area){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT * from encuentro WHERE area = '"+area+"'");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
  
   public ResultSet visualizar_encuentros_equipo(String equipo){
        Connection con = conectar();
        
        ResultSet rs = null;
        try{
            PreparedStatement ps = con.prepareStatement("SELECT equipo1, golesE1, puntosE1, fecha_encuentro, estadio, tipoEncuentro \n" +
"FROM encuentro \n" +
"WHERE equipo1 = '"+equipo+"'");
            rs = ps.executeQuery();
        }catch(Exception ex){
            System.out.println("Error de consulta");
        }
        return rs;
    }
  
  
    public Connection conectar(){
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/sistema";
        try{
            Class.forName("org.h2.Driver");
            con = DriverManager.getConnection(url, "root","");
            System.out.println("En linea");
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
        return con;
    }

    public void guardar(String ruta, String nombre){
        Connection con = conectar();
        String insert = "insert into pais(Nombre,img_bandera) values(?,?)";
        System.out.println(insert);
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(1, nombre);
            ps.setBinaryStream(2, fi);
            //ps.setString(3, estadio);
            
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error al agregar usuario "+ex.getMessage());
        }
    }
    
     public void guardar_seleccion(String ruta, String nombre, int ranking, int id_pais, int id_area, String estadio, int puntos){
        Connection con = conectar();
        String insert = "insert into seleccion(seleccion,img_uniforme,ranking, id_pais, id_area, Estadio,puntos_jornada) values(?,?,?,?,?,?,?)";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(insert);
            ps.setString(1, nombre);
            ps.setBinaryStream(2, fi);
            ps.setInt(3, ranking);
            ps.setInt(4, id_pais);
            ps.setInt(5, id_area);
            ps.setString(6, estadio);
            ps.setInt(7, puntos);
            
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error al agregar seleccion "+ex.getMessage());
        }
    }
    
    
     public void guardarFotoJugador(String ruta, int ultimoId){
        Connection con = conectar();
        String update = "UPDATE `jugador` SET `img_foto`=? WHERE id_jugador = "+ultimoId+"";
        FileInputStream fi = null;
        PreparedStatement ps = null;
        try{
            File file = new File(ruta);
            fi = new FileInputStream(file);
            
            ps = con.prepareStatement(update);
            System.out.println(update);
            //ps.setString(1, nombre);
            ps.setBinaryStream(1, fi);
            //ps.setString(3, estadio);
            
            ps.executeUpdate();
        }catch(Exception ex){
            System.out.println("Error al actualizar usuario "+ex.getMessage());
        }
    }
     
    
     //registrar encuentro
     public void guardar_encuentro(String equipo1, String equipo2, int ptosE1, int ptosE2,String estadio,String fecha,String tipoEncuentro,int golesE1,int golesE2, String area,String grupo){
        Connection con = conectar();
        String insert = "insert into encuentro(equipo1, equipo2, puntosE1, puntosE2, estadio, fecha_encuentro, tipoEncuentro, golesE1, golesE2, area, grupo) values(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        //System.out.println(insert);
        try{
  
            ps = con.prepareStatement(insert);
            ps.setString(1, equipo1);
            ps.setString(2, equipo2);
            ps.setInt(3, ptosE1);
            ps.setInt(4, ptosE2);
            ps.setString(5, estadio);
            ps.setString(6, fecha);
            ps.setString(7, tipoEncuentro);
            ps.setInt(8, golesE1);
            ps.setInt(9, golesE2);
            ps.setString(10, area);
            ps.setString(11, grupo);
            
            ps.executeUpdate();
            
            System.out.println("Encuentro guardado exitosamente!");
        }catch(Exception ex){
            System.out.println("Error al agregar encuentro "+ex.getMessage());
        }
    }
     
     //actualizar puntos seleccion
     public void actualizar_puntos(int ptosAcum, String equipo)
     {
         Connection con = conectar();
         String update = "UPDATE `seleccion` SET `puntos_jornada` = '"+ptosAcum+"' WHERE `seleccion`.`seleccion` = '"+equipo+"'";
         PreparedStatement ps = null;
         
         
         try {
             ps = con.prepareStatement(update);
             ps.executeUpdate();
             
         } catch (Exception e) {
             System.out.println("Error al actualizar"+e.getMessage());
         }
     }
  
}