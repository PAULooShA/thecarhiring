package main.java;

import java.util.Date;

public class Order{
    protected Car car;
    protected Client client;
    protected  int price;
    protected Boolean ispaid;
    protected Administrator admin;
    protected boolean iscanceled;


    Order(Car car, Client client, Boolean ispaid, int price, Administrator admin, boolean iscanceled)
    {
        this.car = car;
        this.client = client;
        this.ispaid = ispaid;
        this.price = price;
        this.admin = admin;
        this.iscanceled = iscanceled;
    }


}
