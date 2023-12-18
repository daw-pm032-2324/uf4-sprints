package cat.ilg.business.pizzeria.entities;

public class Comanda {
    private int idComanda;
    private String data_hora;
    private boolean entregaDomicili_Botiga;
    private int quantitatSeleccionada;
    private double preuTotal;
    private Productes productes = new Productes();
    private Botiga botiga = new Botiga();
    private Repartidor repartidor = new Repartidor();

    //SETTERS
    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public void setEntregaDomicili_Botiga(boolean entregaDomicili_Botiga) {
        this.entregaDomicili_Botiga = entregaDomicili_Botiga;
    }

    public void setQuantitatSeleccionada(int quantitatSeleccionada) {
        this.quantitatSeleccionada = quantitatSeleccionada;
    }

    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }

    public void setProductes(Productes productes) {
        this.productes = productes;
    }

    public void setBotiga(Botiga botiga) {
        this.botiga = botiga;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    //GETTERS
    public int getIdComanda() {
        return this.idComanda;
    }

    public String getData_hora() {
        return this.data_hora;
    }

    public boolean getEntregaDomicili_Botiga() {
        return this.entregaDomicili_Botiga;
    }

    public int getQuantitatSeleccionada() {
        return this.quantitatSeleccionada;
    }

    public double getPreuTotal() {
        return this.preuTotal;
    }

    public Productes getProductes() {
        return this.productes;
    }

    public Botiga getBotiga() {
        return this.botiga;
    }

    public Repartidor getRepartidor() {
        return this.repartidor;
    }

}
