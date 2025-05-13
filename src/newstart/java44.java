package newstart;
import java.util.Scanner;
public class java44 {

        // This method calculates the factorial of a number
        public static long calculateFactorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Number must be non-negative");
            }

            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Factorial Calculator");
            System.out.println("--------------------");
            System.out.print("Enter a number (0-20): ");

            try {
                int number = scanner.nextInt();

                if (number > 20) {
                    System.out.println("Warning: Results for numbers > 20 may overflow");
                }

                long factorial = calculateFactorial(number);
                System.out.println(number + "! = " + factorial);

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                scanner.close();
                System.out.println("Calculation complete.");
            }
        }
    }
