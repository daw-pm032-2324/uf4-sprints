package cat.ilg.business.pizzeria.entities;

public class Localitat {

    private String nomLocalitat;
    private int idLocalitat;

    //SETTERS
    public void setNomLocalitat(String nomLocalitat) {
        this.nomLocalitat = nomLocalitat;
    }

    public void setIdLocalitat(int idLocalitat) {
        this.idLocalitat = idLocalitat;
    }

    //GETTERS
    public String getNomLocalitat() {
        return this.nomLocalitat;
    }
    
    public int getIdLocalitat() {
        return this.idLocalitat;
    }


}
