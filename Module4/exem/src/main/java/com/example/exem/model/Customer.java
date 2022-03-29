package com.example.exem.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String code;
    private String name;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "customer")
    private Set<TranSaction> sessions;

    public Customer() {
    }

    public Customer(int id, String code, String name, String phone, String email, Set<TranSaction> sessions) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.sessions = sessions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<TranSaction> getSessions() {
        return sessions;
    }

    public void setSessions(Set<TranSaction> sessions) {
        this.sessions = sessions;
    }
}
