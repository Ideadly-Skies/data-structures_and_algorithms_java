package lectures;
public class IntroJavaDoc {
    
    /**
     * Roll a group of dice and return their sum
     * 
     * @param n number of dice
     * @param faces number of faces on each die
     * @return the sum of n random rolls in [1, faces]
     */ 
    public static int rollDice(int n, int faces){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += (int) (Math.random() * faces) + 1;
        }
        return sum;
    }

    public static void main(String[] args){
        // roll a 6 faced die 5 times and compute sum  
        int sum = rollDice(5, 6);
        System.out.println(sum);
    }    
}