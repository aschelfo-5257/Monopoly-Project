package monopoly;

import java.util.Scanner;
import java.util.List;

public class GameController {
    private Game game;
    private Dice dice; // Use your dedicated Dice class

    public GameController(Game game) {
        this.game = game;
        this.dice = new Dice(); // Instantiate the dice object
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
        System.out.println("\n" + player.getName() + "'s turn.");
        
        // 1. Roll two dice using your object array method
        int[] result = dice.rollTwoDice();
        int die1 = result[0];
        int die2 = result[1];
        int totalRoll = die1 + die2;
        
        System.out.println("You rolled: [" + die1 + "] and [" + die2 + "] (Total: " + totalRoll + ")");
        
        // 2. Check for monopoly doubles rule
        if (die1 == die2) {
            System.out.println("Doubles! You get another turn after this.");
            // Note: You can add an extra turn flag or tracking logic here
        }

        // 3. Move player and handle board interaction
        player.move(totalRoll);
        Space currentSpace = game.getBoard().getSpace(player.getPosition());
        System.out.println("You landed on " + currentSpace.getName());
        
        // TODO: Invoke space actions (e.g., currentSpace.executeAction(player);)
    }

    public void resetGame() {
        game.reset();
    }
}
