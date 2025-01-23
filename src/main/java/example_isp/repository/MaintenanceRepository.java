package example_isp.repository;

import example_isp.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceRepository {
    private final List<Vehicle> vehicles;

    public MaintenanceRepository() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}