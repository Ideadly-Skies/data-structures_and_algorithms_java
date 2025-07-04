package chapter2.examples;

public class StaticExample {
    static String word;
    
    public static void main(String[] args){
        StaticExample a = new StaticExample();
        StaticExample b = new StaticExample();

        a.word = "aardvark";
        System.out.println(b.word); // prints...? aardvark
        
        b.word = "bandicoot";        
        System.out.println(a.word); // prints...? bandicoot 

        // static way
        StaticExample.word = "destroyer";
        System.out.println(a.word); // prints...? bandicoot
    }    

}