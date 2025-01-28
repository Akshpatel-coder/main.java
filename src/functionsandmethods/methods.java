package functionsandmethods;

import java.util.Scanner;

public class methods {
     public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
         int n = sc.nextInt();
         if(n < 0) {
             System.out.println("Invalide Number");
             return;
         }
         int factorial = 1;

         for(int i=n; i>=1; i--) {
             factorial  = factorial * i;

         }
         System.out.println(factorial);
         return;
 }
}


