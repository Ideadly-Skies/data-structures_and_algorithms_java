package chapter2.project;

import java.util.ArrayList;
import java.util.Collections;

import chapter2.project.Card.Suit;
import chapter2.project.Card.Rank;

public class Deck {
    
    /**
     * Represent the deck as a list of Card objects
     */
    private ArrayList<Card> deck;    

    /**
     * Constructor -- create an ArrayList of 52 Cards 
     */
    public Deck(){
        this.deck = new ArrayList<Card>(); // initialize empty ArrayList
    
        // Loop through all 52 cards using the enhanced for loop
        for (Suit s : Suit.values()){
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                deck.add(c);
            }
        }    
    }

    /**
     * Deal a card from this deck
     * @return the first Card in this Deck
     */
    public Card deal(){
        // remove the last element from deck ArrayList
        // more efficient than removing the first element 
        return this.deck.remove(this.deck.size()-1);
    }

    /**
     * Randomly permute the Card in this Deck 
     */
    public void shuffle(){
        Collections.shuffle(this.deck);
    }

    /**  
     * Return a String representation of this Deck
     * @return a String listing all cards in the Deck
     * */ 
    public String toString(){
        return this.deck.toString();
    }
}