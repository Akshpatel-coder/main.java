public class arrayoptions {

        public static void main(String[] args) {
            int[] data = {12, 5, 8, 20, 3, 15, 9, 18, 6, 11};
            int sum = 0;
            int max = data[0];
            int min = data[0];

            for (int value : data) {
                sum += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }

            double average = (double) sum / data.length;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);

            // Print even numbers
            System.out.print("Even Numbers: ");
            for (int value : data) {
                if (value % 2 == 0) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }

