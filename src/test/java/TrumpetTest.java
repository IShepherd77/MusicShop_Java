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

}
