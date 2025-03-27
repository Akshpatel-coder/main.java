public class maxnumberfinder {


        public static void main(String[] args) {
            int[] numbers = {34, 67, 23, 89, 12, 45, 78}; // Predefined array of numbers
            int maxNumber = findMax(numbers);

            System.out.println("The maximum number in the array is: " + maxNumber);
        }

        // Method to find the maximum number in an array
        public static int findMax(int[] array) {
            int max = array[0]; // Assume the first number is the maximum

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i]; // Update max if current number is greater
                }
            }
            return max; // Return the maximum number found
        }
    }

