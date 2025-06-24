import java.util.Scanner;

public class Cho {
    public static void main(String[] args){
        System.out.println("Welcome to Cho-Han");
        System.out.println("1. Even");
        System.out.println("2. Odd");
        System.out.println("Select a bet.");

        // init scanner sc from system.in
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();            
        
        // generate a random die roll from 1 to 6 
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1; 
        int total = roll1 + roll2;
        
        System.out.printf("The dice are %d and %d\n", roll1, roll2);
        System.out.printf("The sum is %d\n", total);

        // boolean flag value
        boolean isWin = false; 

        // even number total and even choice 
        if (total % 2 == 0 && choice == 1){
            isWin = true;
        } 

        else if (total % 2 != 0 && choice == 2){
            isWin = true;
        }
        
        if (isWin){
            System.out.println("You win.");
        } else {
            System.out.println("You lose.");
        }

        sc.close();
    } 
}