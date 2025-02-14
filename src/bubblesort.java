
    class BubbleSort {
        public static void main(String[] args) {
            int[] numbers = {64, 34, 25, 12, 22, 11, 90};

            System.out.println("Array before sorting:");
            printArray(numbers);

            bubbleSort(numbers);

            System.out.println("Array after sorting:");
            printArray(numbers);
        }

        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


