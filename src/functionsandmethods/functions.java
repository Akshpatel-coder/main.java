package functionsandmethods;

public class functions {

        // Function to add two numbers
        public static int add(int a, int b) {
            return a + b;
        }

        // Function to subtract two numbers
        public static int subtract(int a, int b) {
            return a - b;
        }

        // Function to multiply two numbers
        public static int multiply(int a, int b) {
            return a * b;
        }

        // Main function where program execution begins
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;

            // Calling the functions
            int sum = add(num1, num2);
            int difference = subtract(num1, num2);
            int product = multiply(num1, num2);

            // Output results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
        }
    }


