package cat.ilg.business.optica.entities;


public class Proveedor {
    private String nomProveedor; 
    private Adreca adreca = new Adreca();
    private int telefonProveedor;
    private int fax; 
    private String nif; 


    //SETTERS
    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public void setAdreca(Adreca adreca) {
        this.adreca = adreca;
    }

    public void setTelefonProveedor(int telefonProveedor) {
        this.telefonProveedor = telefonProveedor;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }


    //GETTERS
    public String getNomProveedor() {
        return this.nomProveedor;
    }

    public Adreca getAdreca() {
        return this.adreca;
    }

    public int getTelefonProveedor() {
        return this.telefonProveedor;
    }

    public int getFax() {
        return this.fax;
    }

    public String getNif() {
        return this.nif;
    }

    
}
