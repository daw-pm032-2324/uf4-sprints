package cat.ilg.business.pizzeria.entities;

public class Empleat {
    private String nomEmpleat;
    private int idEmpleat;
    private String cognomEmpleat;
    private String nifEmpleat;
    private int telefonEmpleat;
    private boolean carrecEmpleat;

    //SETERS
    public void setNomEmpleat(String nomEmpleat) {
        this.nomEmpleat = nomEmpleat;
    }

    public void setIdEmpleat(int idEmpleat) {
        this.idEmpleat = idEmpleat;
    }

    public void setCognomEmpleat(String cognomEmpleat) {
        this.cognomEmpleat = cognomEmpleat;
    }

    public void setNifEmpleat(String nifEmpleat) {
        this.nifEmpleat = nifEmpleat;
    }

    public void setTelefonEmpleat(int telefonEmpleat) {
        this.telefonEmpleat = telefonEmpleat;
    }

    public void setCarrecEmpleat(boolean carrecEmpleat) {
        this.carrecEmpleat = carrecEmpleat;
    }

    //GETERS
    public String getNomEmpleat() {
        return this.nomEmpleat;
    }

    public int getIdEmpleat() {
        return this.idEmpleat;
    }

    public String getCognomEmpleat() {
        return this.cognomEmpleat;
    }

    public String getNifEmpleat() {
        return this.nifEmpleat;
    }

    public int getTelefonEmpleat() {
        return this.telefonEmpleat;
    }

    public boolean getCarrecEmpleat() {
        return this.carrecEmpleat;
    }
}
