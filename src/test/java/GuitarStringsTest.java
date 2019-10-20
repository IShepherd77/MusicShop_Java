import accessories.GuitarStrings;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings1;
    GuitarStrings guitarStrings2;

    @Before
    public void before(){
        guitarStrings1 = new GuitarStrings("Bass guitar strings", 5.00, 6.00);
        guitarStrings2 = new GuitarStrings("Electric guitar strings", 6.00, 7.20);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Bass guitar strings", guitarStrings1.getDescription());
        assertEquals("Electric guitar strings", guitarStrings2.getDescription());
    }

    @Test
    public void canSetDescription(){
        guitarStrings1.setDescription("Test new description");
        assertEquals("Test new description", guitarStrings1.getDescription());
    }

    @Test
    public void canGetStockPrice(){
        assertEquals(5.00, guitarStrings1.getStockPrice(),0.01);
        assertEquals(6.00, guitarStrings2.getStockPrice(),0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(6.00, guitarStrings1.getSellPrice(), 0.01);
        assertEquals(7.20, guitarStrings2.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
      assertEquals(1.00, guitarStrings1.calculateMarkup(), 0.01);
      assertEquals(1.20, guitarStrings2.calculateMarkup(), 0.01);
    }

    @Test
    public void canSetStockPriceWithCalculatedMarkup(){
        guitarStrings1.setStockPrice(10.00);
        assertEquals(10.00, guitarStrings1.getStockPrice(),0.01);
        guitarStrings1.calculateMarkup();
        assertEquals(2, guitarStrings1.calculateMarkup(), 0.01);
    }




}
