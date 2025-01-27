package functionsandmethods;

public class methodsandfunctions {
    public static int calculateSum(int  a, int b) {
        int sum =a + b;
    return  sum;
}
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of 2 numbers is : "+sum);



    }
}


