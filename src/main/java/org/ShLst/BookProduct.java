package org.ShLst;

public class BookProduct extends Product implements WithDiscount{
    private String author;
    private String description;
    private double discount;

    public BookProduct(String nameProduct, double priceProduct, String author, String description, double discount) {
        super(nameProduct, priceProduct);
        this.author = author;
        this.description = description;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getApplyDiscount(double priceProduct, double discount) {
        if (this.discount > 10) {
            System.out.println("Discount is not effective, its over 10% ");
            this.discount = 0;
            return 0;
        }

        return priceProduct - priceProduct*discount/100;
    }

}
