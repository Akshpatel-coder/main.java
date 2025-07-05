package ErrorsandException;

import java.util.Scanner;

public class handlingspecificException {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter te the array index");
        int ind =  sc.nextInt();

        System.out.println("Enter te the number you want to divide the value with");
        int number =  sc.nextInt();
try{
    System.out.println("The value at array index entered is:  " + marks[ind]);
    System.out.println("The value at array-value/number is:  " + marks[ind]/number);
}
catch(Exception e){
    System.out.println("some exception occured!");
    System.out.println(e);
}

    }
}
