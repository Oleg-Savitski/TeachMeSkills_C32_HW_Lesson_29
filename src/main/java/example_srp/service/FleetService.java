package example_srp.service;

import example_srp.model.Car;
import example_srp.model.Fleet;

public class FleetService {
    private final Fleet fleet;

    public FleetService(Fleet fleet) {
        this.fleet = fleet;
    }

    public void addCarToFleet(Car car) {
        fleet.addCar(car);
        System.out.println("Car added -> " + car.getModel() + " (" + car.getLicensePlate() + ")");
    }

    public void displayFleet() {
        System.out.println("Fleet contains ->");
        for (Car car : fleet.getCars()) {
            System.out.println(car.getBrand() + " " + car.getModel() + " - " + car.getLicensePlate());
        }
    }
}