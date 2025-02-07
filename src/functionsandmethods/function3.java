package functionsandmethods;

public class function3 {


        // Function to display a message
        public static void displayMessage() {
            System.out.println("This is a simple function in Java!");
        }

        // Function to add two numbers
        public static int addNumbers(int a, int b) {
            return a + b;
        }

        // Main function to run the program
        public static void main(String[] args) {
            // Calling the displayMessage function
            displayMessage();

            // Calling the addNumbers function and printing the result
            int result = addNumbers(5, 3);
            System.out.println("The sum of 5 and 3 is: " + result);
        }
    }


