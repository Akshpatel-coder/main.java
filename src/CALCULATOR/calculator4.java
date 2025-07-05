package CALCULATOR;

import java.util.Scanner;

public class calculator4 {
    public static void main(String[] args) {
        int operator, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

        System.out.println("1-Add \n 2-Substract");
        System.out.println("choose operator");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter first number");
        n1 = sc.nextInt();
        System.out.println("Enter second number");
        n2 = sc.nextInt();
        System.out.println("Enter third number");
        n3 = sc.nextInt();
        System.out.println("Enter forth number");
        n4 = sc.nextInt();
        System.out.println("Enter fifth number");
        n5 = sc.nextInt();
        System.out.println("Enter sixth number");
        n6 = sc.nextInt();
        System.out.println("Enter seventh number");
        n7 = sc.nextInt();
        System.out.println("Enter eigth number");
        n8 = sc.nextInt();
        System.out.println("Enter ninth number");
        n9 = sc.nextInt();
        System.out.println("Enter tenth number");
        n10 = sc.nextInt();

        int result = 0;
        String operation = "";
        String expression = "";


        switch (operator) {
            case 1:
                System.out.println("enter first number");
                result = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
                operation = "Add";
                expression = n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+" + n6 + "+" + n7 + "+" + n8 + "+" + n9 + "+" + n10 + "=" + result;

            break;
            case 2:
                System.out.println("enter first number");
                result = n1 - n2 - n3 - n4 - n5 - n6 - n7 - n8 - n9 - n10;
                operation = "Substract";
                expression = n1 + "-" + n2 + "-" + n3 + "-" + n4 + "-" + n5 + "-" + n6 + "-" + n7 + "-" + n8 + "-" + n9 + "-" + n10 + "=" + result;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("You chose: " + operation + ".");
        System.out.println(expression);
    }
}