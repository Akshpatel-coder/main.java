package ProblemTrackerG;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class PriorityItem<T> {
    private T item;
    int priority;
     long counter;

    public PriorityItem(T item, int priority, long counter) {
        this.item = item;
        this.priority = priority;
        this.counter = counter;
    }

    public T getItem() {
        return item;
    }

    public int getPriority() {
        return priority;
    }
}

class PriorityQueue<T> {
    private ArrayList<PriorityItem<T>> queue = new ArrayList<>();
    private long counter = 0;

    public void enqueue(T item, int priority) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        PriorityItem<T> newItem = new PriorityItem<>(item, priority, counter++);
        int pos = 0;
        for (; pos < queue.size(); pos++) {
            PriorityItem<T> existing = queue.get(pos);
            if (newItem.priority > existing.priority ||
                    (newItem.priority == existing.priority && newItem.counter < existing.counter)) {
                break;
            }
        }
        queue.add(pos, newItem);
    }

    public PriorityItem<T> dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return queue.remove(0);
    }

    public PriorityItem<T> peek() {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Queue is empty");
        }
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

class Operation {
    private String type;
    private double num1, num2;

    public Operation(String type, double num1, double num2) {
        this.type = type;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String execute() {
        double result = 0;
        String resStr = "";
        switch (type) {
            case "add":
                result = num1 + num2;
                resStr = num1 + " + " + num2 + " = " + result;
                break;
            case "subtract":
                result = num1 - num2;
                resStr = num1 + " - " + num2 + " = " + result;
                break;
            case "multiply":
                result = num1 * num2;
                resStr = num1 + " * " + num2 + " = " + result;
                break;
            case "divide":
                if (num2 == 0) {
                    resStr = "Error: Division by zero for " + num1 + " / " + num2;
                } else {
                    result = num1 / num2;
                    resStr = num1 + " / " + num2 + " = " + result;
                }
                break;
            case "power":
                result = Math.pow(num1, num2);
                resStr = num1 + " ^ " + num2 + " = " + result;
                break;
            case "modulus":
                result = num1 % num2;
                resStr = num1 + " % " + num2 + " = " + result;
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                resStr = "sqrt(" + num1 + ") = " + result;
                break;
            case "compare":
                String comp;
                if (num1 > num2) comp = " is greater than ";
                else if (num1 < num2) comp = " is less than ";
                else comp = " is equal to ";
                resStr = num1 + comp + num2;
                break;
        }
        return resStr;
    }
}

public class CALC71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Welcome to the OOP Calculator");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.print("Enter your choice: ");
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
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            sc.close();
        }
    }

    public static void basicCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        PriorityQueue<Operation> pq = new PriorityQueue<>();
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
            System.out.println("9. Schedule priority operation");
            System.out.println("10. Process priority queue");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
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
                System.out.print("Enter choice (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 2) {
                    scientificCalc();
                    return;
                }
                continue;

            } else if(choice == 9) {
                System.out.println("Select operation to schedule: ");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("7. Compare numbers");
                int opChoice = sc.nextInt();
                String opType = "";
                switch (opChoice) {
                    case 1: opType = "add"; break;
                    case 2: opType = "subtract"; break;
                    case 3: opType = "multiply"; break;
                    case 4: opType = "divide"; break;
                    case 7: opType = "compare"; break;
                    default:
                        System.out.println("Invalid operation");
                        continue;
                }
                System.out.print("Enter first number: ");
                double n1 = sc.nextDouble();
                double n2 = 0;
                if (!opType.equals("compare")) {
                    System.out.print("Enter second number: ");
                    n2 = sc.nextDouble();
                }
                System.out.print("Enter priority (1-5, 5 highest): ");
                int pri = sc.nextInt();
                pq.enqueue(new Operation(opType, n1, n2), pri);
                System.out.println("Operation scheduled.");
                continue;
            } else if (choice == 10) {
                if (pq.isEmpty()) {
                    System.out.println("No operations in priority queue.");
                } else {
                    System.out.println("Processing priority queue...");
                    while (!pq.isEmpty()) {
                        PriorityItem<Operation> item = pq.dequeue();
                        String res = item.getItem().execute();
                        System.out.println(res + " (priority " + item.getPriority() + ")");
                    }
                }
                continue;
            }

            if (choice >= 1 && choice <= 4 || choice == 7) {
                System.out.print("Enter first number: ");
                num1 = sc.nextInt();
                System.out.print("Enter second number: ");
                num2 = sc.nextInt();
            }

            if (choice >= 1 && choice <= 4) {
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
                            System.out.println("Error: Can't divide by zero for " + num1 + " / " + num2);
                        } else {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                }
            } else if (choice == 7) {
                String comp;
                if (num1 > num2) comp = " is greater than ";
                else if (num1 < num2) comp = " is less than ";
                else comp = " is equal to ";
                System.out.println("Result: " + num1 + comp + num2);
            } else {
                System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }

    public static void scientificCalc() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        PriorityQueue<Operation> pq = new PriorityQueue<>();
        int choice;
        double num1 =0 , num2 = 0, result = 0;

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
            System.out.println("10. Switch calculator mode");
            System.out.println("11. Compare numbers");
            System.out.println("12. Schedule priority operation");
            System.out.println("13. Process priority queue");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting....");
                break;
            }else if (choice == 8) {
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

            }  else if (choice == 10) {
                System.out.println("\nAvailable calculator modes: ");
                System.out.println("1. Basic Calculator");
                System.out.println("2. Scientific Calculator");
                System.out.print("Enter choice (1-2): ");
                int newChoice = sc.nextInt();
                if (newChoice == 1) {
                    basicCalc();
                    return;

                }
                continue;

            } else if (choice == 12) {

                System.out.println("Select operation to schedule:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. Power");
                System.out.println("6. Modulus");
                System.out.println("7. Square root");
                System.out.println("12. Compare numbers");
                int opChoice = sc.nextInt();
                String opType = "";
                switch (opChoice) {
                    case 1: opType = "add"; break;
                    case 2: opType = "subtract"; break;
                    case 3: opType = "multiply"; break;
                    case 4: opType = "divide"; break;
                    case 5: opType = "power"; break;
                    case 6: opType = "modulus"; break;
                    case 7: opType = "sqrt"; break;
                    case 12: opType = "compare"; break;
                    default:
                        System.out.println("Invalid operation");
                        continue;
                }
                System.out.print("Enter first number: ");
                double n1 = sc.nextDouble();
                double n2 = 0;
                if (!opType.equals("sqrt")) {
                    System.out.print("Enter second number: ");
                    n2 = sc.nextDouble();
                }
                System.out.print("Enter priority (1-5, 5 highest): ");
                int pri = sc.nextInt();
                pq.enqueue(new Operation(opType, n1, n2), pri);
                System.out.println("Operation scheduled.");
                continue;
            } else if (choice == 13) {
                if (pq.isEmpty()) {
                    System.out.println("No operations in priority queue.");
                } else {
                    System.out.println("Processing priority queue...");
                    while (!pq.isEmpty()) {
                        PriorityItem<Operation> item = pq.dequeue();
                        String res = item.getItem().execute();
                        System.out.println(res + " (priority " + item.getPriority() + ")");
                    }
                }
                     continue;
            }

            if (choice >= 1 && choice <= 6 || choice == 11) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            } else if (choice == 7) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
            }

            if (choice >= 1 && choice <= 6) {
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
                            System.out.println("Error: can't divide by zero for " + num1 + " / " + num2);
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

                }
            } else if (choice == 7) {
                result = Math.sqrt(num1);
                System.out.println("Result: sqrt(" + num1 + ") = " + result);

            } else if (choice == 12) {
                String comp;
                if (num1 > num2) comp = " is greater than ";
                else if (num1 < num2) comp = " is less than ";
                else comp = " is equal to ";
                System.out.println("Result: " + num1 + comp + num2);

               } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }
}
