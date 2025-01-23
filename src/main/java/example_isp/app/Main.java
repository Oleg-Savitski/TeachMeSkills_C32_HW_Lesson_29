package example_isp.app;

import example_isp.model.Vehicle;
import example_isp.repository.MaintenanceRepository;
import example_isp.service.MaintenanceService;
import example_isp.service.VehicleMaintenance;
import example_isp.utils.MaintenanceUtils;

/**
 * This program will be a maintenance service.
 * The Interface Segregation Principle will be demonstrated here.
 */
public class Main {
    public static void main(String[] args) {
        MaintenanceRepository maintenanceRepository = new MaintenanceRepository();
        MaintenanceService maintenanceService = new MaintenanceService();

        Vehicle car = MaintenanceUtils.createCar("CAR331", "Honda Civic Wrong");
        Vehicle carTwo = MaintenanceUtils.createCar("CAR111", "Lada Grant");
        Vehicle truck = MaintenanceUtils.createTruck("TRK467", "Ford F-150");
        Vehicle truckTwo = MaintenanceUtils.createTruck("BYK155", "MAZ For-Matic");

        maintenanceRepository.addVehicle(car);
        maintenanceRepository.addVehicle(carTwo);
        maintenanceRepository.addVehicle(truck);
        maintenanceRepository.addVehicle(truckTwo);

        for (Vehicle vehicle : maintenanceRepository.getVehicles()) {
            if (vehicle instanceof VehicleMaintenance) {
                maintenanceService.performMaintenance((VehicleMaintenance) vehicle);
            }
        }
    }
}