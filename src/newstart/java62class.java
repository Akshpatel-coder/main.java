package newstart;

class Employee1{
    int id;
    int salary;
    String name;
     public void printingDetails() {
         System.out.println("My id is " + id);
         System.out.println("My salary  is " + salary);
         System.out.println("And my name is "+ name);
     }
    // public int getSalary() {
    //     return  salary;
 //     }
}

public class java62class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 Aksh = new Employee1();
        Employee1 Alex = new Employee1();
        // Setting Attributes for Aksh
        Aksh.id = 12;
        Aksh.salary = 80;
        Aksh.name = "AkshPatel";

        // Setting Attribute for Alex
        Alex.id = 19;
        Alex.salary = 50;
        Alex.name = "AlexWarner";


        // Printing the Attributes
        Aksh.printingDetails();
        Alex.printingDetails();
      //  int salary = Aksh.getSalary();
      //  System.out.println(salary);
      //  System.out.println(Aksh.id);
      //  System.out.println(Aksh.name);

    }
}
