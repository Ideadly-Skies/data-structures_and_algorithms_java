/**
 * Monte Carlo approach to estimate the probability of winning
 * the big bet in sic bo. Look at it carefully; it combines all of
 * the features we've discussed so far 
 */
public class SicBo {
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

            // Otherwise, the bet wins on a sum greater than 10
            else if (die1 + die2 + die3 > 10){
                numWins++;
            }
        }

        // calculate the total fraction of wins
        // 
        // cast one value to a double to get a fractional result
        double winPercentage = ((double) numWins) / NUM_TRIALS;        

        // output
        System.out.printf("Winning prob. = %.4f.\n", winPercentage);
    }    
}