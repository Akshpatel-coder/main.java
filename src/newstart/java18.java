package newstart;
import java.util.Scanner;
public class java18 {
    // Importing Scanner for user input


        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for their name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Ask the user for their age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Clear the input buffer
            scanner.nextLine();

            // Ask the user for their favorite hobby
            System.out.print("Enter your favorite hobby: ");
            String hobby = scanner.nextLine();

            // Display a personalized message
            System.out.println("\nHello, " + name + "! You are " + age + " years old and enjoy " + hobby + ".");
            System.out.println("Java is a great hobby too! Maybe you’ll enjoy coding as much as your other interests.");

            // Suggest something based on age
            if (age < 18) {
                System.out.println("You're young and full of potential—keep learning and exploring!");
            } else {
                System.out.println("Keep pursuing your dreams and inspiring others with your hobby!");
            }

            // Close the Scanner
            scanner.close();
        }
    }

