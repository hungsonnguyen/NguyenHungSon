package APJ_EXAM_C1021G1_NguyenHungSon.Model;

public class Teacher extends Person{
    private String specialize;

    public Teacher(String id,
                   String name,
                   String dateOfBirth,
                   String gender,
                   String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public Teacher(String specialize) {
        this.specialize = specialize;
    }

    public Teacher() {
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return super.toString() +
                "specialize='" + specialize + '\'' ;
    }
}
