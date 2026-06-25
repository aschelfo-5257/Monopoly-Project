package monopoly;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Monopoly!");
        
        int numPlayers = 0;
        
        // Input Validation Loop
        while (true) {
            System.out.print("Enter the number of players (2-8): ");
            try {
                numPlayers = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
                
                if (numPlayers >= 2 && numPlayers <= 8) {
                    break; // Valid input, exit loop
                }
                System.out.println("Error: Monopoly requires 2 to 8 players.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine(); // Clear the invalid input token from the buffer
            }
        }

        // Initialize Players
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            String name = "";
            while (name.trim().isEmpty()) {
                System.out.print("Enter name for Player " + (i + 1) + ": ");
                name = scanner.nextLine();
            }
            players[i] = new Player(name);
        }

        // Start Game
        Game game = new Game(players);
        game.start();

        scanner.close();
    }
}
