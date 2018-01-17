import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenseWeaponTest {

    @Test
    public void hasName(){
        assertEquals("ARMOUR", DefenseWeapon.ARMOUR.toString());
    }

    @Test
    public void hasPower(){
        assertEquals(5, DefenseWeapon.ARMOUR.getPower());
    }
}
