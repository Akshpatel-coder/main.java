package THREADS;
class newthreads2 extends Thread{
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println("Thread 1 - Count: " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Mythread2 implements Runnable{
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread 2 - Count: " + i);
            try{
                Thread.sleep(700);
                } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class newthreads {
    public static void main(String[] args) {
       newthreads t1 = new newthreads();
       Mythread2 obj = new Mythread2();
       Thread t2 = new Thread(obj);
       
       t2.start();
       t1.start();

    }

    private void start() {
    }
}
