package example_lsp.model;

public class Truck extends Vehicle {
    public Truck(String licensePlate, String model) {
        super(licensePlate, model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck -> " + model + " (License Plate -> " + licensePlate + ")");
    }
}