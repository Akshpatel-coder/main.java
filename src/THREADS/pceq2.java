package THREADS;

class Practice3 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Timez!");
        }
    }
}
class Practice4 extends Thread {
    /*
    public void run() {
        while (false) {
            System.out.println("Good Timez!");
        }


    }

     */
}
public class pceq2 {
    public static void main(String[] args) {
        Practice3 p1 = new Practice3();
        Practice4 p2 = new Practice4();
      //  p1.setPriority(6);
      //  p2.setPriority(6);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
    //    p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
