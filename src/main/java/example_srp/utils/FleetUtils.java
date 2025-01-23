package example_srp.utils;

import example_srp.model.Car;

public class FleetUtils {
    public static Car createCar(String licensePlate, String model, String brand) {
        return new Car(licensePlate, model, brand);
    }
}
