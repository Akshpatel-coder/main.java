package newstart;
import java.util.Scanner;
public class java39 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Fahrenheit to Celsius Converter");
            System.out.println("-------------------------------");

            // Get Fahrenheit input
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();

            // Convert to Celsius
            double celsius = (fahrenheit - 32) * 5/9;

            // Display result
            System.out.printf("%.1f°F = %.1f°C", fahrenheit, celsius);

            input.close();
        }
    }
