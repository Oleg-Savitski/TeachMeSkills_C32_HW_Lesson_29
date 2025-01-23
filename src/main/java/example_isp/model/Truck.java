package example_isp.model;

import example_isp.service.VehicleMaintenance;

public class Truck extends Vehicle implements VehicleMaintenance {
    public Truck(String licensePlate, String model) {
        super(licensePlate, model);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on truck -> " + model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck -> " + model + " (License Plate -> " + licensePlate + ")");
    }
}