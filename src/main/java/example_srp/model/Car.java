package example_srp.model;

public class Car {
    private final String licensePlate;
    private final String model;
    private final String brand;

    public Car(String licensePlate, String model, String brand) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}