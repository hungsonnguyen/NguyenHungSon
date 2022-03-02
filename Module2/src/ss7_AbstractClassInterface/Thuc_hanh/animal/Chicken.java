package ss7_AbstractClassInterface.Thuc_hanh.animal;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chikcken: ó ò o";
    }

    @Override
    public String howtoEat() {
        return "can eat";
    }
}
