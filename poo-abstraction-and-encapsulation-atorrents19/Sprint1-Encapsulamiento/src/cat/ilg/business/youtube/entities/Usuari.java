package cat.ilg.business.youtube.entities;

public class Usuari {
    private int idUsuari;
    private String emailUsuari;
    private String passwordUsuari;
    private String nomUsuari;
    private String dataNaixementUsuari;
    private boolean sexeUsuari; 
    private String paisUsuari;
    private String codiPostalUsuari;
    private Canal canal = new Canal();
    private Video video = new Video();

    //SETTERS
    public void setIdUsuari(int idUsuari) {
        this.idUsuari = idUsuari;
    }

    public void setEmailUsuari(String emailUsuari) {
        this.emailUsuari = emailUsuari;
    }

    public void setPasswordUsuari(String passwordUsuari) {
        this.passwordUsuari = passwordUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public void setDataNaixementUsuari(String dataNaixementUsuari) {
        this.dataNaixementUsuari = dataNaixementUsuari;
    }

    public void setSexeUsuari(boolean sexeUsuari) {
        this.sexeUsuari = sexeUsuari;
    }

    public void setPaisUsuari(String paisUsuari) {
        this.paisUsuari = paisUsuari;
    }

    public void setCodiPostalUsuari(String codiPostalUsuari) {
        this.codiPostalUsuari = codiPostalUsuari;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    //GETTERS
    public int getIdUsuari() {
        return this.idUsuari;
    }

    public String getEmailUsuari() {
        return this.emailUsuari;
    }

    public String getPasswordUsuari() {
        return this.passwordUsuari;
    }

    public String getNomUsuari() {
        return this.nomUsuari;
    }

    public String getDataNaixementUsuari() {
        return this.dataNaixementUsuari;
    }

    public boolean getSexeUsuari() {
        return this.sexeUsuari;
    }

    public String getPaisUsuari() {
        return this.paisUsuari;
    }

    public String getCodiPostalUsuari() {
        return this.codiPostalUsuari;
    }

    public Canal getCanal() {
        return this.canal;
    }

    public Video getVideo() {
        return this.video;
    }

}
