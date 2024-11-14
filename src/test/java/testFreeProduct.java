import org.ShLst.FoodProduct;
import org.ShLst.FreeProduct;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static  org.junit.jupiter.api.Assertions.assertEquals;

public class testFreeProduct {
    private List<FreeProduct> listOfProducts = new ArrayList<>();

    @Test
    @DisplayName("Test: create + add PRODUCT-- FreeProduct")
    void test_whenTheProductIsFreeProduct_thenReturnAfreeProduct(){
        //  GIVEN
        FreeProduct free1 = new FreeProduct("Banana", 27.27);
        // WHEN
        listOfProducts.add(free1);
        //  THEN
        assertEquals(free1, listOfProducts.get(0)) ;
    }

}
