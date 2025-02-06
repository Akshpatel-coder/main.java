public class arrays5 {

        public static void main(String[] args) {
            // Declare and initialize an array of integers
            int[] numbers = {10, 20, 30, 40, 50};

            // Access and print each element using its index
            System.out.println("First element: " + numbers[0]); // Outputs 10
            System.out.println("Second element: " + numbers[1]); // Outputs 20
            System.out.println("Third element: " + numbers[2]); // Outputs 30
            System.out.println("Fourth element: " + numbers[3]); // Outputs 40
            System.out.println("Fifth element: " + numbers[4]); // Outputs 50

            // Loop through the array to print all elements
            System.out.println("\nAll elements in the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    }


