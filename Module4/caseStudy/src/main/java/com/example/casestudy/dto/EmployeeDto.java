package com.example.casestudy.dto;

import com.example.casestudy.model.employee.Division;
import com.example.casestudy.model.employee.EducationDegree;
import com.example.casestudy.model.employee.Position;
import com.example.casestudy.model.user.User;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class EmployeeDto {

    private int id;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String name;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String birthday;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String idCard;

    @Min(value = 0,message = "Mời nhập vào giá trị >0")
    private double salary;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    @Pattern(regexp = "(^84|0[3|5|7|8|9])+([0-9]{8})$")
    private String phone;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    @Email
    private String email;

    @NotBlank(message = "Mời nhập vào, không để khoảng trắng")
    private String address;

    private Division division;
    private Position position;
    private EducationDegree educationDegree;
    private User user;

    public EmployeeDto(int id, String name, String birthday, String idCard, double salary, String phone, String email,
                       String address, Division division, Position position, EducationDegree educationDegree, User user) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
        this.user = user;
    }

    public EmployeeDto() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }
}
