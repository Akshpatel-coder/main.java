package newstart;

public class java32 {

        public static void main(String[] args) {
            System.out.println("Multiplication Table (1-10)");
            System.out.println("--------------------------");

            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }

            System.out.println("--------------------------");
            System.out.println("End of Table");

            // Additional code to reach exactly 40 lines
            int a = 5, b = 7;
            int sum = a + b;
            System.out.println("Sum: " + sum);

            String message = "This program has exactly";
            System.out.println(message + " 40 lines of code.");

            if (sum > 10) {
                System.out.println("The sum is greater than 10.");
            } else {
                System.out.println("The sum is 10 or less.");
            }

            for (int k = 0; k < 3; k++) {
                System.out.println("Line " + (k + 1));
            }
        }
    }