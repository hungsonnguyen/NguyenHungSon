package ss22_behavior_design_pattern.observer;

public class Boy implements Observer {
    private String name;
    public Boy(String name) {
        this.name = name;
    }
    @Override
    public void care(){
        System.out.println(this.name + " Are you OK");
    }

    //hanh vi rieng cua doi tuong boy
    //da bong

    //game
}
