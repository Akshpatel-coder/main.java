package CALCULATOR;
import java.util.Scanner;
public class calculator2 {
    public static void main(String[] args) {
        int operator , n1, n2 , n3;

        System.out.println("1- Add \n 2-Substract \n 3-Multiply \n 4-Divid");
        System.out.println("choose opertor");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter a fir1st number");
        n1 = sc.nextInt();
        System.out.println("Enter a second number");
        n2 = sc.nextInt();
        System.out.println("Enter a third number");
        n3 = sc.nextInt();


        int result = 0;
        switch(operator){

            case 1:
                result = n1 + n2 + n3;
                break;
            case 2:
                result = n1 -  n2 - n3;
                break;
            case 3:
                result = n1 * n2 * n3;
                break;
            case 4:
                result = n1 / n2 / n3;
                break;
            default:
                System.out.println("You entered unvalid operator");
        }
        System.out.println("Result is "+ result);
    }
}
