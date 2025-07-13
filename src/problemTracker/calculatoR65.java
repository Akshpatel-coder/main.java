package problemTracker;

import java.util.Scanner;
import java.util.ArrayList;

public class calculatoR65 {


        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            ArrayList<String> history = new ArrayList<>();
            double lastResult = 0.0;
            String lastOperation = null;
            double lastOperand = 0.0;

            System.out.println("Welcome to the OOP Calculator!");

            // Personalized username
            String username;
            while (true) {
                System.out.print("Enter your username: ");
                username = sc.nextLine().trim();
                if (!username.isEmpty()) break;
                System.out.println("Username cannot be empty. Please enter a valid username.");
            }
            if (username.isEmpty()) username = "Guest123";

            System.out.println("Hello, " + username + "! Let's start calculating.");

            while (true) {
                System.out.println("\nChoose calculator type:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.print("\nEnter choice: ");
                int mode = sc.nextInt();
                sc.nextLine();

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
                        System.out.println("7. Compare numbers");
                        System.out.println("8. Repeat last operation");
                        System.out.println("0. Exit");

                        System.out.print("\nEnter choice (0-8): ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        double a = 0, b = 0, result = 0;

                        switch (choice) {
                            case 1 -> {
                                System.out.println("You have selected: Add");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a + b;
                                System.out.println("Result: " + a + " + " + b + " = " + result);
                                history.add("[" + username + "] Addition: " + a + " + " + b + " = " + result);
                                lastResult = result;
                                lastOperation = "Addition";
                                 lastOperand = b;
                             }

                            case 2 -> {
                                System.out.println("You have selected: Subtract");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a - b;
                                System.out.println("Result: " + a + " - " + b + " = " + result);
                                history.add("[" + username + "] Subtraction: " + a + " - " + b + " = " + result);
                                lastResult = result;
                                lastOperation = "Subtraction";
                                lastOperand = b;

                            }
                            case 3 -> {
                                System.out.println("You have selected: Multiply");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a * b;
                                System.out.println("Result: " + a + " * " + b + " = " + result);
                                history.add("[" + username + "] Multiplication: " + a + " * " + b + " = " + result);
                                 lastResult = result;
                                lastOperation = "Multiplication";
                                lastOperand = b;
                            }
                            case 4 -> {
                                System.out.println("You have selected: Divide");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                if (b != 0) {
                                    result = a / b;
                                      System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                                    history.add("[" + username + "] Division: " + a + " ÷ " + b + " = " + result);
                                    lastResult = result;
                                    lastOperation = "Division";
                                    lastOperand = b;
                                } else {
                                    System.out.println("Oops! Division by zero isn’t allowed.");
                                }
                            }
                            case 5 -> showHistory(history, username);
                            case 6 -> clearHistory(history);
                            case 7 -> compareNumbers(sc, lastResult, history, username);
                            case 8 -> repeatOperation(sc, history, lastOperation, lastOperand, username);
                            case 0 -> {
                                System.out.println("You have selected: Exit");
                                System.out.println("Thank you for using the calculator, " + username + "! Have a great day!");
                                return;
                            }
                            default -> System.out.println("Invalid choice. Please try again.");
                        }
                      } while (true);
                }

                else if (mode == 2) {
                    System.out.println("You have selected: Scientific Calculator");
                    int choice;
                    do {
                        System.out.println("\nAvailable operations:");
                        System.out.println("1. Add");
                         System.out.println("2. Subtract");
                        System.out.println("3. Multiply");
                        System.out.println("4. Divide");
                        System.out.println("5. Power");
                        System.out.println("6. Square root");
                        System.out.println("7. Sine");
                        System.out.println("8. Cosine");
                        System.out.println("9. View history");
                        System.out.println("10. Clear history");
                        System.out.println("11. Compare numbers");
                        System.out.println("0. Exit");

                        System.out.print("\nEnter choice (0-11): ");
                        choice = sc.nextInt();
                        sc.nextLine();

                        double a = 0, b = 0, result = 0;

                        switch (choice) {
                            case 1 -> {
                                System.out.println("You have selected: Add");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a + b;
                                System.out.println("Result: " + a + " + " + b + " = " + result);
                                history.add("[" + username + "] Addition: " + a + " + " + b + " = " + result);
                                lastResult = result;
                            }
                            case 2 -> {
                                System.out.println("You have selected: Subtract");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a - b;
                                System.out.println("Result: " + a + " - " + b + " = " + result);
                                history.add("[" + username + "] Subtraction: " + a + " - " + b + " = " + result);
                                lastResult = result;
                            }
                            case 3 -> {
                                System.out.println("You have selected: Multiply");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                result = a * b;
                                System.out.println("Result: " + a + " * " + b + " = " + result);
                                history.add("[" + username + "] Multiplication: " + a + " * " + b + " = " + result);
                                lastResult = result;
                            }
                            case 4 -> {
                                System.out.println("You have selected: Divide");
                                a = readNumber("Enter first number: ", sc, lastResult);
                                b = readNumber("Enter second number: ", sc, lastResult);
                                if (b != 0) {
                                    result = a / b;
                                    System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                                    history.add("[" + username + "] Division: " + a + " ÷ " + b + " = " + result);
                                    lastResult = result;
                                } else {
                                    System.out.println("Oops! Division by zero isn’t allowed.");
                                }
                            }
                            case 5 -> {
                                System.out.println("You have selected: Power");
                                a = readNumber("Enter base number: ", sc, lastResult);
                                b = readNumber("Enter exponent: ", sc, lastResult);
                                result = Math.pow(a, b);
                                System.out.println("Result: " + a + " ^ " + b + " = " + result);
                                history.add("[" + username + "] Power: " + a + " ^ " + b + " = " + result);
                                lastResult = result;
                            }

                            case 6 -> {
                                System.out.println("You have selected: Square root");
                                a = readNumber("Enter number: ", sc, lastResult);
                                result = Math.sqrt(a);
                                System.out.println("Result: √" + a + " = " + result);
                                history.add("[" + username + "] Square Root: √" + a + " = " + result);
                                lastResult = result;
                            }
                            case 7 -> {
                                System.out.println("You have selected: Sine");
                                a = readNumber("Enter angle (in degrees): ", sc, lastResult);
                                result = Math.sin(Math.toRadians(a));
                                System.out.println("Result: sin(" + a + ") = " + result);
                                history.add("[" + username + "] Sine: sin(" + a + ") = " + result);
                                lastResult = result;
                            }
                            case 8 -> {
                                System.out.println("You have selected: Cosine");
                                a = readNumber("Enter angle (in degrees): ", sc, lastResult);
                                result = Math.cos(Math.toRadians(a));
                                System.out.println("Result: cos(" + a + ") = " + result);
                                history.add("[" + username + "] Cosine: cos(" + a + ") = " + result);
                                lastResult = result;
                            }
                            case 9 -> showHistory(history, username);
                            case 10 -> clearHistory(history);
                            case 11 -> compareNumbers(sc, lastResult, history, username);
                            case 0 -> {
                                System.out.println("You have selected: Exit");
                                System.out.println("Thanks for calculating with us, " + username + "! See you next time!");
                                return;
                            }
                            default -> System.out.println("Invalid choice. Please try again.");
                        }
                    } while (true);
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
             }
          }

        static double readNumber(String prompt, Scanner sc, double lastResult) {
            System.out.print(prompt);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("last")) {
                System.out.println("Using last result: " + lastResult);
                return lastResult;
            }
            return Double.parseDouble(input);
         }

        static void showHistory(ArrayList<String> history, String username) {
            System.out.println("You have selected: View history");
            if (history.isEmpty()) {
                System.out.println("History is empty.");
            } else {
                System.out.println(username + "'s Operation History:");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }
            }
        }

        static void clearHistory(ArrayList<String> history) {
            System.out.println("You have selected: Clear history");
            history.clear();
            System.out.println("History cleared.");
          }

        static void compareNumbers(Scanner sc, double lastResult, ArrayList<String> history, String username) {
            System.out.println("You have selected: Compare numbers");
            double a = readNumber("Enter first number: ", sc, lastResult);
            double b = readNumber("Enter second number: ", sc, lastResult);
            String result;
            if (a > b) result = a + " is greater than " + b;
            else if (a < b) result = a + " is less than " + b;
            else result = a + " is equal to " + b;
            System.out.println("Result: " + result);
            history.add("[" + username + "] Comparison: " + result);
        }

        static void repeatOperation(Scanner sc, ArrayList<String> history, String lastOp, double lastOperand, String username) {
            if (lastOp == null) {
                System.out.println("Error: No previous operation to repeat.");
                return;
            }
            System.out.println("Last operation: " + lastOp + " (" + getSymbol(lastOp) + " " + lastOperand + ")");
            System.out.print("Enter number of repetitions: ");
            int reps = sc.nextInt();
            sc.nextLine();
            double result = 0;
            System.out.println("\nRepeating '" + lastOp + ": " + getSymbol(lastOp) + " " + lastOperand + "' " + reps + " times...");
            for (int i = 1; i <= reps; i++) {
                result = performOperation(result, lastOperand, lastOp);
                System.out.println("Repetition " + i + ": " + getRepeatStep(i, result, lastOperand, lastOp));
                history.add("[" + username + "] " + lastOp + " (repeat): " + result);
            }
            System.out.println("Final result: " + result);
        }

        static double performOperation(double result, double operand, String operation) {
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

        static String getRepeatStep(int step, double value, double operand, String op) {
            return switch (op) {
                case "Addition" -> (value - operand) + " + " + operand + " = " + value;
                case "Subtraction" -> (value + operand) + " - " + operand + " = " + value;
                case "Multiplication" -> (value / operand) + " * " + operand + " = " + value;
                case "Division" -> (value * operand) + " ÷ " + operand + " = " + value;
                default -> "Unknown operation";
            };
        }
    }
