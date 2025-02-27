public class simpleoperations2 {


        public static void main(String[] args) {

            // Integer calculations
            int numA = 28;
            int numB = 7;

            System.out.println("Sum: " + (numA + numB));
            System.out.println("Difference: " + (numA - numB));
            System.out.println("Multiplication: " + (numA * numB));
            System.out.println("Division: " + ((double) numA / numB));
            System.out.println("Remainder: " + (numA % numB));

            // String operations
            String str1 = "Coding";
            String str2 = "Java";
            String combined = str1 + " " + str2;

            System.out.println("Combined string: " + combined);
            System.out.println("Length: " + combined.length());
            System.out.println("Uppercase: " + combined.toUpperCase());
            System.out.println("Lowercase: " + combined.toLowerCase());

            // Boolean values
            boolean flag1 = true;
            boolean flag2 = false;

            System.out.println("AND: " + (flag1 && flag2));
            System.out.println("OR: " + (flag1 || flag2));
            System.out.println("NOT flag1: " + (!flag1));

            // Character operations
            char charA = 'Z';
            System.out.println("Character: " + charA);
            System.out.println("Next character: " + (char) (charA - 1));

            // Double and Float operations
            double doubleVal = 3.14159;
            float floatVal = 2.718f;

            System.out.println("Double value: " + doubleVal);
            System.out.println("Float value: " + floatVal);
            System.out.println("Double + Float: " + (doubleVal + floatVal));

        }
    }

