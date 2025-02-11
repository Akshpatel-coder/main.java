public class hello2 {

        public static void main(String[] args) {

            // Declare variables to store numbers and the result.
            int number1 = 10;
            int number2 = 5;
            int result;

            // Perform addition.
            result = number1 + number2;
            System.out.println("Sum: " + result);

            // Perform subtraction.
            result = number1 - number2;
            System.out.println("Difference: " + result);

            // Perform multiplication.
            result = number1 * number2;
            System.out.println("Product: " + result);

            // Perform division.  Be careful about dividing by zero!
            if (number2 != 0) { // Check to prevent division by zero
                result = number1 / number2;
                System.out.println("Quotient: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }


            // More examples with different data types

            double price = 19.99; // A double for prices
            int quantity = 3;      // An integer for quantity
            double totalCost = price * quantity;
            System.out.println("Total cost: $" + totalCost);

            String greeting = "Hello, ";
            String name = "User!";
            String message = greeting + name; // String concatenation
            System.out.println(message);


        }
    }

