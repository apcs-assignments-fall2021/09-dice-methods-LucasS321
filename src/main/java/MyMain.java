public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        // REPLACE YOUR CODE HERE
        return ((int)(Math.random()*6))+1;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
            if (rollDie()  == 6) {
                total += 1;
                continue;
            }
        }

        return total / 100;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            int local = 0;
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (local >= 2) {
                total += 1;
            }
        }

        return total / 100;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int total = 0;
        for (int i = 0; i < 10000; i++) {
            int local = 0;
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (rollDie()  == 6) {
                local += 1;
            }
            if (local >= 3) {
                total += 1;
            }
        }

        return total / 100;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(rollDie()); //random number 1 - 6
        System.out.println(probabilityOneSix()); // probability one 6
        System.out.println(probabilityTwoSixes()); // probability two 6
        System.out.println(probabilityThreeSixes()); // probability three 6
    }
}
