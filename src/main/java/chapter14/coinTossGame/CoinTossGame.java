package chapter14.coinTossGame;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("pl1");
        Player player2 = new Player("pl2");

        System.out.println("Choose a head or tail for player 1:");
        String player1Guess = scanner.nextLine();
        String player2Guess = player1Guess.equalsIgnoreCase("head") ? "tail" : "head";

        player1.setGuess(player1Guess);
        player2.setGuess(player2Guess);

        Coin coin = new Coin();
        coin.flip();

        String result = coin.getSide();

        if (player1.getGuess().equalsIgnoreCase(result)) System.out.println("Player 1 won!");
        else System.out.println("Player 2 won!");
    }

}
