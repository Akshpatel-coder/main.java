package newstart;
// Parent Class (Super Class)
class Animal {
    // Encapsulation: private fields with public getter
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Method to be overridden (Polymorphism)
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child Class (Subclass using Inheritance)
class Dog extends Animal {

    // Constructor using super keyword
    public Dog(String name) {
        super(name);
    }

    // Method Overriding (Polymorphism)
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks.");
    }
}

// Main class
public class java69 {
    public static void main(String[] args) {
        // Creating an object of Dog (Polymorphism)
        Animal myDog = new Dog("Tommy");

        // Calling method
        myDog.makeSound();  // Output: Tommy barks.
    }
}
