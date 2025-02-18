public class charactercount {


        // Method to count the occurrence of each character in a string
        public static void countCharacters(String str) {
            int[] charCount = new int[256]; // Assuming ASCII characters

            for (int i = 0; i < str.length(); i++) {
                charCount[str.charAt(i)]++;
            }

            // Print the result
            System.out.println("Character count in the string:");
            for (int i = 0; i < 256; i++) {
                if (charCount[i] > 0) {
                    System.out.println((char) i + ": " + charCount[i]);
                }
            }
        }

        public static void main(String[] args) {
            // Define the string to be analyzed
            String str = "Hello, World!";

            // Count the occurrence of each character in the string
            countCharacters(str);
        }
    }


