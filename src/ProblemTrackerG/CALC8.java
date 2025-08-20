package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;

public class CALC8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " ! Let's start calculating");

        System.out.println("Welcome to the OOP Calculator");
        System.out.println("Choose Calculator type: ");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.println("\nEnter your choice: ");

        int calcType = sc.nextInt();

        switch (calcType) {

            case 1:
                System.out.println("You have selected: Basic Calculator");
                basicCalc();
                break;

            case 2:
                System.out.println("You have selected: Scientific Calculator");
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

        do {
            System.out.println("\nAvailable Operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View history");
            System.out.println("6. Clear history");
            System.out.println("7. Show all operations");
            System.out.println("0. Exit");
            System.out.println("\nEnter choice: ");
            choice = sc.nextInt();
             if (choice == 0) {
                System.out.println("You have selected: Exit");
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            } else if (choice == 5) {
                System.out.println("You have  selected: View history");
                System.out.println("Operation History: ");
                if (history.isEmpty()) System.out.println("(No operations yet)");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            } else if (choice == 6) {
                System.out.println("You have selected: Clear history");
                history.clear();
                System.out.println("Operation history cleared");
                continue;

            } else if (choice == 7) {
                System.out.println("You have selected: Show all operations");
                System.out.println("\nAvailable Operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View history");
                System.out.println("6. Clear history");
                System.out.println("7. Show all operations");
                System.out.println("0. Exit");
                continue;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                num2 = sc.nextInt();
            }


            switch (choice) {
                case 1:
                    System.out.println("You have selected: Addition");
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + "+" + num2 + "=" + result);
                    history.add("Addition: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    System.out.println("You have selected: Subtraction");
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + "-" + num2 + "=" + result);
                    history.add("Subtraction: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    System.out.println("You have selected: Multiplication");
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + "*" + num2 + "=" + result);
                    history.add("Multiplication: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    System.out.println("You have selected: Division");
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        history.add("Division: " + num1 + " / " + num2 + " = Error (Division by zero)");
                    } else {

                        result = (double) num1 / num2;
                        System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
                        history.add("Division: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                default:


                    System.out.println("Invalid choice!");
            }


        } while (choice != 0);


    }


    public static void scientificCalc(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0;

        do {
            System.out.println("\nAvailable operations:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square root");
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("0. Exit");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("You have selected: Exit");
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            } else if (choice == 8) {
                System.out.println("You have selected: View history");
                System.out.println("Operation History:");
                if (history.isEmpty()) System.out.println("(No operations yet)");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            } else if (choice == 9) {
                System.out.println("You have selected: Clear history");
                history.clear();
                System.out.println("Operation history cleared.");
                continue;
            }

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                if (choice != 7) {
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                }
            } else if (choice == 7) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("You have selected: Addition");
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + "+" + num2 + "=" + result);
                    history.add("Addition: " + num1 + " + " + num2 + " = " + result);
                    break;

                case 2:
                    System.out.println("You have selected: Subtraction");
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + "-" + num2 + "=" + result);
                    history.add("Subtraction: " + num1 + " - " + num2 + " = " + result);
                    break;

                case 3:
                    System.out.println("You have selected: Multiplication");
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + "*" + num2 + "=" + result);
                    history.add("Multiplication: " + num1 + " * " + num2 + " = " + result);
                    break;

                case 4:
                    System.out.println("You have selected: Division");
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        history.add("Division: " + num1 + " / " + num2 + " = Error (Division by zero)");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + "/" + num2 + "=" + result);
                        history.add("Division: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                case 5:
                    System.out.println("You have selected: Power");
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + "^" + num2 + "=" + result);
                    history.add("Power: " + num1 + "^" + num2 + " = " + result);
                    break;

                case 6:
                    System.out.println("You have selected: Modulus");
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + "%" + num2 + "=" + result);
                    history.add("Modulus: " + num1 + " % " + num2 + " = " + result);
                    break;

                case 7:
                    System.out.println("You have selected: Square root");
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ")=" + result);
                    history.add("Square root: sqrt(" + num1 + ") = " + result);
                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 0);

    }
}