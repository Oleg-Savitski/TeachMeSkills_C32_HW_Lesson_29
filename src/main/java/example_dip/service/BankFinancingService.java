package example_dip.service;

import example_dip.utils.Financeable;

public class BankFinancingService implements Financeable {
    @Override
    public boolean checkCreditEligibility(double price) {
        return price < 50000;
    }

    @Override
    public double calculateMonthlyPayment(double price, int months) {
        double interestRate = 0.05;
        return (price * (1 + interestRate)) / months;
    }
}
