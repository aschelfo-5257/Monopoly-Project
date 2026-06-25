package monopoly;

import java.util.Random;

public class Dice {
    private final Random random = new Random();
    private int die1;
    private int die2;

    /**
     * Rolls two 6-sided dice, stores their values, and returns them as an array.
     */
    public int[] roll() {
        this.die1 = random.nextInt(6) + 1;
        this.die2 = random.nextInt(6) + 1;
        return new int[]{die1, die2};
    }

    /**
     * Returns the sum of the last rolled dice.
     */
    public int getTotal() {
        return die1 + die2;
    }

    /**
     * Checks if the last roll resulted in doubles.
     */
    public boolean isDouble() {
        return die1 == die2;
    }

    // Getters if needed by other classes
    public int getDie1() { return die1; }
    public int getDie2() { return die2; }
}
