package example_isp.model;

public abstract class Vehicle {
    protected String licensePlate;
    protected String model;
    protected String brand;
    protected int year;

    public Vehicle(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public Vehicle(String licensePlate, String model, String brand, int year) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public abstract void displayInfo();

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public boolean isOlderThan(int years) {
        return (2023 - year) > years;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + licensePlate + ")";
    }
}