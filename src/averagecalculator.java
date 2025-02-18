public class averagecalculator {


        // Method to calculate the average of an array of numbers
        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int number : array) {
                sum += number;
            }
            return (double) sum / array.length;
        }

        // Method to print an array of numbers
        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define an array of numbers
            int[] array = {10, 20, 30, 40, 50};

            // Print the array
            System.out.println("Array elements:");
            printArray(array);

            // Calculate the average using the method
            double average = calculateAverage(array);

            // Print the result
            System.out.println("The average is: " + average);
        }
    }


