public class arraystringandops {

        public static void main(String[] args) {
            int[] numbers = {10, 5, 20, 15, 25, 30, 35, 40, 45, 50};
            String text = "Java Programming Language";
            int sum = 0;
            int max = numbers[0];
            String reversedText = "";

            for (int num : numbers) {
                sum += num;
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Sum of array: " + sum);
            System.out.println("Max value: " + max);

            for (int i = text.length() - 1; i >= 0; i--) {
                reversedText += text.charAt(i);
            }

            System.out.println("Reversed text: " + reversedText);

            System.out.print("Even numbers: ");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();

            System.out.println("Text length: " + text.length());

            String upper = text.toUpperCase();
            System.out.println("Uppercase: " + upper);
        }
    }

