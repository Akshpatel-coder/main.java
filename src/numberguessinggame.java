
    import java.util.Random;
    public class numberguessinggame {

        public static void main(String[] args) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int numberOfTries = 0;
            int guessedNumber = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            while (guessedNumber != numberToGuess) {
                // Simulating user input for demonstration purposes
                guessedNumber = simulateUserInput(); // Replace with actual input method
                numberOfTries++;

                if (guessedNumber < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guessedNumber > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                }
            }
        }

        // Simulated user input method (for demonstration purposes)
        private static int simulateUserInput() {
            Random random = new Random();
            return random.nextInt(100) + 1; // Simulating a guess between 1 and 100
        }
    }

