package problemTracker;
import java.util.ArrayList;
import java.util.Scanner;



public class Callculator62 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int calculatorMode;
            int lastResult = 0;
            ArrayList<String> history = new ArrayList<>();

            System.out.println("Welcome to the OOP Calculator!");

            while (true) {
                System.out.println("\nChoose calculator type:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");

                System.out.print("\nEnter choice: ");
                calculatorMode = sc.nextInt();

                if (calculatorMode == 1) {
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
                        System.out.println("7. Variable management");
                        System.out.println("8. Switch calculator mode");
                        System.out.println("0. Exit");

                        System.out.print("\nEnter choice (0-8): ");
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
                                break;

                            case 4:
                                System.out.println("You have selected: Divide");
                                System.out.print("Enter first number: ");
                                a = sc.nextInt();
                                System.out.print("Enter second number: ");
                                b = sc.nextInt();
                                if (b != 0) {
                                    result = a / b;
                                    System.out.println("Result: " + a + " / " + b + " = " + result);
                                    history.add("Division: " + a + " / " + b + " = " + result);
                                    lastResult = result;
                                } else {
                                    System.out.println("Error: Cannot divide by zero!");
                                }
                                break;

                            case 5:
                                System.out.println("You have selected: View history");
                                printHistory(history);
                                break;

                            case 6:
                                System.out.println("History cleared.");
                                history.clear();
                                break;

                            case 7:
                                System.out.println("Variable management is currently empty.");
                                break;

                            case 8:
                                System.out.println("You have selected: Switch calculator mode");
                                calculatorMode = switchCalculatorMode(sc, lastResult, history);
                                break;

                            case 0:
                                System.out.println("You have selected: Exit");
                                System.out.println("Thank you for using the calculator. Goodbye!");
                                return;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (calculatorMode == 1);
                }

                // Scientific Calculator
                else if (calculatorMode == 2) {
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
                        System.out.println("9. Logarithm");
                        System.out.println("10. View history");
                        System.out.println("11. Clear history");
                        System.out.println("12. Variable management");
                        System.out.println("13. Switch calculator mode");
                        System.out.println("0. Exit");

                        System.out.print("\nEnter choice (0-13): ");
                        choice = sc.nextInt();

                        int a, b, result = 0;
                        double answer;

                        switch (choice) {
                            case 1:
                                System.out.println("You have selected: Add");
                                a = sc.nextInt();
                                b = sc.nextInt();
                                result = a + b;
                                System.out.println("Result: " + a + " + " + b + " = " + result);
                                history.add("Addition: " + a + " + " + b + " = " + result);
                                lastResult = result;
                                break;

                            case 2:
                                System.out.println("You have selected: Subtract");
                                a = sc.nextInt();
                                b = sc.nextInt();
                                result = a - b;
                                System.out.println("Result: " + a + " - " + b + " = " + result);
                                history.add("Subtraction: " + a + " - " + b + " = " + result);
                                lastResult = result;
                                break;

                            case 3:
                                System.out.println("You have selected: Multiply");
                                a = sc.nextInt();
                                b = sc.nextInt();
                                result = a * b;
                                System.out.println("Result: " + a + " * " + b + " = " + result);
                                history.add("Multiplication: " + a + " * " + b + " = " + result);
                                lastResult = result;
                                break;

                            case 4:
                                System.out.println("You have selected: Divide");
                                a = sc.nextInt();
                                b = sc.nextInt();
                                if (b != 0) {
                                    result = a / b;
                                    System.out.println("Result: " + a + " / " + b + " = " + result);
                                    history.add("Division: " + a + " / " + b + " = " + result);
                                    lastResult = result;
                                } else {
                                    System.out.println("Error: Cannot divide by zero!");
                                }
                                break;

                            case 5:
                                  System.out.println("You have selected: Power");
                                System.out.print("Enter base number: ");
                                a = sc.nextInt();
                                System.out.print("Enter exponent: ");
                                double exp = sc.nextDouble();
                                answer = Math.pow(a, exp);
                                System.out.println("Result: " + a + " ^ " + exp + " = " + answer);
                                history.add("Power: " + a + " ^ " + exp + " = " + answer);
                                lastResult = (int) answer;
                                break;

                            case 6:
                                System.out.println("You have selected: Square root");
                                a = sc.nextInt();
                                answer = Math.sqrt(a);
                                System.out.println("Result: √" + a + " = " + answer);
                                history.add("Square Root: √" + a + " = " + answer);
                                lastResult = (int) answer;
                                break;

                            case 7:
                                System.out.println("You have selected: Sine");
                                a = sc.nextInt();
                                answer = Math.sin(Math.toRadians(a));
                                System.out.println("Result: sin(" + a + ") = " + answer);
                                history.add("Sine: sin(" + a + ") = " + answer);
                                break;

                            case 8:
                                System.out.println("You have selected: Cosine");
                                a = sc.nextInt();
                                answer = Math.cos(Math.toRadians(a));
                                System.out.println("Result: cos(" + a + ") = " + answer);
                                history.add("Cosine: cos(" + a + ") = " + answer);
                                break;

                            case 9:
                                System.out.println("You have selected: Logarithm");
                                a = sc.nextInt();
                                if (a > 0) {
                                    answer = Math.log10(a);
                                    System.out.println("Result: log(" + a + ") = " + answer);
                                    history.add("Logarithm: log(" + a + ") = " + answer);
                                } else {
                                    System.out.println("Error: Logarithm undefined for non-positive numbers");
                                }
                                break;

                            case 10:
                                System.out.println("You have selected: View history");
                                printHistory(history);
                                break;

                            case 11:
                                System.out.println("History cleared.");
                                history.clear();
                                break;

                            case 12:
                                System.out.println("Variable management is currently empty.");
                                break;

                            case 13:
                                System.out.println("You have selected: Switch calculator mode");
                                calculatorMode = switchCalculatorMode(sc, lastResult, history);
                                break;

                            case 0:
                                System.out.println("You have selected: Exit");
                                System.out.println("Thank you for using the calculator. Goodbye!");
                                return;

                            default:
                                System.out.println("Invalid choice.");
                        }

                    } while (calculatorMode == 2);
                } else {
                    System.out.println("Invalid calculator type!");
                }
            }
           }

        static void printHistory(ArrayList<String> history) {
            System.out.println("Operation History:");
              for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }

        static int switchCalculatorMode(Scanner sc, int lastResult, ArrayList<String> history) {
            System.out.println("\nAvailable calculator modes:");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");

            System.out.print("\nEnter choice (1-2): ");
             int newMode = sc.nextInt();

            if (newMode == 1 || newMode == 2) {
                System.out.println("Switching to " + (newMode == 1 ? "Basic" : "Scientific") + " Calculator...");
                System.out.println("Transferring your data...");
                System.out.println("- Last result: " + lastResult);
                 System.out.println("- History: " + history.size() + " operations transferred");
                System.out.println("- Variables: 0 variables transferred");
                System.out.println("\nYou have switched to: " + (newMode == 1 ? "Basic Calculator" : "Scientific Calculator"));
            } else {
                System.out.println("Invalid selection. Staying in current mode.");
                return 1; // default to Basic if invalid
            }
            return newMode;
        }
    }


