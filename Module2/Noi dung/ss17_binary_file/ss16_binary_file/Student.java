package ss16_binary_file;

import java.io.Serializable;

public class Student extends Person {

//    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
//    public static String address = "Viet Nam";
    public transient String address = "Viet Nam";

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
