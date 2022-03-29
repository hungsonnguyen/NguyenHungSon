package codegym.quan_ly_khach_hang_phan_trang.model;

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
