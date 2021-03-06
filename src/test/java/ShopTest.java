import accessories.GuitarStrings;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Trumpet trumpet1;
    Trumpet trumpet2;
    GuitarStrings guitarStrings1;
    GuitarStrings guitarStrings2;


    @Before
    public void before(){
        shop = new Shop("HMV");
        trumpet1 = new Trumpet("brass", "yellow", 50.00, 75.00, 3);
        trumpet2 = new Trumpet("brass", "yellow", 100.00, 150.00, 3);
        guitarStrings1 = new GuitarStrings("Bass guitar strings", 5.00, 6.00);
        guitarStrings2 = new GuitarStrings("Electric guitar strings", 6.00, 7.20);
    }

    @Test
    public void canGetName(){
        assertEquals("HMV", shop.getName());
    }

    @Test
    public void canAddStock(){
        shop.addStock(trumpet1);
        shop.addStock(trumpet1);

        shop.addStock(guitarStrings1);
        shop.addStock(trumpet2);

        shop.addStock(guitarStrings2);
        shop.addStock(guitarStrings2);

        assertEquals(2, shop.stockCount(trumpet1));
        assertEquals(1, shop.stockCount(guitarStrings1));
        assertEquals(1, shop.stockCount(trumpet2));
        assertEquals(2, shop.stockCount(guitarStrings2));
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addStock(trumpet1);
        shop.addStock(trumpet1);
        shop.addStock(trumpet1);
        shop.addStock(guitarStrings1);
        shop.addStock(guitarStrings1);
        shop.addStock(trumpet2);
        assertEquals(3, shop.stockCount(trumpet1));
        assertEquals(2, shop.stockCount(guitarStrings1));
        assertEquals(1, shop.stockCount(trumpet2));

        shop.removeItemFromStock(trumpet1);
        shop.removeItemFromStock(guitarStrings1);
        shop.removeItemFromStock(trumpet2);
        assertEquals(2, shop.stockCount(trumpet1));
        assertEquals(1, shop.stockCount(guitarStrings1));
        assertEquals(0, shop.stockCount(trumpet2));
    }


    @Test
    public void canTotalStockPrice(){
        shop.addStock((trumpet1));
        shop.addStock((trumpet2));
        shop.addStock((guitarStrings2));
        assertEquals(156.00, shop.getTotalStockPrice(), 0.01);
    }

    @Test
    public void canTotalSellPrice(){
        shop.addStock(trumpet1);
        shop.addStock(trumpet1);
        shop.addStock(trumpet2);
        shop.addStock(guitarStrings1);
        assertEquals(306, shop.getTotalSellPrice(), 0.01);
    }



}
