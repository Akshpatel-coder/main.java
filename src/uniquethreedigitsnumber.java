public class uniquethreedigitsnumber {


        public static void main(String[] args) {
            int[] digits = {1, 2, 3, 4}; // Digits to use
            System.out.println("Unique three-digit numbers using 1, 2, 3, 4:");

            generateUniqueNumbers(digits);
        }

        // Method to generate unique three-digit numbers
        public static void generateUniqueNumbers(int[] digits) {
            for (int i = 0; i < digits.length; i++) {
                for (int j = 0; j < digits.length; j++) {
                    for (int k = 0; k < digits.length; k++) {
                        if (i != j && j != k && i != k) { // Ensure all digits are unique
                            int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                            System.out.println(number); // Print the unique number
                        }
                    }
                }
            }
        }
    }

