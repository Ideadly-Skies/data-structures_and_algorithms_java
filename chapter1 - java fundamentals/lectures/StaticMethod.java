package lectures;
public class StaticMethod {
    public static double circleArea(double radius){
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public static int dieRoll(){
        return (int) (Math.random() * 6) + 1;
    }

    public static int sumOfTwoDice(){
        int die1 = dieRoll();
        int die2 = dieRoll();
        return die1 + die2; 
    }

    /**
     * return if n is an even number
     * @param n, number supplied
     * @return boolean true/false value
     */
    public static boolean isEven(int n) {
        return n % 2 == 0; 
    }

    /**
     * function to rollDie n times with faces
     * @param n
     * @param faces
     * @return
     */
    public static int rollDie(int n, int faces){
        int sum = 0; 
        for (int i = 0; i < n; i++){
            sum += (int) (Math.random() * faces) + 1;
        }

        return sum;
    }
    
    public static void main(String[] args){

        // a class belonging to the class itself
        System.out.println(sumOfTwoDice());
    }    
}