public class simpleoperations {


        public static void main(String[] args) {

            // Integer operations
            int a = 15;
            int b = 7;

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + ((double)a / b)); // Casting to double for accurate division
            System.out.println("a % b = " + (a % b));

            // String manipulation
            String text1 = "Java";
            String text2 = "Programming";
            String combinedText = text1 + " " + text2;

            System.out.println("Combined text: " + combinedText);
            System.out.println("Length of combined text: " + combinedText.length());
            System.out.println("Text in uppercase: " + combinedText.toUpperCase());

            // Boolean logic
            boolean condition1 = true;
            boolean condition2 = false;

            System.out.println("condition1 AND condition2: " + (condition1 && condition2));
            System.out.println("condition1 OR condition2: " + (condition1 || condition2));
            System.out.println("NOT condition1: " + (!condition1));

            //Double and float operations
            double doubleNum = 2.5;
            float floatNum = 1.2f; // 'f' suffix is important for float literals
            System.out.println("Double + Float: " + (doubleNum + floatNum));

            //Character operations
            char char1 = 'A';
            System.out.println("Character: " + char1);
            System.out.println("Character + 1: " + (char)(char1 + 1)); // Type cast back to char
        }
    }

