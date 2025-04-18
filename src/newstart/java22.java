package newstart;
import java.util.Scanner;
public class java22 {
 // Importing Scanner for user input


        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Welcome message
            System.out.println("Welcome to the Even-Or-Odd Checker!");
            System.out.println("You'll enter a number, and I'll tell you if it's even or odd.");

            // Variable to control the loop
            boolean continueChecking = true;

            while (continueChecking) {
                // Ask the user to enter a number
                System.out.print("\nEnter a number: ");
                int number = scanner.nextInt();

                // Check if the number is even or odd
                if (number % 2 == 0) {
                    System.out.println("The number " + number + " is even.");
                } else {
                    System.out.println("The number " + number + " is odd.");
                }

                // Ask if the user wants to try again
                System.out.print("\nWould you like to check another number? (yes/no): ");
                scanner.nextLine(); // Clear the input buffer
                String response = scanner.nextLine();

                if (response.equalsIgnoreCase("no")) {
                    continueChecking = false; // Exit the loop
                }
            }

            // Farewell message
            System.out.println("\nThank you for using the Even-Or-Odd Checker. Goodbye!");

            // Close the Scanner
            scanner.close();
        }
    }

