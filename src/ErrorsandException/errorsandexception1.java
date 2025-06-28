package ErrorsandException;


import java.util.Scanner;

public class errorsandexception1 {
    public static void main(String[] args) {
        // Example: adding two numbers
        // int a = 5;
        // int b = 9;
        // System.out.println(a + b);

        System.out.println(2);

        // Corrected loop
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // Scanner and division logic
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number to divide 1000 by: ");
            int k = sc.nextInt();
            System.out.println("Integer part of 1000 divided by k is " + 1000 / k);
        } catch (ArithmeticException e) {

        }

        sc.close();
    }
}
