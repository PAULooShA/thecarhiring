package main.java;

import java.util.Date;

public class Application {
    protected String clientname;
    protected String clientpasspot;
    protected Date orderstart;
    protected Date orderend;
    protected String carname;
    protected String id;
    protected String administrator;
    protected int repairprice;
    protected int price;
    protected boolean isbeaten;
    public Application(String clientname, String clientpasspot, Date orderstart, Date orderend, String carname, String id, String administrator, int repairprice, int price, boolean isbeaten)
    {this.clientname = clientname;
        this.clientpasspot = clientpasspot;
        this.orderstart = orderstart;
        this.orderend = orderend;
        this.carname = carname;
        this.id = id;
        this.administrator = administrator;
        this.price = price;
        this.isbeaten = isbeaten;
    }
}