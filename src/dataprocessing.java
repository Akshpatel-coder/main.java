public class dataprocessing {


        public static void main(String[] args) {

            // Integer data
            int quantity = 10;
            int price = 5;
            int total = quantity * price;

            System.out.println("Total: " + total);

            // Double data
            double temperature = 25.5;
            double conversion = (temperature * 9/5) + 32; // Celsius to Fahrenheit
            System.out.println("Temperature in Fahrenheit: " + conversion);

            // String data
            String message = "Processing data...";
            System.out.println(message);
            System.out.println("Message length: " + message.length());
            System.out.println("Message uppercase: " + message.toUpperCase());

            // Boolean data
            boolean isValid = true;
            if (isValid) {
                System.out.println("Data is valid.");
            } else {
                System.out.println("Data is invalid.");
            }

            //Char data
            char initial = 'A';
            System.out.println("Initial: " + initial);

            //More Integer operations
            int num1 = 15;
            int num2 = 4;

            System.out.println("Division: " + (double)num1 / num2);
            System.out.println("Remainder: " + num1 % num2);

            //More Double operations
            double radius = 3.0;
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);

            //More String operations
            String part1 = "Hello";
            String part2 = "World";
            String combined = part1 + " " + part2;
            System.out.println("Combined String: " + combined);
        }
    }

