public class arrays3 {

        public static void main(String[] args) {
            // Declare an array of integers
            int[] numbers = {10, 20, 30, 40, 50};

            // Accessing and printing array elements
            System.out.println("First element: " + numbers[0]);
            System.out.println("Second element: " + numbers[1]);
            System.out.println("Third element: " + numbers[2]);

            // Looping through the array using a for loop
            System.out.println("\nArray elements using a loop:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }

            // Changing an array element
            numbers[2] = 100;
            System.out.println("\nUpdated array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        }
    }


