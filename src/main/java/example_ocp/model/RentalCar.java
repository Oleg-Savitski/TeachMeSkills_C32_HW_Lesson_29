package example_ocp.model;

public abstract class RentalCar {
    protected String licensePlate;
    protected String model;
    protected double baseRate;

    public RentalCar(String licensePlate, String model, double baseRate) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.baseRate = baseRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }
}