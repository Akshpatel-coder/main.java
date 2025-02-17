public class sumevennumber {


        // Method to calculate the sum of even numbers in an array
        public static int sumEvenNumbers(int[] array) {
            int sum = 0;
            for (int number : array) {
                if (number % 2 == 0) {
                    sum += number;
                }
            }
            return sum;
        }

        // Method to print an array
        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define an array of numbers
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Print the array
            System.out.println("Array elements:");
            printArray(array);

            // Calculate the sum of even numbers in the array
            int sum = sumEvenNumbers(array);

            // Print the result
            System.out.println("Sum of even numbers in the array: " + sum);
        }
    }



