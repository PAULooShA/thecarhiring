package system;

public class Car {
    protected String name;
    protected int price;
    protected Boolean isbeaten;
    protected String number;
    public Car(String name, Boolean isbeaten, int price, String number) {
        this.name = name;
        this.isbeaten = isbeaten;
        this.price = price;
        this.number = number;

    }
    public  Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getIsbeaten() {
        return isbeaten;
    }

    public void setIsbeaten(Boolean isbeaten) {
        this.isbeaten = isbeaten;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}