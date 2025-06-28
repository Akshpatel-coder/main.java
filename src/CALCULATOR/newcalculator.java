
    package CALCULATOR;
import java.util.Scanner;
    public class newcalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("===Calculator===");
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter operator (+ , - , * , /): ");
            char operator = sc.next().charAt(0);

            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean valid = true;

            switch(operator){
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("result: "+ result);
        }
    }


