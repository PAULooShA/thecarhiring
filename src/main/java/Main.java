package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import  java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        List<Car> carlist = new ArrayList();
        Calendar instance = Calendar.getInstance();
        Date date = new Date();
        instance.setTime(date); //устанавливаем дату, с которой будет производить операции
        instance.add(Calendar.DAY_OF_MONTH, 20);
        Date newDate = instance.getTime(); // получаем измененную дату
        Car Polo = new Car("Volkswagen Polo", "KH-4 2090", date, newDate, false);
        Car Logan = new Car("Renault Logan", "KH-4 4650", date, newDate, false);
        carlist.add(Polo);
        carlist.add(Logan);
        System.out.println("Cars available");
        for (Car car:carlist
             ) {
            System.out.println(car.name);

        }
        Client Paul = new Client("Paul", "KH4345335");
        Administrator Igor = new Administrator("Igor");
        Order n1 = new Order(Polo,Paul,true, 20, Igor, false);
        carlist.remove(Polo);
        System.out.println("Cars available after ordering");
        for (Car car:carlist
                ) {
            System.out.println(car.name);

        }
        System.out.println("Some info about orders in orderlist");
        List<Order> orderlist = new ArrayList();
        orderlist.add(n1);
        for (Order order:orderlist
                ) {
            System.out.println(order.car.name);
            System.out.println(order.car.ret);
            System.out.println(order.ispaid);
        }
        System.out.println("Returning of cars");
        if(n1.iscanceled == false) {
            if (n1.car.isbeaten == false) {
                orderlist.remove(n1);
                carlist.add(n1.car);
                for (Car car:carlist
                        ) {
                    System.out.println(car.name);
                }
            } else {
                Application app = new Application(n1.car, n1.client, n1.admin, 50, "");
                System.out.println(app.client.name);
                System.out.println(app.car.name);
                System.out.println(app.administrator);
                System.out.println(app.repairprice);
            }
        }
        else
        {
            Application app = new Application(n1.car, n1.client, n1.admin, 50, "Reason of canceling");
            System.out.println(app.reason);
        }
    }
}
