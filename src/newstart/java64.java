package newstart;

class MyEmployee{
  private   int id;
  private   String name;
  public String getName() {
      return name;
  }

  public void setName(String n){
      name = n;
  }
  public void setId(int i ){
    id = i;
  }
  public int getId() {
      return id;
  }
  }
public class java64 {
    public static void main(String[] args) {
 MyEmployee aksh = new MyEmployee();
    //   aksh.id = 45;
    //   aksh.name = "Akshpatel";
       aksh.setName("AkshPatel" );
        System.out.println(aksh.getName());
  aksh.setId(343);
        System.out.println(aksh.getId());

    }
}
