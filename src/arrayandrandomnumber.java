public class arrayandrandomnumber {


        public static void main(String[] args) {
            int[] randomNumbers = new int[10];
            java.util.Random random = new java.util.Random();
            int evenCount = 0;
            int oddCount = 0;

            // Generate and populate random numbers
            for (int i = 0; i < randomNumbers.length; i++) {
                randomNumbers[i] = random.nextInt(100); // Generate numbers between 0 and 99
                if (randomNumbers[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Print generated random numbers
            System.out.print("Random numbers: ");
            for (int num : randomNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Count even and odd numbers
            System.out.println("Even count: " + evenCount);
            System.out.println("Odd count: " + oddCount);

            // Find the maximum random number
            int max = randomNumbers[0];
            for (int num : randomNumbers) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Maximum random number: " + max);

            //Simple demonstration of random boolean
            System.out.println("Random boolean: " + random.nextBoolean());

            //Simple average calculation.
            int sum = 0;
            for(int num : randomNumbers){
                sum += num;
            }
            System.out.println("Average: " + (double)sum/randomNumbers.length);
        }
    }

