package cat.ilg.business.youtube.entities;

public class Comentari {
    private int idComentari;
    private String textComentari;
    private String dataPubliComentari;
    private Video video = new Video();
    private Usuari usuari = new Usuari();

    //SETTERS
    public void setIdComentari(int idComentari) {
        this.idComentari = idComentari;
    }

    public void setTextComentari(String textComentari) {
        this.textComentari = textComentari;
    }

    public void setDataPubliComentari(String dataPubliComentari) {
        this.dataPubliComentari = dataPubliComentari;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    //GETTERS
    public int getIdComentari() {
        return this.idComentari;
    }

    public String getTextComentari() {
        return this.textComentari;
    }

    public String getDataPubliComentari() {
        return this.dataPubliComentari;
    }

    public Video getVideo() {
        return this.video;
    }

    public Usuari getUsuari() {
        return this.usuari;
    }
}
