package cat.ilg.business.pizzeria.entities;


public class Order {
    public String id_order;

    public String order_date;

    public String total_price;

    public String delivery_date;

    private Client client;

    private Product product;

    private DeliveryDriver deliveryDriver;

}
