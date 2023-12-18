package cat.ilg.business.optica.entities;

import java.util.ArrayList;
import java.util.List;

public class Glasses {
    private int id_glasses;

    private String marca;

    private String prescription;

    private String colorFrame;

    private String colorCrystals;

    private double price;

    private List<Provaider> provaider = new ArrayList<Provaider> ();

}
