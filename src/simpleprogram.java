public class simpleprogram {

        public static void main(String[] args) {
            int[] numbers = {5, 10, 15, 20, 25};
            printArray(numbers);
            int sum = calculateSum(numbers);
            System.out.println("Sum: " + sum);
            System.out.println("Max: " + findMax(numbers));
        }

        static void printArray(int[] arr) {
            System.out.print("Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        static int calculateSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        static int findMax(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }
