import BattleTools.Potion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {


    @Test
    public void hasName(){
        assertEquals("COFFEE", Potion.COFFEE.toString());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(11, Potion.COFFEE.getHealthValue());
    }
}
