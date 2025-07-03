package chapter2.examples;

/**
 * BookDriver --- class with a main that tests Book 
 */

//  wow you just solved your own problem! https://stackoverflow.com/questions/32598120/cannot-find-symbol-in-same-package-and-directory
public class BookDriver {

    // package private (access available under package chapter2.examples only)
    // 
    // unless you add the public keyword specifier before the type
    public static void main(String[] args){
        // Create a new Book object
        Book prideAndPrejudice = new Book("Sydney Khosasih", "Price and Prejudice", 9.99, "Horror");
        double prideAndPrejudicePrice = prideAndPrejudice.getPrice();

        System.out.printf("pride and prejudice has the following price: $%.2f\n",prideAndPrejudicePrice);

        // Assign values to its instance variables using dot notation
        // prideAndPrejudice.author = "Sydney Khosasih";
        // prideAndPrejudice.title = "Pride and Prejudice"; 
        // prideAndPrejudice.price = 9.99;

        // print out book author title and price
        // System.out.printf("The book %s is written by %s and cost $%.2f\n",prideAndPrejudice.title, prideAndPrejudice.author, prideAndPrejudice.price);

        // create a new Book object
        Book algorithmsAndDataStructure = new Book("Jay Wengrow", "A Common-Sense Guide to Data Structures and Algorithms in Python, Volume 1: Level Up Your Core Programming Skills", 91.54, "Education");

        // assign values to its instance variables using dot notation
        // algorithmsAndDataStructure.author = "Jay Wengrow";
        // algorithmsAndDataStructure.title = "A Common-Sense Guide to Data Structures and Algorithms in Python, Volume 1: Level Up Your Core Programming Skills";
        // algorithmsAndDataStructure.price = 91.54;

        // print out book author title and price
        // System.out.printf("The book %s is written by %s and cost $%.2f\n",algorithmsAndDataStructure.title, algorithmsAndDataStructure.author, algorithmsAndDataStructure.price);
    
        System.out.println(prideAndPrejudice);
        System.out.println(algorithmsAndDataStructure); 
    }
}