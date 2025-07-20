package problemTracker;
import java.util.ArrayList;
import java.util.Scanner;
public class Calculator8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;
            int lastResult = 0;
            ArrayList<String> history = new ArrayList<>();


            System.out.println("Welcome to the OOP Calculator!");

            System.out.println("\nChoose calculator type:");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");

            System.out.print("\nEnter choice: ");
            int type = sc.nextInt();

            if (type == 1) {
                System.out.println("You have selected: Basic Calculator");

                do {

                    System.out.println("\nAvailable operations:");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Get last result");
                    System.out.println("6. View history");
                    System.out.println("7. Clear history");
                    System.out.println("8. Exit");

                    System.out.print("\nEnter choice (0-7): ");
                    choice = sc.nextInt();

                    int a, b, result = 0;

                    switch (choice) {
                        case 1:
                            System.out.println("You have selected: Addition");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a + b;
                            System.out.println("Result: " + a + "+" + b + "=" + result);
                            history.add("Addition: " + a + " + " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 2:
                            System.out.println("You have selected: Subtract");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a - b;
                            System.out.println("Result: " + a + "-" + b + "=" + result);
                            history.add("Subtraction: " + a + " - " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 3:
                            System.out.println("You have selected: Multiply");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a * b;
                            System.out.println("Result: " + a + "*" + b + "=" + result);
                            history.add("Multiplication: " + a + " * " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 4:
                            System.out.println("You have selected: Divide");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            if (b != 0) {
                                result = a / b;
                                System.out.println("Result: " + a + "/" + b + "=" + result);
                                history.add("Division: " + a + " / " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot divide by zero. Please try again.");
                            }
                            break;

                        case 5:
                            System.out.println("Last result: " + lastResult);
                            break;

                        case 6:
                            System.out.println("You have selected: View history");
                            if (history.isEmpty()) {
                                System.out.println("Operation History:\n(No operations yet)");
                            } else {
                                System.out.println("Operation History:");
                                for (int i = 0; i < history.size(); i++) {
                                    System.out.println((i + 1) + ". " + history.get(i));
                                }
                            }
                            break;

                        case 7:
                            System.out.println("You have selected: Clear history");
                            history.clear();
                            System.out.println("Operation history cleared.");
                            break;

                        case 8:


                            System.out.println("You have selected: Exit");
                            System.out.println("Thank you for using the calculator. Goodbye!");
                            break;


                        default:

                            System.out.println("Invalid choice.");
                    }

                } while (choice != 8);

            } else if (type == 2) {
                System.out.println("You have selected: Scientific Calculator");

                do {
                    System.out.println("\nAvailable operations:");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Power");
                    System.out.println("6. Modulus");
                    System.out.println("7. Square root");
                    System.out.println("8. Get last result");
                    System.out.println("9. View history");
                    System.out.println("10. Clear history");
                    System.out.println("0. Exit");

                    System.out.print("\nEnter choice (0-10): ");
                    choice = sc.nextInt();

                    int a, b, result = 0;
                    double sqrt;

                    switch (choice) {
                        case 1:

                            System.out.println("You have selected: Add");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a + b;
                            System.out.println("Result: " + a + "+" + b + "=" + result);
                            history.add("Addition: " + a + " + " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 2:
                            System.out.println("You have selected: Subtract");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a - b;
                            System.out.println("Result: " + a + "-" + b + "=" + result);
                            history.add("Subtraction: " + a + " - " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 3:
                            System.out.println("You have selected: Multiply");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            result = a * b;
                            System.out.println("Result: " + a + "*" + b + "=" + result);
                            history.add("Multiplication: " + a + " * " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 4:
                            System.out.println("You have selected: Divide");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            if (b != 0) {
                                result = a / b;
                                System.out.println("Result: " + a + "/" + b + "=" + result);
                                history.add("Division: " + a + " / " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot divide by zero. Please try again.");
                            }
                            break;

                        case 5:
                            System.out.println("You have selected: Power");
                            System.out.print("Enter base number: ");
                            a = sc.nextInt();
                            System.out.print("Enter exponent: ");
                            b = sc.nextInt();
                            result = (int) Math.pow(a, b);
                            System.out.println("Result: " + a + "^" + b + "=" + result);
                            history.add("Power: " + a + "^" + b + " = " + result);
                            lastResult = result;
                            break;

                        case 6:
                            System.out.println("You have selected: Modulus");
                            System.out.print("Enter first number: ");
                            a = sc.nextInt();
                            System.out.print("Enter second number: ");
                            b = sc.nextInt();
                            if (b != 0) {
                                result = a % b;
                                System.out.println("Result: " + a + "%" + b + "=" + result);
                                history.add("Modulus: " + a + " % " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot mod by zero!");
                            }
                            break;

                        case 7:
                            System.out.println("You have selected: Square root");
                            System.out.print("Enter number: ");
                            a = sc.nextInt();
                            if (a >= 0) {
                                sqrt = Math.sqrt(a);
                                System.out.println("Result: sqrt(" + a + ") = " + sqrt);
                                history.add("Square root: sqrt(" + a + ") = " + sqrt);
                                lastResult = (int) sqrt;
                            } else {
                                System.out.println("Error: Negative number");
                            }
                            break;

                        case 8:
                            System.out.println("Last result: " + lastResult);
                            break;

                        case 9:
                            System.out.println("You have selected: View history");
                            if (history.isEmpty()) {
                                System.out.println("Operation History:\n(No operations yet)");
                            } else {
                                System.out.println("Operation History:");
                                for (int i = 0; i < history.size(); i++) {
                                    System.out.println((i + 1) + ". " + history.get(i));
                                }
                            }
                            break;

                        case 10:
                            System.out.println("You have selected: Clear history");
                            history.clear();
                            System.out.println("Operation history cleared.");
                            break;

                        case 0:
                            System.out.println("You have selected: Exit");
                            System.out.println("Thank you for using the calculator. Goodbye!");
                            break;

                        default:

                            System.out.println("Invalid choice.");
                    }

                } while (choice != 0);

            } else {
                System.out.println("Invalid calculator type!");
            }
        }
    }