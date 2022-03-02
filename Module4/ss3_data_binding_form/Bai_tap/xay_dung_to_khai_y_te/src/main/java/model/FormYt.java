package model;

import java.util.Date;

public class FormYt {
    private String name;
    private Date yearOfBirth;
    private Integer gender;
    private String nationality;
    private Integer idCard;
    private String vehicle;
    private String vehicleNumber;
    private Integer vehicleSeat;
    private Date startDate;
    private Date endDate;
    private String location14Day;
    private String city;
    private String district;
    private String commune;
    private String address;
    private String phone;
    private String email;

    public FormYt(String name, Date yearOfBirth, Integer gender, String nationality, Integer idCard, String vehicle,
                  String vehicleNumber, Integer vehicleSeat, Date startDate, Date endDate, String location14Day, String city, String district, String commune, String address, String phone, String email) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSeat = vehicleSeat;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location14Day = location14Day;
        this.city = city;
        this.district = district;
        this.commune = commune;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public FormYt() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Date yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getVehicleSeat() {
        return vehicleSeat;
    }

    public void setVehicleSeat(Integer vehicleSeat) {
        this.vehicleSeat = vehicleSeat;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation14Day() {
        return location14Day;
    }

    public void setLocation14Day(String location14Day) {
        this.location14Day = location14Day;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
