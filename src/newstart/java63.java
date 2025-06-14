package newstart;


import java.awt.*;

class Employee {
int salary;
String name;
public int getSalary() {
    return salary;
}
public String getName(){
    return name;
}
public void setName(String n){
    name =n;
   }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing........");
    }
    public void vibrate(){
        System.out.println("Vibrating........");
    }
    public void callFriend(){
        System.out.println("Calling a  fate........");
    }


}

class Square{
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter() {
return 4*side;
    }

}
class Johny{
    public void hit() {
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on  the enemy");
    }
}
class  Rectangle{
    private int length;
    private  int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(final int length, final int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}
public class java63 {


    public static void main(String[] args) {
        /*
        //  1
      Employee aksh = new Employee();
      aksh.setName("AkshPatel!?");
      aksh.salary = 555;
        System.out.println(aksh.getSalary());
        System.out.println(aksh.getName());

        // 2
        CellPhone s25edge = new CellPhone();
        s25edge.callFriend();
        s25edge.vibrate();
      //  s25edge.ring();


         */
// 3
        /*
        Square sq = new Square();
        sq.side = 3 ;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        // 4
      Johny player1 = new Johny();
      player1.fire();
      player1.run();
      player1.hit();


         */
        Rectangle r = new Rectangle();
    }
}
