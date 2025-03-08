public class Student {



        private String name;
        private int age;
        private double gpa;

        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getGpa() {
            return gpa;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("GPA: " + gpa);
        }

        public static void main(String[] args) {
            Student student1 = new Student("John Doe", 20, 3.5);
            Student student2 = new Student("Jane Doe", 22, 3.8);

            student1.displayInfo();
            System.out.println();
            student2.displayInfo();
        }
    }

