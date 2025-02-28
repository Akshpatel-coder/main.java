public class arrayreverseandsum {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] reversedArr = new int[arr.length];
            int sum = 0;

            // Reverse the array
            for (int i = 0; i < arr.length; i++) {
                reversedArr[i] = arr[arr.length - 1 - i];
            }

            // Calculate the sum of the reversed array
            for (int num : reversedArr) {
                sum += num;
            }

            // Print the reversed array
            System.out.print("Reversed Array: ");
            for (int num : reversedArr) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Print the sum
            System.out.println("Sum of Reversed Array: " + sum);

            //Print every other element of the original array.
            System.out.print("Every other element of original array: ");
            for(int i = 0; i< arr.length; i+=2){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

