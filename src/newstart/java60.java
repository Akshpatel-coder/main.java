package newstart;

public class java60 {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;  // Base case
        else
            return n * factorial(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        int number = 5; // Change this number to test other values
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);


    }
}