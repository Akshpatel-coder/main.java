package newstart;
class One {}
    class Phone {
        public void greet() {
            System.out.println("Good Morning");
        }

        public void on() {
            System.out.println("Turning on SmartPhone");
        }
    }

    class SmartPhone extends Phone {
        public void music() {
            System.out.println("Turning on SmartPhone... ");
        }

        public void name() {
            System.out.println("My name is Java in Class two");
        }
    }

    public class java73Dynamic {
        public static void main(String[] args) {
          //  Phone obj = new Phone();
          // SmartPhone smobj = new SmartPhone();
           // obj.name();

            Phone obj = new SmartPhone();
            //SmartPhone obj2 =  new Phone();

            obj.greet();
            obj.on();
           // obj.music(); Not Allowed

        }
    }
