package newstart;


class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
          id= 45;
          name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
          id=myId;
          name = "myName";
    }
     public MyMainEmployee(String myName){
          id=1;
          name = myName;
    }

    public String getName() { return  name;}
    public void setName(String n) {this.name= n;}
    public void setId(int i) {this.id = i;}
    public int getId() {return id;}
}
public class java66 {
    public static void main(String[] args) {
MyMainEmployee aksh = new MyMainEmployee("AkshPatel",47 );
//aksh.setName("AkshPatel");
//aksh.setId(37);
        System.out.println(aksh.getId());
        System.out.println(aksh.getName());
    }
}
