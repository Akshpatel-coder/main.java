package intererface;
interface Vehicle {
    void start();
    void stop();
}

// Interface Car extends Vehicle (interface inheritance)
interface Car extends Vehicle {
    void accelerate();
    void brake();
}

// A concrete class implementing the child interface
class SportsCar implements Car {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.accelerate();
        sc.brake();
        sc.stop();
    }
}


