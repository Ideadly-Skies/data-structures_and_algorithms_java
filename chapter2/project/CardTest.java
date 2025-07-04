package chapter2.project;

import chapter2.project.Card.Suit;
import chapter2.project.Card.Rank;
import chapter2.project.Deck;

public class CardTest {
    public static void main(String[] args){
        Card aceOfSpades = new Card(Suit.SPADES, Rank.ACE);
        Card queenOfHearts = new Card(Suit.HEARTS, Rank.QUEEN);

        System.out.println(aceOfSpades);
        System.out.println(queenOfHearts);

        // an ArrayList have their own built-in toString implementation
        // when invoked will invoke the respective toString implementation of the elements
        // that it contains
        Deck deckOfCard = new Deck();

        // shuffle -- rearrange the deck internally, no return
        deckOfCard.shuffle();

        // print using toString
        System.out.println(deckOfCard);
    }
}
