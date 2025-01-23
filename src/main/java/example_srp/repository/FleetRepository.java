package example_srp.repository;

import example_srp.model.Fleet;

public class FleetRepository {
    private final Fleet fleet;

    public FleetRepository() {
        this.fleet = new Fleet();
    }

    public Fleet getFleet() {
        return fleet;
    }
}