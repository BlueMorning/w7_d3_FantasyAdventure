import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttackWeaponTest {





    @Test
    public void hasName(){
        assertEquals("SWORD", AttackWeapon.SWORD.toString());
    }

    @Test
    public void hasPower(){
        assertEquals(10, AttackWeapon.SWORD.getPower());
    }

}
