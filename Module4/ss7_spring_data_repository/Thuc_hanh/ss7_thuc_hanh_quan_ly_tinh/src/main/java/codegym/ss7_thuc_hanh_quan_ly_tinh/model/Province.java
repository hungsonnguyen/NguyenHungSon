package codegym.ss7_thuc_hanh_quan_ly_tinh.model;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "province")
    Set<Customer> customerSet;


    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Province() {
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
}
