package cat.ilg.business.pizzeria.entities;

public class Botiga {
    private int idBotiga;
    private String nomBotiga;
    private String codiPostalBotiga;
    private String adrecaBotiga;
    private Localitat localitat = new Localitat();
    private Provincia provincia = new Provincia();
    private Empleat empleats = new Empleat();

    //SETTERS
    public void setidBotiga(int idBotiga) {
        this.idBotiga = idBotiga;
    }

    public void setNomBotiga(String nomBotiga) {
        this.nomBotiga = nomBotiga;
    }

    public void setCodiPostalBotiga(String codiPostalBotiga) {
        this.codiPostalBotiga = codiPostalBotiga;
    }

    public void setAdrecaBotiga(String adrecaBotiga) {
        this.adrecaBotiga = adrecaBotiga;
    }

    public void setLocalitat(Localitat localitat) {
        this.localitat = localitat;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setEmpleats(Empleat empleats) {
        this.empleats = empleats;
    }

    //GETTERS
    public int getidBotiga() {
        return this.idBotiga;
    }

    public String getNomBotiga() {
        return this.nomBotiga;
    }

    public String getCodiPostalBotiga() {
        return this.codiPostalBotiga;
    }

    public String getAdrecaBotiga() {
        return this.adrecaBotiga;
    }

    public Localitat getLocalitat() {
        return this.localitat;
    }

    public Provincia getProvincia() {
        return this.provincia;
    }

    public Empleat getEmpleats() {
        return this.empleats;
    }


}
