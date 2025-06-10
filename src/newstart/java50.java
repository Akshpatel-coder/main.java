package newstart;

public class java50 {
    public static void main(String[] args) {
        // Practice problem 1
     //   int n = 4;
     //   for(int i=n; i>0; i--){
     //       for(int j=0; j<i;j++) {
     //           System.out.print("*");
     //       }
     //       System.out.print("\n");

     //   }

        // Practice problem 2
   //  int sum = 0;
   //  int n=4;
   //  for(int i=0; i<n;i++){
   //      sum = sum + (2*i);
   //  }
   //     System.out.println("Sum of even numbers is: ");
   //     System.out.println(sum);

        // Practice problem 3
     // int n = 6;
     // for(int i=1; i<=10; i++) {
     //     System.out.printf("%d  .  %d = %d\n", n,i, n*i);
     // }

        // Practice problem 4
     //   int n = 10;
     //   for(int i=10; i>=1; i-- ){
     //       System.out.printf("%d . %d = %d\n", n,i, n*i);
     //   }

        // Practice problem 5
        int n = 3;
        int i=1;
        int factorial = 1;
        while(i<=n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);

    }
}
