public class functionsandmethods {

    public static int printMyName(String name) {
        System.out.println(name);
        return 0;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.next();

         printMyName(name);
        ;
    }
}
