public class simplecalculations {


        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            double quotient = (double) num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);

            double radius = 3.5;
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            System.out.println("Radius: " + radius);
            System.out.println("Area of circle: " + area);
            System.out.println("Circumference of circle: " + circumference);

            int a = 7;
            int b = 12;
            int temp = a;
            a = b;
            b = temp;

            System.out.println("After swap:");
            System.out.println("a: " + a);
            System.out.println("b: " + b);

            int value = 15;
            if (value % 2 == 0) {
                System.out.println(value + " is even.");
            } else {
                System.out.println(value + " is odd.");
            }
        }
    }

