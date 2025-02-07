package functionsandmethods;

public class functions2 {


        // Function to calculate the square of a number
        public static int square(int number) {
            return number * number;
        }

        // Function to greet a person
        public static void greet(String name) {
            System.out.println("Hello, " + name + "!");
        }

        // Function to find the maximum of two numbers
        public static int findMax(int num1, int num2) {
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }

        // Main function to run the program
        public static void main(String[] args) {
            // Calling the square function
            int result = square(5);
            System.out.println("Square of 5 is: " + result);

            // Calling the greet function
            greet("Alice");

            // Calling the findMax function
            int max = findMax(10, 20);
            System.out.println("The maximum value is: " + max);
        }
    }


