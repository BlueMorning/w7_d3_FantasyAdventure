import Being.Players.Fighters.Warriors.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {


        Dwarf dwarf;


        @Before
        public void before(){

            dwarf = new Dwarf("Sleepy", 20);

        }

        @Test
        public void hasName(){
            assertEquals("Sleepy", dwarf.getName());
        }
}
