package newstart;

public class java51arrays {
    public static void main(String[] args) {


        /* float [] marks = {89.5f, 85.7f , 98.2f , 78.8f 85.7f};
          String [] students = {"Harry" , "mahi" , "khaleel" , "jitendra" , "ravindra"};
          System.out.println(students.length);
          System.out.println(students[2]);

         */

        int[] marks = {98, 77, 78, 92, 90};
        // System.out.println(marks.length);
        System.out.println("Printing using for Naive Way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        // Displaying the Array (for loop)
         System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop in revrese order");
            for (int i = marks.length - 1; i >=0; i--) {
            System.out.println(marks[i]);
        }
            for(int element: marks){
                System.out.println(element);
            }
    }
}
