package exercises.basic;

public class Q13 {

    /**
     * convert weight in kilogram to pounds
    */
    public static void main(String[] args){
        
        // 1 kg = 2.20462 lb 
        double conversion_spec = 2.20462;  
        double record_lift_kg = 267;        

        System.out.printf("Record lift in kg: %.2f kg\n", record_lift_kg);
        System.out.printf("Record lift in pounds: %.1f lb\n", record_lift_kg * conversion_spec);

    }    
}