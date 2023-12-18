package cat.ilg.business.pizzeria.entities;

public class Client {
    private int idClient;
    private String nomClient;
    private String cognomsClient;
    private String adrecaClient;
    private String codPosClient;
    private int telefonClient;
    private Localitat localitat = new Localitat();
    private Provincia provincia = new Provincia();
    private Comanda comanda = new Comanda();

    //SETTERS
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setCognomsClient(String cognomsClient) {
        this.cognomsClient = cognomsClient;
    }

    public void setAdrecaClient(String adrecaClient) {
        this.adrecaClient = adrecaClient;
    }

    public void setCodPosClient(String codPosClient) {
        this.codPosClient = codPosClient;
    }

    public void setTelefonClient(int telefonClient) {
        this.telefonClient = telefonClient;
    }

    public void setLocalitat(Localitat localitat) {
        this.localitat = localitat;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    //GETTERS
    public int getIdClient() {
        return this.idClient;
    }

    public String getNomClient() {
        return this.nomClient;
    }
    
    public String getCognomsClient() {
        return this.cognomsClient;
    }

    public String getAdrecaClient() {
        return this.adrecaClient;
    }

    public String getCodPosClient() {
        return this.codPosClient;
    }

    public int getTelefonClient() {
        return this.telefonClient;
    }

    public Localitat getLocalitat() {
        return this.localitat;
    }

    public Provincia getProvincia() {
        return this.provincia;
    }

    public Comanda getComanda() {
        return this.comanda;
    }

}
