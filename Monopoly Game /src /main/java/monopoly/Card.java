package monopoly;

public class Card {
    private final String description;
    private final CardType type;
    private int spaceIndex;
    private int moneyAmount;

    public enum CardType {
        MOVE_TO_SPACE,
        MONEY,
        GET_OUT_OF_JAIL_FREE,
        GO_TO_JAIL,
        ADVANCE_TO_GO,
        GO_BACK,
        PAY_MONEY,
        RECEIVE_MONEY
    }

    public Card(String description, CardType type) {
        this.description = description;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public CardType getType() {
        return type;
    }

    public void setSpaceIndex(int spaceIndex) {
        this.spaceIndex = spaceIndex;
    }

    public int getSpaceIndex() {
        return spaceIndex;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void execute(Player player, Game game) {
        switch (this.type) {
            case ADVANCE_TO_GO:
                player.setPosition(0); // Assuming 0 is GO
                break;
            case GO_TO_JAIL:
                player.setPosition(10); // Assuming 10 is Jail
                // add jail status logic here
                break;
            case MONEY:
            case RECEIVE_MONEY:
                player.addMoney(moneyAmount);
                break;
            case PAY_MONEY:
                player.deductMoney(moneyAmount);
                break;
            case MOVE_TO_SPACE:
                player.setPosition(spaceIndex);
                break;
            case GO_BACK:
                player.setPosition(player.getPosition() - spaceIndex);
                break;
            case GET_OUT_OF_JAIL_FREE:
                player.addGetOutOfJailCard();
                break;
        }
    }

    @Override
    public String toString() {
        return description;
    }
}
