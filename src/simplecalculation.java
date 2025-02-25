public class simplecalculation {


        public static void main(String[] args) {
            // Basic arithmetic operations
            int num1 = 10;
            int num2 = 5;

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double quotient = (double) num1 / num2; // Type casting for accurate division

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);

            // Working with strings
            String greeting = "Hello, ";
            String name = "World!";
            String message = greeting + name;

            System.out.println(message);
            System.out.println("Length of message: " + message.length());
            System.out.println("Uppercase message: " + message.toUpperCase());

            // Conditional statements
            int age = 20;
            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a minor.");
            }

            // Loop example
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteration: " + i);
            }

            //Working with boolean
            boolean isJavaFun = true;
            if(isJavaFun){
                System.out.println("Java is fun!");
            }

            //working with char
            char firstLetter = 'J';
            System.out.println("The first letter is : " + firstLetter);

            //working with double
            double pi = 3.14159;
            double circleArea = pi * num1 * num1;
            System.out.println("Area of circle : " + circleArea);

        }
    }

