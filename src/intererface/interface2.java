package intererface;
interface Pen {
    void writesmooth();
    void multicolour();
    private void write(){
        System.out.println("Essay");
    }
    default void writeanessay(){
        write();
        System.out.println("My Favourite festival");
    }
}

interface Scale {
    String[] makemeasure();
    void TodrawStraightLine(String makemeasure);
}

class Book {
    void TowWrite(int notes) {
        System.out.println("Writing " + notes);
    }

    void read() {
        System.out.println("reading...");
    }
}

class DigitalBook extends Book implements Scale, Pen {
    // Implementing methods from Pen
    public void writesmooth() {
        System.out.println("Writing smoothly...");
    }

    public void multicolour() {
        System.out.println("Using multicolour pen...");
    }

    // Implementing methods from Scale
    public String[] makemeasure() {
        System.out.println("Asking for Scale");
        System.out.println("Aksh, Arush, Shrey");
        return new String[] {"cm", "inch"};
    }

    public void TodrawStraightLine(String makemeasure) {
        System.out.println("Drawing straight line using: " + makemeasure);
    }
}

public class interface2 {
    public static void main(String[] args) {
     DigitalBook ms = new DigitalBook();
     ms.writeanessay();
     String[] ar = ms.makemeasure();
     for(String item : ar){
         System.out.println(item);
     }
    }
}
