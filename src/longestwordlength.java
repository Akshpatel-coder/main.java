public class longestwordlength {


        // Method to find the length of the longest word in a string
        public static int findLongestWordLength(String str) {
            if (str == null || str.isEmpty()) {
                return 0;
            }

            String[] words = str.split("\\s+");
            int maxLength = 0;

            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
            return maxLength;
        }

        public static void main(String[] args) {
            // Define the string to be analyzed
            String str = "The quick brown fox jumped over the lazy dog";

            // Find the length of the longest word in the string
            int longestWordLength = findLongestWordLength(str);

            // Print the result
            System.out.println("The length of the longest word is: " + longestWordLength);
        }
    }


