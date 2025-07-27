package ProblemTrackerG;
import java.util.ArrayList;
import java.util.Scanner;
public class CALC5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        int num1, num2;
        double result = 0, lastResult = 0;

        do {
            System.out.println("\nBasic Calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Get last result");
            System.out.println("6. Show all operations");
            System.out.println("7. view history");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator....");
                break;
            } else if (choice == 5) {
                System.out.println("Last Result : " + lastResult);
                break;
            } else if (choice == 6) {
                System.out.println("\nBasic Calculator operations: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5, Get last result");
                System.out.println("6. Show all operations");
                System.out.println("7. view history");
                System.out.println("0. Exit");
                continue;
            } else if (choice == 7) {
                System.out.println("\n----History----");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;
            }

            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter second number");
            num2 = sc.nextInt();
            String entry = " ";

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

                    } else {
                        result = num1 / num2;
                        System.out.println("Result : " + num1 + " / " + num2 + " = " + result);

                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }


            history.add(entry);
            lastResult = result;

        } while (choice != 0);
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        double num1 = 0, num2 = 0, result = 0, lastResult = 0;


        do {
            System.out.println("\nScientific Calculator operations: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Modulus");
            System.out.println("7. Square Root");
            System.out.println("8. Get last result");
            System.out.println("9. Show all operations");
            System.out.println("10. View history");
            System.out.println("0. Exit");

            System.out.println("Enter your choice");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting Calculator....");
                break;
            } else if (choice == 8) {
                System.out.println("Last Result: " + lastResult);
                break;
            } else if (choice == 9) {
                System.out.println("\nScietific Calculator operations");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Modulus");
                System.out.println("7. Square Root");
                System.out.println("8. Get last result");
                System.out.println("9. Show all operations");
                System.out.println("10. View history");
                System.out.println("0. Exit");
                continue;

            } else if (choice == 10) {
                System.out.println("\n---History---");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }

                }
                continue;

            }
            String entry = "";
            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                num2 = sc.nextDouble();
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
                        System.out.println("Error: Cant divide by zero");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);

                    }
                    break;
                case 5:
                    System.out.println("Enter base: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter exponent: ");
                    num2 = sc.nextInt();
                    result = Math.pow(num1, num2);
                    break;

                case 6:
                    System.out.println("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter second number: ");
                    num2 = sc.nextInt();
                    result = num1 % num2;
                    System.out.println("Result : " + num1 + " % " + num2 + " = " + result);
                    break;

                case 7:
                    System.out.println("Enter number");
                    num1 = sc.nextInt();
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ") = " + result);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            history.add(entry);
            lastResult = result;
        } while (choice != 0);
    }
}

