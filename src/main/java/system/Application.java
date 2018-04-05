package system;

import system.Car;

public class Application {
    protected Car car;
    protected Client client;
    protected Administrator administrator;
    protected int repairprice;
    protected String reason;
    public Application(Car car, Client client, Administrator administrator, int repairprice, String reason)
    {
        this.car = car;
        this.client = client;
        this.administrator = administrator;
        this.repairprice = repairprice;
        this.reason = reason;
    }
}