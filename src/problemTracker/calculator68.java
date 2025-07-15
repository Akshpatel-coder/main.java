
   package problemTracker;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
 import java.util.Date;


    public class calculator68 {


            static ArrayList<String> history = new ArrayList<>();
             static double lastResult = 0.0;
            static String lastOperation = null;
            static double lastOperand = 0.0;
            static Date sessionStart = new Date();
            static String username = "";

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to the OOP Calculator!");

                // Get username
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

                    if (mode == 1) {
                        basicCalculator(sc);
                    } else if (mode == 2) {
                        scientificCalculator(sc);
                    } else {
                        System.out.println("Invalid choice. Please enter 1 or 2.");
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
                    System.out.println("6. Clear history");
                    System.out.println("7. Compare numbers");
                    System.out.println("8. Show Date/Time");
                    System.out.println("0. Exit");
                    System.out.print("\nEnter choice (0-8): ");
                    choice = sc.nextInt();
                    sc.nextLine();

                    switch (choice) {


                        case 1 -> {
                            System.out.println("You have selected: Add");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a + b;
                            System.out.println("Result: " + a + " + " + b + " = " + result);
                            saveOperation(username + " - Addition: " + a + " + " + b, result);
                        }

                        case 2 -> {
                            System.out.println("You have selected: Subtract");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a - b;
                            System.out.println("Result: " + a + " - " + b + " = " + result);
                            saveOperation(username + " - Subtraction: " + a + " - " + b, result);
                        }

                        case 3 -> {
                            System.out.println("You have selected: Multiply");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a * b;
                            System.out.println("Result: " + a + " * " + b + " = " + result);
                            saveOperation(username + " - Multiplication: " + a + " * " + b, result);
                        }

                        case 4 -> {
                            System.out.println("You have selected: Divide");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            if (b != 0) {
                                double result = a / b;
                                System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                                saveOperation(username + " - Division: " + a + " ÷ " + b, result);
                            } else {
                                System.out.println("Oops! Division by zero isn't allowed.");


                            }
                        }
                        case 5 -> {
                            System.out.println("You have selected: View history");
                            showHistory();
                        }
                        case 6 -> {
                            System.out.println("You have selected: Clear history");
                            clearHistory();
                        }
                        case 7 -> {
                            System.out.println("You have selected: Compare numbers");
                            compareNumbers(sc);
                        }
                        case 8 -> {
                            System.out.println("You have selected: Show Date/Time");
                            showDateTime();
                        }
                        case 0 -> {
                            System.out.println("Thank you for using the calculator. Goodbye, " + username + "!");
                            return;


                        }
                        default -> System.out.println("Invalid choice. Please try again.");
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
                    System.out.println("0. Exit");
                    System.out.print("\nEnter choice (0-12): ");
                    choice = sc.nextInt();
                    sc.nextLine();

                       switch (choice) {
                        case 1 -> {
                            System.out.println("You have selected: Add");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a + b;
                            System.out.println("Result: " + a + " + " + b + " = " + result);
                            saveOperation(username + " - Addition: " + a + " + " + b, result);


                        }
                        case 2 -> {
                            System.out.println("You have selected: Subtract");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a - b;
                            System.out.println("Result: " + a + " - " + b + " = " + result);
                            saveOperation(username + " - Subtraction: " + a + " - " + b, result);


                        }
                        case 3 -> {
                            System.out.println("You have selected: Multiply");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            double result = a * b;
                            System.out.println("Result: " + a + " * " + b + " = " + result);
                            saveOperation(username + " - Multiplication: " + a + " * " + b, result);
                        }
                        case 4 -> {
                            System.out.println("You have selected: Divide");
                            double a = readNumber("Enter first number: ", sc);
                            double b = readNumber("Enter second number: ", sc);
                            if (b != 0) {
                                double result = a / b;
                                System.out.println("Result: " + a + " ÷ " + b + " = " + result);
                                saveOperation(username + " - Division: " + a + " ÷ " + b, result);
                            } else {
                                System.out.println("Oops! Division by zero isn't allowed.");
                            }
                        }
                        case 5 -> {
                            System.out.println("You have selected: Power");
                            double base = readNumber("Enter base: ", sc);
                            double exp = readNumber("Enter exponent: ", sc);
                            double result = Math.pow(base, exp);
                            System.out.println("Result: " + base + "^" + exp + " = " + result);
                            saveOperation(username + " - Power: " + base + "^" + exp, result);

                        }
                        case 6 -> {
                            System.out.println("You have selected: Square root");
                            double num = readNumber("Enter number: ", sc);
                            double result = Math.sqrt(num);
                            System.out.println("Result: √" + num + " = " + result);
                            saveOperation(username + " - Square Root: √" + num, result);
                        }
                        case 7 -> {
                            System.out.println("You have selected: Sine");
                            double angle = readNumber("Enter angle (degrees): ", sc);
                            double result = Math.sin(Math.toRadians(angle));
                            System.out.println("Result: sin(" + angle + "°) = " + result);
                            saveOperation(username + " - Sine: sin(" + angle + "°)", result);
                        }
                        case 8 -> {
                            System.out.println("You have selected: Cosine");
                            double angle = readNumber("Enter angle (degrees): ", sc);
                            double result = Math.cos(Math.toRadians(angle));
                            System.out.println("Result: cos(" + angle + "°) = " + result);
                            saveOperation(username + " - Cosine: cos(" + angle + "°)", result);
                        }
                        case 9 -> {
                            System.out.println("You have selected: View history");
                            showHistory();
                        }
                        case 10 -> {
                            System.out.println("You have selected: Clear history");

                            clearHistory();
                        }
                        case 11 -> {
                            System.out.println("You have selected: Compare numbers");
                            compareNumbers(sc);

                        }
                        case 12 -> {
                            System.out.println("You have selected: Show Date/Time");
                            showDateTime();
                        }
                        case 0 -> {
                            System.out.println("Thank you for using the calculator. Goodbye, " + username + "!");
                            return;
                        }
                        default -> System.out.println("Invalid choice. Please try again.");
                    }
                } while (true);
            }

            static void showDateTime() {
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

                System.out.print("\nPress Enter to continue...");
                new Scanner(System.in).nextLine();
            }


            static double readNumber(String prompt, Scanner sc) {
                System.out.print(prompt);
                return sc.nextDouble();
            }

            static void saveOperation(String operation, double result) {
                history.add(operation + " = " + result);
                lastResult = result;
                lastOperation = operation.split(":")[0];
                lastOperand = result;
            }

            static void showHistory() {
                if (history.isEmpty()) {
                    System.out.println("History is empty.");
                    return;
                }
                System.out.println("\nCalculation History for " + username + ":");
                for (int i = 0; i < history.size(); i++) {
                    System.out.println((i + 1) + ". " + history.get(i));
                }
            }

            static void clearHistory() {
                history.clear();
                System.out.println("History cleared for " + username + ".");
            }

            static void compareNumbers(Scanner sc) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();


                String result;
                if (a > b) result = a + " is greater than " + b;
                else if (a < b) result = a + " is less than " + b;
                else result = a + " is equal to " + b;

                System.out.println("Result: " + result);
                saveOperation(username + " - Comparison: " + result, 0);

            }


        }