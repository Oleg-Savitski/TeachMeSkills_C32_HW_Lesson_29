package example_lsp.utils;

import example_lsp.model.Car;
import example_lsp.model.Truck;
import example_lsp.model.Vehicle;

public class VehicleUtils {
    public static Vehicle createCar(String licensePlate, String model) {
        return new Car(licensePlate, model);
    }

    public static Vehicle createTruck(String licensePlate, String model) {
        return new Truck(licensePlate, model);
    }
}