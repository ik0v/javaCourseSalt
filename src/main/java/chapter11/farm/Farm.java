package chapter11.farm;

public class Farm {
    public static void main(String[] args) {

        Animal pig = new Pig();
        pig.makeSound();
        pig.eat();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Animal animal = new Pig();
        animal.makeSound();
//        ((Duck)animal).makeSound(); // can't cast in this case, bcs type can't be declared as abstract class Animal


    }
}
