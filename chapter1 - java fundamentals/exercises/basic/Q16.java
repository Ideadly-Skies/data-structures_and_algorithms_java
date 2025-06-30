package exercises.basic;

public class Q16 {
    public static boolean onlyConsonants(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o' || ch == 'y'){
                return false; 
            } 
        }

        return true;
    } 
    
    public static void main(String[] args){
        System.out.println(onlyConsonants("trtz"));
    } 
}