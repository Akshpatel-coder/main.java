package functionsandmethods;

public class functions5 {


        public static String capitalize(String str) {
            if (str == null || str.isEmpty()) {
                return str; // Handle null or empty strings
            }
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }

        public static int countWords(String str) {
            if (str == null || str.isEmpty()) {
                return 0;
            }
            String[] words = str.split("\\s+"); // Split by one or more whitespace characters
            return words.length;
        }

        public static void main(String[] args) {
            String greeting = "hello world";
            String capitalized = capitalize(greeting);
            System.out.println("Capitalized: " + capitalized); // Output: Capitalized: Hello world

            String sentence = "This is a sentence with several words.";
            int wordCount = countWords(sentence);
            System.out.println("Word count: " + wordCount); // Output: Word count: 7
        }
    }

