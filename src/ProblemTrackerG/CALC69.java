package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;

public class CALC69 {

    private static int adds = 0;
    private static int subtracts = 0;
    private static int multiplies = 0;
    private static int divides = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " ! Let's start calculating");

        System.out.println("Welcome to the OOP Calculator");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.println("Eter your choice: ");

        int calcType = sc.nextInt();
        switch (calcType) {
            case 1:
            basicCalc();
            break;

            case 2:
                scientificCalc();
            default:
                System.out.println("Invalid choice!!!");

        }
    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        int num1, num2;
        double result;

        do {
            System.out.println("\nBasic calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Compare numbers");
            System.out.println("8. Show operation stats");
            System.out.println("9. Switch calculator mode");
            System.out.println("10. Show all operations");
            System.out.println("0. Exit");
            System.out.println("Choose operations: ");
            choice = sc.nextInt();

            if(choice == 0) {
                System.out.println("Exiting.......");
                break;
            } else if (choice == 5) {
                System.out.println("\n--history--");
                if(history.isEmpty()) {
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

            } else if (choice == 8) {
                System.out.println("\nOperation Statics");
                System.out.println("Addition: " + adds);
                System.out.println("Substractions: " + subtracts);
                System.out.println("Multiplications: " + multiplies);
                System.out.println("Divisions: " + divides);
                System.out.println("\nPress Enter to continue......");
                sc.nextLine();
                sc.nextLine();
            } else if(choice == 9) {
                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic clculator");
                System.out.println("2. Scientific calculator");
                System.out.println("Enter choicr (1-2): ");
                int newChoice = sc.nextInt();
                if(newChoice == 2) {
                    scientificCalc();
                    return;
                }
                continue;
            } else if (choice == 10) {
                System.out.println("\nBasic calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View history");
                System.out.println("6. Clear history");
                System.out.println("7. Compare numbers");
                System.out.println("8. Show operation stats");
                System.out.println("9. Switch calculator mode");
                System.out.println("10. Show all operations");
                System.out.println("0. Exit");
                break;
            }

            if (choice >= 1 && choice <= 4 || choice == 7) {
                System.out.print("Enter first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                num2 = sc.nextInt();
                String entry = "";

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        adds++;
                        entry = num1 + "  + " + num2 + " = " + result;
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        subtracts++;
                        entry = num1 + " - " + num2 + " = " + result;
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        multiplies++;
                        entry = num1 + " * " + num2 + " = " + result;
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero");
                        } else {
                            result = (double) num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                            divides++;
                            entry = num1 + " / " + num2 + " = " + result;
                        }
                        break;
                    case 7:
                        if (num1 > num2) {
                            System.out.println(num1 + " is greater than " + num2);
                        } else if (num1 < num2) {
                            System.out.println(num1 + " is less than " + num2);
                        } else {
                            System.out.println(num1 + " is equal to " + num2);
                        }
                        entry = "Comparison: " + num1 + " and " + num2;
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                if (!entry.isEmpty()) {
                    history.add(entry);
                }
            }
        } while (choice != 0);
                }


 public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>history = new ArrayList<>();
        int choice;
        double num1 , num2 , result;

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
            System.out.println("13. Show operations stats");
            System.out.println("0. Exit");

            System.out.println("Choose operations: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;

            } else if (choice == 8) {
                System.out.println("\n----History----");
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
            } else if (choice == 10) {
                System.out.println("\nAvailable operations: 1-13 (see menu)");
            } else if (choice == 11) {
                System.out.print("\nSwitch to (1)Basic or (2)Scientific? ");
                int mode = sc.nextInt();
                if (mode == 1) {
                    basicCalc();
                    return;
                }
            } else if (choice == 13) {
                System.out.println("\n== Operation Statistics ==");
                System.out.println("Additions: " + adds);
                System.out.println("Subtractions: " + subtracts);
                System.out.println("Multiplications: " + multiplies);
                System.out.println("Divisions: " + divides);
                System.out.print("\nPress Enter to continue...");
                sc.nextLine();
                sc.nextLine();
                continue;
            }
            if (choice >= 1 && choice <= 7 || choice == 12) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                num2 = sc.nextDouble();

                String entry = "";

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        adds++;
                        entry = num1 + " + " + num2 + " = " + result;
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        subtracts++;
                        entry = num1 + " - " + num2 + " = " + result;
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        multiplies++;
                        entry = num1 + " * " + num2 + " = " + result;
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                            divides++;
                            entry = num1 + " / " + num2 + " = " + result;
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
                    case 12:
                        if (num1 > num2) {
                            System.out.println(num1 + " is greater than " + num2);
                        } else if (num1 < num2) {
                            System.out.println(num1 + " is less than " + num2);
                        } else {
                            System.out.println(num1 + " is equal to " + num2);
                        }

                        break;
                }
                if (!entry.isEmpty()) {
                    history.add(entry);
                }
            }
        } while (choice != 0);
        }
 }
