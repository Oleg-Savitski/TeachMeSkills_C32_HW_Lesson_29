package example_lsp.model;

public class Car extends Vehicle {
    public Car(String licensePlate, String model) {
        super(licensePlate, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car -> " + model + " (License Plate -> " + licensePlate + ")");
    }
}