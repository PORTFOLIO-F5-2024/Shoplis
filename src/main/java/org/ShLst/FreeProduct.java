package org.ShLst;

public class FreeProduct extends Product{

    private double discount;
    public FreeProduct(String nameProduct, double priceProduct) {
        super(nameProduct, priceProduct);
        this.discount = 100;
    }

    @Override
    public double getApplyDiscount() {
        double priceProduct = this.getPriceProduct();
        double discount = this.discount;
        setPriceProduct(priceProduct - priceProduct*discount/100);
        return priceProduct - priceProduct*discount/100;
    }
}
