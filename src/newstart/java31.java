package newstart;
import java.util.Scanner;

public class java31 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            char choice;

            System.out.println("=== Positive, Negative, or Zero Checker ===");

            do {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                if (number > 0) {
                    System.out.println(number + " is Positive.");
                } else if (number < 0) {
                    System.out.println(number + " is Negative.");
                } else {
                    System.out.println("The number is Zero.");
                }

                System.out.print("Do you want to check another number? (y/n): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Thanks for using the program!");
            scanner.close();
        }
    }
