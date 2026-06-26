package monopoly;

public class Space {
    private final String name;
    private final int index;
    private final SpaceType type;
    private final int value;
    private Player owner;

    public enum SpaceType {
        GO,
        PROPERTY,
        TAX,
        CHANCE,
        COMMUNITY_CHEST,
        JAIL,
        FREE_PARKING,
        GO_TO_JAIL,
        EMPTY
    }

    public Space(String name, int index, SpaceType type, int value) {
        this.name = name;
        this.index = index;
        this.type = type;
        this.value = value;
        this.owner = null;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public SpaceType getType() {
        return type;
    }

    public int getValue() {
        return value;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void landOn(Player player) {
        switch (type) {
            case TAX:
                player.payTax(value);
                break;
            case GO_TO_JAIL:
                player.goToJail();
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return index + ": " + name + " (" + type + ")";
    }
}
