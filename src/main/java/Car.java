package main.java;

import java.util.Date;
import java.util.List;

public class Car {
    protected String name;
    protected String id;
    protected Date take;
    protected Date ret;
    protected  boolean isbeaten;
    Car(String name, String id, Date take, Date ret, boolean isbeaten) {
        this.name = name;
        this.id = id;
        this.take = take;
        this.ret = ret;
        this.isbeaten = isbeaten;
    }

}
