package org.ShLst;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productsCart = new ArrayList<>();

    public void viewCart (){
        numberProdruct();
        for (Product item : productsCart){
            System.out.println("Name product: " + item.getNameProduct());
        }
        numberProdruct();
    }
    public void addCart(Product productItem) {
        for (Product item : productsCart){
            if (item.getNameProduct().equals(productItem.getNameProduct())){
                System.out.println("El producto ya existe en el carrito!!");
                return;
            }
        }
        productsCart.add(productItem);
    }

    public void deleteCart (Product productItem){
        productsCart.removeIf( item -> item.getNameProduct().equals(productItem.getNameProduct()));
        System.out.println("El producto ha sido eliminado con exito!!");
    }

    public void numberProdruct (){
        System.out.println("Total products: " + productsCart.size());
    }

    public void sumPriceProduct (){
        double totalPriceCart = 0;
        for (int i = 0; i < productsCart.size();i++){
           String typeOf = productsCart.getClass().getSimpleName();
           double priceSumToTotal = 0;
            switch (typeOf){
                case "FoodProduct":
                    FoodProduct itemFood = (FoodProduct) productsCart.get(i);
                    priceSumToTotal = itemFood.getApplyDiscount();
                    break;
                case "BookProduct":
                    BookProduct itemBook = (BookProduct) productsCart.get(i);
                    priceSumToTotal = itemBook.getApplyDiscount();
                    break;
            }
            totalPriceCart += priceSumToTotal;
        }

        System.out.println("Total price cart: " + totalPriceCart);
    }
}
