package HomeWorkMVC.Bai1;

public class Candidate {
    private int id;
    private String name;
    private String dayOfBirth;
    private double scoreMath;
    private double scoreLiterature;
    private double scoreEnglish;

    public Candidate() {
    }

    public Candidate(int id, String name, String dayOfBirth, double scoreMath, double scoreLiterature, double scoreEnglish) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
        this.scoreEnglish = scoreEnglish;
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

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(double scoreLiterature) {
        this.scoreLiterature = scoreLiterature;
    }

    public double getScoreEnglish() {
        return scoreEnglish;
    }

    public void setScoreEnglish(double scoreEnglish) {
        this.scoreEnglish = scoreEnglish;
    }
    public double getTotalscore(){
        double totalsocre = 0;
        totalsocre = this.scoreMath + this.scoreEnglish + this.scoreLiterature;
        return totalsocre;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", scoreMath=" + scoreMath +
                ", scoreLiterature=" + scoreLiterature +
                ", scoreEnglish=" + scoreEnglish +
                '}';
    }
}
