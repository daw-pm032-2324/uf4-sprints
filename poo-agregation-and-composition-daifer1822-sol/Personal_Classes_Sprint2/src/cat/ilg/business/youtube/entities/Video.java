package cat.ilg.business.youtube.entities;

import java.util.Date;
import java.util.List;

public class Video {
//atributes
    private Integer id_video;

    private String title;

    private String description;

    private String file_name;

    private Integer duration_video;

    private double size;

    private Integer reproductions;

    private Date date_creation;

    private String thumbnail;

    private Integer likes;

    private Integer dislikes;

    private int state_video;

    private List<Label> labels;

}
