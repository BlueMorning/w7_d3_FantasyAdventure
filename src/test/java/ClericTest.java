import Being.Players.Healer.Cleric;
import Item.Potion.Potion;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Potion potion1;
    Potion potion2;

    @Before
    public void before(){
        cleric  = new Cleric("Cedric", 10);
        potion1 = new Potion("greenTea", 2);
        potion2 = new Potion("water", 4);
        ArrayList<Potion> potions = new ArrayList<>();
        potions.add(potion1);
        potions.add(potion2);
        cleric.setHealingPotions(potions);
    }

    @Test
    public void hasName(){
        assertEquals("Cedric", cleric.getName());
    }

    @Test
    public void hasPotions(){
        assertEquals(2, cleric.getHealingPotionsCount());
    }

    @Test
    public void canAddPotion(){
        cleric.addPotion(new Potion("greenTea", 2));
        assertEquals(3, cleric.getHealingPotionsCount());
    }

    @Test
    public void canRemovePotion(){
        Potion potion = new Potion("fruitJuice", 3);
        cleric.addPotion(potion);
        assertEquals(3, cleric.getHealingPotionsCount());
        cleric.removePotion(potion);
        assertEquals(2, cleric.getHealingPotionsCount());
    }

    @Test
    public void canSetHealingPotions(){
        assertEquals(2, cleric.getHealingPotionsCount());
    }

    @Test
    public void canRemoveAllPotions(){
        cleric.removeAllPotions();
        assertEquals(0, cleric.getHealingPotionsCount());
    }


    @Test
    public void canHeal(){
        cleric.takeDamages(3);
        cleric.recoverHealth(cleric.heal(potion1));
        assertEquals(9, cleric.getHealthValue());
    }


}
