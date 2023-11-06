package com.pluralcamp.business.optica.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {
    private String nom;

    private String email;

    private int cp;

    private String telefon;

    private Date dataRegistre;

    private List<Client> recomanatPer = new ArrayList<Client> ();

}
