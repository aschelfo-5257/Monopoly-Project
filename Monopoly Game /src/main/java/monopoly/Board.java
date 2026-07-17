package monopoly;

import java.util.Random;

public class Board {
    private final Game game;
    // Single instance reused for all dice rolls
    private final Random random = new Random(); 

    public Board(Game game) {
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
            System.out.println(player.getName() + " - Position: " + 
                               player.getPosition() + ", Money: $" + player.getMoney());
        }
    }

    public void handlePlayerTurn(Player player) {
        System.out.println(player.getName() + "'s turn.");
        int diceRoll = rollDice();
        System.out.println("You rolled a " + diceRoll);
        player.move(diceRoll);
        
        Space currentSpace = game.getBoard().getSpace(player.getPosition());
        System.out.println("You landed on " + currentSpace.getName());
        
    }

    private int rollDice() {
    int die1 = random.nextInt(6) + 1;
    int die2 = random.nextInt(6) + 1;
    // You can also add logic here to check if (die1 == die2) for doubles
    return die1 + die2;
    }


    public void resetGame() {
        game.reset();
    }
}
