package example_lsp.repository;

import example_lsp.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    private final List<Vehicle> vehicles;

    public VehicleRepository() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}