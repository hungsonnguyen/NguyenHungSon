package model;

public class Customer {
    private String name,dateOfBirth,address;
    private String linkImage;

    public Customer(String name, String dateOfBirth, String address, String linkImage) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.linkImage = linkImage;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", linkImage='" + linkImage;
    }
}
