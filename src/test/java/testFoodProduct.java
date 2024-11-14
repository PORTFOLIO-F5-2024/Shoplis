import org.ShLst.FoodProduct;
import org.ShLst.Product;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static  org.junit.jupiter.api.Assertions.assertEquals;

public class testFoodProduct {
    private List<FoodProduct> listOfProducts = new ArrayList<>();
    @Test
    @DisplayName("Test: create + add PRODUCT-- FoodProduct")
    void test_whenTheProductIsFoodProduct_thenReturnAfoodProduct(){
        //  GIVEN
    FoodProduct food1 = new FoodProduct(5,"Banana", 27.27);
        // WHEN
    listOfProducts.add(food1);
        //  THEN
        assertEquals(food1, listOfProducts.get(0)) ;
    }

}
