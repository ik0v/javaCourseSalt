package chapter10.fruitMarket;

/*
--- Optional exercise for chapter 10 ---

Create a Class called Fruit. This class should contain a field called calories and
a method called makeJuice which prints a statement ("Juice is made");

Create two subclasses of the Fruit class (e.g. Apple, Banana) and create method(s)
in these classes that are specific to them (e.g. removeSeeds, peel).

Set the calories within the constructors of these subclasses. Override the
makeJuice method to print the specific type of juice that's made.

Create a marked class which tests polymorphism by creating
several variations of these objects.
*/

public class Market {

    public static void main(String[] args) {
        Apple apple = new Apple(50);
        apple.removeSeeds();
        apple.makeJuice();

        Fruit fruit = new Fruit();
        fruit.makeJuice();

        Fruit banana = new Banana(100);
        ((Banana)banana).peel();
        banana.makeJuice();

    }

}
