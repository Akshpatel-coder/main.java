public class gcd {


        // Method to calculate the GCD of two numbers
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            // Define two numbers
            int num1 = 56;
            int num2 = 98;

            // Calculate the GCD using the method
            int result = gcd(num1, num2);

            // Print the result
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
        }
    }


