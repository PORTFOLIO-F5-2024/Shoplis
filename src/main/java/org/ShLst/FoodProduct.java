package org.ShLst;

public class FoodProduct extends Product implements WithDiscount{
    protected double discount;

    public FoodProduct(double discount,String nameProduct, double priceProduct) {
        super( nameProduct,priceProduct);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getApplyDiscount(double priceProduct, double discount) {
        return priceProduct + priceProduct*discount/100;
    }
}
