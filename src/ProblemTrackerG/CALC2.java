package ProblemTrackerG;
import java.util.Scanner;
public class CALC2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.print("Enter your choice: ");

        int calcType = sc.nextInt();

        switch (calcType) {
            case 1:
                basicCalc();
                break;
            case 2:
                scientificCalc();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        System.out.println("\nBasic Calculator Operations:");

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator....");
                return;
            }
            System.out.println("Enter first number: ");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cant divide by Zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        while (choice != 0);

    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1 = 0, num2 = 0, result;

        System.out.println("\nScientific Calculator Operations:");
        do {
            System.out.println("1. Add");
            System.out.println("2. Substract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulas");
            System.out.println("7. Square Root");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");

            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting Calculator...");
                return;
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Cant divide by zero!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

                    }
                    break;
                case 5:
                    System.out.println("Enter base: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter exponent: ");
                    num2 = sc.nextInt();
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;
                case 6:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;
                case 7:
                    System.out.print("Enter number: ");
                    num1 = sc.nextInt();
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ") = " + result);
                    break;
                default:
                    System.out.println("Invalid operation");

            }


        } while (choice !=0);

    }
}
