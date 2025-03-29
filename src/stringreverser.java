public class stringreverser {

        public static void main(String[] args) {
            String original = "Hello, World!"; // Original string
            String reversed = reverseString(original);

            System.out.println("Original String: " + original);
            System.out.println("Reversed String: " + reversed);
        }

        // Method to reverse a string
        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder(); // StringBuilder for efficient string manipulation

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i)); // Append characters in reverse order
            }

            return reversed.toString(); // Convert StringBuilder to String and return
        }
    }

