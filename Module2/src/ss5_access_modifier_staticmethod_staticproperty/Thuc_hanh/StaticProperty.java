package ss5_access_modifier_staticmethod_staticproperty.Thuc_hanh;

import java.util.ArrayList;
import java.util.List;

public class StaticProperty {
    private String name;
    private String engine;
    public static int numberOfCars;
    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        StaticProperty.numberOfCars = numberOfCars;
    }

    public StaticProperty() {
    }

    public StaticProperty(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
        this.id = numberOfCars;
    }

    @Override
    public String toString() {
        return "StaticProperty{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("bmw", "sky1");
        System.out.println(car1.numberOfCars);
        StaticProperty car2 = new StaticProperty("bmw2", "sky2");
        System.out.println(car2.numberOfCars);
        StaticProperty car3 = new StaticProperty("bmw3", "sky3");
        System.out.println(car3.numberOfCars);
        System.out.println(car1.numberOfCars);

        List<StaticProperty> myList = new ArrayList<StaticProperty>();
        myList.add(car1);
        myList.add(car2);
        myList.add(car3);

        for(StaticProperty car: myList){
            System.out.println("id: " + car.getId()
            );
        }

    }
}
