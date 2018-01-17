import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleToolTest {

    BattleTool bt;


    @Before
    public void before(){
        bt = new BattleTool("sword", 10);
    }


    @Test
    public void hasName(){
        assertEquals("sword", bt.getName());
    }

    @Test
    public void hasPower(){
        assertEquals(10, bt.hasPower());
    }


}
