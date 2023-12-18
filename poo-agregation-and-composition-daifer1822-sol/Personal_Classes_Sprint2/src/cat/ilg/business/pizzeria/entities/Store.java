package cat.ilg.business.pizzeria.entities;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int id_store;

    private String name_store;

    private String address_store;

    private int postal_code;

    private List<DeliveryDriver> deliveryDriver = new ArrayList<DeliveryDriver> ();

    private Province province;

}
