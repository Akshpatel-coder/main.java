package ProblemTrackerG;
import java.util.ArrayList;
import java.util.Scanner;


class Variablestorage{
private String[] name;
private double[] values;
private int count;
    private Object[] names;

    public Variablestorage() {
    String[] names = new String[100];
    values = new double[100];
    count = 0;
}
    public void set(String name, double value) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                values[i] = value;
                System.out.println("Variable '" + name + "' set to " + value);
                return;
            }
        }
        if (count < names.length) {
            names[count] = name;
            values[count] = value;
            count++;
            System.out.println("Variable '" + name + "' set to " + value);
        } else {
            System.out.println("Storage full! Cannot add more variables.");
        }
    }

    public Double get(String name) {
        for ( int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return values[i];
            }
        }
        return null;
    }

    public void remove(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < count - 1; j++) {
                    names[j] = names[j + 1];
                    values[j] = values[j + 1];
                }
                count--;
                System.out.println("Variable '" + name + "' removed");
                return;
            }
        }
        System.out.println("Variable '" + name + "' not found");
    }

    public void listAll() {
        if (count == 0) {
            System.out.println("No variables stored");
            return;
        }

        System.out.println("Variables:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + names[i] + " = " + values[i]);
        }
    }

    public boolean contains(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }
}




public class CALC73 {
    private static VariableStorage variables = new VariableStorage();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " ! Let's start calculating");
        System.out.println("Welcome to the OOP Calculator");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.println("3. Variable Storage");
        System.out.print("Enter your choice: ");
        int calcType = sc.nextInt();

        switch (calcType) {
            case 1:
                basicCalc();
                break;
            case 2:
                scientificCalc();
                break;
            case 3:
                variableStorage();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void variableStorage() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nVariable Storage Menu!!!");
            System.out.println("1. Set variable ");
            System.out.println("2. Get variable value");
            System.out.println("3. Remove variable");
            System.out.println("4. List all variables  ");
            System.out.println("5. Back to main menu ");
            System.out.println("Enter your choice:  ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter variable name: ");
                    String varName = sc.nextLine();
                    System.out.println("Enter value: ");
                    double value = sc.nextDouble();
                    variables.set(varName, value);
                    break;

                case 2:
                    System.out.println("Enter variable name: ");
                    String getVarName = sc.nextLine();
                    Double varValue = variables.get(getVarName);
                    if (varValue != null) {
                        System.out.println("Value of " + getVarName + " is " + varValue);
                    } else {
                        System.out.println("Variable " + getVarName + " not found ");

                    }
                    break;

                case 3:
                    System.out.println("Enter variable name: ");
                    String removeVarName = sc.nextLine();
                    variables.remove(removeVarName);
                    break;

                case 4:
                    variables.listAll();
                    break;

                case 5:
                    System.out.println("Returning to main menu...");
                    main(new String[]{});
                    return;

                default:
                    System.out.println("Invalid choice!!!");
            }

        } while (choice != 5);

    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        int choice;
        int num1 = 0, num2 = 0;
        double result = 0;


        do {
            System.out.println("\nBasic Calculator operations:  ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Compare numbers");
            System.out.println("6. Switch calculator mode");
            System.out.println("7. Variable Storage");
            System.out.println("8. View history");
            System.out.println("9. Clear history");
            System.out.println("0. Exit");

            System.out.println("Enter your choice:  ");

            choice = sc.nextInt();
            if (choice == 0) {

                System.out.println("Exiting.....");
                break;

            } else if (choice == 6) {

                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.println("3. Variable Storage");
                System.out.print("Enter choice (1-3): ");

                int newChoice = sc.nextInt();
                if (newChoice == 2) {

                    scientificCalc();
                    return;

                } else if (newChoice == 3) {
                    variableStorage();
                    return;

                }
                continue;

            } else if (choice == 7) {
                variableStorage();
                return;
            }
            else if (choice == 8) {
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

            }

            System.out.print("Enter first number: ");
            num1 = sc.nextInt();
            System.out.print("Enter second number: ");
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
                        System.out.println("Error: Can't divide by zero");
                    } else {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    }
                    break;

                case 5:
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
            System.out.println("8. Switch calculator mode");
            System.out.println("9. Compare numbers");
            System.out.println("10. View history");
            System.out.println("11. Clear history");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting....");
                break;

            } else if (choice == 8) {
                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.println("3. Variable Storage");
                System.out.print("Enter choice (1-3): ");
                int newChoice = sc.nextInt();
                if (newChoice == 1) {
                    basicCalc();
                    return;
                } else if (newChoice == 3) {
                    variableStorage();
                    return;
                }
                continue;
            } else if (choice == 10) {
                System.out.println("\n----history----");
                if (history.isEmpty()) System.out.println("No history yet");
                else {
                    for (int i = 0; i < history.size(); i++) {
                        System.out.println((i + 1) + ". " + history.get(i));
                    }
                }
                continue;

            } else if (choice == 11) {
                history.clear();
                System.out.println("History cleared");
                continue;
            }

            if (choice >= 1 && choice <= 6 || choice == 9) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
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
                    result = Math.pow(num1, num2);
                    System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                    break;

                case 6:
                    result = num1 % num2;
                    System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                    break;

                case 7:
                    System.out.print("Enter number: ");
                    num1 = sc.nextDouble();
                    result = Math.sqrt(num1);
                    System.out.println("Result: sqrt(" + num1 + ") = " + result);
                    break;

                case 9:
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
