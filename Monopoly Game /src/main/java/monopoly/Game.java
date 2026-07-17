package monopoly;

public class Game {
    private final Player[] players;
    private final Board board;

    public Game(Player[] players) {
        this.players = players;
        this.board = new Board(this);
    }

    public void start() {
        System.out.println("Game started with " + players.length + " players.");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public Player[] getPlayers() {
        return players;
    }

    public Board getBoard() {
        return board;
    }

    public void reset() {
        for (Player player : players) {
            player.setPosition(0);
            player.adjustMoney(1500 - player.getMoney());
            player.getOutOfJail();
        }
    }
}
