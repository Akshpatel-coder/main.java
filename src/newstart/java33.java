package newstart;

public class java33 {

        public static void main(String[] args) {
            System.out.println("Prime Numbers (1-100)");
            System.out.println("---------------------");

            int count = 0;
            for (int num = 2; num <= 100; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    count++;
                    if (count % 5 == 0) {
                        System.out.println();
                    }
                }
            }

            System.out.println("\n---------------------");
            System.out.println("Total primes found: " + count);

            int testNum = 29;
            if (isPrime(testNum)) {
                System.out.println(testNum + " is a prime number.");
            } else {
                System.out.println(testNum + " is not a prime.");
            }
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

