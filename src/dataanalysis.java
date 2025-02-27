public class dataanalysis {

        public static void main(String[] args) {

            // Numerical data
            int count = 12;
            double average = 85.7;

            System.out.println("Count: " + count);
            System.out.println("Average: " + average);

            // String processing
            String data = "Sample,Data,Analysis";
            String[] parts = data.split(",");

            System.out.println("Part 1: " + parts[0]);
            System.out.println("Part 2: " + parts[1]);
            System.out.println("Part 3: " + parts[2]);
            System.out.println("Data length: " + data.length());

            // Boolean logic
            boolean isProcessed = true;
            boolean isComplete = false;

            System.out.println("Processed: " + isProcessed);
            System.out.println("Complete: " + isComplete);
            System.out.println("Combined: " + (isProcessed && !isComplete));

            // Character Manipulation
            char symbol = '$';
            System.out.println("Symbol: " + symbol);
            System.out.println("Next Character: " + (char)(symbol + 1));

            // Math operations
            double power = Math.pow(2, 3);
            double sqrt = Math.sqrt(16);

            System.out.println("Power: " + power);
            System.out.println("Square root: " + sqrt);

            //More Integer operations
            int x = 20;
            int y = 7;
            System.out.println("Modulus: " + x % y);
            System.out.println("Integer division: " + x / y);
        }
    }

