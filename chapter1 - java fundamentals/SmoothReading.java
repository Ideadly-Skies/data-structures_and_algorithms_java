import java.util.Scanner;

public class SmoothReading {

    public static void main(String[] args){
        // initialize input scanner taking in System.in arguments 
        Scanner input = new Scanner(System.in);

        // propmt user to enter value
        System.out.print("Please enter a measurement in cm: ");
        double centimeter = input.nextDouble();
        
        // declare constant in all capslock
        final double CM_PER_SMOOT = 170.0;
        
        System.out.printf("The measurement in terms of smoot: %.3f3f3f smoot!\n", centimeter / CM_PER_SMOOT);

        // close scanner
        input.close();
    }
}