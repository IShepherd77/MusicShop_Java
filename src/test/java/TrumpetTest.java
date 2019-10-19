import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;
    Trumpet trumpet2;

    @Before
    public void before(){
        trumpet1 = new Trumpet("brass", "yellow", 50.00, 75.00, 3);
        trumpet2 = new Trumpet("brass", "yellow", 100.00, 150.00, 3);
    }

    @Test
    public void getType(){
        assertEquals("brass", trumpet1.getType());
    }

    @Test
    public void getColour(){
        assertEquals("yellow", trumpet1.getColour());
    }

    @Test
    public void setColour(){
        trumpet1.setColour("green");
        assertEquals("green", trumpet1.getColour());
    }

    @Test
    public void canGetStockPrice(){
        assertEquals(50.00, trumpet1.getStockPrice(), 0.01);
    }

    @Test
    public void canSetStockPrice(){
        trumpet1.setStockPrice(40.00);
        assertEquals(40.00, trumpet1.getStockPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(75.00, trumpet1.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice(){
        trumpet1.setSellPrice(110.00);
        assertEquals(110.00, trumpet1.getSellPrice(), 0.01);
    }

    @Test
    public void canGetNumOfValves(){
        assertEquals(3, trumpet1.getNumOfValves());
    }

    @Test
    public void canGetSound(){
        assertEquals("Parp, parp!", trumpet1.getSound());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(25.00, trumpet1.calculateMarkup(), 0.01);
        assertEquals(50.00, trumpet2.calculateMarkup(), 0.01);
    }

}
