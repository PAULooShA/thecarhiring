package system;

public class Client {
    protected String name;
    protected String passport;
    protected int money;
    public Client(String name, String passport, int money)
    {
        this.money = money;
        this.name = name;
        this.passport = passport;
    }
    public Client(){}


}
