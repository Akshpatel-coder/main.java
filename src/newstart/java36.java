package newstart;
import java.util.Scanner;
public class java36 {

        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a number
            System.out.println("Factorial Calculator");
            System.out.println("-------------------");
            System.out.print("Enter a number (0-20): ");

            // Read the user's input
            int number = scanner.nextInt();

            // Validate the input
            if (number < 0 || number > 20) {
                System.out.println("Please enter a number between 0 and 20.");
                return;
            }

            // Calculate the factorial
            long factorial = calculateFactorial(number);

            // Display the result
            System.out.println("The factorial of " + number + " is: " + factorial);

            // Close the scanner
            scanner.close();
        }

        /**
         * Calculates the factorial of a given number
         * @param n The number to calculate factorial for
         * @return The factorial of n
         */
        public static long calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }

            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

