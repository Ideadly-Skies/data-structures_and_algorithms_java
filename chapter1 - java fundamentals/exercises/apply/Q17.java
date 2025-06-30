package exercises.apply;

import java.util.Scanner;

public class Q17 {
    
    public static void main(String[] args){
        // init variables to hold doubles 
        double shillings, pennies, pounds; 
        
        // init scanner
        Scanner sc = new Scanner(System.in);

        // define conversion factor for
        // 
        // both shillings and pennies 
        double shillings_to_pounds = 0.05;
        double pennies_to_pounds = 0.0041667;

        // prompt user for shillings and pennies
        System.out.print("Enter a number of shillings: "); 
        shillings = sc.nextDouble();

        System.out.print("Enter a number of pennies: "); 
        pennies = sc.nextDouble();

        // calculate pounds
        pounds = (shillings * shillings_to_pounds) + (pennies * pennies_to_pounds);

        // output calculated pounds
        System.out.printf("That's %.2f pounds\n", pounds);
        sc.close();
    } 
}
