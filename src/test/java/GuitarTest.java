import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;
    Guitar guitar2;


    @Before
    public void before(){
        guitar1 = new Guitar("string instrument", "red", 100.00, 180.00, 6);
        guitar2 = new Guitar("string instrument", "gold", 200.00, 360.00, 6);
    }

    @Test
    public void canGetSound(){
        assertEquals("bumchickawahwah", guitar1.getSound());
    }

    @Test
    public void canGetType(){
        assertEquals("string instrument", guitar1.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("red", guitar1.getColour());
    }

    @Test
    public void canSetColour(){
        guitar1.setColour("black");
        assertEquals("black", guitar1.getColour());
    }

    @Test
    public void canGetStockPrice(){
        assertEquals(100.00, guitar1.getStockPrice(),0.01);
    }

    @Test
    public void canSetStockPrice(){
        guitar1.setStockPrice(175.00);
        assertEquals(175.00, guitar1.getStockPrice(),0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(180.00, guitar1.getSellPrice(),0.01);
    }

    @Test
    public void canSetSellPrice(){
        guitar1.setSellPrice(200.00);
        assertEquals(200.00, guitar1.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar1.getNumOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(80.00, guitar1.calculateMarkup(), 0.01);
        assertEquals(160.00, guitar2.calculateMarkup(), 0.01);
    }
}
