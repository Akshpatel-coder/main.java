public class fibonacciseries {


        // Method to generate the Fibonacci series
        public static void generateFibonacci(int terms) {
            int firstTerm = 0;
            int secondTerm = 1;

            System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

            for (int i = 2; i < terms; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(", " + nextTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define the number of terms for the Fibonacci series
            int terms = 10;

            // Generate and print the Fibonacci series
            generateFibonacci(terms);
        }
    }


