package problemTracker;
import java.util.Scanner;

public class Calc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the OOP Calculator!");

        while (true) {
            System.out.println("\nChoose calculator type:");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                runBasicCalculator(sc);
            } else if (choice == 2) {
                runScientificCalculator(sc);
            } else {
                System.out.println("Invalid choice. Exiting...");
                break;
            }
        }
        sc.close();
    }

    public static void runBasicCalculator(Scanner sc) {
        double lastResult = 0.0;

        while (true) {
            System.out.println("\nAvailable operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Get last result");
            System.out.println("0. Exit");
            System.out.print("Enter choice (0-5): ");
            int op = sc.nextInt();

            if (op == 0) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            switch (op) {
                case 1 -> {
                    System.out.println("You have selected: Addition");
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    lastResult = num1 + num2;
                    System.out.println("Result: " + (int)num1 + " + " + (int)num2 + " = " + lastResult);
                }
                case 2 -> {
                    System.out.println("You have selected: Subtraction");
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    lastResult = num1 - num2;
                    System.out.println("Result: " + (int)num1 + " - " + (int)num2 + " = " + lastResult);
                }
                case 3 -> {
                    System.out.println("You have selected: Multiplication");
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    lastResult = num1 * num2;
                    System.out.println("Result: " + (int)num1 + " * " + (int)num2 + " = " + lastResult);
                }
                case 4 -> {
                    System.out.println("You have selected: Division");
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        lastResult = num1 / num2;
                        System.out.println("Result: " + (int)num1 + " / " + (int)num2 + " = " + lastResult);
                    }
                }
                case 5 -> System.out.println("Last result: " + lastResult);
                default -> System.out.println("Invalid operation.");
            }
        }
    }

    public static void runScientificCalculator(Scanner sc) {
        double lastResult = 0.0;

        while (true) {
            System.out.println("\nAvailable operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square root");
            System.out.println("8. Get last result");
            System.out.println("0. Exit");
            System.out.print("Enter choice (0-8): ");
            int op = sc.nextInt();

            if (op == 0) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            switch (op) {
                case 1, 2, 3, 4 -> {
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    switch (op) {
                        case 1 -> {
                            lastResult = num1 + num2;
                            System.out.println("Result: " + (int)num1 + " + " + (int)num2 + " = " + lastResult);
                        }
                        case 2 -> {
                            lastResult = num1 - num2;
                            System.out.println("Result: " + (int)num1 + " - " + (int)num2 + " = " + lastResult);
                        }
                        case 3 -> {
                            lastResult = num1 * num2;
                            System.out.println("Result: " + (int)num1 + " * " + (int)num2 + " = " + lastResult);
                        }
                        case 4 -> {
                            if (num2 == 0) {
                                System.out.println("Error: Division by zero!");
                            } else {
                                lastResult = num1 / num2;
                                System.out.println("Result: " + (int)num1 + " / " + (int)num2 + " = " + lastResult);
                            }
                        }
                    }
                }
                case 5 -> {
                    System.out.print("Enter base number: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    lastResult = Math.pow(base, exp);
                    System.out.println("Result: " + (int)base + " ^ " + (int)exp + " = " + lastResult);
                }
                case 6 -> {
                    System.out.print("Enter first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = sc.nextInt();
                    lastResult = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + lastResult);
                }
                case 7 -> {
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    lastResult = Math.sqrt(num);
                    System.out.println("Result: sqrt(" + (int)num + ") = " + lastResult);
                }
                case 8 -> System.out.println("Last result: " + lastResult);
                default -> System.out.println("Invalid operation.");
            }
        }
    }
}
