import BattleTools.AttackWeapon;

import java.util.ArrayList;

public abstract class Player<E> {

    private String name;
    private int healthValue;
    private ArrayList<E> attackTools;

    public Player(String name, int healthValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackTools = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getWeaponsCount() {
        return attackTools.size();
    }
}
