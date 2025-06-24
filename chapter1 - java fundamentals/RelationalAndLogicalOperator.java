// class RelationalAndLogicalOperator
public class RelationalAndLogicalOperator {
    
    // the final operator !, inverts the result of a single test
    // in this example, you will see how it converts an expression
    // using && into one using ||, or vice versa
    public static void main(String[] args){
        // init variable for testing 
        double x = 11.0;

        // true if x is outside the range of 0 to 10 
        if (x < 0 || x > 10){
            System.out.printf("%.0f is outside the range of 0 to 10\n", x); 
        }

        // true if x is outside the range of 0 to 10
        if (!(x >= 0 && x <= 10)){
            System.out.printf("%.0f is outside the range of 0 to 10\n", x);
        }
    } 
}