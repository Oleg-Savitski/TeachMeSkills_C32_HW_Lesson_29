package example_ocp.repository;

import example_ocp.model.RentalCar;

import java.util.ArrayList;
import java.util.List;

public class RentalRepository {
    private final List<RentalCar> rentalCars;

    public RentalRepository() {
        this.rentalCars = new ArrayList<>();
    }

    public void addCar(RentalCar car) {
        rentalCars.add(car);
    }

    public List<RentalCar> getRentalCars() {
        return rentalCars;
    }
}