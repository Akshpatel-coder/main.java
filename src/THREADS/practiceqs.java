package THREADS;
class Practice1  extends Thread{
   public  void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("good morning ");
        }


        }
    }

class Practice2 extends  Thread {
    public void run() {
        while (true) {
try{
    Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("welcome ");
        }
    }
}
public class practiceqs {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();
        p1.setPriority(6);
        p2.setPriority(6);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
      //  p1.start();
      //  p2.start();
    }


}
