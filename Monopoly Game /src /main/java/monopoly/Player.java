package monopoly;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.*;

public class Player {
    private String name;
    private int position;
    private int money;

    public Player(String name) {
        this.name = name;
        this.position = 0; // Starting position
        this.money = 1500; // Starting money
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void adjustMoney(int amount) {
        this.money += amount;
    }

    public boolean isBankrupt() {
        return this.money < 0;
    }

    public void move(int steps) {
        this.position = (this.position + steps) % 40; // Assuming a standard Monopoly board with 40 spaces
    }

    public String toString() {
        return name + " (Position: " + position + ", Money: $" + money + ")";
    }

    public void takeTurn(Game game) {
        // Simulate rolling two six-sided dice
        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int steps = die1 + die2;

        System.out.println(name + " rolls " + die1 + " and " + die2 + " (Total: " + steps + ")");
        move(steps);
        System.out.println(name + " moves to position " + position);

        // Handle landing on the new position (e.g., buying property, paying rent, etc.)
        game.handleLanding(this);
    }

    public void declareBankruptcy() {
        System.out.println(name + " has gone bankrupt!");
        // Additional logic to remove the player from the game can be added here
    }

    public void payRent(Player owner, int rent) {
        if (this.money >= rent) {
            this.adjustMoney(-rent);
            owner.adjustMoney(rent);
            System.out.println(name + " pays $" + rent + " to " + owner.getName());
        } else {
            // Not enough money to pay rent, declare bankruptcy
            declareBankruptcy();
        }
    }

    public void buyProperty(Property property) {
        if (this.money >= property.getPrice()) {
            this.adjustMoney(-property.getPrice());
            property.setOwner(this);
            System.out.println(name + " buys " + property.getName() + " for $" + property.getPrice());
        } else {
            System.out.println(name + " does not have enough money to buy " + property.getName());
        }
    }

    public void payTax(int tax) {
        if (this.money >= tax) {
            this.adjustMoney(-tax);
            System.out.println(name + " pays $" + tax + " in taxes");
        } else {
            // Not enough money to pay tax, declare bankruptcy
            declareBankruptcy();
        }
    }

    public void goToJail() {
        this.position = 10; // Jail position
        System.out.println(name + " goes to jail!");

        case 30: // Go to Jail
            player.goToJail();
            turnsToSkip = 3; // Skip next 3 turns
            turnsSkipped = 0;
    }

    public void getOutOfJail() {
        /* 
        Logic for getting out of jail (e.g., rolling doubles, paying a fine, etc.) can be added here 
        */
        System.out.println(name + " gets out of jail!");
    }

    public boolean isInJail() {
        return this.position == 10; // Assuming position 10 is jail

        case 10: // Jail
            return true;
            if (player.isInJail()) {
                player.getOutOfJail();
            }
    }

    public void displayStatus() {
        System.out.println(this.toString());
    }

    public void endTurn() {
        System.out.println(name + "'s turn ends.");
    }

    public void collectSalary() {
        this.adjustMoney(200); // Collect $200 for passing Go
        System.out.println(name + " collects $200 for passing Go!");
    }

}
