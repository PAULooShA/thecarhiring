package main.java;

import java.util.Date;

public class Application {
    private String clientname;
    private String clientpasspot;
    private Date orderstart;
    private Date orderend;
    private String carname;
    private String id;
    private String administrator;
    private int repairprice;
    private int price;
    public Application(String clientname, String clientpasspot, Date orderstart, Date orderend, String carname, String id, String administrator, int repairprice, int price){this.clientname = clientname;
        this.clientpasspot = clientpasspot;
        this.orderstart = orderstart;
        this.orderend = orderend;
        this.carname = carname;
        this.id = id;
        this.administrator = administrator;
        this.price = price;}
}