package CALCULATOR;

import java.util.Scanner;

public class newcalculatorr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operator, totalNumbers;

        System.out.println("1-Add \n2-Subtract");
        System.out.println("Choose operator:");
        operator = sc.nextInt();

        System.out.println("How many numbers do you want to use?");
        totalNumbers = sc.nextInt();

        int[] numbers = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        int result = 0;
        String operation = "";
        String expression = "";

        switch (operator) {
            case 1:
                result = 0;
                operation = "Add";
                for (int i = 0; i < totalNumbers; i++) {
                    result += numbers[i];
                    expression += numbers[i];
                    if (i < totalNumbers - 1) {
                        expression += " + ";
                    }
                }
                expression += " = " + result;
                break;

            case 2:
                result = numbers[0];
                operation = "Subtract";
                expression += numbers[0];
                for (int i = 1; i < totalNumbers; i++) {
                    result -= numbers[i];
                    expression += " - " + numbers[i];
                }
                expression += " = " + result;
                break;

            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("You chose: " + operation + ".");
        System.out.println(expression);
    }
}
