package com.pluralcamp.business.pizzeria.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {
    private String idComanda;

    private Date dataHora;

    private int quantitatPerCategoria;

    private double preuTotal;

    private String tipusComanda;

    private Date dataHoraLliurament;

    private List<Producte> productes = new ArrayList<Producte> ();

    private Client client;

    private Botiga botiga;

    private Empleat empleat;

}
