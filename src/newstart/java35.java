package newstart;
import java.util.Scanner;
public class java35 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Let's play Mad Libs!");

            // Get words from user
            System.out.print("Enter an adjective: ");
            String adj = scanner.nextLine();

            System.out.print("Enter a noun: ");
            String noun1 = scanner.nextLine();

            System.out.print("Enter a verb (past tense): ");
            String verb = scanner.nextLine();

            System.out.print("Enter another noun: ");
            String noun2 = scanner.nextLine();

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter a silly word: ");
            String silly = scanner.nextLine();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Display the story
            System.out.println("\nHere's your Mad Lib story:\n");
            System.out.println("One " + adj + " day, a " + noun1 +
                    " decided to " + verb + " to the store.");
            System.out.println("On the way, it met " + number + " " + noun2 +
                    "s dancing the " + silly + ".");
            System.out.println("\"This is ridiculous!\" said " + name + ".");
            System.out.println("And they all lived happily ever after.\n");
            System.out.println("THE END");

            scanner.close();
        }
    }

