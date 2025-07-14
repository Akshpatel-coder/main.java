package problemTracker;

import java.util.*;

public class Calculaor66 {

        static String username;
        static String lastOperation = null;
        static double lastOperand = 0.0;
        static double lastResult = 0.0;

        static final ArrayList<String> history = new ArrayList<>();
        static final LinkedHashSet<String> favorites = new LinkedHashSet<>();

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to the OOP Calculator!");
            System.out.print("Enter your username: ");
            username = sc.nextLine();
            System.out.println("Hello, " + username + "! Let's start calculating.");

            while (true) {
                System.out.println("\nChoose calculator type:");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.print("\nEnter choice: ");
                int mode = sc.nextInt();
                sc.nextLine();

                if (mode == 1) runBasicCalculator(sc);
                else if (mode == 2) runScientificCalculator(sc);
                else System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        static void runBasicCalculator(Scanner sc) {
            int choice;
            do {
                showBasicMenu();
                choice = sc.nextInt();
                sc.nextLine();
                double a, b, result;

                switch (choice) {
                    case 1 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a + b;
                        displayResult(a + " + " + b + " = " + result, "Add");
                    }
                    case 2 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a - b;
                        displayResult(a + " - " + b + " = " + result, "Subtract");
                    }
                    case 3 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a * b;
                        displayResult(a + " * " + b + " = " + result, "Multiply");
                    }
                    case 4 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        if (b != 0) {
                            result = a / b;
                            displayResult(a + " ÷ " + b + " = " + result, "Divide");
                        } else System.out.println("Oops! Division by zero isn’t allowed.");
                    }
                    case 5 -> showHistory();
                    case 6 -> clearHistory();
                    case 7 -> compareNumbers(sc);
                    case 8 -> repeatOperation(sc);
                    case 11 -> markFavorite();
                    case 12 -> viewFavorites(sc);
                    case 0 -> {
                        exitProgram();
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } while (true);
        }

        static void runScientificCalculator(Scanner sc) {
            int choice;
            do {
                showScientificMenu();
                choice = sc.nextInt();
                sc.nextLine();
                double a, b, result;

                switch (choice) {
                    case 1 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a + b;
                        displayResult(a + " + " + b + " = " + result, "Add");
                    }
                    case 2 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a - b;
                        displayResult(a + " - " + b + " = " + result, "Subtract");
                    }
                    case 3 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        result = a * b;
                        displayResult(a + " * " + b + " = " + result, "Multiply");
                    }
                    case 4 -> {
                        a = readNumber("Enter first number: ", sc);
                        b = readNumber("Enter second number: ", sc);
                        if (b != 0) {
                            result = a / b;
                            displayResult(a + " ÷ " + b + " = " + result, "Divide");
                        } else System.out.println("Oops! Division by zero isn’t allowed.");
                    }
                    case 5 -> {
                        a = readNumber("Enter base number: ", sc);
                        b = readNumber("Enter exponent: ", sc);
                        result = Math.pow(a, b);
                        displayResult(a + " ^ " + b + " = " + result, "Power");
                    }
                    case 6 -> {
                        a = readNumber("Enter number: ", sc);
                        result = Math.sqrt(a);
                        displayResult("√" + a + " = " + result, "Square root");
                    }
                    case 7 -> {
                        a = readNumber("Enter angle in degrees: ", sc);
                        result = Math.sin(Math.toRadians(a));
                        displayResult("sin(" + a + "°) = " + result, "Sine");
                    }
                    case 8 -> {
                        a = readNumber("Enter angle in degrees: ", sc);
                        result = Math.cos(Math.toRadians(a));
                        displayResult("cos(" + a + "°) = " + result, "Cosine");
                    }
                    case 9 -> showHistory();
                    case 10 -> clearHistory();
                    case 11 -> compareNumbers(sc);
                    case 11+1 -> markFavorite(); // 12
                    case 11+2 -> viewFavorites(sc); // 13
                    case 0 -> {
                        exitProgram();
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } while (true);
        }

        static double readNumber(String prompt, Scanner sc) {
            System.out.print(prompt);
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("last")) {
                System.out.println("Using last result: " + lastResult);
                return lastResult;
            }
            return Double.parseDouble(input);
        }

        static void displayResult(String resultLine, String opName) {
            System.out.println("Result: " + resultLine);
            String entry = "[" + username + "] " + opName + ": " + resultLine;
            history.add(entry);
            lastResult = Double.parseDouble(resultLine.replaceAll("[^\\d.\\-]+$", "").split(" ")[0]);
            lastOperation = opName;
            lastOperand = lastResult;
        }

        static void showHistory() {
            System.out.println("You have selected: View history");
            if (history.isEmpty()) {
                System.out.println("History is empty.");
            } else {
                System.out.println(username + "'s Operation History:");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }
            }
        }

        static void clearHistory() {
            System.out.println("You have selected: Clear history");
            history.clear();
            System.out.println("History cleared.");
        }

        static void compareNumbers(Scanner sc) {
            double a = readNumber("Enter first number: ", sc);
            double b = readNumber("Enter second number: ", sc);
            String result;
            if (a > b) result = a + " is greater than " + b;
            else if (a < b) result = a + " is less than " + b;
            else result = a + " is equal to " + b;
            System.out.println("Result: " + result);
            history.add("[" + username + "] Comparison: " + result);
        }

        static void markFavorite() {
            if (lastOperation == null) {
                System.out.println("No operation performed yet. Please perform an operation first, then mark it as favorite.");
            } else if (favorites.contains(lastOperation)) {
                System.out.println("'" + lastOperation + "' is already in your favorites list.");
            } else {
                favorites.add(lastOperation);
                System.out.println("Last operation '" + lastOperation + "' has been added to your favorites!");
            }
        }

        static void viewFavorites(Scanner sc) {
            System.out.println("You have selected: View favorites");
            if (favorites.isEmpty()) {
                System.out.println("You haven't marked any operations as favorites yet.");
                System.out.println("Perform an operation, then select 'Mark as favorite' to add it.");
                return;
            }
            List<String> list = new ArrayList<>(favorites);
            System.out.println(username + "'s Favorite Operations:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ". " + list.get(i));
            }

            System.out.print("\nEnter choice (1-" + list.size() + "): ");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch < 1 || ch > list.size()) {
                System.out.println("Invalid choice.");
                return;
            }

            String selectedOp = list.get(ch - 1);
            System.out.println("You have selected: " + selectedOp + " (from favorites)");

            switch (selectedOp) {
                case "Add" -> {
                    double a = readNumber("Enter first number: ", sc);
                    double b = readNumber("Enter second number: ", sc);
                    double result = a + b;
                    displayResult(a + " + " + b + " = " + result, "Add");
                }
                case "Square root" -> {
                    double a = readNumber("Enter number: ", sc);
                    double result = Math.sqrt(a);
                    displayResult("√" + a + " = " + result, "Square root");
                }
                case "Power" -> {
                    double a = readNumber("Enter base number: ", sc);
                    double b = readNumber("Enter exponent: ", sc);
                    double result = Math.pow(a, b);
                    displayResult(a + " ^ " + b + " = " + result, "Power");
                }
                case "Cosine" -> {
                    double a = readNumber("Enter angle in degrees: ", sc);
                    double result = Math.cos(Math.toRadians(a));
                    displayResult("cos(" + a + "°) = " + result, "Cosine");
                }
                default -> System.out.println("Operation not implemented for favorite use.");
            }
        }

        static void repeatOperation(Scanner sc) {
            if (lastOperation == null) {
                System.out.println("Error: No previous operation to repeat.");
                return;
            }
            System.out.print("Enter number of repetitions: ");
            int reps = sc.nextInt();
            sc.nextLine();
            double result = 0;
            for (int i = 1; i <= reps; i++) {
                result = performOperation(result, lastOperand, lastOperation);
                System.out.println("Repetition " + i + ": Result = " + result);
                history.add(lastOperation + ": (repeated) → " + result);
            }
            lastResult = result;
        }

        static double performOperation(double res, double val, String op) {
            return switch (op) {
                case "Add" -> res + val;
                case "Subtract" -> res - val;
                case "Multiply" -> res * val;
                case "Divide" -> val != 0 ? res / val : res;
                default -> res;
            };
        }

        static void showBasicMenu() {
            System.out.println("\nAvailable operations:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.println("5. View history\n6. Clear history");
            System.out.println("7. Compare numbers\n8. Repeat last operation");
            System.out.println("11. Mark as favorite\n12. View favorites");
            System.out.println("0. Exit");
            System.out.print("\nEnter choice (0-12): ");
        }

        static void showScientificMenu() {
            System.out.println("\nAvailable operations:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            System.out.println("5. Power\n6. Square root\n7. Sine\n8. Cosine");
            System.out.println("9. View history\n10. Clear history\n11. Compare numbers");
            System.out.println("12. Mark as favorite\n13. View favorites");
            System.out.println("0. Exit");
            System.out.print("\nEnter choice (0-13): ");
        }

        static void exitProgram() {
            System.out.println("You have selected: Exit");
            System.out.println("Thanks for calculating, " + username + "! Your favorites have been saved.");
        }
    }


