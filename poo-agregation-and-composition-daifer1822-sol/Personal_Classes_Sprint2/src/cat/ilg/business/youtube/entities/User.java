package cat.ilg.business.youtube.entities;

import java.util.Date;
import java.util.List;

public class User {
//atributes
    private Integer id_user;

    private String email;

    private String password;

    private String name;

    private Date date_birth;

    private Integer sex;

    private String country;

    private String postalCode;

    private List<Video> videos;

    private List<Chanel> chanelsSubscri;

    private List<Like> likes;

}
