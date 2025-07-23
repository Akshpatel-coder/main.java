   import java.util.Scanner;
public class ProblemtrackerG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int n1, n2;
        int result = 0;

        System.out.println("Welcome to the OOP Calculator!");
        System.out.println("------------------------------");
        System.out.println("Available Operations");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Exit");

        System.out.println("\n Enter Choice(0-4): ");
        choice = sc.nextInt();

        switch (choice) {
            case 0:
            System.out.println("Exiting");
            return;

            case 1:
                System.out.println("You have selected: Addition");
                break;

            case 2:
                System.out.println("You have selected: Subtraction");
                break;

            case 3:
                System.out.println("You have selected: Multiplications");
                break;

            case 4:
                System.out.println("You have selected: Division");
                break;

            default:
                System.out.println("Invalid choice!");
                return;


        }

        System.out.println("Enter First number: ");
        n1 = sc.nextInt();

        System.out.println("Enter Second number: ");
        n2 = sc.nextInt();

        switch (choice) {
            case 1:
                result = n1 + n2;
                System.out.println("result: " + n1 + "+" + n2 + " = " + result) ;
                break;

            case 2:
                result = n1 - n2;
                System.out.println("result : " + n1 + " - " + n2 + " = " + result);
                break;


            case 3:
                result= n1 * n2;
                System.out.println("result: " + n1 + "*" + n2 +  " = " + result);
                break;

            case 4:
                if(n2 == 0){
                    System.out.println("Error: Can't divide by zero!");
                } else{
                    result = n1 / n2;
                    System.out.println("result: " + n1 + "/" + n2 + " = " + result);
                }
                break;

        }
    }

    }


