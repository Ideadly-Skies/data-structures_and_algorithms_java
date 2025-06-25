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
    
    public static void main(String[] args){
         
        // a class belonging to the class itself
        System.out.println(sumOfTwoDice());
    }    
}