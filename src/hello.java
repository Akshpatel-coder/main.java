public class hello {


        public static void main(String[] args) {

            // This line prints "Hello, World!" to the console.
            System.out.println("Hello, World!");

            // Declaring and initializing some variables.
            int age = 25;
            String name = "Alice";
            double height = 5.8; // Height in feet

            // Printing the values of the variables.
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height: " + height + " feet");

            // A simple if-else statement.
            if (age >= 18) {
                System.out.println(name + " is an adult.");
            } else {
                System.out.println(name + " is a minor.");
            }

            // A simple for loop to print numbers from 1 to 5.
            System.out.println("Numbers from 1 to 5:");
            for (int i = 1; i <= 5; i++) {
                System.out.print(i + " "); //print on same line
            }
            System.out.println(); //move to next line

            // Another example: calculating the area of a rectangle
            int length = 10;
            int width = 5;
            int area = length * width;
            System.out.println("Area of the rectangle: " + area);


        }
    }

