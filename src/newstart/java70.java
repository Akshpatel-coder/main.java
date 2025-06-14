package newstart;

class Base1 {
    Base1() {
        System.out.println("I am a constructure");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor with value of a as: "+ a );
    }
}

class Derived1 extends Base1 {
    Derived1() {
      //  super(0);
        System.out.println("I am a derived class constructor");
    }
Derived1(int x, int y){
        super(x);
    System.out.println("I am an overloaded constructor of Derived with value of b as: "+ y);
}
}
class ChildofDerived extends Derived1{
ChildofDerived  (){
    System.out.println("I am a child of derived constructor");
}
ChildofDerived  (int x , int y, int z){
    super(x , y);
    System.out.println("I am an overloaded constructor with value of z as: "+ z);
}
}


public class java70 {
    public static void main(String[] args) {
        // Base1 b = new Base();
      //  Derived1 d = new Derived1();
     //   Derived1 d = new Derived1(14,9);
        ChildofDerived cd  =  new ChildofDerived(12 , 13 , 15);
    }
}
