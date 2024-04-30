package test01;

public class Card {
    private int cardId;
    private static int cardSiralNumber = 1000;

    public Card(){
        cardSiralNumber++;
        cardId = cardSiralNumber;
    }

    public int getCardId() {
        return cardId;
    }

}
