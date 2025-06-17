package newstart;

class Circle {
    public int radius;

    Circle(int r ){
        System.out.println("I am circle perameterized constructor");
        this.radius = r;
    }


    public double area() {
        return Math.PI * this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
   Cylinder1(int r,int  h) {
         super(r);
       System.out.println("I am cylinder1 parameterized constructor");
       this.height = h;
   }
   public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class java75 {
    public static void main(String[] args) {
 // Circle objc = new Circle(12);
Cylinder1 obj = new Cylinder1(12 , 4);
    }

}
