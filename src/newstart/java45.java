package newstart;
import java.util.Scanner;
public class java45 {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Greeting!");
        System.out.println("--------------------------");

        // Ask for user's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Ask for user's age
        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        // Greet the user
        System.out.println("\nHello, " + name + "!");

        // Check if it's their birthday
        System.out.print("Is today your birthday? (yes/no) ");
        scanner.nextLine(); // Clear the buffer
        String birthdayResponse = scanner.nextLine();

        if (birthdayResponse.equalsIgnoreCase("yes")) {
            age++; // Increment age if it's their birthday
            System.out.println("Happy Birthday! �");
        }

        // Print age message
        System.out.println("You are " + age + " years old.");

        // Closing message

    }
}