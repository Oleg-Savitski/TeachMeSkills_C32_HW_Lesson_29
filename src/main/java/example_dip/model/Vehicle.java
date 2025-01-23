package example_dip.model;

public abstract class Vehicle {
    protected String vin;
    protected String brand;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(String vin, String brand, String model, int year, double price) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getVin() { return vin; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    public abstract String getVehicleType();
}