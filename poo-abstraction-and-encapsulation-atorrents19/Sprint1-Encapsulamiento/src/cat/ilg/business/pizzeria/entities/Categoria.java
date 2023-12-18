package cat.ilg.business.pizzeria.entities;

public class Categoria {
    private String nomCategoria;
    private int idCategoria;
    private Pizza pizza = new Pizza();

    //SETTERS
    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    //GETTERS
    public String getNomCategoria() {
        return this.nomCategoria;
    }

    public int getIdCategoria() {
        return this.idCategoria;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

}
