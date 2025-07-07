package problemTracker;
import java.util.Scanner;

public class calc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n1 , n2;
        int result = 0;

        System.out.println("Welcome to the OOP Calculator!");
        System.out.println("---------------------------------");
        System.out.println("Available operations");
        System.out.println("1. Add");
        System.out.println("2. Substract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");

        System.out.println("\n Enter choise (0-4): ");
        choice = sc.nextInt();

        if(choice == 0) {
            System.out.println("Exiting");
            return;
        }
        System.out.println("Enter first number: ");
        n1 = sc.nextInt();

        System.out.println("Enter second number: ");
        n2 = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You have selected: Addition");
                result = n1 + n2;
                System.out.println("Result:  " + n1 + " + " + n2 + "=" + result);
                break;

            case 2:
                System.out.println("You have selected: Substraction");
                result = n1 - n2;
                System.out.println("Result:  " + n1 + " - " + n2 + "=" + result);
                break;

            case 3:
                System.out.println("You have selected: Multiplication");
                result = n1 * n2;
                System.out.println("Result:  " + n1 + " * " + n2 + "=" + result);
                break;

            case 4:
                System.out.println("You have selected: Division");
                if(n2==0){
                    System.out.println("Error: Cannot divide by zero");
                }else {
                    result = n1 / n2;
                    System.out.println("Result:  " + n1 + " / " + n2 + "=" + result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 0  and 4.");
        }
    }
}
