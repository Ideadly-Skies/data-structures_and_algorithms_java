package chapter2.project;

import chapter2.project.Card.SUIT;
import chapter2.project.Card.Rank;

public class DeckOfCards {
    public static void main(String[] args){

        // Declare a suit variable and assign it to SPADES 
        // Use dot notation to access enum elements
        SUIT suit = SUIT.SPADES;

        // use dot notation to derive eight 
        Rank rank = Rank.EIGHT;

        System.out.print(rank);
        System.out.printf(" of ");
        System.out.print(suit);
    } 
}
