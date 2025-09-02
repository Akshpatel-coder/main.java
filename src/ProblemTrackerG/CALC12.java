package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;

public class CALC12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        int num1, num2 = 0;
        int result = 0;

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
            System.out.println("9. Show all operations");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting....");
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
                System.out.println("Enter choice (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 2) {
                    scientificCalc();
                    return;
                }
                continue;

            } else if (choice == 9) {
                System.out.println("\nBasic Calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View history");
                System.out.println("6. Clear history");
                System.out.println("7. Compare numbers");
                System.out.println("8. Switch calculator mode");
                System.out.println("9. Show all operations");
                System.out.println("0. Exit");
                continue;
            }

            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
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

                case 7:
                    if (num1 > num2) {
                        System.out.println("Result: " + num1 + " is greater than " + num2);
                    } else if (num1 < num2) {
                        System.out.println("Result: " + num1 + " is less than " + num2);
                    } else {
                        System.out.println("Result: " + num1 + " is equal to " + num2);
                    }
                    break;
            }
            history.add(entry);

        } while (choice != 0);
    }

    private static double degreesToRadians(double degrees) {
        return degrees * (Math.PI / 180);
    }

    private static double normalizeAngle(double degrees) {
        degrees = degrees % 360;
        if (degrees < 0) degrees += 360;
        return degrees;
    }

    public static void scientificCalc() {
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
            System.out.println("8. Sine");
            System.out.println("9. Cosine");
            System.out.println("10. Tangent");
            System.out.println("11. View history");
            System.out.println("12. Clear history");
            System.out.println("13. Show all operations");
            System.out.println("14. Switch calculator mode");
            System.out.println("15. Compare numbers");
            System.out.println("0. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if (choice == 0) {

                System.out.println("Exiting.....");
                break;
            } else if (choice == 11) {

                System.out.println("\n----history----");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;

            } else if (choice == 12) {
                history.clear();
                System.out.println("History cleared");
                continue;

            } else if (choice == 13) {
                System.out.println("\nScientific Calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Modulus");
                System.out.println("7. Square root");
                System.out.println("8. Sine");
                System.out.println("9. Cosine");
                System.out.println("10. Tangent");
                System.out.println("11. View history");
                System.out.println("12. Clear history");
                System.out.println("13. Show all operations");
                System.out.println("14. Switch calculator mode");
                System.out.println("15. Compare numbers");
                System.out.println("0. Exit");
                continue;

            } else if (choice == 14) {
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
            }

            String entry = "";

            if (choice >= 1 && choice <= 6 || choice == 15) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                num2 = sc.nextDouble();
            } else if (choice == 7) {
                System.out.println("Enter number");
                num1 = sc.nextDouble();
            } else if (choice >= 8 && choice <= 10) {
                System.out.println("Enter angle in degrees: ");
                num1 = sc.nextDouble();
                num1 = normalizeAngle(num1);
            }

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
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;

                case 6:
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;

                case 7:
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ") = " + result);
                    break;

                case 8:
                    result = Math.sin(degreesToRadians(num1));
                    System.out.println("Result: sin(" + num1 + "°) = " + result);
                    break;

                case 9:
                    result = Math.cos(degreesToRadians(num1));
                    System.out.println("Result: cos(" + num1 + "°) = " + result);
                    break;

                case 10:
                    if (num1 % 180 == 90) {
                        System.out.println("Error: Tangent is undefined at " + num1 + " degrees (division by zero).");
                    } else {
                        result = Math.tan(degreesToRadians(num1));
                        System.out.println("Result: tan(" + num1 + "°) = " + result);
                    }
                    break;

                case 15:
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