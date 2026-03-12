package monopoly;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.*;

public class GameController {
    private Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public void startGame() {
        game.start();
    }

    public void endGame() {
        System.out.println("Game Over! Thanks for playing.");
    }

    public void displayBoard() {
        game.getBoard().displayBoard();
    }

    public void displayPlayerStatus() {
        for (Player player : game.getPlayers()) {
            System.out.println(player.getName() + " - Position: " + player.getPosition() + ", Money: $" + player.getMoney());
        }
    }

    public void handlePlayerTurn(Player player) {
        System.out.println(player.getName() + "'s turn.");
        int diceRoll = rollDice();
        System.out.println("You rolled a " + diceRoll);
        player.move(diceRoll);
        Space currentSpace = game.getBoard().getSpace(player.getPosition());
        System.out.println("You landed on " + currentSpace.getName());
        // Handle space actions (e.g., buy property, pay rent, etc.)
    }

    private int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Simulate rolling a 6-sided die
    }

    public void resetGame() {
        game.reset();
    }
}
