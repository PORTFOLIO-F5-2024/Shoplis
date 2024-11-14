package org.ShLst;

public abstract class Product {
    private String nameProduct;
    private double PriceProduct;

    public Product(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.PriceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return PriceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        PriceProduct = priceProduct;
    }


}
