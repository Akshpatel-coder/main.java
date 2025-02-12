public class hello5 {

        // Method to calculate the sum of an array
        public static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

        // Method to calculate the average of an array
        public static double calculateAverage(int[] numbers) {
            int sum = calculateSum(numbers);
            return (double) sum / numbers.length;
        }

        // Method to print the array
        public static void printArray(int[] numbers) {
            System.out.print("Array: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define an array of numbers
            int[] numbers = {10, 20, 30, 40, 50};

            // Print the array
            printArray(numbers);

            // Calculate and print the sum
            int sum = calculateSum(numbers);
            System.out.println("Sum of the array: " + sum);

            // Calculate and print the average
            double average = calculateAverage(numbers);
            System.out.println("Average of the array: " + average);
        }
    }