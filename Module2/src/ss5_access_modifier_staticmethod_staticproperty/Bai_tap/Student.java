package ss5_access_modifier_staticmethod_staticproperty.Bai_tap;

public class Student {
    private String name = "John";
    private String clas = "C02";
    public Student(){

    }

    public void setName(String name){
       this.name = name;
    }

//    private void setName(String name){
//        this.name = name;
//    }

    public void setClas(String clas){
        this.clas = clas;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }

}
class Test{
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Hoa");
        System.out.println();
        System.out.println(std.toString());
    }
}