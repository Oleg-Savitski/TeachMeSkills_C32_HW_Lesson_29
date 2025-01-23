package example_dip.model;

public class Car extends Vehicle {
    private final int seats;
    private final String fuelType;

    public Car(String vin, String brand, String model, int year,
               double price, int seats, String fuelType) {
        super(vin, brand, model, year, price);
        this.seats = seats;
        this.fuelType = fuelType;
    }

    @Override
    public String getVehicleType() {
        return "Passenger Car";
    }

    public int getSeats() { return seats; }
    public String getFuelType() { return fuelType; }
}