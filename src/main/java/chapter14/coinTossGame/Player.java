package chapter14.coinTossGame;

public class Player {

    private String name;

    public String getGuess() {
        return guess;
    }

    private String guess;

    public Player(String name) {
        this.name = name;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
