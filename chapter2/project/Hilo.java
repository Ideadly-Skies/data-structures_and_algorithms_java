package chapter2.project;
import java.util.Scanner;
import chapter2.project.Card.Rank;

// High or Low (Guessing game)
public class Hilo {

    public static void main(String[] args) {
        // Initialize and shuffle the deck
        Deck deck = new Deck();
        deck.shuffle();

        // Create a Scanner for user input
        Scanner sc = new Scanner(System.in);        

        // Deal and print the first card
        Card firstCard = deck.deal();

        // Propmt the user for a guess
        System.out.println("The next card will be:");
        System.out.println("1. Higher");
        System.out.println("2. Lower");
        System.out.print("Enter your choice: ");

        // Read the user's choice with nextInt
        int choice = sc.nextInt();

        // Deal and print the next card
        Card secondCard = deck.deal();

        // Extract the ranks and compare them
        Rank firstRank = firstCard.getRank();
        Rank secondRank = secondCard.getRank();
        int diff = secondRank.compareTo(firstRank);

        // Print the result
        // 
        // There are four options: two way to win,
        // a tie between the ranks, or loss.
        if (choice == 1 && diff > 0 || choice == 2 && diff < 0){
            System.out.println("Winner, winner, chicken dinner!");
        } else if (diff == 0) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("You have choosen...poorly.");
        }

        // close the scanner
        sc.close();
    }
}