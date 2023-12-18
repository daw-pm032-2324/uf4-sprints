package cat.ilg.business.youtube.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoRate {
    private int idVideo;

    private int idUserLike;

    private int tipusValoracio;

    private Date dataCreacio;

    private List<User> user = new ArrayList<User> ();

    private Video video;

    private RateType videoRateType;

}
