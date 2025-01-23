package example_dip.utils;

public interface Financeable {
    boolean checkCreditEligibility(double price);
    double calculateMonthlyPayment(double price, int months);
}