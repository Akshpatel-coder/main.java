package problemTracker;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

    public class claculator610 {

        static ArrayList<String> history = new ArrayList<>();
        static double lastResult = 0.0;
        static String lastOperation = null;
        static double lastOperand = 0.0;
        static Date sessionStart = new Date();
        static String username = "";

        static int addCount = 0;
        static int subCount = 0;
        static int mulCount = 0;
        static int divCount = 0;
        static int totalOperations = 0;

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
                int mode = getIntInput(sc, 1, 2);
                sc.nextLine();

                if (mode == 1) {
                    basicCalculator(sc);
                } else if (mode == 2) {
                    scientificCalculator(sc);
                }
            }
        }

        static void basicCalculator(Scanner sc) {
            System.out.println("You have selected: Basic Calculator");
            int choice;
            do {
                System.out.println("\nAvailable operations:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View history");
                System.out.println("6. Show Operation Statistics");
                System.out.println("7. Compare numbers");
                System.out.println("8. Show Date/Time");
                System.out.println("0. Exit");
                System.out.print("\nEnter choice (0-8): ");
                choice = getIntInput(sc, 0, 8);
                sc.nextLine();

                switch (choice) {

                    case 1 -> handleAddition(sc);
                    case 2 -> handleSubtraction(sc);
                    case 3 -> handleMultiplication(sc);
                    case 4 -> handleDivision(sc);
                    case 5 -> showHistory(sc);
                    case 6 -> showOperationStatistics(sc);
                    case 7 -> compareNumbers(sc);
                    case 8 -> showDateTime(sc);
                    case 0 -> {
                        System.out.println("Thank you for using the calculator. Goodbye, " + username + "!");
                        return;
                    }
                }
            } while (true);


        }

        static void scientificCalculator(Scanner sc) {
            System.out.println("You have selected: Scientific Calculator");
            int choice;
            do {
                System.out.println("\nAvailable operations:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Square root");
                System.out.println("7. Sine");
                System.out.println("8. Cosine");
                System.out.println("9. View history");
                System.out.println("10. Clear history");
                System.out.println("11. Compare numbers");
                System.out.println("12. Show Date/Time");
                System.out.println("13. Show Operation Statistics");
                System.out.println("0. Exit");
                System.out.print("\nEnter choice (0-13): ");
                choice = getIntInput(sc, 0, 13);
                sc.nextLine();

                switch (choice) {
                    case 1 -> handleAddition(sc);
                    case 2 -> handleSubtraction(sc);
                    case 3 -> handleMultiplication(sc);
                    case 4 -> handleDivision(sc);
                    case 5 -> handlePower(sc);
                    case 6 -> handleSquareRoot(sc);
                     case 7 -> handleSine(sc);
                    case 8 -> handleCosine(sc);
                    case 9 -> showHistory(sc);
                    case 10 -> clearHistory(sc);
                    case 11 -> compareNumbers(sc);
                    case 12 -> showDateTime(sc);
                    case 13 -> showOperationStatistics(sc);
                    case 0 -> {
                        System.out.println("Thank you for using the calculator. Goodbye, " + username + "!");
                        return;
                    }
                }
              } while (true);
        }

        static void handleAddition(Scanner sc) {
            System.out.println("You have selected: Add");
            double a = readNumber("Enter first number: ", sc);
            double b = readNumber("Enter second number: ", sc);
            double result = a + b;
            checkLargeNumber(result);
            System.out.println("Result: " + a + " + " + b + " = " + result);
            saveOperation(username + " - Addition: " + a + " + " + b, result);
            addCount++;
            totalOperations++;
            pressEnterToContinue(sc);
        }

        static void handleSubtraction(Scanner sc) {
            System.out.println("You have selected: Subtract");
            double a = readNumber("Enter first number: ", sc);
            double b = readNumber("Enter second number: ", sc);
            double result = a - b;
            checkLargeNumber(result);
            System.out.println("Result: " + a + " - " + b + " = " + result);
            saveOperation(username + " - Subtraction: " + a + " - " + b, result);
            subCount++;
            totalOperations++;
            pressEnterToContinue(sc);
        }

        static void handleMultiplication(Scanner sc) {
            System.out.println("You have selected: Multiply");
            double a = readNumber("Enter first number: ", sc);
            double b = readNumber("Enter second number: ", sc);
            double result = a * b;
            checkLargeNumber(result);
            System.out.println("Result: " + a + " * " + b + " = " + result);
            saveOperation(username + " - Multiplication: " + a + " * " + b, result);
            mulCount++;
            totalOperations++;
            pressEnterToContinue(sc);
        }

        static void handleDivision(Scanner sc) {
            System.out.println("You have selected: Divide");
            double a = readNumber("Enter first number: ", sc);
            double b = readNumber("Enter second number: ", sc);
            if (b != 0) {
                double result = a / b;
                checkLargeNumber(result);
                System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                 saveOperation(username + " - Division: " + a + " ÷ " + b, result);
                divCount++;
                totalOperations++;
            } else {
                System.out.println("Error: Division by zero is not allowed!");
                System.out.println("Please try again with a non-zero divisor.");
            }
            pressEnterToContinue(sc);
        }

        static void handlePower(Scanner sc) {
            System.out.println("You have selected: Power");
            double base = readNumber("Enter base: ", sc);
            double exp = readNumber("Enter exponent: ", sc);
            double result = Math.pow(base, exp);
            checkLargeNumber(result);
            System.out.println("Result: " + base + "^" + exp + " = " + result);
            saveOperation(username + " - Power: " + base + "^" + exp, result);
            pressEnterToContinue(sc);
        }

        static void handleSquareRoot(Scanner sc) {
            System.out.println("You have selected: Square root");
            double num = readNumber("Enter number: ", sc);
            if (num >= 0) {
                double result = Math.sqrt(num);
                System.out.println("Result: √" + num + " = " + result);
                saveOperation(username + " - Square Root: √" + num, result);
            } else {
                System.out.println("Error: Cannot calculate square root of negative number!");
                System.out.println("Note: For complex numbers, use scientific calculator mode.");
            }
            pressEnterToContinue(sc);
        }

        static void handleSine(Scanner sc) {
            System.out.println("You have selected: Sine");
            double angle = readNumber("Enter angle (degrees): ", sc);
            double result = Math.sin(Math.toRadians(angle));
            System.out.println("Result: sin(" + angle + "°) = " + result);
            saveOperation(username + " - Sine: sin(" + angle + "°)", result);
            pressEnterToContinue(sc);
        }


        static void handleCosine(Scanner sc) {
            System.out.println("You have selected: Cosine");

            double angle = readNumber("Enter angle (degrees): ", sc);
            double result = Math.cos(Math.toRadians(angle));
            System.out.println("Result: cos(" + angle + "°) = " + result);
            saveOperation(username + " - Cosine: cos(" + angle + "°)", result);
            pressEnterToContinue(sc);
    }

        static void checkLargeNumber(double num) {
            if (Math.abs(num) > 1_000_000_000_000_000_000.0) {
                System.out.println("Warning: Result is very large and may not be precise.");
                System.out.println("Result: " + String.format("%.5e", num));
            }
        }

           static double readNumber(String prompt, Scanner sc) {
            while (true) {
                try {
                    System.out.print(prompt);
                    return sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input! Please enter a valid number.");
                    sc.nextLine();


                }
            }
        }

        static int getIntInput(Scanner sc, int min, int max) {
            while (true) {
                try {
                    int input = sc.nextInt();
                    if (input >= min && input <= max) {
                        return input;
                    }

                    System.out.println("Error: Please enter a number between " + min + " and " + max);
                } catch (InputMismatchException e) {
                    System.out.println("Error: Invalid input! Please enter a valid integer.");
                    sc.nextLine();
                }
            }
        }

        static void pressEnterToContinue(Scanner sc) {
            System.out.print("\nPress Enter to continue...");
            sc.nextLine();

        }

        static void saveOperation(String operation, double result) {
            String entry = operation + " = " + result;
            if (Math.abs(result) > 1_000_000_000_000_000_000.0) {
                entry += " (large number warning)";
            }

            history.add(entry);
            lastResult = result;
            lastOperation = operation.split(":")[0];
            lastOperand = result;
        }

        static void showHistory(Scanner sc) {

            if (history.isEmpty()) {
                System.out.println("History is empty.");
            } else {
                System.out.println("\nCalculation History for " + username + ":");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }
            }
            pressEnterToContinue(sc);
        }

        static void clearHistory(Scanner sc) {
            history.clear();
            System.out.println("History cleared for " + username + ".");
            pressEnterToContinue(sc);
        }

        static void showOperationStatistics(Scanner sc) {
            if (totalOperations == 0) {
                System.out.println("\n=== Operation Statistics ===");

                System.out.println("No operations have been performed yet.");
                System.out.println("Start calculating to see your statistics!");
                pressEnterToContinue(sc);
                return;
            }

            long sessionMillis = new Date().getTime() - sessionStart.getTime();

            long minutes = sessionMillis / (60 * 1000);

            double opsPerMinute = (double) totalOperations / Math.max(1, minutes);

            System.out.println("\n=== Operation Statistics ===");

            System.out.println("Total Operations: " + totalOperations);

            System.out.println("\nOperation Breakdown:");

            if (addCount > 0) {
                System.out.printf("- Addition: %d times (%.1f%%)\n", addCount, (addCount*100.0)/totalOperations);

            }
            if (subCount > 0) {
                System.out.printf("- Subtraction: %d times (%.1f%%)\n", subCount, (subCount*100.0)/totalOperations);
            }

            if (mulCount > 0) {
                System.out.printf("- Multiplication: %d times (%.1f%%)\n", mulCount, (mulCount*100.0)/totalOperations);

            }
            if (divCount > 0) {
                System.out.printf("- Division: %d times (%.1f%%)\n", divCount, (divCount*100.0)/totalOperations);
            }

             String mostUsed = "Addition";
            int max = addCount;
            if (subCount > max) { mostUsed = "Subtraction"; max = subCount; }
            if (mulCount > max) { mostUsed = "Multiplication"; max = mulCount; }
            if (divCount > max) { mostUsed = "Division"; }

            StringBuilder leastUsed = new StringBuilder();

            int min = Integer.MAX_VALUE;
            if (addCount > 0 && addCount < min) { min = addCount; leastUsed = new StringBuilder("Addition"); }
            if (subCount > 0 && subCount < min) { min = subCount; leastUsed = new StringBuilder("Subtraction"); }
            else if (subCount > 0 && subCount == min) { leastUsed.append(", Subtraction"); }
            if (mulCount > 0 && mulCount < min) { min = mulCount; leastUsed = new StringBuilder("Multiplication"); }
            else if (mulCount > 0 && mulCount == min) { leastUsed.append(", Multiplication"); }
            if (divCount > 0 && divCount < min) { min = divCount; leastUsed = new StringBuilder("Division"); }
            else if (divCount > 0 && divCount == min) { leastUsed.append(", Division"); }

            System.out.println("\nMost Used Operation: " + mostUsed);
               System.out.println("Least Used Operation: " + leastUsed);
              System.out.printf("Average Operations per Minute: %.1f\n", opsPerMinute);
            System.out.println("\nSession Duration: " + minutes + " minutes");
            pressEnterToContinue(sc);
        }

        static void showDateTime(Scanner sc) {
            Date now = new Date();
            SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

            SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

            long sessionDuration = now.getTime() - sessionStart.getTime();
            long minutes = (sessionDuration / (1000 * 60)) % 60;

            long seconds = (sessionDuration / 1000) % 60;


            System.out.println("\nCurrent Date and Time:");
            System.out.println("Time: " + timeFormat.format(now));
            System.out.println("Date: " + dateFormat.format(now));
            System.out.println("\nSession Information:");
            System.out.println("User: " + username);
            System.out.println("Started: " + timeFormat.format(sessionStart));
            System.out.println("Duration: " + minutes + " minutes " + seconds + " seconds");
            System.out.println("Operations performed: " + history.size());


            pressEnterToContinue(sc);
        }


        static void compareNumbers(Scanner sc) {
            System.out.print("Enter first number: ");
            double a = readNumber("", sc);
            System.out.print("Enter second number: ");
            double b = readNumber("", sc);


            String result;
            if (a > b) result = a + " is greater than " + b;
            else if (a < b) result = a + " is less than " + b;

            else result = a + " is equal to " + b;

            System.out.println("Result: " + result);
            saveOperation(username + " - Comparison: " + result, 0);

            pressEnterToContinue(sc);


        }
    }

