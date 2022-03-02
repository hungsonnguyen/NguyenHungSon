package HomeWorkMVC.Bai3.model;

public class Staff {
    private String  name, gender, address, dayOfBirth, focus, level;
    private int mnv;
    private double heSoLuong, phuCap;

    public Staff(int mnv, String name, String gender, String address, String dayOfBirth, String focus, String level, double heSoLuong, double phuCap) {
        this.mnv = mnv;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;
        this.focus = focus;
        this.level = level;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public Staff() {
    }

    public int getMnv() {
        return mnv;
    }

    public void setMnv(int mnv) {
        this.mnv = mnv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "mnv='" + mnv + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", focus='" + focus + '\'' +
                ", level='" + level + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", phuCap=" + phuCap +
                '}';
    }
}
