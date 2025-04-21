package newstart;
import java.util.Scanner;
public class java27 {

        public static void main(String[] args) {
            // Generate a random number between 1 and 100
            int targetNumber = (int) (Math.random() * 100) + 1;
            int guess;
            int attempts = 0;
            boolean isCorrect = false;

            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have picked a number between 1 and 100. Try to guess it!");

            // Loop until the user guesses correctly
            while (!isCorrect) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("It took you " + attempts + " attempts.");
                    isCorrect = true;
                }
            }

            // Close the scanner
            scanner.close();
        }
    }

