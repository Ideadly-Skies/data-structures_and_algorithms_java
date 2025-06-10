import java.util.Scanner;

public class Binet {
    public static void main(String[] args) {
        // define ratios 
        double CONSTANT_RATIO = 1 / Math.sqrt(5);  
        double LEFT = (1 + Math.sqrt(5)) / 2;        
        double RIGHT = (1 - Math.sqrt(5)) / 2;

        // scan for the value of n
        Scanner sc = new Scanner(System.in);     
        System.out.printf("please input n: ");
    
        // record user answer 
        int n = sc.nextInt();

        // calculate the nth fibonnaci number 
        double f_n = CONSTANT_RATIO * (Math.pow(LEFT, n) - Math.pow(RIGHT, n));
        System.out.printf("the %d fibonnaci number is %.0f.\n",n,f_n);

        // close the scanner
        sc.close(); 
    } 
}