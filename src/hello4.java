public class hello4 {
        public static void main(String[] args) {
            // Define an array of integers
            int[] numbers = {12, 45, 7, 23, 56, 89, 34};

            // Assume the first number is the largest
            int largest = numbers[0];

            // Loop through the array to find the largest number
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            // Print the largest number
            System.out.println("The largest number in the array is: " + largest);
        }
    }

