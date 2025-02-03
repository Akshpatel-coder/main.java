public class strings5 {


        public static void main(String[] args) {
            // Declare and initialize a string
            String str = "Programming is fun!";

            // Convert to char array
            char[] charArray = str.toCharArray();
            System.out.print("Char Array: ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();

            // Compare two strings lexicographically
            String str2 = "Programming is amazing!";
            int comparisonResult = str.compareTo(str2);
            System.out.println("Comparison Result: " + comparisonResult);

            // Check if the string matches a regex
            String regex = ".*fun.*";
            boolean matches = str.matches(regex);
            System.out.println("Matches '.*fun.*': " + matches);

            // Find the last index of a character
            int lastIndexOfN = str.lastIndexOf('n');
            System.out.println("Last index of 'n': " + lastIndexOfN);

            // Concatenate two strings using concat method
            String newStr = str.concat(" Let's code.");
            System.out.println("Concatenated String: " + newStr);

            // Check if the string is empty
            boolean isEmpty = str.isEmpty();
            System.out.println("Is the string empty?: " + isEmpty);
        }
    }
