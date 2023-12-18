package cat.ilg.business.youtube.entities;

public class Video {
    private String titolVideo;
    private int idVideo;
    private String descripcioVideo;
    private int grandariaVideo;
    private String nomVideo;
    private int duradaVideo;
    private Object thumbnailVideo;
    private int numReprodVideo;
    private int numLikesVideo;
    private int numDislikesVideo;
    private boolean LikeVideo; 
    private String dataPubliVideo;
    private String usuariPubliVideo;
    private EstatVideo estatVideo = new EstatVideo();
    private Etiqueta etiqueta = new Etiqueta();

    //SETTERS
    public void setTitolVideo(String titolVideo) {
        this.titolVideo = titolVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public void setDescripcioVideo(String descripcioVideo) {
        this.descripcioVideo = descripcioVideo;
    }

    public void setGrandariaVideo(int grandariaVideo) {
        this.grandariaVideo = grandariaVideo;
    }

    public void setNomVideo(String nomVideo) {
        this.nomVideo = nomVideo;
    }

    public void setDuradaVideo(int duradaVideo) {
        this.duradaVideo = duradaVideo;
    }

    public void setThumbnailVideo(Object thumbnailVideo) {
        this.thumbnailVideo = thumbnailVideo;
    }

    public void setNumReprodVideo(int numReprodVideo) {
        this.numReprodVideo = numReprodVideo;
    }

    public void setNumLikesVideo(int numLikesVideo) {
        this.numLikesVideo = numLikesVideo;
    }

    public void setNumDislikesVideo(int numDislikesVideo) {
        this.numDislikesVideo = numDislikesVideo;
    }

    public void setLikeVideo(boolean LikeVideo) {
        this.LikeVideo = LikeVideo;
    }

    public void setDataPubliVideo(String dataPubliVideo) {
        this.dataPubliVideo = dataPubliVideo;
    }

    public void setUsuariPubliVideo(String usuariPubliVideo) {
        this.usuariPubliVideo = usuariPubliVideo;
    }

    public void setEstatVideo(EstatVideo estatVideo) {
        this.estatVideo = estatVideo;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    //GETTERS
    public String getTitolVideo() {
        return this.titolVideo;
    }

    public int getIdVideo() {
        return this.idVideo;
    }

    public String getDescripcioVideo() {
        return this.descripcioVideo;
    }

    public int getGrandariaVideo() {
        return this.grandariaVideo;
    }

    public String getNomVideo() {
        return this.nomVideo;
    }

    public int getDuradaVideo() {
        return this.duradaVideo;
    }

    public Object getThumbnailVideo() {
        return this.thumbnailVideo;
    }

    public int getNumReprodVideo() {
        return this.numReprodVideo;
    }

    public int getNumLikesVideo() {
        return this.numLikesVideo;
    }

    public int getNumDislikesVideo() {
        return this.numDislikesVideo;
    }

    public boolean getLikeVideo() {
        return this.LikeVideo;
    }

    public String getDataPubliVideo() {
        return this.dataPubliVideo;
    }

    public String getUsuariPubliVideo() {
        return this.usuariPubliVideo;
    } 
    
    public EstatVideo getEstatVideo() {
        return this.estatVideo;
    }

    public Etiqueta getEtiqueta() {
        return this.etiqueta;
    }
}
