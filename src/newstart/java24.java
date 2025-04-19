package newstart;
import java.util.Scanner;
public class java24 {
    // A simple program to add two numbers


        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");

            // Close the scanner
            scanner.close();
        }
    }

