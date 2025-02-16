public class vowelconsonant {


        // Method to count vowels and consonants in a string
        public static void countVowelsAndConsonants(String str) {
            int vowels = 0, consonants = 0;

            // Convert string to lowercase
            str = str.toLowerCase();

            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            // Print the result
            System.out.println("Number of vowels: " + vowels);
            System.out.println("Number of consonants: " + consonants);
        }

        public static void main(String[] args) {
            // Define the string to be analyzed
            String str = "Hello World";

            // Count the vowels and consonants in the string
            countVowelsAndConsonants(str);
        }
    }


