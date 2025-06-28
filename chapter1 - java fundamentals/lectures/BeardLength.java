package lectures;
public class BeardLength {
    public static void main(String[] args){
        double lengthInMeters = 5.18;
        double lengthInMillimeters = lengthInMeters * 1000;

        double hours = lengthInMillimeters * 55.55;
        double days = hours / 24;
        double years = days / 365;

        // Use + to concatenate output to one string
        System.out.println(years + " years");
    } 
}