public class randomdata {

        public static void main(String[] args) {
            int[] numbers = new int[10];
            double[] decimals = new double[5];
            String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

            // Generate random integers
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 100); // 0 to 99
            }

            // Generate random doubles
            for (int i = 0; i < decimals.length; i++) {
                decimals[i] = Math.random() * 10; // 0.0 to 9.999...
            }

            // Print the generated data
            System.out.println("Random Integers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println("\nRandom Decimals:");
            for (double dec : decimals) {
                System.out.print(dec + " ");
            }
            System.out.println("\nRandom Names:");
            for(String name : names){
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }

