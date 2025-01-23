package example_ocp.model;

public class LuxuryCar extends RentalCar {
    public LuxuryCar(String licensePlate, String model) {
        super(licensePlate, model, 100.0);
    }

    @Override
    public double calculateRentalCost(int days) {
        return baseRate * days * 1.5;
    }
}