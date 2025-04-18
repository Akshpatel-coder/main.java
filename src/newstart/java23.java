package newstart;
import java.util.Scanner;
public class java23 {

        public static void main(String[] args) {
            // Create a Scanner object for input
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the length of the rectangle
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            // Ask the user for the width of the rectangle
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            // Calculate the area
            double area = length * width;

            // Display the result
            System.out.println("The area of the rectangle is: " + area);

            // Close the Scanner
            scanner.close();
        }
    }

