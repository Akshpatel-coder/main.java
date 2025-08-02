package ProblemTrackerG;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.ArrayList;

public class CALC66 {
    private static ArrayList<String> favorites = new ArrayList<>();
    private static  String lastOperation = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the OOP Calculator!");
        System.out.println("Enter your username: ");
        String name = sc.nextLine();
        System.out.println("Hello , " + name + "! Lets's start calculating");
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
   public  static void basicCalc() {
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
           System.out.println("7. Show all operations");
           System.out.println("8. Switch calculator  mode");
           System.out.println("9. Mark as favourite");
           System.out.println("10. View favourites");
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

           } else if (choice == 7) {
               System.out.println("\nBasic Calculator operations: ");
               System.out.println("1. Add");
               System.out.println("2. Subtract");
               System.out.println("3. Multiply");
               System.out.println("4. Divide");
               System.out.println("5. View history");
               System.out.println("6. Clear history");
               System.out.println("7. Show all operations");
               System.out.println("8. Switch calculator mode");
               System.out.println("9. ");
               System.out.println("0. Exit");
               continue;
           } else if (choice == 8) {
               System.out.println("\nAvailable calculator modes:");
               System.out.println("1. Basic Calculator");
               System.out.println("2. Scientific Calculator");
               System.out.println("Enter choice (1-2): ");
               int newChoice = sc.nextInt();
               if (newChoice == 2) {
                   scientificCalc();
                   return;

               }
               continue;
           } else if (choice == 9) {
               history.clear();
               System.out.println("History cleared");
               continue;
           } else if (choice == 10) {
               if (!lastOperation.isEmpty()) {
                   favorites.add(lastOperation);
                   System.out.println("Last operation " + lastOperation + " added to favourites!");
               } else {
                   System.out.println("No operation to add to favorites!");
               }
               continue;

           } else if (choice == 12) {
               System.out.println("\nfavorite operations: ");
               if (favorites.isEmpty()) {
                   System.out.println("No favorites yet!");
               } else {
                   for (int i = 0; i < favorites.size(); i++) {
                       System.out.println((i + 1) + ". " + favorites.get(i));
                   }
               }
               continue;
           }

           System.out.println("Enter first number:  ");
           num1 = sc.nextInt();
           System.out.println("Enter second number: ");
           num2 = sc.nextInt();
           String entry = "";

           switch (choice) {
               case 1:
                   result = num1 + num2;
                   System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                   lastOperation = "Add";
                   entry = "Addition:  " + num1 + " + " + num2 + " = " + result;
                   break;

               case 2:
                   result = num1 - num2;
                   System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                   lastOperation = "Subtract";
                   entry = "Subtraction:  " + num1 + " - " + num2 + " = " + result;
                   break;

               case 3:
                   result = num1 * num2;
                   System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                   lastOperation = "Multiply";
                   entry = "Multiplication: " + num1 + " * " + num2 + " = " + result;
                   break;
               case 4:
                   if (num2 == 0) {
                       System.out.println("Error: can't divide by zero");
                       entry = "Divison: Error - Division by zero";

                   } else {
                       result = (double) num1 / num2;
                       System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

                       lastOperation = "Divide";
                       entry = "Division:  " + num1 + " / " + num2 + " = " + result;
                   }
                   break;
               default:
                   System.out.println("Invalid choice!");
           }
           if (!entry.isEmpty()) {
               history.add(entry);

           }

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
                System.out.println("6. Square root");
                System.out.println("7. Modulus");
                System.out.println("8. View history");
                System.out.println("9. Clear history");
                System.out.println("10. Show all operations");
                System.out.println("11. Switch calculator mode");
                System.out.println("12. Mark as favorites");
                System.out.println("13. View favorites");
                System.out.println("0. Exit");

                System.out.println("Enter your choice:  ");
                choice = sc.nextInt();

                if (choice == 0) {
                    System.out.println("Exiting....");
                    break;
                } else if (choice == 9) {
                    System.out.println("\n---history---");
                    if (history.isEmpty()) System.out.println("No history yet");
                    else {
                        for (int i = 0; i < history.size(); i++) {
                            System.out.println((i + 1) + ". " + history.get(i));
                        }
                    }
                    continue;
                } else if (choice == 10) {
                    System.out.println("\nScientific Calculator");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.println("5. Power");
                    System.out.println("6. Square root");
                    System.out.println("7. Modulus");
                    System.out.println("8. View history");
                    System.out.println("9. Clear history");
                    System.out.println("10. Show all operations");
                    System.out.println("11. Mark as favorites");
                    System.out.println("12. View favorites");
                    System.out.println("0. Exit");
                    continue;
                }


                else if (choice == 10) {
                    System.out.println("\nAvailable calculator modes:");
                    System.out.println("1. Basic Calculator");
                    System.out.println("2. Scientific Calculator");
                    System.out.println("Enter choice (1-2): ");
                    int newChoice = sc.nextInt();
                    if (newChoice == 2) {
                        basicCalc();
                        return;

                    }
                    continue;
                } else if (choice == 11) {
                    history.clear();
                    System.out.println("History cleared");
                    continue;
                } else if (choice == 12) {
                    if (!lastOperation.isEmpty()) {
                        favorites.add(lastOperation);
                        System.out.println("Last operation " + lastOperation + " added to favourites!");
                    } else {
                        System.out.println("No operation to add to favorites!");
                    }
                    continue;

                } else if (choice == 13) {
                    System.out.println("\nfavorite operations: ");
                    if (favorites.isEmpty()) {
                        System.out.println("No favorites yet!");
                    } else {
                        for (int i = 0; i < favorites.size(); i++) {
                            System.out.println((i + 1) + ". " + favorites.get(i));
                        }
                    }
                    continue;
                }
                if (choice >= 1 && choice <= 5) {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                } else if (choice >= 6 && choice <= 8) {
                    System.out.print("Enter number:  ");
                    num1 = sc.nextDouble();
                }
                    String entry = "";
                switch (choice){
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        lastOperation = "Add";
                        entry = "Addition: "  + num1 + " + " + num2 + " = " + result;
                        break;

                    case 2:
                        result = num1  - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        lastOperation = "Subtract";
                        entry = "Subtract: " + num1 + " - " + num2 + " = " + result;
                        break;


                    case 3:
                        result = num1 * num2;
                        System.out.println("Result:  " + num1 + " * " + num2  + " = " + result);
                        lastOperation = "Multiply";
                        entry = "Multiply";
                        break;

                    case 4:
                        if (num2 == 0) {
                            System.out.println("Error: can't divide by zero");
                            entry = "Division: Error - Division by zero";
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                            lastOperation = "Divide";
                            entry = "Division: " + num1 + " / " + num2 + " = " + result;
                        }
                        break;

                    case 5:
                        System.out.println("Enter base: ");
                        num1 = sc.nextInt();
                        System.out.println("Enter exponent: ");
                        num2 = sc.nextInt();
                        result = Math.pow(num1, num2);
                        System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                        lastOperation = "Power";
                        entry = "Power:  " + num1 + " ^ " + num2 + " = " + result;
                        break;

                    case 6:
                        System.out.println("Enter number");
                        num1 = sc.nextInt();
                        result = Math.sqrt(num1);
                        System.out.println("Result: sqrt(" + num1 + ") = " + result);
                        lastOperation = "Square root";
                        entry = "Square Root: sqrt(" + num1 + ") = " + result;
                        break;

                    case 7:
                        if(num2 == 0) {
                            System.out.println("Error: cannot modulus by zero");
                            entry = "Modulus: Error - Division by zero";

                        } else {
                            result = num1 % num2;
                            System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                            lastOperation = "Modulus";
                            entry = "Modulus: " + num1 + " % " + num2 + " = " + result;
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                if(!entry.isEmpty()) {
                    history.add(entry);
                }


            } while (choice != 0);
   }
}
