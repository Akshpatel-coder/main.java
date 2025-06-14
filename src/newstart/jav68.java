package newstart;

import javax.swing.*;

class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

     public void printme(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
public class jav68 {
    public static void main(String[] args) {
      Derived  b = new  Derived();
      b.setX(4);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setY(8);
        System.out.println(d.getY());
    }
}
