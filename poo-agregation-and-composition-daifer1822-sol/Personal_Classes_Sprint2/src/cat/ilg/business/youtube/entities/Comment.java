package cat.ilg.business.youtube.entities;

import java.util.Date;

public class Comment {
//atributs
    private String id_comment;

    private String text;

    private Date date_creation;

    private User user;

    private CommentLike[] likes;

}
