package main.java;

import java.util.Date;
import java.util.List;

public class Car {
    private String name;
    private String id;
    private Date take;
    private Date ret;
    private Boolean isbeaten;
    List<String> carlist;
    Car(String name, String id, Date take, Date ret, Boolean isbeaten) {
        this.name = name;
        this.id = id;
        this.take = take;
        this.ret = ret;
        this.isbeaten = isbeaten;
    }

    public List<String> getcarinfo()
    {
        return carlist;
    }

    public List<String> addcar()
    {
        return carlist;
    }

    public List<String> deletecar()
    {
        return carlist;
    }
}
