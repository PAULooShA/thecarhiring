package system;

import dataaccess.impl.OrderDao;
import system.Car;
import system.Order;


import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import  java.util.Calendar;
import java.util.Scanner;

public class Main {

    private static final String XML_FOLDER = "XmlFolder";
    private static OrderDao orderDao;
    public static CarInfo cars;

    public static void createDao() {
        orderDao = new OrderDao(XML_FOLDER);
    }

    public static void main(String[] args) throws IOException, ParseException {
        createDao();
        cars = CarInfo.getInstance();
        Calendar instance = Calendar.getInstance();
        Date date = new Date();
        String adminname = "admin";
        Administrator administrator = new Administrator(adminname);
        Scanner in = new Scanner(System.in);
        System.out.println("Who are u: press 1, if you are admin, press 2, if you are client");
        Integer n;
        n = Integer.parseInt(in.nextLine());
        if (n == 1) {
            Integer s;
            System.out.println("1. Show all available cars");
            System.out.println("2. Add car");
            System.out.println("3. Delete car");
            System.out.println("4. Show all orders");
            System.out.println("5. Get order by id");
            s = Integer.parseInt(in.nextLine());
            switch (s) {
                case 1:
                    cars.openInfoFromFile();
                    for (Car c : cars.map) {
                        System.out.println(c.name);
                    }
                    break;
                case 2:
                    cars.openInfoFromFile();
                    cars.AddCar();
                    cars.saveInfoToFile();
                    break;
                case 3:
                    cars.openInfoFromFile();
                    cars.DeleteCar();
                    cars.saveInfoToFile();
                    break;
                case 4:
                    List<Order> orderList = orderDao.getAll();
                    for (Order o : orderList) {
                        System.out.println(o.client.name + " " + o.car.name + " id: " + o.getId());
                    }
                    break;
                case 5:
                    List<Order> orderList1 = orderDao.getAll();
                    for (Order o : orderList1) {
                        System.out.println(o.client.name + " " + o.car.name + " id: " + o.getId());
                    }
                    System.out.println("Enter id: ");
                    Long id;
                    id = Long.parseLong(in.nextLine());
                    Order o1 = orderDao.get(id);
                    System.out.println(o1.client.name + " " + o1.car.name + " id: " + o1.getId());

            }
            if (n == 2) {
                String name, passport;
                int money, s1;
                System.out.println("Enter your name: ");
                name = in.nextLine();
                System.out.println("Enter your passport: ");
                passport = in.nextLine();
                System.out.println("Amount you are ready to spend: ");
                money = Integer.parseInt(in.nextLine());
                Client client = new Client(name, passport, money);
                System.out.println("1. Create Order");
                s1 = Integer.parseInt(in.nextLine());
                switch (s1) {
                    case 1:
                        System.out.println("Cars available: ");
                        cars.openInfoFromFile();
                        for (Car c : cars.map) {
                            System.out.println(c.name);
                        }
                        System.out.println("Write the car u want to take");
                        String carname = in.nextLine();
                        System.out.println("Write start date of offering");
                        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Date startdate = sdf.parse(br.readLine());
                        System.out.println("Period of time you take time");
                        Integer per;
                        per = Integer.parseInt(in.nextLine());
                        instance.setTime(date);
                        instance.add(Calendar.DAY_OF_MONTH, per);
                        Date retdate = instance.getTime();
                        for (Car car1 : cars.map) {
                            if (car1.name.equals(carname)) {
                                if (client.money >= car1.price) {
                                    Order newOrder = new Order(car1, client, administrator, false, startdate, retdate);
                                    System.out.println(client.name + " you can use " + car1.name + " from " + startdate + " to " + retdate);
                                    cars.DeleteCar(car1.name);
                                    cars.saveInfoToFile();
                                    orderDao.saveNew(newOrder);
                                } else {
                                    System.out.println("U dont have enough money");
                                }
                            }
                        }
                        break;
                }
            }
        }
    }
}
