package monopoly;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.*;

public class Card {
    private String description;
    private CardEffect effect;
    private int spaceIndex;
    private int moneyAmount;
    private boolean isGetOutOfJailFree;
    private boolean isMoveToSpaceCard;
    private boolean isMoneyCard;
    private boolean isGetOutOfJailFreeCard;
    private boolean isGoToJailCard;
    private boolean isAdvanceToGoCard;
    private boolean isGoBackCard;
    private boolean isPayMoneyCard;
    private boolean isReceiveMoneyCard;

    public Card(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setEffect(CardEffect effect) {
        this.effect = effect;
    }

    public CardEffect getEffect() {
        return effect;
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

    public void setGetOutOfJailFree(boolean isGetOutOfJailFree) {
        this.isGetOutOfJailFree = isGetOutOfJailFree;
    }

    public boolean isGetOutOfJailFree() {
        return isGetOutOfJailFree;
    }

    public void setMoveToSpaceCard(boolean isMoveToSpaceCard) {
        this.isMoveToSpaceCard = isMoveToSpaceCard;
    }

    public boolean isMoveToSpaceCard() {
        return isMoveToSpaceCard;
    }

    public void setMoneyCard(boolean isMoneyCard) {
        this.isMoneyCard = isMoneyCard;
    }

    public boolean isMoneyCard() {
        return isMoneyCard;
    }

    public void setGetOutOfJailFreeCard(boolean isGetOutOfJailFreeCard) {
        this.isGetOutOfJailFreeCard = isGetOutOfJailFreeCard;
    }

    public boolean isGetOutOfJailFreeCard() {
        return isGetOutOfJailFreeCard;
    }

    public void setGoToJailCard(boolean isGoToJailCard) {
        this.isGoToJailCard = isGoToJailCard;
    }

    public boolean isGoToJailCard() {
        return isGoToJailCard;
    }

    public void setAdvanceToGoCard(boolean isAdvanceToGoCard) {
        this.isAdvanceToGoCard = isAdvanceToGoCard;
    }

    public boolean isAdvanceToGoCard() {
        return isAdvanceToGoCard;
    }

    public void setGoBackCard(boolean isGoBackCard) {
        this.isGoBackCard = isGoBackCard;
    }

    public boolean isGoBackCard() {
        return isGoBackCard;
    }

    public void setPayMoneyCard(boolean isPayMoneyCard) {
        this.isPayMoneyCard = isPayMoneyCard;
    }

    public boolean isPayMoneyCard() {
        return isPayMoneyCard;
    }

    public void setReceiveMoneyCard(boolean isReceiveMoneyCard) {
        this.isReceiveMoneyCard = isReceiveMoneyCard;
    }

    public boolean isReceiveMoneyCard() {
        return isReceiveMoneyCard;
    }

    public void applyEffect(Player player, Game game) {
        if (effect != null) {
            effect.apply(player, game);
        }
    }

    case CardEffect {
        public void apply(Player player, Game game) {
            // Implement the logic to apply the card's effect on the player and game state
        }
    }

    public void execute(Player player, Game game) {
        applyEffect(player, game);
    }

    public String toString() {
        return description;
    }

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

}
