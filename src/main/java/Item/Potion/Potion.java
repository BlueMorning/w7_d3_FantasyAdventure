package Item.Potion;

import Item.Item;

public class Potion extends Item {

    protected int healthValue;

    public Potion(String name, int healthValue){
        super(name);
        this.healthValue = healthValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
