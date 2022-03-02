package HomeWorkMVC.Bai1;

public class CandidateTest {

    public static void main(String[] args) {
        Candidate[] candidates = new Candidate[3];
        candidates[0]  = new Candidate(1,"Hung","12/5/2000",7,9,6);
        candidates[1]  = new Candidate(2,"Hung","20/9/2000",8,6,8);
        candidates[2]  = new Candidate(3,"Hung","11/4/2000",5,4,4);

        for (Candidate candidate: candidates){
            if (candidate.getTotalscore()>15){
                System.out.println(candidate);
            }
        }


    }
}