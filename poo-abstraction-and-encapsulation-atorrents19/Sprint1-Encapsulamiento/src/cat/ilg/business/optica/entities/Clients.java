package cat.ilg.business.optica.entities;

public class Clients {
    
    private String nomClient;
    private int adrPostal; 
    private String corrElectronic;
    private String dataRegistre; 
    private Empleat empleat = new Empleat();


    //SETTERS
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setAdrPostal(int adrPostal) {
        this.adrPostal = adrPostal;
    }
    
    public void setCorrElectronic(String corrElectronic) {
        this.corrElectronic = corrElectronic;
    }

    public void setDataRegistre(String dataRegistre) {
        this.dataRegistre = dataRegistre;
    }

    public void setEmpleat(Empleat empleat) {
        this.empleat = empleat;
    }

    //GETTERS
    public String getNomClient() {
        return this.nomClient;
    }

    public int getAdrPostal() {
        return this.adrPostal;
    }

    public String getCorrElectronic() {
        return this.corrElectronic;
    }

    public String getDataRegistre() {
        return this.dataRegistre;
    }

    public Empleat getEmpleat() {
        return this.empleat;
    }


}
