import java.util.*;

public class Main {

   public static void printMyName(String name) {
      System.out.println(name);
      return ;
   }
   public static void main(String args[]) {
      Scanner sc=new Scanner();
      String name = sc.next();

      printMyName(name);//call kiya function ko

   }
}
