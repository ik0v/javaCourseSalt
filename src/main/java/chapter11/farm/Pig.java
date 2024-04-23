package chapter11.farm;

public class Pig extends Animal {

    @Override
    public void makeSound() {
        System.out.println("oink!");
    }

    @Override
    public void eat() {
        System.out.println("Pig es eating");
    }
}
