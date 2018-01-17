import BattleTools.AttackSpell;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackSpellTest {

    @Test
    public void hasName(){
        assertEquals("FIREBALL", AttackSpell.FIREBALL.toString());
    }

    @Test
    public void hasPower(){
        assertEquals(10, AttackSpell.FIREBALL.getPower());
    }
}
