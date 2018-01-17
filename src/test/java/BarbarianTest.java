import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;


    @Before
    public void before(){

        barbarian = new Barbarian("Konan", 20);

    }

    @Test
    public void hasName(){
        assertEquals("Konan", barbarian.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(20, barbarian.getHealthValue());
    }

    @Test
    public void hasWeapons(){
        assertEquals(0, barbarian.getWeaponsCount());
    }



}
