package example_lsp.app;

import example_lsp.model.Vehicle;
import example_lsp.repository.VehicleRepository;
import example_lsp.service.VehicleService;
import example_lsp.utils.VehicleUtils;

/**
 * This program will be a vehicle classification system.
 * The Liskov Substitution Principle will be demonstrated here.
 */
public class Main {
    public static void main(String[] args) {
        VehicleRepository vehicleRepository = new VehicleRepository();
        VehicleService vehicleService = new VehicleService();

        Vehicle car = VehicleUtils.createCar("CAR333", "Honda Civic High");
        Vehicle truck = VehicleUtils.createTruck("TRK777", "Ford F-150");

        vehicleRepository.addVehicle(car);
        vehicleRepository.addVehicle(truck);

        for (Vehicle vehicle : vehicleRepository.getVehicles()) {
            vehicleService.displayVehicleInfo(vehicle);
        }
    }
}