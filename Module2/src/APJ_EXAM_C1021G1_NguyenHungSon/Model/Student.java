package APJ_EXAM_C1021G1_NguyenHungSon.Model;

public class Student extends Person{
    private String grade;
    private double score;

    public Student(String id,
                   String name,
                   String dateOfBirth,
                   String gender,
                   String grade,
                   double score) {
        super(id, name, dateOfBirth, gender);
        this.grade = grade;
        this.score = score;
    }

    public Student(String grade, double score) {
        this.grade = grade;
        this.score = score;
    }

    public Student() {
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                "grade='" + grade + '\'' +
                ", score=" + score ;
    }
}
