package example_dip.service;

import example_dip.model.SaleOffer;
import example_dip.model.Vehicle;
import example_dip.utils.Financeable;
import example_dip.utils.Notifiable;

public class SaleService {
    private final Notifiable notificationService;
    private final Financeable financingService;

    public SaleService(Notifiable notificationService, Financeable financingService) {
        this.notificationService = notificationService;
        this.financingService = financingService;
    }

    public SaleOffer createSaleOffer(Vehicle vehicle, boolean wantFinancing) {
        double finalPrice = vehicle.getPrice();
        boolean isFinanced = false;

        if (wantFinancing && financingService.checkCreditEligibility(finalPrice)) {
            isFinanced = true;
            double monthlyPayment = financingService.calculateMonthlyPayment(finalPrice, 60);
            notificationService.sendNotification("Financing approved. Monthly payment -> $" + monthlyPayment);
        }

        SaleOffer offer = new SaleOffer(vehicle, finalPrice, isFinanced);
        notificationService.sendNotification("Sale offer created for -> " + vehicle.getBrand() + " " + vehicle.getModel());

        return offer;
    }
}