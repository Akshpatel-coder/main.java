package newstart.java;
import java.util.Scanner;

public class java28 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Game introduction
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Rules: Enter 1 for Rock, 2 for Paper, or 3 for Scissors.");

            // Computer's random choice (1-3)
            int computerChoice = (int) (Math.random() * 3) + 1;

            // User's choice
            System.out.print("Enter your choice (1 for Rock, 2 for Paper, 3 for Scissors): ");
            int userChoice = scanner.nextInt();

            // Display choices
            System.out.println("You chose: " + getChoiceName(userChoice));
            System.out.println("Computer chose: " + getChoiceName(computerChoice));

            // Determine the winner
            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                    (userChoice == 2 && computerChoice == 1) ||
                    (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win! Congratulations!");
            } else {
                System.out.println("Computer wins! Better luck next time.");
            }

            // Close scanner
            scanner.close();
        }

        // Helper method to get the name of the choice
        public static String getChoiceName(int choice) {
            switch (choice) {
                case 1: return "Rock";
                case 2: return "Paper";
                case 3: return "Scissors";
                default: return "Invalid Choice";
            }
        }
    }

