package newstart;
import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        //   int a = 11;
       // if (a = 11) {
//
   //       }
           //question 2
        /*
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println(" Your over all percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulations , you have been promoted");
        }
        else{
            System.out.println("Sorry, You have not beeen promoted! Please try again. ");
        }

         */
        // Question 3
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in  Lakhs per annum");
      float tax = 0;
      float income = sc.nextFloat();
      if(income<=2.5) {
          tax = tax + 0;

      }
      else  if(income>2.5f && income <=5f) {
          tax = tax + 0.05f * (income - 2.5f);
      }
      else   if(income>5f && income<= 10.0f) {
          tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);

          }
      else   if(income>10f) {
          tax = tax + 0.05f * (5.0f - 2.5f);
          tax = tax + 0.2f * (10.0f - 5f);
          tax = tax + 0.3f * (income - 10.0f);
      }
        System.out.println("The total tax paid by the employee is:  " + tax);



         */
        // Question 4
/*
        int day = 7;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thusrsday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");





        }
*/
        // Question 5
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("This id an  organizational website");
        }
         else if(website.endsWith("com")) {
            System.out.println("This is  an Commercial website");
        }
         else if (website.endsWith(".in")) {
            System.out.println("This is an indian website");

        }
      }
    }

