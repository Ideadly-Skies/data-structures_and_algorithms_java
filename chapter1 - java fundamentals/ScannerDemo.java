// Reading user input with Scanner
import java.util.Scanner;

public class ScannerDemo {
    
    // program invocation occurs in the main function 
    public static void main(String[] args){
        // Create a new scanner -- System.in is the standard input
        Scanner input = new Scanner(System.in);

        // Read a string using the NextLine method
        System.out.printf("What is your name? ");
        String name = input.nextLine();

        // Print a message using the name
        System.out.printf("Hello, " +  name + ".");
    
        // close the input stream
        input.close();
    }
}