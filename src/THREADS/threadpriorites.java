package THREADS;



class MyThre extends Thread {
    public MyThre(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        while (true) {
            System.out.println("Thank you " + this.getName());
        //    System.out.println("Thank youuuuuu!");
        }
    }
}
public class threadpriorites {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThre t1 = new MyThre("Akshhhhhhh???!!!!");
        MyThre t2 = new MyThre("Akshhhhhhhhhhh???");
        MyThre t3 = new MyThre("Akshhhhhhhh!!!");
        MyThre t4 = new MyThre("Aksh");
        MyThre t5 = new MyThre("Akshshshsh!!!???(most important");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
