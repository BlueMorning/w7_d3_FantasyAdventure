package Item.BattleItems;

import Item.Item;

public class BattleItem extends Item {

    protected int power;

    public BattleItem(String name, int power) {
        super(name);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }
}
