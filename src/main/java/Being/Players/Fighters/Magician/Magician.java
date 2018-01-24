package Being.Players.Fighters.Magician;

import Being.Players.Defender.Creature;
import Being.Players.Fighters.Fighter;
import Item.BattleItems.Attack.AttackSpell;
import Item.BattleItems.Defence.DefenceSpell;

public abstract class Magician extends Fighter<AttackSpell, DefenceSpell> {

    private Creature creature;

    public Magician(String name, int healthValue) {
        super(name, healthValue);

    }

    public Creature getCreature(){
        return this.creature;
    }

    public void setCreature(Creature creature){
        this.creature = creature;
    }

    @Override
    public void takeDamages(int damages) {

        int reducedDamages = damages;

        if(this.getCurrentDefenseItem() != null){
            reducedDamages = Math.min(0, damages - this.getCurrentDefenseItem().getPower());
        }

        if(this.getCreature() != null){
            reducedDamages = Math.min(0, reducedDamages - this.getCreature().getHealthValue());
            if(reducedDamages >= this.getCreature().getHealthValue()){
                creature = null;
            }
        }

        this.healthValue -= reducedDamages;
    }

}
