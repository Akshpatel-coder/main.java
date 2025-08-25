package ProblemTrackerG;

import java.util.ArrayList;
import java.util.Scanner;

public class CALC10 {
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
            System.out.println("9. Unit Conversion");
            System.out.println("10. Show all operation");
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
                unitConversionBasic(history);
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
                System.out.println("9. Unit Conversion");
                System.out.println("10. Show all operation");
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
                    entry = num1 + " + " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 2:

                    result = num1 - num2;
                    entry = num1 + " - " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 3:
                    result = num1 * num2;
                    entry = num1 + " * " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 4:

                    if (num2 == 0) {
                        System.out.println("Error: Can't divide by zero");
                    } else {
                        result = num1 / num2;
                        entry = num1 + " / " + num2 + " = " + result;
                        System.out.println("Result: " + entry);
                    }
                    break;

                case 7:

                    if (num1 > num2)
                        entry = num1 + " is greater than " + num2;
                    else if (num1 < num2)
                        entry = num1 + " is less than " + num2;
                    else
                        entry = num1 + " is equal to " + num2;
                    System.out.println("Result: " + entry);
                    break;
            }
            history.add(entry);
        } while (choice != 0);
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
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("10. Show all operations");
            System.out.println("11. Switch calculator mode");
            System.out.println("12. Compare numbers");
            System.out.println("13. Unit Conversion");
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
                System.out.println("13. Unit Conversion");
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
                unitConversionScientific(history);
                continue;

            }

            if (choice >= 1 && choice <= 6 || choice == 12) {
                System.out.println("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.println("Enter second number: ");
                num2 = sc.nextDouble();

            }
            String entry = "";
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    entry = num1 + " + " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 2:
                    result = num1 - num2;
                    entry = num1 + " - " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 3:
                    result = num1 * num2;
                    entry = num1 + " * " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: can't divide by zero");
                    } else {
                        result = num1 / num2;
                        entry = num1 + " / " + num2 + " = " + result;
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
                    System.out.println("Result: " + entry);
                    break;

                case 6:
                    result = num1 % num2;
                    entry = num1 + " % " + num2 + " = " + result;
                    System.out.println("Result: " + entry);
                    break;

                case 7:
                    System.out.println("Enter number");
                    num1 = sc.nextInt();
                    result = Math.sqrt(num1);
                    entry = "sqrt(" + num1 + ") = " + result;
                    System.out.println("Result: " + entry);
                    break;
                case 12:
                    if (num1 > num2) {
                        entry = num1 + " is greater than " + num2;
                    } else if (num1 < num2) {
                        entry = num1 + " is less than " + num2;
                    } else {
                        entry = num1 + " is equal to " + num2;
                    }
                    System.out.println("Result: " + entry);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            history.add(entry);
        } while (choice != 0);

    }


    public static void unitConversionBasic(ArrayList<String> history) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {

            System.out.println("\nChoose conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Meters to Feet");
            System.out.println("3. Pounds to Kilograms");
            System.out.println("4. Miles to Kilometers");
            System.out.println("5. Gallons to Liters");
            System.out.println("0. Return to Main Menu");

            choice = sc.nextInt();

            double input, result;
            String entry = "";

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    input = sc.nextDouble();
                    result = (input * 9 / 5) + 32;
                    entry = input + " Celsius = " + result + " Fahrenheit";
                    System.out.println("Result: " + entry);
                    break;

                case 2:
                    System.out.print("Enter length in Meters: ");
                    input = sc.nextDouble();
                    result = input * 3.28084;
                    entry = input + " Meters = " + result + " Feet";
                    System.out.println("Result: " + entry);
                    break;

                case 3:
                    System.out.print("Enter weight in Pounds: ");
                    input = sc.nextDouble();
                    result = input * 0.453592;
                    entry = input + " Pounds = " + result + " Kilograms";
                    System.out.println("Result: " + entry);
                    break;

                case 4:


                    System.out.print("Enter distance in Miles: ");
                    input = sc.nextDouble();
                    result = input * 1.60934;
                    entry = input + " Miles = " + result + " Kilometers";
                    System.out.println("Result: " + entry);
                    break;

                case 5:

                    System.out.print("Enter volume in Gallons: ");
                    input = sc.nextDouble();
                    result = input * 3.78541;
                    entry = input + " Gallons = " + result + " Liters";
                    System.out.println("Result: " + entry);
                    break;

                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid number.");
            }

            if (!entry.isEmpty()) history.add(entry);

        } while (choice != 0);

    }

    public static void unitConversionScientific(ArrayList<String> history) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Meters to Feet");
            System.out.println("4. Feet to Meters");
            System.out.println("5. Pounds to Kilograms");
            System.out.println("6. Kilograms to Pounds");
            System.out.println("7. Miles to Kilometers");
            System.out.println("8. Kilometers to Miles");
            System.out.println("9. Gallons to Liters");
            System.out.println("10. Liters to Gallons");
            System.out.println("0. Return to Main Menu");

            choice = sc.nextInt();
            double input, result;
            String entry = "";


            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    input = sc.nextDouble();
                    result = (input * 9 / 5) + 32;
                    entry = input + " Celsius = " + result + " Fahrenheit";
                    System.out.println("Result: " + entry);
                    break;

                case 2:

                    System.out.print("Enter temperature in Fahrenheit: ");
                    input = sc.nextDouble();
                    result = (input - 32) * 5 / 9;
                    entry = input + " Fahrenheit = " + result + " Celsius";
                    System.out.println("Result: " + entry);
                    break;

                case 3:

                    System.out.print("Enter length in Meters: ");
                    input = sc.nextDouble();
                    result = input * 3.28084;
                    entry = input + " Meters = " + result + " Feet";
                    System.out.println("Result: " + entry);
                    break;

                case 4:
                    System.out.print("Enter length in Feet: ");
                    input = sc.nextDouble();
                    result = input * 0.3048;
                    entry = input + " Feet = " + result + " Meters";
                    System.out.println("Result: " + entry);
                    break;

                case 5:
                    System.out.print("Enter weight in Pounds: ");
                    input = sc.nextDouble();
                    result = input * 0.453592;
                    entry = input + " Pounds = " + result + " Kilograms";
                    System.out.println("Result: " + entry);
                    break;

                case 6:
                    System.out.print("Enter weight in Kilograms: ");
                    input = sc.nextDouble();
                    result = input * 2.20462;
                    entry = input + " Kilograms = " + result + " Pounds";
                    System.out.println("Result: " + entry);
                    break;

                case 7:
                    System.out.print("Enter distance in Miles: ");
                    input = sc.nextDouble();
                    result = input * 1.60934;
                    entry = input + " Miles = " + result + " Kilometers";
                    System.out.println("Result: " + entry);
                    break;

                case 8:

                    System.out.print("Enter distance in Kilometers: ");
                    input = sc.nextDouble();
                    result = input * 0.621371;
                    entry = input + " Kilometers = " + result + " Miles";
                    System.out.println("Result: " + entry);
                    break;

                case 9:

                    System.out.print("Enter volume in Gallons: ");
                    input = sc.nextDouble();
                    result = input * 3.78541;
                    entry = input + " Gallons = " + result + " Liters";
                    System.out.println("Result: " + entry);
                    break;

                case 10:

                    System.out.print("Enter volume in Liters: ");
                    input = sc.nextDouble();
                    result = input * 0.264172;
                    entry = input + " Liters = " + result + " Gallons";
                    System.out.println("Result: " + entry);
                    break;

                case 0:

                    System.out.println("Returning to main menu...");
                    break;
                default:

                    System.out.println("Invalid input. Please enter a valid number.");
            }
            if (!entry.isEmpty()) history.add(entry);
        } while (choice != 0);
    }
}
