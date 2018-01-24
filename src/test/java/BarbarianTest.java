import Item.BattleItems.Attack.AttackEquipment;
import Being.Players.Healer.Cleric;
import Being.Players.Fighters.Warriors.Barbarian;
import Item.BattleItems.Defence.DefenceEquipment;
import Item.Potion.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;


    @Before
    public void before(){

        barbarian = new Barbarian("Konan", 20);

    }

    @Test
    public void hasName(){
        assertEquals("Konan", barbarian.getName());
    }

    @Test
    public void hasHealthValue(){
        assertEquals(20, barbarian.getHealthValue());
    }

    @Test
    public void hasWeapons(){
        assertEquals(0, barbarian.getAttackItemCount());
    }

    @Test
    public void hasDefenceWeapons(){
        assertEquals(0, barbarian.getDefenseItemCount());
    }

    @Test
    public void canAddWeapon(){
        barbarian.addAttackTool(new AttackEquipment("sword", 10));
        assertEquals(1, barbarian.getAttackItemCount());
    }

    @Test
    public void canRemoveWeapon(){
        barbarian.addAttackTool(new AttackEquipment("sword", 10));
        barbarian.addAttackTool(new AttackEquipment("axe", 7));
        assertEquals(2, barbarian.getAttackItemCount());
    }

    @Test
    public void canAddDefenseWeapon(){
        barbarian.addDefenseEquipment(new DefenceEquipment("armor", 7));
        assertEquals(1, barbarian.getDefenseItemCount());
    }

    @Test
    public void canRemoveDefenseWeapon(){
        barbarian.addDefenseEquipment(new DefenceEquipment("armor", 7));
        barbarian.removeDefenseItem(new DefenceEquipment("armor", 7));
        assertEquals(0, barbarian.getAttackItemCount());
    }

    @Test
    public void hasCurrentAttackWeapon(){
        AttackEquipment sword = new AttackEquipment("sword", 10);
        AttackEquipment axe   = new AttackEquipment("sword", 10);
        barbarian.addAttackTool(sword);
        barbarian.addAttackTool(axe);
        barbarian.setCurrentAttackItem(barbarian.getAttackItems().get(0));
        assertEquals(sword, barbarian.getCurrentAttackItem());
    }

    @Test
    public void hasCurrentDefenseWeapon(){
        DefenceEquipment armor = new DefenceEquipment("armor", 7);
        DefenceEquipment helmet = new DefenceEquipment("armor", 3);
        barbarian.addDefenseEquipment(armor);
        barbarian.addDefenseEquipment(helmet);
        barbarian.setCurrentDefenseItem(barbarian.getDefenceItems().get(1));
        assertEquals(helmet, barbarian.getCurrentDefenseItem());
    }


    @Test
    public void canBeHealed(){
        Cleric cleric = new Cleric("ShadowMaster", 12);
        Potion greenThea = new Potion("greenThea", 2);
        cleric.addPotion(greenThea);

        barbarian.takeDamages(9);
        assertEquals(11, barbarian.getHealthValue());
        barbarian.recoverHealth(cleric.heal(greenThea));
        assertEquals(13, barbarian.getHealthValue());
    }


}
