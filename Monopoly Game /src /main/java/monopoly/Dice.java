package monopoly;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.*;

public class Dice {
    private Random random;

    public Dice() {
        random = new Random();
    }

    public int roll() {
        int die1 = random.nextInt(6) + 1; // Roll first die (1-6)
        int die2 = random.nextInt(6) + 1; // Roll second die (1-6)
        return die1 + die2; // Return the total of both dice
    }

    public boolean isDouble() {
        int die1 = random.nextInt(6) + 1; // Roll first die (1-6)
        int die2 = random.nextInt(6) + 1; // Roll second die (1-6)
        return die1 == die2; // Check if both dice show the same number
    }

    public int[] rollTwoDice() {
        int die1 = random.nextInt(6) + 1; // Roll first die (1-6)
        int die2 = random.nextInt(6) + 1; // Roll second die (1-6)
        return new int[]{die1, die2}; // Return both dice values
    }

    public int rollSingleDie() {
        return random.nextInt(6) + 1; // Roll a single die (1-6)
    }

    if (isDouble()) {
        // Handle the case where the player rolled doubles
        // For example, you might want to allow the player to take another turn
    }

    if (roll() == 2) {
        // Handle the case where the player rolled snake eyes (double ones)
        // For example, you might want to give the player a bonus or a penalty
    }

    if (roll() == 3) {
        // Handle the case where the player rolled a three
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 4) {
        // Handle the case where the player rolled a four
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 5) {
        // Handle the case where the player rolled a five
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 6) {
        // Handle the case where the player rolled a six
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 7) {
        // Handle the case where the player rolled a seven
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 8) {
        // Handle the case where the player rolled an eight
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 9) {
        // Handle the case where the player rolled a nine
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 10) {
        // Handle the case where the player rolled a ten
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 11) {
        // Handle the case where the player rolled an eleven
        // For example, you might want to trigger a special event or action
    }

    if (roll() == 12) {
        // Handle the case where the player rolled a double six
        // For example, you might want to send the player to jail
    }

    switch (roll()) {
        case 2:
            // Handle snake eyes
            break;
        case 3:
            // Handle three
            break;
        case 4:
            // Handle four
            break;
        case 5:
            // Handle five
            break;
        case 6:
            // Handle six
            break;
        case 7:
            // Handle seven
            break;
        case 8:
            // Handle eight
            break;
        case 9:
            // Handle nine
            break;
        case 10:
            // Handle ten
            break;
        case 11:
            // Handle eleven
            break;
        case 12:
            // Handle double sixes
            break;

        default:
            // Handle any other rolls (if necessary)
            break;
    }
}
