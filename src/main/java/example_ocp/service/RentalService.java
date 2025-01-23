package example_ocp.service;

import example_ocp.model.RentalCar;

public class RentalService {
    public double calculateTotalCost(RentalCar car, int days) {
        return car.calculateRentalCost(days);
    }
}