package newstart;

 import java.util.Scanner; // Importing Scanner for user input

    public class java20{

    public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Ask the user for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // Close the Scanner
            scanner.close();
        }
    }

