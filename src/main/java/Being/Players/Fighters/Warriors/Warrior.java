package Being.Players.Fighters.Warriors;

import Item.BattleItems.Attack.AttackEquipment;
import Being.Players.Fighters.Fighter;
import Item.BattleItems.Defence.DefenceEquipment;

public abstract class  Warrior extends Fighter<AttackEquipment, DefenceEquipment> {

    public Warrior(String name, int healthValue) {
        super(name, healthValue);

    }
}
