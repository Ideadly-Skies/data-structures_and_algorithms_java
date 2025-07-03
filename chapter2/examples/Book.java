package chapter2.examples;

/**
 * A basic Book class with a title, author, and price 
 */
public class Book {
    // Declare instance variables of the class
    private String author;  
    private String title;
    private double price;
    private String genre;

    // constructor and toString methods appear below here
    
    /**
     * get the current value of price
     * 
     * @return the price of this book
     */
    public double getPrice(){
        return this.price;
    }  

    /**
     * get the current title for this book
     * 
     * @return the title of this book
     */
    public String getTitle(){
        return this.title;
    }

    /**
     * get the current author of this book
     * 
     * @return the author of this book
     */
    public String getAuthor(){
        return this.author;
    }

    /**
     * return the current genre of this book
     * 
     * @return the genre of this book
     */
    public String getGenre(){
        return this.genre;
    }

    // setter methods
    public void setPrice(double newPrice){
        // ignore negative prices
        if (newPrice < 0.0){
            return;
        }

        // set the new price
        this.price = newPrice; 
    }

    /**
     * set the genre of the book with new value
     * 
     * @param genre value that you set for the boo
     */
    public void setGenre(String genre){
        this.genre = genre;
    }

    /**
     * Constructor
     * 
     * @param newAuthor author of this new Book 
     * @param newTitle title of this new Book
     * @param newPrice price of this new Book
     */
    public Book(String newAuthor, String newTitle, double newPrice, String genre){
        this.author = newAuthor;
        this.title = newTitle; 
        this.price = newPrice;
        this.genre = genre;
    }

    /**
     * Returns a String representation of this Book
     * 
     * @return String describing title, author, and price 
     */
    public String toString(){
        // Construct a summary string for this book
        String summary = String.format("%s by %s, %.2f genre = %s", this.title, this.author, this.price, this.genre);
        return summary;
    } 
}