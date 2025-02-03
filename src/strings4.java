public class strings4 {

        public static void main(String[] args) {
            // Declare and initialize a string
            String greeting = "Hello, World!";

            // Print the string
            System.out.println(greeting);

            // Concatenate two strings
            String name = "Alice";
            String welcomeMessage = greeting + " Welcome, " + name + "!";
            System.out.println(welcomeMessage);

            // Get the length of the string
            int length = greeting.length();
            System.out.println("Length of the greeting: " + length);

            // Access a character at a specific index
            char charAtPosition = greeting.charAt(7);
            System.out.println("Character at index 7: " + charAtPosition);
        }
    }



