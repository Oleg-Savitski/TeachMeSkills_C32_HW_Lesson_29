package example_srp.app;

import example_srp.model.Car;
import example_srp.model.Fleet;
import example_srp.repository.FleetRepository;
import example_srp.service.FleetService;
import example_srp.utils.FleetUtils;

/**
 * This program will be a fleet management system.
 * Demonstration of the principle of unified responsibility.
 */

public class Main {
    public static void main(String[] args) {
        FleetRepository fleetRepository = new FleetRepository();
        Fleet fleet = fleetRepository.getFleet();
        FleetService fleetService = new FleetService(fleet);

        Car car1 = FleetUtils.createCar("ABC123", "Model S", "Tesla");
        Car car2 = FleetUtils.createCar("XYZ789", "Mustang", "Ford");
        Car car3 = FleetUtils.createCar("WZZ341", "Focus", "Ford");

        fleetService.addCarToFleet(car1);
        fleetService.addCarToFleet(car2);
        fleetService.addCarToFleet(car3);
        fleetService.displayFleet();
    }
}
