public class mixedoperations {


        public static void main(String[] args) {
            int num1 = 15;
            int num2 = 7;

            int result1 = num1 + num2;
            int result2 = num1 - num2;
            int result3 = num1 * num2;
            int result4 = num1 / num2;
            int result5 = num1 % num2;

            System.out.println("Sum: " + result1);
            System.out.println("Difference: " + result2);
            System.out.println("Product: " + result3);
            System.out.println("Quotient: " + result4);
            System.out.println("Remainder: " + result5);

            double value = 3.14;
            double squared = value * value;
            System.out.println("Value squared: " + squared);

            String str1 = "New ppls ";
            String str2 = "new something";
            String combined = str1 + str2;
            System.out.println(combined);

            boolean check = num1 > num2;
            System.out.println("Num1 > Num2: " + check);

            int counter = 10;
            counter--;
            counter += 3;
            System.out.println("Counter: " + counter);

            String sample = "JavaCode";
            System.out.println("Sample length: " + sample.length());
            System.out.println(sample.substring(0,4)); //example of string function.
        }
    }

