package chapter2.examples;

import java.util.ArrayList;

public class ArrayListDemo {
    
    public static void main(String[] args){
        // declare new array list of composers
        // java demands that you specify the type of data in the list so that the
        // compiler can verify the type safety of anything that you might add or remove
        // from it
        ArrayList<String> composers = new ArrayList<String>(); 
        
        // append the following elements to the end of composers
        composers.add("Wolgang Amadeus Mozart");
        composers.add("Scott Joplin");
        composers.add("Clara Schumann");
        composers.add("Iannis Xenakis");

        // return the number of items in the list 
        int numComposers = composers.size(); // 4

        // toString method prints the list

        // indexing starts at 0, similar to python JS and C/C++
        String clara = composers.get(2);

        // dynamic insert and removal
        String mozart = composers.remove(0);

        // insert new value into the new position
        composers.add(0, "Francisco Tarrega");

        // this will fail
        // ArrayList<int> primes = new ArrayList<int>();

        // use the capital-I Integer wrapper type
        ArrayList<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5); 
        primes.add(7);

        // conversion also works the other way -- "auto-unboxing"
        int firstPrime = primes.get(0);
        System.out.printf("%d is the first prime number.\n", firstPrime);
    }
}