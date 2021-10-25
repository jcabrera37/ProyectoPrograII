package clases;
/**
 *
 * @author Julio Cabrera
 */
public class Usuarios {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected String usuario;
    protected String Pass;
    protected int status;
    protected int id_rol;
    
    public Usuarios(){}
    
    public Usuarios(int id, String Nombre, String Apellidos, String usuario, String Pass, int status, int id_rol){
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.usuario = usuario;
        this.Pass = Pass;
        this.status = status;
        this.id_rol = id_rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }


}//fin clase Usuarios

