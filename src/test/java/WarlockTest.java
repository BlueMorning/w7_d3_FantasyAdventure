import Being.Players.Defender.Creature;
import Being.Players.Fighters.Magician.Magician;
import Being.Players.Fighters.Magician.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Creature creature;

    @Before
    public void before(){
        warlock = new Warlock("Valis", 20);
    }

    @Test
    public void hasName(){
        assertEquals("Valis", warlock.getName());
    }

    @Test
    public void hasCreature(){
        creature = new Creature("Dragon", 8);
        warlock.setCreature(creature);
        assertEquals(creature, warlock.getCreature());
    }

}
