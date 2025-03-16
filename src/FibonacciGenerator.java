public class FibonacciGenerator {

        public static void main(String[] args) {
            int numTerms = 10;
            long[] fibonacci = new long[numTerms];

            // Initialize the first two terms
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            // Generate the Fibonacci sequence
            for (int i = 2; i < numTerms; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            // Create a StringBuilder to store the sequence
            StringBuilder sequence = new StringBuilder();

            // Append the terms to the StringBuilder
            for (int i = 0; i < numTerms; i++) {
                sequence.append(fibonacci[i]).append(" ");
            }

            // Print the Fibonacci sequence
            System.out.println("Fibonacci Sequence:");
            System.out.println(sequence.toString());
        }
    }

