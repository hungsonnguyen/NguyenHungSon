package ss20_Desing_pattern.Thuc_hanh.factory_method.factory_method;

public class FatoryAnimal {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
