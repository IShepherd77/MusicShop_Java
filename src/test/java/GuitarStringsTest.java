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
        guitarStrings2 = new GuitarStrings("Electric guitar strings", 5.00, 6.20);
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

    
}
