/*
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

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private CardCompany(){}

    public static CardCompany getInstance() {

        if(instance == null){
            instance = new CardCompany();
        }


        return instance;
    }

    public static Card createCard(){
        Card card = new Card();
        return card;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();
        Card card1 = company.createCard();
        Card card2 = company.createCard();
        System.out.println(card1.getCardId());
        System.out.println(card2.getCardId());
    }
}
*/

