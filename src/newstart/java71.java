package newstart;
class EkClass{
int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
this.a = a;
}
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructer hoon");
    }
}
public class java71 {
    public static void main(String[] args) {
EkClass e = new EkClass(5);
DoClass d = new DoClass(56);
        System.out.println(e.getA());
    }
}
