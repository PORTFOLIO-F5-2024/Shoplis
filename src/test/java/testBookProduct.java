import org.ShLst.BookProduct;
import org.ShLst.FoodProduct;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static  org.junit.jupiter.api.Assertions.assertEquals;

public class testBookProduct {
    private List<BookProduct> listOfProducts = new ArrayList<>();

    @Test
    @DisplayName("Test: create + add PRODUCT-- FoodProduct")
    void test_whenTheProductIsBookProduct_thenReturnAbookProduct(){
        //  GIVEN
        BookProduct book1 = new BookProduct("Banana",27.27,"Stuart","Ba-ba-ba-ba-ba-na-na Ba-ba-ba-ba-ba-na-na Banana-ah-ah Potato-na-ah-ah Banana-ah-ah. Tokari noh potato-li kani malo mani kano Chi ka-baba, ba-ba-nana Yoh plano boo la planonoh too Ma bana-na la-ka moobi talaloo",5 );
        // WHEN
        listOfProducts.add(book1);
        //  THEN
        assertEquals(book1, listOfProducts.get(0)) ;
    }
}
