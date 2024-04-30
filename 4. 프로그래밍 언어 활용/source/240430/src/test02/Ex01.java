package test02;

import java.util.Comparator;

public class Ex01 {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();
        Card card1 = company.createCard();
        Card card2 = company.createCard();
        System.out.println(card1.getCardId());
        System.out.println(card2.getCardId());
    }
}
