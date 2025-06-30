package trycatchblock;
import java.util.Scanner;

public class trycatchblock {
    public static void main(String[] args) {
        // 1. syntax error (commented out)
        // int a = 5 // Missing semicolon

        // 2. logical error
        int age = 28;
        if (age > 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // 3. Runtime exception example
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number to divide 100 by: ");
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Some other error occurred: " + e);
        }

        // 4. ArrayIndexOutOfBoundsException Example
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        sc.close();
    }
}
