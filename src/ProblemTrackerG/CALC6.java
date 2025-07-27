package ProblemTrackerG;
import java.util.ArrayList;
import java.util.Scanner;

public class CALC6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the OOP Calculator!\n");
        System.out.println("Choose calculator type:");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.print("\nEnter your choice: ");
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
        int num1, num2;
        double result = 0, lastResult = 0;

        do {
            System.out.println("\nBasic Calculator Operations:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Clear specific history entry");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("\nExiting Calculator... Thank you!");
                break;
            }
            else if (choice == 5) {
                System.out.println("\n--- Calculation History ---");
                if (history.isEmpty()) {
                    System.out.println("No calculations recorded yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            }
            else if (choice == 6) {
                history.clear();
                System.out.println("\nHistory cleared successfully!");
                continue;
            }
            else if (choice == 7) {
                if (history.isEmpty()) {
                    System.out.println("\nNo history entries to clear!");
                    continue;
                }
                System.out.println("\nCurrent History:");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }
                System.out.print("\nEnter the entry number to delete: ");
                int del = sc.nextInt();
                if (del > 0 && del <= history.size()) {
                    String removed = history.remove(del - 1);
                    System.out.println("Deleted: " + removed);
                } else {
                    System.out.println("Invalid entry number!");
                }
                continue;
            }

            System.out.print("\nEnter first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            num2 = sc.nextInt();
            String entry = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                    entry = "Addition: " + num1 + " + " + num2 + " = " + result;
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                    entry = "Subtraction: " + num1 + " - " + num2 + " = " + result;
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                    entry = "Multiplication: " + num1 + " * " + num2 + " = " + result;
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero");
                        entry = "";
                    } else {
                        result = num1 / num2;
                        System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                        entry = "Division: " + num1 + " / " + num2 + " = " + result;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            if (!entry.isEmpty()) {
                history.add(entry);
            }
            lastResult = result;

        } while (choice != 0);
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0, lastResult = 0;

        do {
            System.out.println("\nScientific Calculator Operations:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square Root");
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("10. Clear specific history entry");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("\nExiting Calculator... Thank you!");
                break;
            }
            else if (choice == 8) {
                System.out.println("\n--- Calculation History ---");
                if (history.isEmpty()) {
                    System.out.println("No calculations recorded yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            }
            else if (choice == 9) {
                history.clear();
                System.out.println("\nHistory cleared successfully!");
                continue;
            }
            else if (choice == 10) {
                if (history.isEmpty()) {
                    System.out.println("\nNo history entries to clear!");
                    continue;
                }
                System.out.println("\nCurrent History:");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }

                System.out.print("\nEnter the entry number to delete: ");
                int del = sc.nextInt();
                if (del > 0 && del <= history.size()) {
                    String removed = history.remove(del - 1);
                    System.out.println("Deleted: " + removed);
                } else {
                    System.out.println("Invalid entry number!");
                }
                continue;
            }

            String entry = "";
            if (choice >= 1 && choice <= 4 || choice == 6) {
                System.out.print("\nEnter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            }

            switch (choice) {


                case 1:
                    result = num1 + num2;
                    System.out.println("\nResult: " + num1 + " + " + num2 + " = " + result);
                    entry = "Addition: " + num1 + " + " + num2 + " = " + result;
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("\nResult: " + num1 + " - " + num2 + " = " + result);
                    entry = "Subtraction: " + num1 + " - " + num2 + " = " + result;
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("\nResult: " + num1 + " * " + num2 + " = " + result);
                    entry = "Multiplication: " + num1 + " * " + num2 + " = " + result;
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero");
                        entry = "";
                    } else {
                        result = num1 / num2;
                        System.out.println("\nResult: " + num1 + " / " + num2 + " = " + result);
                        entry = "Division: " + num1 + " / " + num2 + " = " + result;
                    }
                    break;
                case 5:
                    System.out.print("\nEnter base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = sc.nextDouble();
                    result = Math.pow(num1, num2);
                    System.out.println("\nResult: " + num1 + " ^ " + num2 + " = " + result);
                    entry = "Power: " + num1 + " ^ " + num2 + " = " + result;
                    break;

                case 6:
                    if (num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero");
                        entry = "";
                    } else {
                        result = num1 % num2;
                        System.out.println("\nResult: " + num1 + " % " + num2 + " = " + result);
                        entry = "Modulus: " + num1 + " % " + num2 + " = " + result;
                    }
                    break;

                case 7:
                    System.out.print("\nEnter number: ");
                    num1 = sc.nextDouble();
                    if (num1 < 0) {
                        System.out.println("\nError: Cannot square root negative number");
                        entry = "";
                    } else {
                        result = Math.sqrt(num1);
                        System.out.println("\nResult: sqrt(" + num1 + ") = " + result);
                        entry = "Square Root: sqrt(" + num1 + ") = " + result;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            if (!entry.isEmpty()) {
                history.add(entry);
            }
            //    lastResult = result;
        } while (choice != 0);
    }
}