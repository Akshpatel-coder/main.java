public class reversearray {


        // Method to reverse an array
        public static void reverse(int[] array) {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }

        // Method to print an array
        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define an array of integers
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Print the original array
            System.out.println("Original array:");
            printArray(array);

            // Reverse the array
            reverse(array);

            // Print the reversed array
            System.out.println("Reversed array:");
            printArray(array);
        }
    }


