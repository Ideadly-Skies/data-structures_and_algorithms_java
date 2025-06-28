package lectures;
public class SicBoOdd {
     public static void main(String[] args){
        // constant number of trials
        final int NUM_TRIALS = 10000;

        // count the number of trials that result in a win
        int numWins = 0;

        // Iterate over the number of trials 
        for (int trial = 0; trial < NUM_TRIALS; trial++){
            // simulate three dice
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int die3 = (int) (Math.random() * 6) + 1;
        
            // The bet loses on a triple
            if (die1 == die2 && die2 == die3){
                continue;
            }

            // Otherwise, the bet wins on an odd sum 
            else if ((die1 + die2 + die3) % 2 != 0){
                numWins++;
            }
        }

        // calculate the total fraction of wins
        // 
        // cast one value to a double to get a fractional result
        double winPercentage = ((double) numWins) / NUM_TRIALS;        

        // output
        System.out.printf("Winning prob odd. = %.4f.\n", winPercentage);
    }
}
