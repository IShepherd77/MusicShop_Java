import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void before(){
        trumpet1 = new Trumpet("brass", "yellow", 50, 100, 3);
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
    public void getStockPrice(){
        assertEquals(50, trumpet1.getStockPrice());
    }

    @Test
    public void setStockPrice(){
        trumpet1.setStockPrice(40);
        assertEquals(40, trumpet1.getStockPrice());
    }

    @Test
    public void getSellPrice(){
        assertEquals(100, trumpet1.getSellPrice());
    }

    @Test
    public void setSellPrice(){
        trumpet1.setSellPrice(110);
        assertEquals(110, trumpet1.getSellPrice());
    }

    @Test
    public void getNumOfValves(){
        assertEquals(3, trumpet1.getNumOfValves());
    }

}
