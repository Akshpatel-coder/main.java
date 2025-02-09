package functionsandmethods;

public class functions7 {

        // Define a method to add two numbers
        public static int add(int a, int b) {
            return a + b;
        }

        // Define a method to subtract two numbers
        public static int subtract(int a, int b) {
            return a - b;
        }

        // Define a method to print a greeting message
        public static void printGreeting(String name) {
            System.out.println("Hello, " + name + "!");
        }

        public static void main(String[] args) {
            // Call the add method
            int sum = add(5, 3);
            System.out.println("Sum: " + sum);

            // Call the subtract method
            int difference = subtract(5, 3);
            System.out.println("Difference: " + difference);

            // Call the printGreeting method
            printGreeting("Alice");
        }
    }


