package THREADS;
class Practice1  extends Thread{
   public  void run(){
        while(true){
            System.out.println("Good Morning!");
        }
    }
}
class Practice2 extends  Thread {
    public void run() {
        while (true) {

            System.out.println("Good Morning");
        }
    }
}
public class practiceqs {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();
        p1.start();
        p2.start();
    }


}
