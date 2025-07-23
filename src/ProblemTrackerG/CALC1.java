package ProblemTrackerG;

import java.util.Scanner;

public class CALC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        int choice;

        System.out.println("Welcome to the OOP Calculator");
        System.out.println("-----------------------------");
        do {
            System.out.println("\nAvailable operations");

            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator....");
                break;

            }

            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            num2 = sc.nextInt();
            switch(choice){
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result );
                    break;

                case 3:
                    result = num1 * num2 ;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if(num2 == 0){
                        System.out.println("Error: cant divid by zero!");

                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        } while (choice != 0);
    }
}