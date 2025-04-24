package newstart;
import java.util.Scanner;

import java.util.Random;

public class java30 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            char choice;

            System.out.println("=== Even or Odd Checker ===");

            do {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();

                if (number % 2 == 0) {
                    System.out.println(number + " is Even.");
                } else {
                    System.out.println(number + " is Odd.");
                }

                System.out.print("Do you want to check another number? (y/n): ");
                choice = scanner.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Thank you for using the program!");
            scanner.close();
        }
    }

