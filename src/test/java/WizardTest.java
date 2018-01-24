import Being.Players.Fighters.Magician.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {


    Wizard wizard;


    @Before
    public void before(){

        wizard = new Wizard("Harry", 5);

    }

    @Test
    public void hasName(){
        assertEquals("Harry", wizard.getName());
    }

}
