package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;

public class CALC11{
    private static final java.util.Map<String, Double> CONSTANTS = new java.util.HashMap<>();

    static {

        CONSTANTS.put("PI", Math.PI);
        CONSTANTS.put("E", Math.E);
        CONSTANTS.put("PHI", 1.6180339887);
        CONSTANTS.put("TAU", 2 * Math.PI);
        CONSTANTS.put("SQRT2", Math.sqrt(2));
        CONSTANTS.put("SQRT3", Math.sqrt(3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " ! Let's start calculating");
        System.out.println("Welcome to the OOP Calculator");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scintific Calculator");
        System.out.println("Enter your choice: ");
        int calcType = sc.nextInt();


        switch (calcType){

            case 1:
                basicCalc();
                break;

            case 2:

                scientificCalc();
                break;

            default:

                System.out.println("Invaldi choice!");
        }
    }

    private static double readNumber(Scanner sc) {
        String input = sc.next();
        if (CONSTANTS.containsKey(input.toUpperCase())) {
            return CONSTANTS.get(input.toUpperCase());
        }
        return Double.parseDouble(input);
    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0;

        do {
            System.out.println("\nBasic Calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Compare numbers");
            System.out.println("8. Switch calculator mode");
            System.out.println("9. View constants");
            System.out.println("10. Show all operations");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {

                System.out.println("Exiting.....");
                break;

            } else if (choice == 5) {
                System.out.println("\n----history----");
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

                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.println("Enter  choice (1-2): ");
                int newChoice = sc.nextInt();

                if (newChoice == 2) {

                    scientificCalc();
                    return;
                }
                continue;

            } else if (choice == 9) {
                System.out.println("\nAvailable constants:");
                for (var c : CONSTANTS.entrySet()) {
                    System.out.println(c.getKey() + " = " + c.getValue());
                }
                continue;

            } else if (choice == 10) {

                System.out.println("\nBasic Calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View history");
                System.out.println("6. Clear history");
                System.out.println("7. Compare numbers");
                System.out.println("8. Switch calculator mode");
                System.out.println("9. View constants");
                System.out.println("10. Show all operations");
                System.out.println("0. Exit");
                continue;
            }

            System.out.println("Enter first number (or constant)");
            num1 = readNumber(sc);
            System.out.println("Enter second number (or constant)");
            num2 = readNumber(sc);
            String entry = "";

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
                        System.out.println("Error: Can't divide by zero");
                    }
                    else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                case 7:
                    if (num1 > num2)
                        System.out.println("Result: " + num1 + " is greater than " + num2);
                    else if (num1 < num2) {
                        System.out.println("Result: " + num1 + " is less than " + num2);
                    }
                    else {
                        System.out.println("Result: " + num1 + " is equal to " + num2);
                    }
                    break;
            }

            history.add(entry);
        } while (choice != 0);

    }

    public static void scientificCalc(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0;

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
            System.out.println("10. Show all operations");
            System.out.println("11. Switch calculator mode");
            System.out.println("12. Compare numbers");
            System.out.println("13. View constants");
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
                System.out.println("12. Compare numbers");
                System.out.println("13. View constants");
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

            } else if (choice == 13) {
                System.out.println("\nAvailable constants:");
                for (var c : CONSTANTS.entrySet()) {
                    System.out.println(c.getKey() + " = " + c.getValue());
                }
                continue;
            }

            if (choice >= 1 && choice <= 6 || choice == 12) {
                System.out.println("Enter first number (or constant): ");
                num1 = readNumber(sc);
                System.out.println("Enter second number (or constant): ");
                num2 = readNumber(sc);
            }

            String entry = "";


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
                        System.out.println("Error: can't divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                case 5:
                    System.out.println("Enter base (or constant): ");
                    num1 = readNumber(sc);
                    System.out.println("Enter exponent (or constant): ");
                    num2 = readNumber(sc);
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;

                case 6:
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;

                case 7:
                    System.out.println("Enter number (or constant): ");
                    num1 = readNumber(sc);
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ") = " + result);
                    break;

                case 12:
                    if (num1 > num2) {
                        System.out.println("Result: " + num1 + " is greater than " + num2);
                    } else if (num1 < num2) {
                        System.out.println("Result: " + num1 + " is less than " + num2);
                    } else {
                        System.out.println("Result: " + num1 + " is equal to " + num2);
                    }
                    break;
                default:

                    System.out.println("Invalid choice");
            }

            history.add(entry);

        } while (choice != 0);

    }
}
