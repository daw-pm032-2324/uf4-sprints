package cat.ilg.business.youtube.entities;

public class Etiqueta {
    private String nomEtiqueta; 
    private String idEtiqueta; 
    
    //SETTERS
    public void setNomEtiqueta(String nomEtiqueta) {
        this.nomEtiqueta = nomEtiqueta;
    }

    public void setIdEtiqueta(String idEtiqueta) {
        this.idEtiqueta = idEtiqueta;
    }
    
    //GETTERS
    public String getNomEtiqueta() {
        return this.nomEtiqueta;
    }

    public String getIdEtiqueta() {
        return this.idEtiqueta;
    }

}
