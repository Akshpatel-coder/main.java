package newstart;

import javax.imageio.stream.ImageInputStream;



    public class java59 {

            // Recursive function to print stars in a line
            static void printStars(int n) {
                if (n == 0)
                    return;
                System.out.print("*");
                printStars(n - 1);
            }

            // Recursive function to handle rows
            static void printPattern(int n) {
                if (n == 0)
                    return;
                printStars(n);
                System.out.println();
                printPattern(n - 1);
            }

            public static void main(String[] args) {
                int rows = 7;
                printPattern(rows);
            }
        }
