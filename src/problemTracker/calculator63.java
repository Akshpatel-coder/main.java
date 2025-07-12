package problemTracker;
import java.util.ArrayList;
import java.util.Scanner;

public class calculator63 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> history = new ArrayList<>();

            System.out.println("Welcome to the OOP Calculator!");


              int lastResult = 0;
            String lastOperation = null;
            int   lastOperand = 0;

            while (true) {
                System.out.println("\nChoose calculator type:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");

                System.out.print("\nEnter choice: ");
                int mode = sc.nextInt();

                if (mode == 1) {
                    System.out.println("You have selected: Basic Calculator");

                    int choice;
                    do {
                        System.out.println("\nAvailable operations:");
                        System.out.println("1. Add");
                        System.out.println("2. Subtract");
                        System.out.println("3. Multiply");
                        System.out.println("4. Divide");
                        System.out.println("5. View history");
                        System.out.println("6. Clear history");
                        System.out.println("7. Repeat last operation");
                        System.out.println("0. Exit");

                        System.out.print("\nEnter choice (0-7): ");
                        choice = sc.nextInt();

                        int a, b, result = 0;

                        switch (choice) {
                            case 1:
                                System.out.println("You have selected: Add");
                                System.out.print("Enter first number: ");
                                a = sc.nextInt();
                                System.out.print("Enter second number: ");
                                b = sc.nextInt();
                                result = a + b;
                                System.out.println("Result: " + a + " + " + b + " = " + result);
                                history.add("Addition: " + a + " + " + b + " = " + result);
                                lastResult = result;
                                lastOperation = "Addition";
                                lastOperand = b;
                                break;

                            case 2:
                                System.out.println("You have selected: Subtract");
                                System.out.print("Enter first number: ");
                                a = sc.nextInt();
                                System.out.print("Enter second number: ");
                                b = sc.nextInt();
                                result = a - b;
                                System.out.println("Result: " + a + " - " + b + " = " + result);
                                history.add("Subtraction: " + a + " - " + b + " = " + result);
                                lastResult = result;
                                lastOperation = "Subtraction";
                                lastOperand = b;
                                break;

                            case 3:
                                System.out.println("You have selected: Multiply");
                                System.out.print("Enter first number: ");
                                a = sc.nextInt();
                                System.out.print("Enter second number: ");
                                b = sc.nextInt();
                                result = a * b;
                                System.out.println("Result: " + a + " * " + b + " = " + result);
                                history.add("Multiplication: " + a + " * " + b + " = " + result);
                                lastResult = result;
                                lastOperation = "Multiplication";
                                lastOperand = b;
                                break;

                            case 4:
                                System.out.println("You have selected: Divide");
                                System.out.print("Enter first number: ");
                                a = sc.nextInt();
                                System.out.print("Enter second number: ");
                                b = sc.nextInt();
                                if (b != 0) {



                                     result = a / b;
                                     System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                                    history.add("Division: " + a + " ÷ " + b + " = " + result);
                                    lastResult = result;
                                    lastOperation = "Division";
                                    lastOperand = b;
                                } else {
                                    System.out.println("Oops! Division by zero isn’t allowed.");
                                }
                                break;

                            case 5:
                                System.out.println("You have selected: View history");
                                if (history.isEmpty()) {
                                    System.out.println("History is empty.");
                                } else {
                                    System.out.println("Operation History:");
                                    for (int i = 0; i < history.size(); i++) {
                                        System.out.println((i + 1) + ". " + history.get(i));
                                    }
                                }
                                break;

                            case 6:
                                System.out.println("You have selected: Clear history");
                                history.clear();
                                System.out.println("History cleared.");
                                break;

                            case 7:
                                System.out.println("You have selected: Repeat last operation");

                                if (lastOperation == null) {
                                    System.out.println("Error: No previous operation to repeat.");
                                    System.out.println("Please perform an operation first, then you can repeat it.");
                                } else {
                                    System.out.println("\nLast operation: " + lastOperation +
                                            " (" + getSymbol(lastOperation) + " " + lastOperand + ")");
                                    System.out.print("Enter number of repetitions: ");
                                    int reps = sc.nextInt();

                                    if (reps < 0) {
                                        System.out.println("Error: Number of repetitions must be 0 or greater.");
                                        break;
                                    } else if (reps == 0) {
                                        System.out.println("No repetitions requested.");
                                        break;
                                    }

                                    System.out.println("\nRepeating '" + lastOperation + ": " +
                                            getSymbol(lastOperation) + " " + lastOperand + "' " + reps + " times...");

                                    for (int i = 1; i <= reps; i++) {
                                        lastResult = performOperation(lastResult, lastOperand, lastOperation);
                                        System.out.println("Repetition " + i + ": " +
                                                getRepeatStep(i, lastResult, lastOperand, lastOperation));
                                        history.add(lastOperation + ": (repeated) → " + lastResult);
                                    }

                                    System.out.println("\nAll repetitions complete!");
                                    System.out.println("Final result: " + lastResult);
                                }
                                break;

                            case 0:
                                System.out.println("You have selected: Exit");
                                 System.out.println("Thank you for using the calculator. Goodbye!");
                                return;

                            default:
                                 System.out.println("Invalid choice. Please try again.");
                        }

                    } while (true);
                } else {
                    System.out.println("Sorry, only Basic Calculator is implemented in this version.");
                 }
            }
        }

        static int performOperation(int result, int operand, String operation) {
            return switch (operation) {
                case "Addition" -> result + operand;
                case "Subtraction" -> result - operand;
                case "Multiplication" -> result * operand;
                case "Division" -> operand != 0 ? result / operand : result;
                default -> result;
            };
        }

        static String getSymbol(String operation) {
            return switch (operation) {
                case "Addition" -> "+";
                case "Subtraction" -> "-";
                case "Multiplication" -> "*";
                case "Division" -> "÷";
                default -> "?";
            };
        }

        static String getRepeatStep(int step, int value, int operand, String op) {
            return switch (op) {
                case "Addition" -> (value - operand) + " + " + operand + " = " + value;
                case "Subtraction" -> (value + operand) + " - " + operand + " = " + value;
                case "Multiplication" -> (value / operand) + " * " + operand + " = " + value;
                case "Division" -> (value * operand) + " ÷ " + operand + " = " + value;
                default -> "Unknown operation";
            };
        }
    }


