package example_ocp.model;

public class EconomyCar extends RentalCar {
    public EconomyCar(String licensePlate, String model) {
        super(licensePlate, model, 30.0);
    }

    @Override
    public double calculateRentalCost(int days) {
        return baseRate * days;
    }
}