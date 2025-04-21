package newstart;
import java.util.Scanner;
public class java26 {

        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Assume the number is prime
            boolean isPrime = true;

            // Check if the number is less than 2 (not prime)
            if (number < 2) {
                isPrime = false;
            } else {
                // Check divisors from 2 to the square root of the number
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false; // Found a divisor, so it's not prime
                        break;
                    }
                }
            }

            // Display the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            // Close the scanner
            scanner.close();
        }
    }

