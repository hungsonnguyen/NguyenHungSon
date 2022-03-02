package ss5_access_modifier_staticmethod_staticproperty.Thuc_hanh;

public class StaticMethod {
    private int rollo;
    private String name;
    private static String college = "BBDIT";
    StaticMethod(int r, String n){
        rollo = r;
        name = n;
    }
    static void change(){
        college = "gum";
    }
    void display(){
        System.out.println(rollo + " " + name + " " + college);
    }

    public static void main(String[] args) {

        StaticMethod student = new StaticMethod(11, "Nhung");
        StaticMethod student1 = new StaticMethod(22, "Thao");
        student.display();
        System.out.println("--");
        StaticMethod.college = "Ty";
        System.out.println("--");
        student1.display();
        System.out.println("--");
        student.display();
       change();
        StaticMethod student2 = new StaticMethod(33, "Trang");
        student.display();
        student2.display();

            StaticProperty car = new StaticProperty("bmw", "sky1");
            System.out.println(car.numberOfCars);
            StaticProperty car1 = new StaticProperty("bmw2", "sky2");
            System.out.println(car.numberOfCars);
            StaticProperty car3 = new StaticProperty("bmw3", "sky3");
            System.out.println(car.numberOfCars);

    }
}
