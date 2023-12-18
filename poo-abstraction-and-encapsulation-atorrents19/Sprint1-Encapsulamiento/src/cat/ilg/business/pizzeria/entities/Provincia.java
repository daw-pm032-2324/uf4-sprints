package cat.ilg.business.pizzeria.entities;

public class Provincia {
    private String nomProvincia;
    private int idProvincia;

    //SETTERS
    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    //GETTERS
    public String getNomProvincia() {
        return this.nomProvincia;
    }

    public int getIdProvincia() {
        return this.idProvincia;
    }

}
