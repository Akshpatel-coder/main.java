package ProblemTrackerG;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Calculator");
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
        ArrayList<String> history = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View History");
            System.out.println("6. Show Date/Time");
            System.out.println("7. Exit");
            System.out.print("Choose operation: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();
                int result = 0;
                String operation = "";

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        operation = num1 + " + " + num2 + " = " + result;
                        break;
                    case 2:
                        result = num1 - num2;
                        operation = num1 + " - " + num2 + " = " + result;
                        break;
                    case 3:
                        result = num1 * num2;
                        operation = num1 + " * " + num2 + " = " + result;
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero");
                            continue;
                        }
                        result = num1 / num2;
                        operation = num1 + " / " + num2 + " = " + result;
                        break;
                }
                System.out.println("Result: " + operation);
                history.add(operation);
            } else if (choice == 5) {
                System.out.println("\n---- History ----");
                if (history.isEmpty()) {
                    System.out.println("No history yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } else if (choice == 6) {
                showDateTime();
            } else if (choice != 7) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 7);
        System.out.println("Exiting...");
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== Scientific Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Show Date/Time");
            System.out.println("8. View History");
            System.out.println("9. Exit");
            System.out.print("Choose operation: ");

            choice = sc.nextInt();

            if (choice >= 1 && choice <= 6) {
                double num1, num2 = 0, result;
                String operation = "";

                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                if (choice != 6) {
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                }

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        operation = num1 + " + " + num2 + " = " + result;
                        break;
                    case 2:
                        result = num1 - num2;
                        operation = num1 + " - " + num2 + " = " + result;
                        break;
                    case 3:
                        result = num1 * num2;
                        operation = num1 + " * " + num2 + " = " + result;
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero");
                            continue;
                        }
                        result = num1 / num2;
                        operation = num1 + " / " + num2 + " = " + result;
                        break;
                    case 5:
                        result = Math.pow(num1, num2);
                        operation = num1 + " ^ " + num2 + " = " + result;
                        break;
                    case 6:
                        result = Math.sqrt(num1);
                        operation = "sqrt(" + num1 + ") = " + result;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        continue;
                }
                System.out.println("Result: " + operation);
                history.add(operation);
            } else if (choice == 7) {
                showDateTime();
            } else if (choice == 8) {
                System.out.println("\n---- History ----");
                if (history.isEmpty()) {
                    System.out.println("No history yet");
                } else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
            } else if (choice != 9) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 9);
        System.out.println("Exiting...");
    }

    public static void showDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:ss a");

        System.out.println("\nCurrent Date and Time:");
        System.out.println("Date: " + dateFormat.format(new Date()));
        System.out.println("Time: " + timeFormat.format(new Date()));
        System.out.println("Timezone: " + java.util.TimeZone.getDefault().getID());

        System.out.print("\nPress Enter to continue...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}