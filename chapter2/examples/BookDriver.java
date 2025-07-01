package chapter2.examples;

/**
 * BookDriver --- class with a main that tests Book 
 */

//  wow you just solved your own problem! https://stackoverflow.com/questions/32598120/cannot-find-symbol-in-same-package-and-directory
public class BookDriver {

    public static void main(String[] args){
        // Create a new Book object
        Book prideAndPrejudice = new Book();
        

        // Assign values to its instance variables using dot notation
        prideAndPrejudice.author = "Sydney Khosasih";
        prideAndPrejudice.title = "Pride and Prejudice"; 
        prideAndPrejudice.price = 9.99;

        // print out book author title and price
        System.out.printf("The book %s is written by %s and cost $%.2f\n",prideAndPrejudice.title, prideAndPrejudice.author, prideAndPrejudice.price);
    }
}