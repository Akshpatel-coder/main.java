public class uniqueoperations {

        public static void main(String[] args) {

            long largeNumber = 1234567890123L;
            char initial = 'J';
            float smallDecimal = 3.14159f;

            System.out.println("Large Number: " + largeNumber);
            System.out.println("Initial: " + initial);
            System.out.println("Small Decimal: " + smallDecimal);

            String binaryString = Integer.toBinaryString(25);
            System.out.println("Binary of 25: " + binaryString);

            double exponential = Math.exp(2);
            System.out.println("e^2: " + exponential);

            double logarithm = Math.log(10);
            System.out.println("ln(10): " + logarithm);

            int absoluteValue = Math.abs(-10);
            System.out.println("Absolute Value: " + absoluteValue);

            double power = Math.pow(2, 3);
            System.out.println("2^3: " + power);

            int randomValue = (int) (Math.random() * 100);
            System.out.println("Random Value (0-99): " + randomValue);

            String hexString = Integer.toHexString(255);
            System.out.println("Hexadecimal of 255: " + hexString);

            double squareRoot = Math.sqrt(16);
            System.out.println("Square Root of 16: " + squareRoot);

            char unicodeChar = '\u00A9'; // Copyright symbol
            System.out.println("Unicode Char: " + unicodeChar);

            boolean isNan = Double.isNaN(0.0 / 0.0);
            System.out.println("Is NaN: " + isNan);
        }
    }

