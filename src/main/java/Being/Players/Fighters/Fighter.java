package Being.Players.Fighters;

import Item.BattleItems.Attack.AttackEquipment;
import Being.Abilities.ITakeDamages;
import Being.Players.Being;
import Item.BattleItems.Attack.AttackItem;
import Item.BattleItems.Defence.DefenceEquipment;
import Item.BattleItems.Defence.DefenceItem;

import java.util.ArrayList;

public abstract class Fighter<E, F> extends Being implements ITakeDamages {

    private ArrayList<AttackItem> attackItems;
    private ArrayList<DefenceItem> defenceItems;
    private AttackItem currentAttackItem;
    private DefenceItem currentDefenseItem;

    public Fighter(String name, int healthValue) {
        super(name, healthValue);
        attackItems = new ArrayList<>();
        defenceItems = new ArrayList<>();
    }

    public int getAttackItemCount() {
        return this.attackItems.size();
    }

    public int getDefenseItemCount() {
        return this.defenceItems.size();
    }

    public ArrayList<AttackItem> getAttackItems() {
        return this.attackItems;
    }

    public ArrayList<DefenceItem> getDefenceItems() {
        return this.defenceItems;
    }

    public void addAttackTool(AttackItem attackItem) {
        this.attackItems.add(attackItem);
    }

    public void removeAttackItem(AttackItem attackItem) {
        this.attackItems.remove(attackItem);
    }

    public void addDefenseEquipment(DefenceItem defenceItem) {
        this.defenceItems.add(defenceItem);
    }

    public void removeDefenseItem(DefenceItem defenceItem) {
        this.defenceItems.remove(defenceItem);
    }

    public AttackItem getCurrentAttackItem() {
        return currentAttackItem;
    }

    public DefenceItem getCurrentDefenseItem() {
        return currentDefenseItem;
    }

    public void setCurrentAttackItem(AttackItem currentAttackItem) {
        this.currentAttackItem = currentAttackItem;
    }

    public void setCurrentDefenseItem(DefenceItem currentDefenseItem) {
        this.currentDefenseItem = currentDefenseItem;
    }

    @Override
    public void takeDamages(int damages) {

        int reducedDamages = damages;

        if(this.getCurrentDefenseItem() != null){
            reducedDamages = Math.min(0, damages - this.getCurrentDefenseItem().getPower());
        }

        this.healthValue -= reducedDamages;
    }
}
