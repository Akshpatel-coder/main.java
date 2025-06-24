package vscode;
class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Calculator: Your result is: " + (a + b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Scientific Calculator: Your result is: " + (a + b));
    }
}

class HyCalculator {
    public void calculate(int a, int b) {
        int sum = a + b;
        System.out.println("Hybrid Calculator: Your result is: " + sum);
        System.out.println("Hybrid Calculator: sin(" + sum + ") = " + Math.sin(sum));
    }
}

public class ex1 {
    public static void main(String[] args) {
        System.out.println("I am main method!!");

        int a = 10;
        int b = 5;

        Calculator basic = new Calculator();
        basic.calculate(a, b);

        ScCalculator sci = new ScCalculator();
        sci.calculate(a, b);

        HyCalculator hybrid = new HyCalculator();
        hybrid.calculate(a, b);
    }
}
