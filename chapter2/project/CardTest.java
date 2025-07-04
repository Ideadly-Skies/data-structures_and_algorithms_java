package chapter2.project;

import chapter2.project.Card.Suit;
import chapter2.project.Card.Rank;

public class CardTest {
    public static void main(String[] args){
        Card aceOfSpades = new Card(Suit.SPADES, Rank.ACE);
        Card queenOfHearts = new Card(Suit.HEARTS, Rank.QUEEN);

        System.out.println(aceOfSpades);
        System.out.println(queenOfHearts);
    }
}
