package newstart;
import java.util.Scanner;

public class java25 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Choose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        // Take operation choice from user
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Ask for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");

    }
}
