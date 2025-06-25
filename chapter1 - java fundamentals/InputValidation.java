import java.util.Scanner;

public class InputValidation {
    
    public static void main(String[] args){
        // Setup
        Scanner in = new Scanner(System.in);
        System.out.print("Coffee (y/n)? ");
        boolean checkingInput = true;

        // Read the initial response
        String response = in.next();        

        // Loop until the user inputs a valid choice
        while (checkingInput){
            // If response is "y" or "n", end the loop
            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n")){
                checkingInput = false; 
            }

            // otherwise, propmt and read again
            else {
                System.out.print("Enter y or n: ");
                response = in.next();
            }
        }

        in.close();
    }    
}