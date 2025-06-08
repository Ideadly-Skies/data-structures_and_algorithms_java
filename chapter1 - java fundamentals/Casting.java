public class Casting {
    public static void main(String[] args) {
        int successes = 789;
        int trials = 1500;

        // this expression results in 0 because of the integer division
        double incorrectFraction = successes / trials;

        System.out.printf("incorrect fraction: %.2f\n", incorrectFraction);

        // cast one variable to a double to get correct result
        double correctFraction = ((double) successes / trials);

        System.out.printf("Correct fraction: %.2f\n", correctFraction);
    }
}