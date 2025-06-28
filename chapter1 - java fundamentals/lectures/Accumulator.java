package lectures;
public class Accumulator {
    public static void main(String[] args){
        int sum = 0; 
        for(int j = 1; j < 101; j++) {
            if (j % 2 == 0){
                sum += j;
            } 
        }
        
        System.out.printf("Sum of all even numbers from 1 to 100 is %d\n", sum);        
    }    
}