package newstart;
import java.util.Scanner;

public class java42 {// Simple Calculator Program


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== Simple Calculator ===");

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.println("Choose operation: +, -, *, /");
            char operator = input.next().charAt(0);

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = divide(num1, num2);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    valid = false;
            }

            if (valid) {
                System.out.println("Result: " + result);
            }

            input.close();
        }

        static double add(double a, double b) {
            return a + b;
        }

        static double subtract(double a, double b) {
            return a - b;
        }

        static double multiply(double a, double b) {
            return a * b;
        }

        static double divide(double a, double b) {
            return a / b;
        }
    }

