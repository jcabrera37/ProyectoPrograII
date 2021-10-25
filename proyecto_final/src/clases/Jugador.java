package clases;

/**
 *
 * @author Julio Cabrera
 */
public class Jugador {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int camisola;
    protected int tipo;
    protected String img_foto;
    protected int edad;
    protected String Habilidad;
    protected String pierna_habil;
    protected String Nacionalizado;
    protected int id_seleccion;
    protected String patrocinador;
    protected int valor_mercado;
    
    public Jugador(){}
    
    public Jugador(int id, String Nombre, String Apellidos, int camisola, 
            int tipo, String img_foto, int edad, String Habilidad, 
            String pierna_habil, String Nacionalizado, int id_seleccion,
            String patrocinador, int valor_mercado){
    
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.camisola = camisola;
        this.tipo = tipo;
        this.img_foto = img_foto;
        this.edad = edad;
        this.Habilidad = Habilidad;
        this.pierna_habil = pierna_habil;
        this.Nacionalizado = Nacionalizado;
        this.id_seleccion = id_seleccion;
        this.patrocinador = patrocinador;
        this.id_seleccion = id_seleccion;
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

    public int getCamisola() {
        return camisola;
    }

    public void setCamisola(int camisola) {
        this.camisola = camisola;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getImg_foto() {
        return img_foto;
    }

    public void setImg_foto(String img_foto) {
        this.img_foto = img_foto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(String Habilidad) {
        this.Habilidad = Habilidad;
    }

    public String getPierna_habil() {
        return pierna_habil;
    }

    public void setPierna_habil(String pierna_habil) {
        this.pierna_habil = pierna_habil;
    }

    public String getNacionalizado() {
        return Nacionalizado;
    }

    public void setNacionalizado(String Nacionalizado) {
        this.Nacionalizado = Nacionalizado;
    }

    public int getId_seleccion() {
        return id_seleccion;
    }

    public void setId_seleccion(int id_seleccion) {
        this.id_seleccion = id_seleccion;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public int getValor_mercado() {
        return valor_mercado;
    }

    public void setValor_mercado(int valor_mercado) {
        this.valor_mercado = valor_mercado;
    }
    
    
    
    
}
