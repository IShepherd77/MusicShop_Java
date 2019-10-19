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
    public void canAddStock(){
        shop.addStock(trumpet1);
        shop.addStock(trumpet1);
        shop.addStock(guitarStrings1);
        assertEquals(2, shop.stockCount(trumpet1));
        assertEquals(1, shop.stockCount(guitarStrings1));
    }







}
