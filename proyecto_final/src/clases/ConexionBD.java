package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Julio Cabrera
 */
public class ConexionBD {
    Connection conn;
    
    public ConexionBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root","");
            
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion "+e);
            
        }
        
        }
    
    public Connection getConection(){
            return conn;
        }
    
   
    
}