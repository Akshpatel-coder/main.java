package newstart.java;

public class java61 {


        // 1. Factorial using recursion
        static int factorial(int n) {
            if (n == 0 || n == 1)
                return 1;  // Base case
            else
                return n * factorial(n - 1);  // Recursive call
        }

        // 2. Sum of natural numbers using recursion
        static int sumOfNaturalNumbers(int n) {
            if (n == 0)
                return 0;
            else
                return n + sumOfNaturalNumbers(n - 1);
        }

        // 3. Downward star pattern using recursion

        // Print stars in one row
        static void printStars(int count) {
            if (count == 0)
                return;
            System.out.print("*");
            printStars(count - 1);
        }

        // Print pattern of stars
        static void printPattern(int rows) {
            if (rows == 0)
                return;
            printStars(rows);
            System.out.println();
            printPattern(rows - 1);
        }

        public static void main(String[] args) {
            int number = 5;

            // Factorial
            System.out.println("Factorial of " + number + " is: " + factorial(number));

            // Sum of natural numbers
            System.out.println("Sum of numbers from 1 to " + number + " is: " + sumOfNaturalNumbers(number));

            // Downward star pattern
            System.out.println("Downward Star Pattern:");
            printPattern(number);
        }
    }


