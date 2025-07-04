package chapter2.project;

/**
 * Card 
 * 
 * Represents a single playing card with suit and rank 
*/
public class Card {
    
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }
    
    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING; 
    }
    // private attributes of class
    private Suit suit;
    private Rank rank;

    /**
     * Constructor
     * 
     * @param newSuit Suit for this new Card
     * @param newRank Rank for this new Card
     */
    public Card(Suit newSuit, Rank newRank){
        this.suit = newSuit;
        this.rank = newRank;
    }

    /**
     * Return the SUIT of this Card
     * @return Suit for this card 
     */
    public Suit getSuit(){
        return this.suit;
    }

    /**
     * Return the RANK of this card
     * @return Rank for this card
     */
    public Rank getRank(){
        return this.rank;
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