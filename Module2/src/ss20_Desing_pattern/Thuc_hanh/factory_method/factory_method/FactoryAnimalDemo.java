package ss20_Desing_pattern.Thuc_hanh.factory_method.factory_method;

public class FactoryAnimalDemo {
    public static void main(String[] args) {
        FatoryAnimal animalFactory = new FatoryAnimal();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
