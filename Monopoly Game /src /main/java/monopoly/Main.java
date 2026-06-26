package monopoly;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 8;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            scanner = s;
            System.out.println("Welcome to Monopoly!");
            
            int numPlayers = getNumberOfPlayers();
            Player[] players = initializePlayers(numPlayers);
            
            Game game = new Game(players);
            game.start();
        }
    }
    
    private static int getNumberOfPlayers() {
        while (true) {
            System.out.printf("Enter the number of players (%d-%d): ", MIN_PLAYERS, MAX_PLAYERS);
            try {
                int num = scanner.nextInt();
                scanner.nextLine();
                
                if (num >= MIN_PLAYERS && num <= MAX_PLAYERS) {
                    return num;
                }
                System.out.printf("Error: Monopoly requires %d to %d players.%n", MIN_PLAYERS, MAX_PLAYERS);
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
            }
        }
    }
    
    private static Player[] initializePlayers(int numPlayers) {
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            String name = getPlayerName(i + 1);
            players[i] = new Player(name);
        }
        return players;
    }
    
    private static String getPlayerName(int playerNumber) {
        while (true) {
            System.out.print("Enter name for Player " + playerNumber + ": ");
            String name = scanner.nextLine().trim();
            if (!name.isEmpty()) {
                return name;
            }
            System.out.println("Name cannot be empty. Please try again.");
        }
    }
}
