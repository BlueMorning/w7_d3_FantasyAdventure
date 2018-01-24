import Item.Potion.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    @Before
    public void before(){
        potion = new Potion("Detox", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Detox", potion.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(10, potion.getHealthValue());
    }
}
