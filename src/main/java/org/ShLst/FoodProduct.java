package org.ShLst;

public class FoodProduct extends Product{
    protected double discount;

    public FoodProduct(double discount,String nameProduct, double priceProduct) {
        super( nameProduct,priceProduct);
        this.discount = discount;
    }

    @Override
    public double getApplyDiscount() {
        double priceProduct = this.getPriceProduct();
        double discount = this.discount;
        return priceProduct + priceProduct*discount/100;
    }
}
