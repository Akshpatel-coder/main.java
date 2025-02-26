public class simpledataoperations {


        public static void main(String[] args) {

            // Integer variables
            int value1 = 25;
            int value2 = 10;
            int result;

            // Basic calculations
            result = value1 + value2;
            System.out.println("Sum: " + result);

            result = value1 - value2;
            System.out.println("Difference: " + result);

            result = value1 * value2;
            System.out.println("Product: " + result);

            double divisionResult = (double) value1 / value2;
            System.out.println("Division: " + divisionResult);

            // String operations
            String firstName = "John";
            String lastName = "Doe";
            String fullName = firstName + " " + lastName;

            System.out.println("Full Name: " + fullName);
            System.out.println("Length: " + fullName.length());
            System.out.println("Uppercase: " + fullName.toUpperCase());

            // Boolean values
            boolean isTrue = true;
            boolean isFalse = false;

            System.out.println("Is True: " + isTrue);
            System.out.println("Is False: " + isFalse);
            System.out.println("Logical AND: " + (isTrue && isFalse));
            System.out.println("Logical OR: " + (isTrue || isFalse));
            System.out.println("Logical NOT: " + (!isTrue));

            //Character values
            char myChar = 'G';
            System.out.println("Character: " + myChar);

            //Double and float values
            double doubleValue = 3.1415;
            float floatValue = 2.718f;

            System.out.println("Double value: " + doubleValue);
            System.out.println("Float value: " + floatValue);
            System.out.println("Double + Float: " + (doubleValue + floatValue));
        }
    }

