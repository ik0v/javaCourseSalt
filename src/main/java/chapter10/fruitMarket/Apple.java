package chapter10.fruitMarket;

public class Apple extends Fruit {

    public Apple(int calories) {
        this.calories = calories;
    }

    @Override
    protected void makeJuice() {
        System.out.print(this.getClass().getSimpleName() + " ");
        super.makeJuice();
    }

    protected void removeSeeds () {
        System.out.println("Seeds are removed from apple");
    }

}
