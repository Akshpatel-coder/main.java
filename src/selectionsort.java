public class selectionsort {


        // Method to perform selection sort on an array
        public static void selectionSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
                // Swap the found minimum element with the first element
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
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
            // Define an array of numbers
            int[] array = {64, 25, 12, 22, 11};

            // Sort the array using selection sort
            selectionSort(array);

            // Print the sorted array
            System.out.println("Sorted array:");
            printArray(array);
        }
    }


