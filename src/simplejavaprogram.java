public class simplejavaprogram {

        public static void main(String[] args) {
            // Hardcoded values for demonstration
            int[] numbers = {3, 7, 2, 9, 5};
            String message = "Hello, Java!";

            // Print the original array
            System.out.println("Original Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Find the maximum value in the array
            int max = numbers[0];
            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum value in the array: " + max);

            // Reverse the array
            int[] reversedArray = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                reversedArray[i] = numbers[numbers.length - 1 - i];
            }

            // Print the reversed array
            System.out.println("Reversed Array:");
            for (int num : reversedArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            // String manipulation
            System.out.println("Original Message: " + message);
            System.out.println("Message in uppercase: " + message.toUpperCase());
            System.out.println("Message length: " + message.length());

            // Check if the message contains the word "Java"
            if (message.contains("Java")) {
                System.out.println("The message contains the word 'Java'.");
            } else {
                System.out.println("The message does not contain the word 'Java'.");
            }

            // Print even numbers from the array
            System.out.println("Even numbers in the array:");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();

            // Print a simple pattern
            System.out.println("Printing a pattern:");
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
