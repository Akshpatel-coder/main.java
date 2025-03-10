
    // Employee.java

    public class Employee {
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getSalary() {
            return salary;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }

        public static void main(String[] args) {
            Employee emp1 = new Employee("John Doe", 30, 50000);
            Employee emp2 = new Employee("Jane Doe", 25, 60000);

            System.out.println("Employee 1 Information:");
            emp1.displayInfo();

            System.out.println("\nEmployee 2 Information:");
            emp2.displayInfo();
        }
    }

