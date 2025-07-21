package problemTracker;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;


public class calculator10 {



         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int choice;
            int lastResult = 0;
            ArrayList<String> history = new ArrayList<>();

            System.out.println("Welcome to the OOP Calculator!");

            System.out.println("\nChoose calculator type:");
            System.out.println("1. Basic Calculator");

            System.out.println("2. Scientific Calculator");

            System.out.print("\nEnter choice: ");
            int type = getValidIntInput(sc);

            if (type == 1) {
                System.out.println("You have selected: Basic Calculator");

                do {
                    System.out.println("\nAvailable operations:");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Get last result");
                    System.out.println("6. View history");
                    System.out.println("7. Clear history");
                    System.out.println("8. Unit Conversion");
                    System.out.println("0. Exit");

                    System.out.print("\nEnter choice (0-8): ");
                    choice = getValidIntInput(sc);

                    int a, b, result = 0;
                    double conversionResult;

                             switch (choice) {
                        case 1:
                               System.out.println("You have selected: Addition");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a + b;
                            System.out.println("Result: " + a + "+" + b + "=" + result);
                            history.add("Addition: " + a + " + " + b + " = " + result);
                            lastResult = result;
                            break;

                            case 2:
                            System.out.println("You have selected: Subtract");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a - b;
                            System.out.println("Result: " + a + "-" + b + "=" + result);
                            history.add("Subtraction: " + a + " - " + b + " = " + result);
                            lastResult = result;
                            break;



                        case 3:
                            System.out.println("You have selected: Multiply");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a * b;
                            System.out.println("Result: " + a + "*" + b + "=" + result);
                            history.add("Multiplication: " + a + " * " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 4:
                            System.out.println("You have selected: Divide");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            if (b != 0) {
                                result = a / b;
                                System.out.println("Result: " + a + "/" + b + "=" + result);
                                history.add("Division: " + a + " / " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot divide by zero. Please try again.");
                            }
                            break;

                        case 5:
                            System.out.println("Last result: " + lastResult);
                            break;

                        case 6:
                            System.out.println("You have selected: View history");
                            if (history.isEmpty()) {
                                System.out.println("Operation History:\n(No operations yet)");
                            } else {
                                System.out.println("Operation History:");
                                for (int i = 0; i < history.size(); i++) {
                                    System.out.println((i + 1) + ". " + history.get(i));
                                }
                            }
                            break;

                        case 7:
                            System.out.println("You have selected: Clear history");
                            history.clear();
                            System.out.println("Operation history cleared.");
                            break;

                        case 8:
                            System.out.println("You have selected: Unit Conversion");
                            handleBasicUnitConversions(sc, history);
                            break;

                        case 0:
                            System.out.println("You have selected: Exit");
                            System.out.println("Thank you for using the calculator. Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }

                } while (choice != 0);

            } else if (type == 2) {
                System.out.println("You have selected: Scientific Calculator");

                do {
                    System.out.println("\nAvailable operations:");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Power");
                    System.out.println("6. Modulus");
                    System.out.println("7. Square root");
                    System.out.println("8. Get last result");
                    System.out.println("9. View history");
                    System.out.println("10. Clear history");
                    System.out.println("11. Unit Conversion");
                    System.out.println("0. Exit");

                    System.out.print("\nEnter choice (0-11): ");
                    choice = getValidIntInput(sc);

                    int a, b, result = 0;
                    double sqrt;

                    switch (choice) {
                        case 1:
                            System.out.println("You have selected: Add");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a + b;
                            System.out.println("Result: " + a + "+" + b + "=" + result);
                            history.add("Addition: " + a + " + " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 2:
                            System.out.println("You have selected: Subtract");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a - b;
                            System.out.println("Result: " + a + "-" + b + "=" + result);
                            history.add("Subtraction: " + a + " - " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 3:
                            System.out.println("You have selected: Multiply");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            result = a * b;
                            System.out.println("Result: " + a + "*" + b + "=" + result);
                            history.add("Multiplication: " + a + " * " + b + " = " + result);
                            lastResult = result;
                            break;

                        case 4:
                            System.out.println("You have selected: Divide");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            if (b != 0) {
                                result = a / b;
                                System.out.println("Result: " + a + "/" + b + "=" + result);
                                history.add("Division: " + a + " / " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot divide by zero. Please try again.");
                            }
                            break;

                        case 5:
                            System.out.println("You have selected: Power");
                            a = getNumberInput(sc, "Enter base number: ");
                            b = getNumberInput(sc, "Enter exponent: ");
                            result = (int) Math.pow(a, b);
                            System.out.println("Result: " + a + "^" + b + "=" + result);
                            history.add("Power: " + a + "^" + b + " = " + result);
                            lastResult = result;
                            break;

                        case 6:
                            System.out.println("You have selected: Modulus");
                            a = getNumberInput(sc, "Enter first number: ");
                            b = getNumberInput(sc, "Enter second number: ");
                            if (b != 0) {
                                result = a % b;
                                System.out.println("Result: " + a + "%" + b + "=" + result);
                                history.add("Modulus: " + a + " % " + b + " = " + result);
                                lastResult = result;
                            } else {
                                System.out.println("Error: Cannot mod by zero!");
                            }
                            break;

                        case 7:
                            System.out.println("You have selected: Square root");
                            a = getNumberInput(sc, "Enter number: ");
                            if (a >= 0) {
                                sqrt = Math.sqrt(a);
                                System.out.println("Result: sqrt(" + a + ") = " + sqrt);
                                history.add("Square root: sqrt(" + a + ") = " + sqrt);
                                lastResult = (int) sqrt;
                            } else {
                                System.out.println("Error: Negative number");
                            }
                            break;

                        case 8:
                            System.out.println("Last result: " + lastResult);
                            break;

                        case 9:
                            System.out.println("You have selected: View history");
                            if (history.isEmpty()) {
                                System.out.println("Operation History:\n(No operations yet)");
                            } else {
                                System.out.println("Operation History:");
                                for (int i = 0; i < history.size(); i++) {
                                    System.out.println((i + 1) + ". " + history.get(i));
                                }
                            }
                            break;

                        case 10:
                            System.out.println("You have selected: Clear history");
                            history.clear();
                            System.out.println("Operation history cleared.");
                            break;

                        case 11:
                            System.out.println("You have selected: Unit Conversion");
                            handleScientificUnitConversions(sc, history);
                            break;

                        case 0:
                            System.out.println("You have selected: Exit");
                            System.out.println("Thank you for using the calculator. Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }

                } while (choice != 0);
            } else {
                System.out.println("Invalid calculator type!");
            }
        }

        private static void handleBasicUnitConversions(Scanner sc, ArrayList<String> history) {
            int conversionChoice;
            do {
                System.out.println("\nChoose conversion type:");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Meters to Feet");
                System.out.println("3. Pounds to Kilograms");
                System.out.println("4. Miles to Kilometers");
                System.out.println("5. Gallons to Liters");
                System.out.println("0. Return to Main Menu");

                System.out.print("\nEnter choice (0-5): ");
                conversionChoice = getValidIntInput(sc);

                switch (conversionChoice) {
                    case 1:
                        System.out.println("You have selected: Celsius to Fahrenheit");
                        double celsius = getDoubleInput(sc, "Enter temperature in Celsius: ");
                        double fahrenheit = (celsius * 9/5) + 32;
                        System.out.printf("Result: %.1f Celsius = %.1f Fahrenheit%n", celsius, fahrenheit);
                        history.add(String.format("%.1f Celsius = %.1f Fahrenheit", celsius, fahrenheit));
                        break;

                    case 2:
                        System.out.println("You have selected: Meters to Feet");
                        double meters = getDoubleInput(sc, "Enter length in Meters: ");
                        double feet = meters * 3.28084;
                        System.out.printf("Result: %.1f Meters = %.1f Feet%n", meters, feet);
                        history.add(String.format("%.1f Meters = %.1f Feet", meters, feet));
                        break;

                    case 3:
                        System.out.println("You have selected: Pounds to Kilograms");
                        double pounds = getDoubleInput(sc, "Enter weight in Pounds: ");
                        double kilograms = pounds * 0.453592;
                        System.out.printf("Result: %.1f Pounds = %.1f Kilograms%n", pounds, kilograms);
                        history.add(String.format("%.1f Pounds = %.1f Kilograms", pounds, kilograms));
                        break;

                    case 4:
                        System.out.println("You have selected: Miles to Kilometers");
                        double miles = getDoubleInput(sc, "Enter distance in Miles: ");
                        double kilometers = miles * 1.60934;
                        System.out.printf("Result: %.1f Miles = %.1f Kilometers%n", miles, kilometers);
                        history.add(String.format("%.1f Miles = %.1f Kilometers", miles, kilometers));
                        break;

                    case 5:
                        System.out.println("You have selected: Gallons to Liters");
                        double gallons = getDoubleInput(sc, "Enter volume in Gallons: ");
                        double liters = gallons * 3.78541;
                        System.out.printf("Result: %.1f Gallons = %.1f Liters%n", gallons, liters);
                        history.add(String.format("%.1f Gallons = %.1f Liters", gallons, liters));
                        break;

                         case 0:
                        System.out.println("Returning to main menu...");
                        break;

                         default:

                             System.out.println("Invalid choice.");
                }
            } while (conversionChoice != 0);
        }

        private static void handleScientificUnitConversions(Scanner sc, ArrayList<String> history) {
            int conversionChoice;


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

                System.out.print("\nEnter choice (0-10): ");
                conversionChoice = getValidIntInput(sc);

                switch (conversionChoice) {
                    case 1:
                        System.out.println("You have selected: Celsius to Fahrenheit");
                        double celsius = getDoubleInput(sc, "Enter temperature in Celsius: ");
                        double fahrenheit = (celsius * 9/5) + 32;
                        System.out.printf("Result: %.1f Celsius = %.1f Fahrenheit%n", celsius, fahrenheit);
                        history.add(String.format("%.1f Celsius = %.1f Fahrenheit", celsius, fahrenheit));
                        break;

                    case 2:
                        System.out.println("You have selected: Fahrenheit to Celsius");
                        fahrenheit = getDoubleInput(sc, "Enter temperature in Fahrenheit: ");
                        celsius = (fahrenheit - 32) * 5/9;
                        System.out.printf("Result: %.1f Fahrenheit = %.1f Celsius%n", fahrenheit, celsius);
                        history.add(String.format("%.1f Fahrenheit = %.1f Celsius", fahrenheit, celsius));
                        break;

                    case 3:
                        System.out.println("You have selected: Meters to Feet");
                        double meters = getDoubleInput(sc, "Enter length in Meters: ");
                        double feet = meters * 3.28084;
                        System.out.printf("Result: %.1f Meters = %.1f Feet%n", meters, feet);
                        history.add(String.format("%.1f Meters = %.1f Feet", meters, feet));
                        break;

                    case 4:
                        System.out.println("You have selected: Feet to Meters");
                        feet = getDoubleInput(sc, "Enter length in Feet: ");
                        meters = feet / 3.28084;
                        System.out.printf("Result: %.1f Feet = %.1f Meters%n", feet, meters);
                        history.add(String.format("%.1f Feet = %.1f Meters", feet, meters));
                        break;

                    case 5:
                        System.out.println("You have selected: Pounds to Kilograms");
                        double pounds = getDoubleInput(sc, "Enter weight in Pounds: ");
                        double kilograms = pounds * 0.453592;
                        System.out.printf("Result: %.1f Pounds = %.1f Kilograms%n", pounds, kilograms);
                        history.add(String.format("%.1f Pounds = %.1f Kilograms", pounds, kilograms));
                        break;

                    case 6:
                        System.out.println("You have selected: Kilograms to Pounds");
                        kilograms = getDoubleInput(sc, "Enter weight in Kilograms: ");
                        pounds = kilograms / 0.453592;
                        System.out.printf("Result: %.1f Kilograms = %.1f Pounds%n", kilograms, pounds);
                        history.add(String.format("%.1f Kilograms = %.1f Pounds", kilograms, pounds));
                        break;

                          case 7:
                           System.out.println("You have selected: Miles to Kilometers");
                        double miles = getDoubleInput(sc, "Enter distance in Miles: ");
                        double kilometers = miles * 1.60934;
                        System.out.printf("Result: %.1f Miles = %.1f Kilometers%n", miles, kilometers);
                        history.add(String.format("%.1f Miles = %.1f Kilometers", miles, kilometers));
                        break;

                    case 8:
                        System.out.println("You have selected: Kilometers to Miles");
                        kilometers = getDoubleInput(sc, "Enter distance in Kilometers: ");
                        miles = kilometers / 1.60934;
                        System.out.printf("Result: %.1f Kilometers = %.1f Miles%n", kilometers, miles);
                        history.add(String.format("%.1f Kilometers = %.1f Miles", kilometers, miles));
                        break;

                       case 9:
                        System.out.println("You have selected: Gallons to Liters");
                        double gallons = getDoubleInput(sc, "Enter volume in Gallons: ");
                        double liters = gallons * 3.78541;
                        System.out.printf("Result: %.1f Gallons = %.1f Liters%n", gallons, liters);
                        history.add(String.format("%.1f Gallons = %.1f Liters", gallons, liters));
                        break;

                        case 10:
                        System.out.println("You have selected: Liters to Gallons");
                        liters = getDoubleInput(sc, "Enter volume in Liters: ");
                        gallons = liters / 3.78541;
                        System.out.printf("Result: %.1f Liters = %.1f Gallons%n", liters, gallons);
                        history.add(String.format("%.1f Liters = %.1f Gallons", liters, gallons));
                        break;

                    case 0:
                        System.out.println("Returning to main menu...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } while (conversionChoice != 0);
        }

        private static int getValidIntInput(Scanner sc) {
            while (true) {

                try {
                    return sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();
                }
            }
        }

        private static int getNumberInput(Scanner sc, String prompt) {
            while (true) {
                try {
                    System.out.print(prompt);
                    return sc.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();
                }
            }
        }

        private static double getDoubleInput(Scanner sc, String prompt) {
            while (true) {
                try {


                    System.out.print(prompt);
                    return sc.nextDouble();
                } catch (InputMismatchException e) {

                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();
                }
            }

        }
    }

