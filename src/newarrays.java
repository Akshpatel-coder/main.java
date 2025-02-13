public class newarrays {


        // Method to print the array
        public static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Method to sort the array
        public static void sortArray(int[] array) {
            int n = array.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    if (array[j] > array[j+1]) {
                        // Swap array[j] and array[j+1]
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Unsorted array:");
            printArray(array);

            sortArray(array);

            System.out.println("Sorted array:");
            printArray(array);
        }
    }


