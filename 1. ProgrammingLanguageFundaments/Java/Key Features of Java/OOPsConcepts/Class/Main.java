class Car {
    // Attributes (fields)
    String brand;
    String model;
    int year;

    // Constructor (initializes new objects)
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method (behavior)
    public void displayCarInfo() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating objects from the Car class
        Car myCar = new Car("Mercedes-Benz", "E-Class", 2012);
        Car anotherCar = new Car("BMW", "M3", 2020);

        // Calling method on objects
        myCar.displayCarInfo();
        anotherCar.displayCarInfo();
    }
}