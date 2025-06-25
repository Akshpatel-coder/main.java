package THREADS;
class MyThread extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000) {
            System.out.println("My Cooking  Thread is Running");
            System.out.println("I am happy!");
            i++;
        }


    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000) {
            System.out.println("Thread 2 is busy with doing his work");
            System.out.println("I am sad! ");
            i++;
        }

    }
}
public class threads {
    public static void main(String[] args) {
MyThread t1 = new MyThread();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();
    }
}
