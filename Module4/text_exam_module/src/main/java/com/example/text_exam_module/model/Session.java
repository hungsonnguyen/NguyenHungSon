package com.example.text_exam_module.model;


import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String code;

    private String name;

    private String dateSession;

    private double price;
    private double area;

    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "sessionType_id",referencedColumnName = "id")
    private SessionType sessionType;

    public Session(int id, String code, String name, String dateSession, double price, double area, Customer customer, SessionType sessionType) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.dateSession = dateSession;
        this.price = price;
        this.area = area;
        this.customer = customer;
        this.sessionType = sessionType;
    }

    public Session() {
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

    public String getDateSession() {
        return dateSession;
    }

    public void setDateSession(String dateSession) {
        this.dateSession = dateSession;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SessionType getSessionType() {
        return sessionType;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }
}
