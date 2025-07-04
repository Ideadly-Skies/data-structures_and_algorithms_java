package chapter2.project;

/**
 * Card 
 * 
 * Represents a single playing card with suit and rank 
*/
public class Card {
    
    public enum SUIT {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }
    
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING; 
    }
    // private attributes of class
    private SUIT suit;
    private Rank rank;

    /**
     * Constructor
     * 
     * @param newSuit Suit for this new Card
     * @param newRank Rank for this new Card
     */
    public Card(SUIT newSuit, Rank newRank){
        this.suit = newSuit;
        this.rank = newRank;
    }

    /**
     * Return a string representation of this Card
     * 
     * @return a string describing the suit and rank
    */
    public String toString() {
        return this.rank + " of " + this.suit;
    }
}