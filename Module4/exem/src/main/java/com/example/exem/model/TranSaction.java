package com.example.exem.model;


import javax.persistence.*;

@Entity
@Table(name = "session")
public class TranSaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    private String dateSession;
    private double price;
    private double area;
    @ManyToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "sessionType_id",referencedColumnName = "id")
    private SessionType sessionType;

    public TranSaction(int id, String code, String name, String dateSession, double price, double area, Customer customer, SessionType sessionType) {
        this.id = id;
        this.code = code;
        this.dateSession = dateSession;
        this.price = price;
        this.area = area;
        this.customer = customer;
        this.sessionType = sessionType;
    }

    public TranSaction() {
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
