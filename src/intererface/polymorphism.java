package intererface;
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Cow moos");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // Polymorphic array of Animal interface
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        // Polymorphic behavior: all use same method name, different output
        for (Animal a : animals) {
            a.makeSound();  // actual method called depends on object type
        }
    }
}

