package cat.ilg.business.youtube.entities;

import java.util.Date;

public class Chanel {
//atributes
    private int id_chanel;

    private String name;

    private String description;

    private Date date_creation;

//es un doble por que no tiene sentido tener una lista com millones de subscriptores, podiendo solo guardar los canales por usuario sumando o restando subscriptores
    private double subscribers;

}
