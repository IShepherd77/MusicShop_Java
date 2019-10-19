import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("string instrument", "red", 100.00, 180.00, 6);
    }

    @Test
    public void canGetSound(){
        assertEquals("bumchickawahwah", guitar.getSound());
    }

    @Test
    public void canGetType(){
        assertEquals("string instrument", guitar.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void canSetColour(){
        guitar.setColour("black");
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canGetStockPrice(){
        assertEquals(100.00, guitar.getStockPrice(),0.01);
    }

    @Test
    public void canSetStockPrice(){
        guitar.setStockPrice(175.00);
        assertEquals(175.00, guitar.getStockPrice(),0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(180.00, guitar.getSellPrice(),0.01);
    }

    @Test
    public void canSetSellPrice(){
        guitar.setSellPrice(200.00);
        assertEquals(200.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }
}
