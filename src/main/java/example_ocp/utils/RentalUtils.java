package example_ocp.utils;

import example_ocp.model.EconomyCar;
import example_ocp.model.LuxuryCar;
import example_ocp.model.RentalCar;

public class RentalUtils {
    public static RentalCar createEconomyCar(String licensePlate, String model) {
        return new EconomyCar(licensePlate, model);
    }

    public static RentalCar createLuxuryCar(String licensePlate, String model) {
        return new LuxuryCar(licensePlate, model);
    }
}