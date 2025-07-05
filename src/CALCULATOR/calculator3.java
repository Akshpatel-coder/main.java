package CALCULATOR;

 import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args) {
        int operator, n1 , n2;

        System.out.println("1-Add \n 2-Substract ");
        System.out.println("choose operator");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter a first number");
        n1 = sc.nextInt();
       System.out.println("Enter a second number");
        n2 = sc.nextInt();

        int result = 0;

        switch(operator){

            case 1 :
                result = n1 + n2;
                break;

            default:
                System.out.println("Invalid operator!");
        }
        System.out.println("Result: " + result);


    }
    }

