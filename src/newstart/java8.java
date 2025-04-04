package newstart;
import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics Marks :");
        int physics = scan.nextInt();
        System.out.println("Enter your English Marks :");
        int english = scan.nextInt();
        System.out.println("Enter your Chemistry Marks :");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Maths Marks :");
        int maths = scan.nextInt();
        System.out.println("Enter your computer Marks :");
        int computer = scan.nextInt();

        float percentage = ((physics + english + chemistry + maths + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
