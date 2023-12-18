package cat.ilg.business.optica.entities;

public class Adreca {
    private String carrer;
    private int numTelefon; 
    private int pis;
    private int porta;
    private String ciutat; 
    private int codPostal;
    private String pais;


    //SETTERS
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public void setNumTelefon(int numTelefon) {
        this.numTelefon = numTelefon;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }


    public void setPorta(int porta) {
        this.porta = porta;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    //GETTERS
    public String getCarrer() {
        return this.carrer;
    }

    public int getNumTelefon() {
        return this.numTelefon;
    }

    public int getPis() {
        return this.pis;
    }

    public int getPorta() {
        return this.porta;
    }

    public String getCiutat() {
        return this.ciutat;
    }

    public int getCodPostal() {
        return this.codPostal;
    }

    public String getPais() {
        return this.pais;
    }
    
    
    
}
