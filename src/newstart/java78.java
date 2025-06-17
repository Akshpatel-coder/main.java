package newstart;
interface Animal {
    void makeSound();
    void eat();
}

interface Bird {
    void makeSound();
    void eat();
}

// Dog implements Animal interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Cat implements Animal interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

// Lion implements Animal interface
class Lion implements Animal {
    public void makeSound() {
        System.out.println("Lion roars");
    }

    public void eat() {
        System.out.println("Lion eats other animals");
    }
}

// Eagle implements Bird interface
class Eagle implements Bird {
    public void makeSound() {
        System.out.println("Eagle screams");
    }

    public void eat() {
        System.out.println("Eagle eats small animals and birds");
    }
}

// Main class
public class java78 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.makeSound();
        a1.eat();

        Animal a2 = new Cat();
        a2.makeSound();
        a2.eat();

        Animal a3 = new Lion();
        a3.makeSound();
        a3.eat(); // fixed this

        Bird b1 = new Eagle();
        b1.makeSound();
        b1.eat();
    }
}
