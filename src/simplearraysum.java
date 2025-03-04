public class simplearraysum {


        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int sum = 0;

            // Calculate the sum of elements in the array
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // Print the sum
            System.out.println("Sum of array elements: " + sum);

            //Example of array operations
            int average = sum / numbers.length;
            System.out.println("Average of array elements: " + average);

            //Example of accessing array elements
            System.out.println("First element: " + numbers[0]);
            System.out.println("Last element: " + numbers[numbers.length - 1]);

            //Example of checking array length
            System.out.println("Array length: " + numbers.length);
        }
    }

