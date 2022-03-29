package codegym.ss7_mo_rong_ung_dung_blog.model;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "category")
    Set<Blog> blogSet;


    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
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
