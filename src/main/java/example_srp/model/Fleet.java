package example_srp.model;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private final List<Car> cars;

    public Fleet() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}