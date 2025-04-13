package newstart;
import java.util.Scanner; // Importing Scanner for user input

public class java19 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their favorite color
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Ask the user for their favorite number
        System.out.print("Enter your favorite number: ");
        int number = scanner.nextInt();

        // Clear the input buffer
        scanner.nextLine();

        // Ask the user for their favorite animal
        System.out.print("Enter your favorite animal: ");
        String animal = scanner.nextLine();

        // Create a fun story
        System.out.println("\nHere’s your personalized story:");
        System.out.println("Once upon a time, there was a magical " + animal + " that loved the color " + color + ".");
        System.out.println("One day, it found " + number + " sparkling treasures hidden in a forest.");
        System.out.println("The " + animal + " shared its treasures with everyone, and they lived happily ever after.");

        // Add a fun conclusion
        System.out.println("Moral of the story: Always embrace your love for " + color + " and " + animal + "!");

        // Close the Scanner
        scanner.close();
    }
}