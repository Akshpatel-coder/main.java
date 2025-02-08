package functionsandmethods;

public class function4 {
    public class MathFunctions {

        public static int add(int a, int b) {
            return a + b;
        }

        public static double divide(double numerator, double denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("Cannot divide by zero."); // Handle potential errors
            }
            return numerator / denominator;
        }

        public static void main(String[] args) {
            int sum = add(10, 5);
            System.out.println("Sum: " + sum); // Output: Sum: 15

            try {
                double result = divide(20, 4);
                System.out.println("Result of division: " + result); // Output: Result of division: 5.0

                double errorResult = divide(10, 0); // This will throw an exception
                System.out.println("This won't print because of the error.");
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage()); // Output: Error: Cannot divide by zero.
            }
        }
    }

}