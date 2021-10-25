package clases;

/**
 *
 * @author Julio Cabrera
 */
public class Seleccion {
    protected int id_seleccion;
    protected String seleccion;
    protected int id_pais;
    protected String img_uniforme;
    protected int id_area;
    protected int ranking;
    
    public Seleccion(){}
    
    public Seleccion(int id_seleccion, String seleccion, int id_pais, 
            String img_uniforme, int id_area, int ranking){
        
        this.id_seleccion = id_seleccion;
        this.seleccion = seleccion;
        this.id_pais = id_pais;
        this.img_uniforme = img_uniforme;
        this.id_area = id_area;
        this.ranking = ranking;
        
    }

    public int getId_seleccion() {
        return id_seleccion;
    }

    public void setId_seleccion(int id_seleccion) {
        this.id_seleccion = id_seleccion;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getImg_uniforme() {
        return img_uniforme;
    }

    public void setImg_uniforme(String img_uniforme) {
        this.img_uniforme = img_uniforme;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
    
}
