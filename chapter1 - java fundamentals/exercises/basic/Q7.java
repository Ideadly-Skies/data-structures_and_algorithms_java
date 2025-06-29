package exercises.basic;

public class Q7 {
    public static int min(int num1, int num2){
        if (num1 < num2) return num1; else return num2;
    } 

    public static void main(String[] args) {
        System.out.println(min(1, 2));    
    }
}
