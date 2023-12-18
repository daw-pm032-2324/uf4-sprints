package cat.ilg.business.pizzeria.entities;

public class Productes {
    private String nomProducte;
    private int idProducte;
    private String descripcioProducte;
    private Object imatgeProducte;
    private double preuProducte;

    //SETTERS
    public void setNomProducte(String nomProducte) {
        this.nomProducte = nomProducte;
    }

    public void setIdProducte(int idProducte) {
        this.idProducte = idProducte;
    }

    public void setDescripcioProducte(String descripcioProducte) {
        this.descripcioProducte = descripcioProducte;
    }

    public void setImatgeProducte(Object imatgeProducte) {
        this.imatgeProducte = imatgeProducte;
    }

    public void setPreuProducte(double preuProducte) {
        this.preuProducte = preuProducte;
    }

    //GETTERS
    public String getNomProducte() {
        return this.nomProducte;
    }

    public int getIdProducte() {
        return this.idProducte;
    }

    public String getDescripcioProducte() {
        return this.descripcioProducte;
    }

    public Object getImatgeProducte() {
        return this.imatgeProducte;
    }

    public double getPreuProducte() {
        return this.preuProducte;
    }
}
