package chapter11.farm;

public class Duck extends Animal {
    @Override
    public void makeSound() {
        System.out.println("quack!");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }
}
