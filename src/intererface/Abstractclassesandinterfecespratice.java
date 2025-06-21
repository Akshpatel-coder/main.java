package intererface;
abstract class Pen1 {
    abstract public void write();
    abstract public void refill();
}

abstract class FountainPen extends Pen1 {
    void write1(){
        System.out.println("Write");
    }
    void refill1(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the Nib");
    }
}

public class Abstractclassesandinterfecespratice {
    public static void main(String[] args) {
        FountainPen pen = null;

    }
}

