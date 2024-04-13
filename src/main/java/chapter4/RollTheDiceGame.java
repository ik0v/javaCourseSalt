package chapter4;

import java.util.Random;

public class RollTheDiceGame {
    public static void main(String[] args) {

        Random random = new Random();

        int result = 0;

        for (int i = 1; i <= 5; i++) {
            int dice = random.nextInt(6) + 1;
            result += dice;
            if(result > 20) {
                System.out.println("Roll #" + i + ". You went over 20 spaces (" + result +
                                    ") and lost. Better luck next time");
                break;
            }
            if(result == 20) {
                System.out.println("Roll #" + i + ". You've rolled " + dice
                        + ". You're on space 20. Congrats, you won!");
                break;
            }
            else {
                System.out.println("Roll #" + i + ". You've rolled " + dice +
                        ". You're on space " + result + " and have " + (20-result) + " to go");
            }
        }

        if(result < 20) System.out.println("You went til " + result + " spaces in 5 attempts and lost. " +
                                        "Better luck next time");

    }
}
