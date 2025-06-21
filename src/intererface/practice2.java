package intererface;
class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }

    void bite() {
        System.out.println("Biting...");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        // Optional: add print if needed
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class practice2 {
    public static void main(String[] args) {
        Human aksh1 = new Human();  // ✅ object created inside method
        aksh1.sleep();              // ✅ method call inside main
    }
}

