package example_isp.utils;

import example_isp.model.Car;
import example_isp.model.Truck;
import example_isp.model.Vehicle;

public class MaintenanceUtils {
    public static Vehicle createCar(String licensePlate, String model) {
        return new Car(licensePlate, model);
    }

    public static Vehicle createTruck(String licensePlate, String model) {
        return new Truck(licensePlate, model);
    }
}