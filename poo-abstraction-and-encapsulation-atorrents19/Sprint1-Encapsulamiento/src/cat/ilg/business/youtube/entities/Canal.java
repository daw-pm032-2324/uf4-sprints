package cat.ilg.business.youtube.entities;

public class Canal {
    private int idCanal;
    private String nomCanal;
    private String descripcioCanal;
    private String dataCreacioCanal;

    //SETTERS
    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }

    public void setNomCanal(String nomCanal) {
        this.nomCanal = nomCanal;
    }

    public void setDescripcioCanal(String descripcioCanal) {
        this.descripcioCanal = descripcioCanal;
    }

    public void setDataCreacioCanal(String dataCreacioCanal) {
        this.dataCreacioCanal = dataCreacioCanal;
    }
    
    //GETTERS
    public int getIdCanal() {
        return this.idCanal;
    }

    public String getNomCanal() {
        return this.nomCanal;
    }

    public String getDescripcioCanal() {
        return this.descripcioCanal;
    }

    public String getDataCreacioCanal() {
        return this.dataCreacioCanal;
    }
}
