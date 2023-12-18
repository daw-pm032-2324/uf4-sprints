package cat.ilg.business.youtube.entities;

public class Playlist {
    private int idPlaylist;
    private String nomPlaylist;
    private String dataCreacioPlaylist;
    private boolean estatPlaylist;

    //SETTERS
    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public void setNomPlaylist(String nomPlaylist) {
        this.nomPlaylist = nomPlaylist;
    }

    public void setDataCreacioPlaylist(String dataCreacioPlaylist) {
        this.dataCreacioPlaylist = dataCreacioPlaylist;
    }

    public void setEstatPlaylist(boolean estatPlaylist) {
        this.estatPlaylist = estatPlaylist;
    }

    //GETTERS
    public int getIdPlaylist() {
        return this.idPlaylist;
    }

    public String getNomPlaylist() {
        return this.nomPlaylist;
    }

    public String getDataCreacioPlaylist() {
        return this.dataCreacioPlaylist;
    }

    public boolean getEstatPlaylist() {
        return this.estatPlaylist;
    }

}
