package org.ShLst;

public class FreeProduct extends Product implements WithDiscount {

    private double discount;

    public FreeProduct(String nameProduct, double priceProduct) {
        super(nameProduct, priceProduct);
        this.discount = 100;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getApplyDiscount(double priceProduct, double discount) {
        return priceProduct + priceProduct * discount / 100;
    }

}
