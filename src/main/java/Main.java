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
        for (Car car:carlist
             ) {
            System.out.println(car.name);
            System.out.println(car.isbeaten);

        }
    }
}
