package newstart;
import java.util.Scanner;
import java.util.Random;
public class java38 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();

            System.out.println("=== Password Generator ===");
            System.out.print("Enter password length (8-16): ");
            int length = input.nextInt();

            if (length < 8 || length > 16) {
                System.out.println("Invalid length! Using default 12 characters.");
                length = 12;
            }

            System.out.print("Include numbers? (y/n): ");
            boolean useNumbers = input.next().equalsIgnoreCase("y");

            System.out.print("Include symbols? (y/n): ");
            boolean useSymbols = input.next().equalsIgnoreCase("y");

            String password = generatePassword(length, useNumbers, useSymbols);
            System.out.println("\nYour new password: " + password);

            input.close();
        }

        public static String generatePassword(int length, boolean useNumbers, boolean useSymbols) {
            String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
            String numbers = "0123456789";
            String symbols = "!@#$%^&*()";

            String chars = letters;
            if (useNumbers) chars += numbers;
            if (useSymbols) chars += symbols;

            StringBuilder password = new StringBuilder();
            Random rand = new Random();

            for (int i = 0; i < length; i++) {
                int index = rand.nextInt(chars.length());
                password.append(chars.charAt(index));
            }

            return password.toString();
        }
    }

