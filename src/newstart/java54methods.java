package newstart;

public class java54methods {
   static  int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else{
            z = (x+y) * 5;
        }
        x = 566;
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
       // java54methods obj = new java54methods();
       // c = obj.logic(a,b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
       c1 = logic(a1, b1);

        System.out.println(c);
        System.out.println(c1);
    }
}