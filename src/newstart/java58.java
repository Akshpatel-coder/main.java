package newstart;

public class java58 {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    // sum(n) = 1 + 2 + 3... +n
// sum(n) = 1 + 2 + 3... + n-1 +n
// sum(n) = sum(n-1) +n
    //  sum(3) = 3 + sum(2)
    //  sum(3) = 3 + sum(1)
    //  sum(3) = 3 + 1
    static int sumRec(int n) {
       if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static int fib(int n) {
       /* if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        */
        if(n==1 || n==2) {
            return n-1;
        }
         else {

            return fib(n - 1) + fib(n - 2);
        }
    }


    public static void main(String[] args) {
        // 1
        //   multiplication(9);


        //  2
        //pattern1(7);

        // 3
        //  int c =  sumRec(4);
        //    System.out.println(c);

        // 4
        // fibonacci series - 0, 1, 1, 2, 3 , 5, 8 , 13, 21, 34
     //   int result = fib(5);
     //   System.out.println(result);
    }
}