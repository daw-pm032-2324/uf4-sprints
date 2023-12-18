package cat.ilg.business.youtube.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentRate {
    private int idComment;

    private Date idUser;

    private String dataCreacio;

    private List<Comment> comment = new ArrayList<Comment> ();

    private List<User> user = new ArrayList<User> ();

    private RateType rateType;

}
