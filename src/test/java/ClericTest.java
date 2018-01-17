import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;


    @Before
    public void before(){

        cleric = new Cleric("Cedric", 10);

    }

    @Test
    public void hasName(){
        assertEquals("Cedric", cleric.getName());
    }
}
