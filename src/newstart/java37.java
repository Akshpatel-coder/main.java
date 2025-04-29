package newstart;
import java.util.Scanner;

public class java37 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Prime Number Checker");
            System.out.println("--------------------");
            System.out.print("Enter a positive integer: ");

            int number = input.nextInt();

            if (number < 2) {
                System.out.println(number + " is not a prime number.");
                input.close();
                return;
            }

            boolean isPrime = checkPrime(number);

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }

            System.out.println("\nPrime numbers up to " + number + ":");
            printPrimesUpTo(number);

            input.close();
        }

        public static boolean checkPrime(int num) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void printPrimesUpTo(int limit) {
            for (int i = 2; i <= limit; i++) {
                if (checkPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
