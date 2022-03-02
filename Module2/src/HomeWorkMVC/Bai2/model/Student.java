package HomeWorkMVC.Bai2.model;

public class Student {
    private int mssv;
    private String name,dayOfbirth,sex,nameOfClass,grade;

    public Student() {
    }

    public Student(int mssv, String name, String dayOfbirth, String sex, String nameOfClass, String grade) {
        this.mssv = mssv;
        this.name = name;
        this.dayOfbirth = dayOfbirth;
        this.sex = sex;
        this.nameOfClass = nameOfClass;
        this.grade = grade;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfbirth() {
        return dayOfbirth;
    }

    public void setDayOfbirth(String dayOfbirth) {
        this.dayOfbirth = dayOfbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mssv=" + mssv +
                ", name='" + name + '\'' +
                ", dayOfbirth='" + dayOfbirth + '\'' +
                ", sex='" + sex + '\'' +
                ", nameOfClass='" + nameOfClass + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
