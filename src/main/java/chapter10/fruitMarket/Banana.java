package chapter10.fruitMarket;

public class Banana extends Fruit {

    public Banana(int calories) {
        this.calories = calories;
    }

    @Override
    protected void makeJuice() {
        System.out.println("Banana juice is made");
    }

    protected void peel() {
        System.out.println("Banana is peeled and ready to be consumed");
    }

}
