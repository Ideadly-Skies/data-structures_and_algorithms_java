public class StringEqualityOperator {
    
    public static void main(String[] args){
        String s1 = new String("Tyrannosaurus Rex");
        String s2 = s1;
        
        // test if two strings are equal
        if (s1 == s2){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }    
}