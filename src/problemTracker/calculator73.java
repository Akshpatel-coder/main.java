package problemTracker;
import java.util.HashMap;
import java.util.Scanner;
public class calculator73 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            HashMap<String, Integer> variables = new HashMap<>();

            System.out.println("Welcome to the Calculator!");
            System.out.println("...");

            while (true) {
                System.out.println("\nVariable menu:");
                System.out.println("1. Set variable");
                System.out.println("2. Get variable value");
                System.out.println("3. Remove variable");
                System.out.println("4. List all variables");
                System.out.println("5. Back to main menu");

                System.out.print("\nEnter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter variable name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter value: ");
                        int value = scanner.nextInt();
                        scanner.nextLine();
                        variables.put(name, value);
                        System.out.println("Variable '" + name + "' set to " + value);
                        break;

                    case 2:
                        System.out.print("Enter variable name: ");
                        String getName = scanner.nextLine();
                        if (variables.containsKey(getName)) {
                            System.out.println("Value of '" + getName + "' is " + variables.get(getName));
                        } else {
                            System.out.println("Variable '" + getName + "' not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter variable name: ");
                        String removeName = scanner.nextLine();
                        if (variables.containsKey(removeName)) {
                            variables.remove(removeName);
                            System.out.println("Variable '" + removeName + "' removed.");
                        } else {
                            System.out.println("Variable '" + removeName + "' not found.");
                        }
                        break;

                    case 4:
                        System.out.println("Variables:");
                        for (String var : variables.keySet()) {
                            System.out.println("- " + var + " = " + variables.get(var));
                        }
                        break;

                    case 5:
                        System.out.println("Returning to main menu...");
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }


