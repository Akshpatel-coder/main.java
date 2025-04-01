import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks for 5 subject (out of 100):");

        System.out.println("subject 1:");
        double subject1 = input.nextDouble();

        System.out.println("subject 2:");
        double subject2 = input.nextDouble();

        System.out.println("subject 3:");
        double subject3 = input.nextDouble();

        System.out.println("subject 4:");
        double subject4 = input.nextDouble();

        System.out.println("subject 5:");
        double subject5 = input.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("percentage:" + percentage+ "%");

        input.close();
    }
}
