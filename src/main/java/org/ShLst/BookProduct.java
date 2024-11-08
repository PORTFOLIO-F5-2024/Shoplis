package org.ShLst;

public class BookProduct extends Product{
    private String author;
    private String description;
    private double discount;

    public BookProduct(String nameProduct, double priceProduct, String author, String description, double discount) {
        super(nameProduct, priceProduct);
        this.author = author;
        this.description = description;
        this.discount = discount;
    }

    @Override
    public double getApplyDiscount() {
        if (this.discount > 10) {
            System.out.println("Discount ");
            this.discount = 0;
            return 0;
        }

        double priceProduct = this.getPriceProduct();
        double discount = this.discount;
        return priceProduct - priceProduct*discount/100;

    }
}
