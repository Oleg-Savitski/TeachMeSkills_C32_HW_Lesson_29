package example_dip.model;

public class SaleOffer {
    private final Vehicle vehicle;
    private final double finalPrice;
    private final boolean isFinanced;

    public SaleOffer(Vehicle vehicle, double finalPrice, boolean isFinanced) {
        this.vehicle = vehicle;
        this.finalPrice = finalPrice;
        this.isFinanced = isFinanced;
    }

    public Vehicle getVehicle() { return vehicle; }
    public double getFinalPrice() { return finalPrice; }
    public boolean isFinanced() { return isFinanced; }
}