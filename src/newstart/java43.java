package newstart;
import java.util.Scanner;
public class java43 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean keepRunning = true;

            System.out.println("=== Welcome to the Interactive Greeting Program ===");

            while (keepRunning) {
                System.out.print("Enter your name: ");
                String name = input.nextLine();

                System.out.print("Enter your age: ");
                int age = input.nextInt();
                input.nextLine(); // consume leftover newline

                System.out.println("Hello, " + name + "!");

                if (age < 13) {
                    System.out.println("You're a child. Enjoy your youth!");
                } else if (age < 20) {
                    System.out.println("Teenage years can be exciting and tough. Hang in there!");
                } else if (age < 60) {
                    System.out.println("You're an adult. Hope you're doing well!");
                } else {
                    System.out.println("You have great wisdom with your age.");
                }

                System.out.println(); // blank line for spacing
                System.out.print("Would you like to try again? (yes/no): ");
                String answer = input.nextLine();

                if (!answer.equalsIgnoreCase("yes")) {
                    keepRunning = false;
                }

                System.out.println(); // another blank line for clarity
            }

            System.out.println("Thanks for using the program. Goodbye!");
            input.close();
        }
    }


