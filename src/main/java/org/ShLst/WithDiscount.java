package org.ShLst;

public interface WithDiscount {


     default double getApplyDiscount(double priceProduct, double discount){
        return 0;
    };
}
