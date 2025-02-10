public class arrays {
        public static void main(String[] args) {
            // Declare and initialize a variable
            int number = 10;

            // Conditional statement
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

            // Declare and initialize an array
            int[] numbers = {1, 2, 3, 4, 5};

            // Loop through the array
            System.out.println("Numbers in the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

            // Use a method to calculate the sum of the array
            int sum = calculateSum(numbers);
            System.out.println("Sum of the numbers: " + sum);
        }

        // Method to calculate the sum of an array
        public static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    }


