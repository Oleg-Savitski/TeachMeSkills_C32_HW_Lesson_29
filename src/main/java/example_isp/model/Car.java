package example_isp.model;

import example_isp.service.VehicleMaintenance;

public class Car extends Vehicle implements VehicleMaintenance {
    public Car(String licensePlate, String model) {
        super(licensePlate, model);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance on car -> " + model);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car -> " + model + " (License Plate -> " + licensePlate + ")");
    }
}