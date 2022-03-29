package com.example.exem.dto;

import com.example.exem.model.Customer;
import com.example.exem.model.SessionType;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class SesssionDto {

    private int id;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String code;


    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String dateSession;

   @Min(value = 0,message = "Đơn giá lớn hơn 0")
    private double price;

    @Min(value = 0,message = "Đơn giá lớn hơn 0")
    private double area;

    private Customer customer;

    private SessionType sessionType;

    public SesssionDto() {
    }

    public SesssionDto(int id, String code, String name, String dateSession, double price, double area, Customer customer, SessionType sessionType) {
        this.id = id;
        this.code = code;
        this.dateSession = dateSession;
        this.price = price;
        this.area = area;
        this.customer = customer;
        this.sessionType = sessionType;
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
