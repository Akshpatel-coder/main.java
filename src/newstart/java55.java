package newstart;

public class java55 {
static void foo(){
    System.out.println("Good morning bro!");
}
static void foo(int a){
    System.out.println(  " Good morning " +  a  +  "  bro!  ");

}
    static void foo(int a, int b) {
        System.out.println(  " Good morning " +  a  +  "  bro!  ");
        System.out.println(  " Good morning " +  b  +  "  bro!  ");

    }   static void foo(int a, int b, int c) {
        System.out.println(  " Good morning " +  a  +  "  bro!  ");
        System.out.println(  " Good morning " +  b  +  "  bro!  ");

    }
    static void change1(int a) {

        a = 98;
    }
    static void change2(int[] arr) {

        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        //  tellJoke();

       // Case 1:   changing the integer
        //   int x = 56;
        //   change(x);
        //   System.out.println("The value of x after running change is: " + x);
        // Case 1:   changing the integer
     //   int[] marks = {54, 56, 54, 67, 55, 44};
      //     change2(marks);
       //    System.out.println("The value of x after running change is: " + marks[0]);
        // method overloading
        foo();
foo(3000);
foo(3000, 4434);
// Arguments are actual!
    }

}