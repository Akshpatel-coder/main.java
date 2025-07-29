package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;
public class CALC63 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the OOP  Calculator");
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

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        int num1 = 0, num2 = 0;
        double result = 0;
        String lastOperation = "";

        do {
            System.out.println("\nBasic Calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Repeat last operation");
            System.out.println("8. Switch calculator mode");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            } else if (choice == 5) {
                System.out.println("\n----History----");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            } else if (choice == 6) {
                history.clear();
                System.out.println("History cleared");
                continue;
            } else if (choice == 8) {
                System.out.println("\nAvailable calculator modes:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.println("Enter choice (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 2) {
                    scientificCalc();
                    return;
                }
                continue;
            } else if (choice == 7) {
                if (lastOperation.isEmpty()) {
                    System.out.println("Error: No previous operation to repeat.");
                    System.out.println("Please perform an operation first, then you can repeat it.");
                    continue;
                }
                System.out.println("Last operation: " + lastOperation);
                System.out.println("Enter number of repetitions: ");
                int repetitions = sc.nextInt();
                if (repetitions <= 0) {
                    System.out.println("Error: Number of repetitions must be 0 or greater.");
                    continue;
                }
                System.out.println("Repeating " + lastOperation + " " + repetitions + " times...");
                for (int i = 0; i < repetitions; i++) {
                    switch (lastOperation) {
                        case "Add":
                            result = num1 + num2;
                            break;
                        case "Subtract":
                            result = num1 - num2;
                            break;
                        case "Multiply":
                            result = num1 * num2;
                            break;
                        case "Divide":
                            if (num2 == 0) {
                                System.out.println("Error: Can't divide by zero");
                                continue;
                            }
                            result = num1 / num2;
                            break;
                    }
                    num1 = (int) result;
                    System.out.println("Repetition " + (i + 1) + ": " + result);
                }
                System.out.println("All repetitions complete!");
                System.out.println("Final result: " + result);
                history.add(lastOperation + " (repeated " + repetitions + " times) = " + result);
                continue;
            }
            System.out.println("Enter first number ");
            num1 = sc.nextInt();
            System.out.println("Enter second number ");
            num2 = sc.nextInt();
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    lastOperation = "Add";
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    lastOperation = "Subtract";
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    lastOperation = "Multiply";
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: can't divide by zero");
                    } else {
                        result = num1 / num2;
                        lastOperation = "Divide";
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            if (choice >= 1 && choice <= 4) {
                history.add((int) result + " = " + num1 + " " + lastOperation + " " + num2);
            }

        } while (choice != 0);
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0;
        String lastOperation = "";
        do {
            System.out.println("\nScientific Calculator operations");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square root");
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("10. Show all operations");
            System.out.println("11. Switch calculator mode");
            System.out.println("12. Repeat last operation");
            System.out.println("0. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting.....");
                break;
            } else if (choice == 8) {
                System.out.println("\n----history----");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            } else if (choice == 9) {
                history.clear();
                System.out.println("History cleared");
                continue;
            } else if (choice == 10) {
                System.out.println("\nScientific Calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Modulus");
                System.out.println("7. Square root");
                System.out.println("8. view history");
                System.out.println("9. clear history");
                System.out.println("10. Show all operations");
                System.out.println("11. Switch calculator mode");
                System.out.println("12. Repeat last operation");
                System.out.println("0. Exit");
                continue;
            } else if (choice == 11) {
                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.println("Enter choice (1-2):");
                int newChoice = sc.nextInt();
                if (newChoice == 1) {
                    basicCalc();
                    return;
                }
                continue;
            } else if (choice == 12) {
                if (lastOperation.isEmpty()) {
                    System.out.println("Error: No previous operation to repeat.");
                    System.out.println("Please perform an operation first, then you can repeat it.");
                    continue;
                }
                System.out.println("Last operation: " + lastOperation);
                System.out.println("Enter number of repetitions: ");
                int repetitions = sc.nextInt();
                if (repetitions <= 0) {
                    System.out.println("Error: Number of repetitions must be 0 or greater.");
                    continue;
                }
                System.out.println("Repeating '" + lastOperation + "' " + repetitions + " times...");
                for (int i = 0; i < repetitions; i++) {
                    switch (lastOperation) {
                        case "Add":
                            result = num1 + num2;
                            break;
                        case "Subtract":
                            result = num1 - num2;
                            break;
                        case "Multiply":
                            result = num1 * num2;
                            break;
                        case "Divide":
                            if (num2 == 0) {
                                System.out.println("Error: Can't divide by zero");
                                continue;
                            }
                            result = num1 / num2;
                            break;
                        case "Power":
                            result = Math.pow(num1, num2);
                            break;
                        case "Modulus":
                            result = num1 % num2;
                            break;
                        case "Square":
                            result = Math.sqrt(num1);
                            break;
                    }
                    num1 = result;
                    System.out.println("Repetition " + (i + 1) + ": " + result);
                }
                System.out.println("All repetitions complete!");
                System.out.println("Final result: " + result);
                history.add(lastOperation + " (repeated " + repetitions + " times) = " + result);
                continue;
            }

            if (choice >= 1 && choice <= 6 || choice == 12) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                if (choice != 7) {
                    System.out.println("Enter second number: ");
                    num2 = sc.nextDouble();
            }
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        lastOperation = "Add";
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        lastOperation = "Subtract";
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        lastOperation = "Multiply";
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: can't divide by zero");
                        } else {
                            result = num1 / num2;
                            lastOperation = "Divide";
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    case 5:
                        result = Math.pow(num1, num2);
                        lastOperation = "Power";
                        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                        break;

                    case 6:
                        result = num1 % num2;
                        lastOperation = "Modulus";
                        System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                        break;

                    case 7:
                        result = Math.sqrt(num1);
                        lastOperation = "Square";
                        System.out.println("Result: sqrt(" + num1 + ") = " + result);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                if (choice >= 1 && choice <= 7) {
                    history.add((int) result + " = " + num1 + " " + lastOperation + " " + num2);
                }
        }
    }while (choice != 0);
}
}