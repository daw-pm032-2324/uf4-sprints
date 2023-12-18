package cat.ilg.business.youtube.entities;

public class EstatVideo {
    private boolean publicEstatVideo;
    private boolean ocultEstatVideo;
    private boolean privatEstatVideo;

    //SETTERS
    public void setPublicEstatVideo(boolean publicEstatVideo) {
        this.publicEstatVideo = publicEstatVideo;
    }

    public void setOcultEstatVideo(boolean ocultEstatVideo) {
        this.ocultEstatVideo = ocultEstatVideo;
    }

    public void setPrivatEstatVideo(boolean privatEstatVideo) {
        this.privatEstatVideo = privatEstatVideo;
    }


    //GETTERS
    public boolean getPublicEstatVideo() {
        return this.publicEstatVideo;
    }

    public boolean getOcultEstatVideo() {
        return this.ocultEstatVideo;
    }

    public boolean getPrivatEstatVideo() {
        return this.privatEstatVideo;
    }
    
}
