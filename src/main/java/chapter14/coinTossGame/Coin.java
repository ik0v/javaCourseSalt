package chapter14.coinTossGame;

import java.util.Random;

public class Coin {

    private String side;

    private final String HEAD = "head";
    private final String TAIL = "tail";

    public void flip() {
        Random random = new Random();
        int choice = random.nextInt(2);
        side = choice == 0 ? HEAD : TAIL;
    }

    public String getSide() {
        return side;
    }
}
