package example_lsp.model;

public abstract class Vehicle {
    protected String licensePlate;
    protected String model;

    public Vehicle(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public abstract void displayInfo();

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }
}