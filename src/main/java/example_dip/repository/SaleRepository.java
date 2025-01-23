package example_dip.repository;

import example_dip.model.SaleOffer;

import java.util.ArrayList;
import java.util.List;

public class SaleRepository {
    private final List<SaleOffer> saleOffers = new ArrayList<>();

    public void addSaleOffer(SaleOffer offer) {
        saleOffers.add(offer);
    }

    public List<SaleOffer> getAllSaleOffers() {
        return saleOffers;
    }
}