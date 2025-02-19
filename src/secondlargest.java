public class secondlargest {


        // Method to find the second largest element in an array
        public static int findSecondLargest(int[] array) {
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int number : array) {
                if (number > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = number;
                } else if (number > secondLargest && number != firstLargest) {
                    secondLargest = number;
                }
            }
            return secondLargest;
        }

        public static void main(String[] args) {
            // Define an array of numbers
            int[] array = {12, 35, 1, 10, 34, 1};

            // Find the second largest element using the method
            int secondLargest = findSecondLargest(array);

            // Print the result
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }


