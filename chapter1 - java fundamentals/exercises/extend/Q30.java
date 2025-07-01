package exercises.extend;

public class Q30 {
    public static int reverse_num(int num){
        String num_str = Integer.toString(num);  
        String num_rev = ""; 
        
        for(int i = 0; i < num_str.length() / 2; i++){
            int twin = num_str.length() - 1 - i;  
            num_rev += num_str.charAt(twin); 
        }

        if (num % 2 != 0){
            num_rev += num_str.charAt(num_str.length() / 2); 
        }

        for(int i = num_str.length() / 2 - 1; i >= 0; i--){
            num_rev += num_str.charAt(i); 
        }

        return Integer.parseInt(num_rev);
    } 
    
    public static void main(String[] args){
        System.out.println(reverse_num(12345)); 
        System.out.println(reverse_num(123456));
        System.out.println(reverse_num(123));
    }    
}
