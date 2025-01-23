package example_dip.app;


import example_dip.model.Car;
import example_dip.model.SaleOffer;
import example_dip.model.Vehicle;
import example_dip.repository.SaleRepository;
import example_dip.service.BankFinancingService;
import example_dip.service.EmailNotificationService;
import example_dip.service.SaleService;

/**
 * This program will be a car sales platform.
 * The Dependency Inversion Principle will be demonstrated here.
 */

public class Main {
    public static void main(String[] args) {
        EmailNotificationService notificationService = new EmailNotificationService();
        BankFinancingService financingService = new BankFinancingService();
        SaleService saleService = new SaleService(notificationService, financingService);
        SaleRepository saleRepository = createSaleRepository(saleService);
        displaySaleOffers(saleRepository);
    }

    private static SaleRepository createSaleRepository(SaleService saleService) {
        SaleRepository saleRepository = new SaleRepository();
        Vehicle car1 = new Car("VIN4321", "Toyota", "Camry", 2023, 35000, 5, "Hybrid");
        Vehicle car2 = new Car("VIN5655", "Honda", "Accord", 2021, 30000, 5, "Petrol");
        SaleOffer offer1 = saleService.createSaleOffer(car1, true);
        SaleOffer offer2 = saleService.createSaleOffer(car2, false);
        saleRepository.addSaleOffer(offer1);
        saleRepository.addSaleOffer(offer2);

        return saleRepository;
    }

    private static void displaySaleOffers(SaleRepository saleRepository) {
        for (SaleOffer offer : saleRepository.getAllSaleOffers()) {
            System.out.println("Sale Offer -> " +
                    offer.getVehicle().getBrand() + " " +
                    offer.getVehicle().getModel() +
                    " - Final Price -> $" + offer.getFinalPrice() +
                    (offer.isFinanced() ? " (Financed)" : " (Not Financed)")
            );
        }
    }
}