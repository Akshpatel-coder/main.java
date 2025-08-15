package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CALC72 {
    static class Operation {
        double num1, num2, result;
        String operation;

        Operation(double num1, double num2, double result, String operation) {
            this.num1 = num1;
            this.num2 = num2;
            this.result = result;

            this.operation = operation;

        }
    }

    private static int getValidIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer!!!");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double getValidDoubleInput(Scanner sc, String prompt) {
        System.out.println(prompt);
        while (!sc.hasNextDouble()) {
            System.out.println("Please enter a valid number!!!");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static void viewHistory(ArrayList<String> history) {
        System.out.println("\n----History----");
        if (history.isEmpty()) System.out.println("No history yet");

        else {
            for (int i = 0; i < history.size(); i++) {
                System.out.println((i + 1) + ". " + history.get(i));
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your username: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name + " ! Let's start calculating");
            System.out.println("Welcome to the OOP Calculator");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("Enter your choice: ");

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

    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        Stack<Operation> undoStack = new Stack<>();
        Stack<Operation> redoStack = new Stack<>();
        int choice;
        int num1, num2;
        double result = 0;


        do {
            System.out.println("\nBasic Calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Switch calculator mode");
            System.out.println("8. Undo");
            System.out.println("9. Redo");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting.......");
                break;

            } else if (choice == 5) {
                System.out.println("\n----history---");
                if (history.isEmpty()) {
                    System.out.println("No history yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {

                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } else if (choice == 6) {
                history.clear();

                System.out.println("History cleared");
                continue;

            } else if (choice == 7) {

                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic clculator");
                System.out.println("2. Scientific calculator");
                System.out.println("Enter choicr (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 2) {

                    scientificCalc();
                    return;
                }
                continue;

            } else if (choice == 8) {
                if (!undoStack.isEmpty()) {

                    Operation lastOp = undoStack.pop();

                    redoStack.push(new Operation(lastOp.num1, lastOp.num2, lastOp.result, lastOp.operation));
                    result = lastOp.num1;
                    System.out.println("Undone to: " + lastOp.operation);
                } else {
                    System.out.println("Nothing to undo");
                }
                continue;
            } else if (choice == 9) {

                if (!redoStack.isEmpty()) {
                    Operation redoOp = redoStack.pop();
                    undoStack.push(new Operation(redoOp.num1, redoOp.num2, redoOp.result, redoOp.operation));
                    result = redoOp.result;
                    System.out.println("Redone to: " + redoOp.operation + " = " + result);
                } else {

                    System.out.println("Nothing to redo!!");
                }

                continue;
            }


            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            String entry = "";

            Operation operation = null;

            switch (choice) {

                case 1:

                    result = num1 + num2;
                    entry = num1 + " + " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;

                case 2:

                    result = num1 - num2;
                    entry = num1 + " - " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;
                case 3:

                    result = num1 * num2;
                    entry = num1 + " * " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;

                case 4:

                    if (num2 == 0) {
                        System.out.println("Error: can't divide by zero");
                    } else {
                        result = num1 / num2;
                        entry = num1 + " / " + num2 + " = " + result;
                        operation = new Operation(num1, num2, result, entry);
                        System.out.println("Result: " + entry);
                    }
                    break;
                default:
                         System.out.println("Invalid choice!");
            }
            if (operation != null) {
                undoStack.push(operation);
                history.add(entry);
                redoStack.clear();
            }
        } while (true);
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        Stack<Operation> undoStack = new Stack<>();
        Stack<Operation> redoStack = new Stack<>();
        int choice;
        double num1 = 0, num2 = 0;
         double result = 0;

        do {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square root");
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("10. Switch calculator mode ");
            System.out.println("11. Undo");
            System.out.println("12. Redo");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting....");
                break;
            } else if (choice == 8) {
                System.out.println("\n----history---");
                if (history.isEmpty()) {
                      System.out.println("No history yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } else if (choice == 9) {

                history.clear();
                System.out.println("History cleared");
                continue;
            } else if (choice == 10) {

                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic clculator");
                System.out.println("2. Scientific calculator");
                System.out.println("Enter choicr (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 2) {
                    scientificCalc();
                    return;
                }
                continue;

            } else if (choice == 11) {


                if (!undoStack.isEmpty()) {
                    Operation lastOp = undoStack.pop();
                    redoStack.push(new Operation(lastOp.num1, lastOp.num2, lastOp.result, lastOp.operation));
                    result = lastOp.num1;
                    System.out.println("Undone to: " + lastOp.operation);
                } else {

                    System.out.println("Nothing to undo");
                }
                continue;

            } else if (choice == 12) {

                if (!redoStack.isEmpty()) {
                    Operation redoOp = redoStack.pop();
                    undoStack.push(new Operation(redoOp.num1, redoOp.num2, redoOp.result, redoOp.operation));
                    result = redoOp.result;
                    System.out.println("Redone to: " + redoOp.operation + " = " + result);
                } else {
                    System.out.println("Nothing to redo!!");
                }
                continue;

            }

            if (choice >= 1 && choice <= 6) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                num2 = sc.nextDouble();
                String entry = "";
                Operation operation = null;


            }
            switch (choice) {
                case 1:

                    result = num1 + num2;

                    String entry = num1 + " + " + num2 + " = " + result;
                    Operation operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;

                case 2:

                    result = num1 - num2;
                    entry = num1 + " - " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;


                case 3:

                    result = num1 * num2;
                    entry = num1 + " * " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;


                case 4:

                    if (num2 == 0) {
                        System.out.println("Error: can't divide by zero");
                    } else {
                        result = num1 / num2;
                        entry = num1 + " / " + num2 + " = " + result;
                        operation = new Operation(num1, num2, result, entry);
                        System.out.println("Result: " + entry);


                    }
                    break;

                case 5:
                    System.out.println("Enter base: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter exponent: ");
                    num2 = sc.nextInt();
                    result = Math.pow(num1, num2);
                    entry = num1 + " ^ " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);
                    break;

                case 6:

                    result = num1 % num2;
                    entry = num1 + " % " + num2 + " = " + result;
                    operation = new Operation(num1, num2, result, entry);
                    System.out.println("Result: " + entry);

                    break;
                case 7:
                    result = Math.sqrt(num1);
                    entry = "sqrt(" + num1 + ") = " + result;
                    operation = new Operation(num1, 0, result, entry);
                    System.out.println("Result: " + entry);
                    break;


                default:
                    System.out.println("Invalid choice");
            }

            Operation operation = null;
            if (operation != null) {
                undoStack.push(operation);
                String entry = "";
                history.add(entry);
                redoStack.clear();
            }

        } while (true);

    }
}