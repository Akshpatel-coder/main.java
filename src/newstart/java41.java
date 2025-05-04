package newstart;
import java.util.ArrayList;
import java.util.Scanner;
public class java41 {

        public static void main(String[] args) {
            ArrayList<String> tasks = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n=== TO-DO LIST ===");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Delete Task");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline

                if (choice == 1) {
                    System.out.print("Enter task: ");
                    tasks.add(scanner.nextLine());
                    System.out.println("Task added!");
                } else if (choice == 2) {
                    System.out.println("\nYour Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i+1) + ". " + tasks.get(i));
                    }
                } else if (choice == 3) {
                    System.out.print("Enter task number to delete: ");
                    int taskNum = scanner.nextInt();
                    tasks.remove(taskNum-1);
                    System.out.println("Task deleted!");
                } else if (choice == 4) {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                } else {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }

