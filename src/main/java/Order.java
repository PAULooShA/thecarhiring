package main.java;

import java.util.Date;

public class Order {
    private String clientname;
    private String clientpasspot;
    private Date orderstart;
    private Date orderend;
    private String carname;
    private String id;
    private String administrator;
    private  int price;
    private Boolean ispaid;


    Order(String clientname, String clientpasspot, Date orderstart, Date orderend, String carname, String id, String administrator, int price)
    {
        this.clientname = clientname;
        this.clientpasspot = clientpasspot;
        this.orderstart = orderstart;
        this.orderend = orderend;
        this.carname = carname;
        this.id = id;
        this.administrator = administrator;
        this.price = price;
    }
    public Boolean ispaid()
    {
        return ispaid;
    }


}
