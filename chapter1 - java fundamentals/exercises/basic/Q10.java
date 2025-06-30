package exercises.basic;

public class Q10 {
    
    public static void main(String[] args){
        double max_percentage_error = 0;

        for(int deg = 0; deg <= 360; deg += 30){
            double bhaskara_approx = (4 * deg * (180 - deg)) / (40500 - (deg * (180 - deg))); 
            double math_sin = Math.sin(Math.toRadians(deg));

            System.out.printf("Bhaskara Approximation: %.2f\n", bhaskara_approx);
            System.out.printf("Math Sin Approximation: %.2f\n", math_sin);

            double abs_diff = Math.abs(bhaskara_approx - math_sin); 

            double percentage_error = (abs_diff * 100/ math_sin);
            
            if (percentage_error > max_percentage_error){
                max_percentage_error = percentage_error;
            }             
        }

        System.out.printf("max percentage error: %.2f%%\n", max_percentage_error);
    }    
}