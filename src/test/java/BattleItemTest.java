import Item.BattleItems.BattleItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BattleItemTest {

    BattleItem battleItem;


    @Before
    public void before(){
        battleItem = new BattleItem("Sword", 10);
    }



    @Test
    public void hasName(){
        assertEquals("Sword", battleItem.getName());
    }

    @Test
    public void hasPower(){
        assertEquals(10, battleItem.getPower());
    }

}
