package cat.ilg.business.pizzeria.entities;

public class Pizza {
    private String nomPizza;
    private int idPizza;

    //SETTERS
    public void setNomPizza(String nomPizza) {
        this.nomPizza = nomPizza;
    }

    public void setIdPizza(int idPizza) {
        this.idPizza = idPizza;
    }
    
    //GETTERS
    public String getNomPizza() {
        return this.nomPizza;
    }

    public int getIdPizza() {
        return this.idPizza;
    }
}
