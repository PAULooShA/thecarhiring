package main.java;

import java.util.Date;

public class Order{
    protected String clientname;
    protected String clientpasspot;
    protected Date orderstart;
    protected Date orderend;
    protected String carname;
    protected String id;
    protected String administrator;
    protected  int price;
    protected Boolean ispaid;


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


}
