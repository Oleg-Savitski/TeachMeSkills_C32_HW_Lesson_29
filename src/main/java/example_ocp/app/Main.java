package example_ocp.app;

import example_ocp.model.RentalCar;
import example_ocp.repository.RentalRepository;
import example_ocp.service.RentalService;
import example_ocp.utils.RentalUtils;

/**
 * This program will be a calculator for the cost of renting a car.
 * The Open/Closed Principle is demonstrated here.
 */
public class Main {
    public static void main(String[] args) {
        RentalRepository rentalRepository = new RentalRepository();
        RentalService rentalService = new RentalService();

        RentalCar economyCar = RentalUtils.createEconomyCar("ECO125RU", "Toyota Corolla");
        RentalCar luxuryCar = RentalUtils.createLuxuryCar("LUX7777BY", "BMW M5 Series Turbo");

        rentalRepository.addCar(economyCar);
        rentalRepository.addCar(luxuryCar);

        int rentalDays = 5;
        double economyCost = rentalService.calculateTotalCost(economyCar, rentalDays);
        double luxuryCost = rentalService.calculateTotalCost(luxuryCar, rentalDays);

        System.out.println("Rental cost for -> " + economyCar.getModel() + " -> $" + economyCost);
        System.out.println("Rental cost for -> " + luxuryCar.getModel() + " -> $" + luxuryCost);
    }
}