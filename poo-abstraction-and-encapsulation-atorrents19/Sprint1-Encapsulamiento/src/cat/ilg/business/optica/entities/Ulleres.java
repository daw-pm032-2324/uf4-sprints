package cat.ilg.business.optica.entities;

public class Ulleres {
    private String marca; 
    private double graduacio;
    private String TipusMontura;
    private String colorMontura; 
    private String colorVidre; 
    private int preu;
    private Proveedor proveedor = new Proveedor();


    //SETTERS
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setGraduacio(double graduacio) {
        this.graduacio = graduacio;
    }

    public void setTipusMontura(String TipusMontura) {
        this.TipusMontura = TipusMontura;
    }

    public void setColorMontura(String colorMontura) {
        this.colorMontura = colorMontura;
    }

    public void setColorVidre(String colorVidre) {
        this.colorVidre = colorVidre;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    //GETTERS
    public String getMarca() {
        return this.marca;
    }

    public double getGraduacio() {
        return this.graduacio;
    }

    public String getTipusMontura() {
        return this.TipusMontura;
    }

    public String getColorMontura() {
        return this.colorMontura;
    }

    public String getColorVidre() {
        return this.colorVidre;
    }

    public int getPreu() {
        return this.preu;
    }

    public Proveedor getProveedor() {
        return this.proveedor;
    }


}
