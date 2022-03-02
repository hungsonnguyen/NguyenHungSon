package ss17_File_and_Serialization.Thuc_hanh.read_and_write_List_Student;



import java.io.Serializable;

public class StudentImplemenySerializable implements Serializable {
    private int id;

    private String name;

    private String address;

    public StudentImplemenySerializable() {
    }

    public StudentImplemenySerializable(int id, String name, String address) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
