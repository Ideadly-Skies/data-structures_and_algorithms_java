public class EqualsMethod {
    public static void main(String[] args){
        // Two strings with the same characters
        String s1 = new String("Tyrannosaurus Rex");        
        String s2 = new String("Tyrannosaurus Rex");

        if (s1.equals(s2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    } 
}
