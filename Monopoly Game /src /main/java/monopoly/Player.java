package monopoly;

import java.util.Random;

public class Player {
    private final String name;
    private int position;
    private int money;
    private boolean inJail;

    public Player(String name) {
        this.name = name;
        this.position = 0; // Starts at GO
        this.money = 1500;  // Standard starting money
        this.inJail = false;
    }

    // --- Core Actions ---

    public void move(int steps) {
        this.position = (this.position + steps) % 40;
        System.out.println(name + " moves to position " + position);
    }

    public void takeTurn(GameController game) {
        if (inJail) {
            System.out.println(name + " is in jail and skips the turn movement.");
            return;
        }

        Random rand = new Random();
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;
        int steps = die1 + die2;

        System.out.println(name + " rolls " + die1 + " and " + die2 + " (Total: " + steps + ")");
        move(steps);
        
        game.handleLanding(this);
    }

    // --- Financials ---

    public void adjustMoney(int amount) {
        this.money += amount;
    }

    public boolean isBankrupt() {
        return this.money < 0;
    }

    public void payRent(Player owner, int rent) {
        if (this.money >= rent) {
            this.adjustMoney(-rent);
            owner.adjustMoney(rent);
            System.out.println(name + " pays $" + rent + " to " + owner.getName());
        } else {
            declareBankruptcy();
        }
    }

    public void buyProperty(Property property) {
        if (this.money >= property.getPrice()) {
            this.adjustMoney(-property.getPrice());
            property.setOwner(this);
            System.out.println(name + " buys " + property.getName() + " for $" + property.getPrice());
        } else {
            System.out.println(name + " cannot afford " + property.getName());
        }
    }

    public void payTax(int tax) {
        if (this.money >= tax) {
            this.adjustMoney(-tax);
            System.out.println(name + " pays $" + tax + " in taxes");
        } else {
            declareBankruptcy();
        }
    }

    public void declareBankruptcy() {
        System.out.println(name + " has gone bankrupt!");
    }

    // --- Jail Mechanics ---

    public void goToJail() {
        this.position = 10; // Standard jail position
        this.inJail = true;
        System.out.println(name + " goes to jail!");
    }

    public void getOutOfJail() {
        this.inJail = false;
        System.out.println(name + " gets out of jail!");
    }

    public boolean isInJail() {
        return this.inJail;
    }

    // --- Getters & Overrides ---

    public String getName() { return name; }
    public int getPosition() { return position; }
    public void setPosition(int position) { this.position = position; }
    public int getMoney() { return money; }

    @Override
    public String toString() {
        return name + " (Position: " + position + ", Money: $" + money + ", In Jail: " + inJail + ")";
    }
}
