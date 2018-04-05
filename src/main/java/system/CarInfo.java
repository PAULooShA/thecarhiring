package system;
import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CarInfo {
    private static CarInfo instance;
    List<Car> map;

    private CarInfo(){
        map = new CopyOnWriteArrayList<Car>();
    }
    public static CarInfo getInstance(){
        if(instance ==null){
            instance = new CarInfo();
        }
        return instance;
    }
    public void DeleteCar() {
        System.out.println("Name of car");
        Scanner na = new Scanner(System.in);
        String name = na.nextLine();
        Iterator<Car> it = map.iterator();
        while(it.hasNext()){
            Car value = it.next();
            if(value.name.equals(name)){
                it.remove();
                break;
            }
        }
    }

    public void DeleteCar(String car) {
        Iterator<Car> it = map.iterator();
        while(it.hasNext()){
            Car value = it.next();
            if(value.name.equals(car)){
                it.remove();
                break;
            }
        }
    }

    public void AddCar(){
        System.out.println("Name of car");
        Scanner t = new Scanner(System.in);
        String name = t.nextLine();
        Car c = null;
        System.out.println("Price");
        int price = Integer.parseInt(t.nextLine());
        Boolean isbeaten = false;
        System.out.println("Number");
        String number = t.nextLine();
        c = new Car(name,isbeaten,price, number);
        map.add(c);
    }
    File mapFile = new File("cars.xml");
    public void saveInfoToFile(){
        try {
            mapFile.createNewFile(); // if file already exists will do nothing
            FileOutputStream mapOFile = new FileOutputStream(mapFile);
            java.beans.XMLEncoder xe1 = new java.beans.XMLEncoder(mapOFile);
            xe1.writeObject(map);
            xe1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * reading routes info from file
     */
    public void openInfoFromFile(){
        try {
            if(mapFile.length()!=0){
            BufferedInputStream mapOFile = new BufferedInputStream(new FileInputStream("cars.xml"));
            java.beans.XMLDecoder xe1 = new java.beans.XMLDecoder(mapOFile);
            map = (List<Car>) xe1.readObject();
            xe1.close();}

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
