package cat.ilg.business.youtube.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private int idComentari;

    private String text;

    private Date dateHora;

    private List<Video> video = new ArrayList<Video> ();

    private List<User> user = new ArrayList<User> ();

}
