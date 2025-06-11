public class MyMath {
    public static void main(String[] args) {
        // Math.pow calculates power
        // Math.PI is the built-in double value of pi 
        double r = 5.0;
        double area = Math.PI * Math.pow(r, 2); 

        // trigonometric function
        double s = Math.sin(Math.PI / 2);
        double c = Math.cos(3 * Math.PI / 2);

        System.out.printf("The area is %.2f\n", area);
        System.out.printf("Sin = %.2f & cos = %.2f\n", s, c);

        // generating coin tosses (alternating between 0 and 1) 
        double flip = Math.round(Math.random());
        System.out.printf("flip: %.2f\n", flip);
        
        // generate a random die roll from 1 to 6 
        int roll = (int) (Math.random() * 6) + 1;
        System.out.printf("Number of roll: %d", roll);
    }    
}