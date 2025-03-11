// Define a Vehicle class
public class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize vehicle properties
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to print vehicle details
    public void printVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2019);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 2018);

        // Print vehicle details
        vehicle1.printVehicleDetails();
        System.out.println();
        vehicle2.printVehicleDetails();
        System.out.println();
        vehicle3.printVehicleDetails();
    }
}