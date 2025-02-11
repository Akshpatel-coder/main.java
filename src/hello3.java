public class hello3 {

        public static void main(String[] args) {

            // 1. Printing to the console:
            System.out.println("Hello, Java World!"); // Prints and goes to the next line
            System.out.print("This is on the same line. "); // Prints and stays on the same line
            System.out.println("Now we're on a new line.");

            // 2. Variables and Data Types:
            int age = 30;          // Integer (whole number)
            double price = 19.99;  // Double (decimal number)
            String name = "Bob";   // String (text)
            boolean isAdult = true; // Boolean (true or false)

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Price: $" + price);
            System.out.println("Is an adult? " + isAdult);

            // 3. Basic Arithmetic Operators:
            int num1 = 15;
            int num2 = 7;

            int sum = num1 + num2;        // Addition
            int difference = num1 - num2; // Subtraction
            int product = num1 * num2;    // Multiplication
            double quotient = (double) num1 / num2; // Division (casting to double for decimal result)
            int remainder = num1 % num2;    // Modulus (remainder after division)

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);


            // 4. Conditional Statements (if-else):
            if (age >= 18) {
                System.out.println(name + " is an adult.");
            } else {
                System.out.println(name + " is not an adult.");
            }

            // 5. Looping (for loop):
            System.out.println("Numbers from 1 to 10:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " "); // Prints on the same line with a space
            }
            System.out.println(); // Moves to the next line

            // 6. String Concatenation:
            String greeting = "Hello, ";
            String message = greeting + name + "!"; // Combining strings together
            System.out.println(message);

            // 7. Arrays (a simple introduction):
            int[] numbers = {10, 20, 30, 40, 50}; // An array of integers

            System.out.println("First number in the array: " + numbers[0]); // Arrays are 0-indexed
            System.out.println("Second number in the array: " + numbers[1]);

            // Looping through the array:
            System.out.println("All numbers in the array:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();


        }
    }

