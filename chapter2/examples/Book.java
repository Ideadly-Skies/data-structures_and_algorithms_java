package chapter2.examples;

/**
 * A basic Book class with a title, author, and price 
 */
public class Book {
    // Declare instance variables of the class
    public String author;  
    public String title;
    public double price;

    /**
     * Constructor
     * 
     * @param newAuthor author of this new Book 
     * @param newTitle title of this new Book
     * @param newPrice price of this new Book
     */
    public Book(String newAuthor, String newTitle, double newPrice){
        this.author = newAuthor;
        this.title = newTitle; 
        this.price = newPrice;
    }

    /**
     * Returns a String representation of this Book
     * 
     * @return String describing title, author, and price 
     */
    public String toString(){
        // Construct a summary string for this book
        String summary = String.format("%s by %s, %.2f", this.title, this.author, this.price);
        return summary;
    } 
}