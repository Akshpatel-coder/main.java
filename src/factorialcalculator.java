public class factorialcalculator {

        public static void main(String[] args) {
            int number = 5; // Change this number to calculate a different factorial
            long factorial = calculateFactorial(number);

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Method to calculate factorial
        public static long calculateFactorial(int n) {
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return -1; // Return -1 for invalid input
            }
            if (n == 0 || n == 1) {
                return 1; // Base case: 0! = 1 and 1! = 1
            }
            return n * calculateFactorial(n - 1); // Recursive case
        }
    }

