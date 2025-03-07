public class bitwisemathandlogic {


        public static void main(String[] args) {
            int a = 23; // Binary: 10111
            int b = 15; // Binary: 01111
            int c = 7;  // Binary: 00111

            // Bitwise operations for math-like logic
            int sum = a + b;
            int bitwiseSum = a ^ b ^ ((a & b) << 1); // Emulate addition
            System.out.println("Sum: " + sum + ", Bitwise Sum: " + bitwiseSum);

            int difference = a - b;
            int bitwiseDifference = a ^ b ^ (~((~a & b) << 1)) ; //Emulate subtraction
            System.out.println("Difference: " + difference + ", Bitwise Difference: " + bitwiseDifference);

            // Check if a number is even or odd using bitwise AND
            System.out.println(a + " is even: " + ((a & 1) == 0));
            System.out.println(b + " is even: " + ((b & 1) == 0));

            // Find the maximum of two numbers without comparison operators
            int max = b + ((a - b) & ((a - b) >> 31));
            System.out.println("Max of " + a + " and " + b + ": " + max);

            //Check if all bits are set in a number.
            int checkNumber = 7;
            System.out.println(checkNumber + " all bits set: " + ((checkNumber & (checkNumber + 1)) == 0));

            //Simple demonstration of bitwise negation.
            System.out.println("Negation of " + c + ": " + (~c));

            //Simple demonstration of bitwise XOR.
            System.out.println(a + " XOR " + b + ": " + (a^b));

        }
    }

