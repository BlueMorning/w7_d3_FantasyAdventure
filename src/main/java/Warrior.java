import BattleTools.AttackWeapon;
import BattleTools.DefenseWeapon;

import java.util.ArrayList;

public class Warrior extends Player {

    private ArrayList<AttackWeapon> attackTools;
    private ArrayList<DefenseWeapon> defenseTools;

    public Warrior(String name, int healthValue) {
        super(name, healthValue);

        this.attackTools = new ArrayList<>();
        this.defenseTools = new ArrayList<>();
    }

    public int getAttackWeaponsCount() {
        return attackTools.size();
    }

    public int getDefenseWeaponCount(){
        return defenseTools.size();
    }

    public void addAttackWeapon(AttackWeapon weapon) {
        this.attackTools.add(weapon);
    }

    public void removeAttackWeapon(AttackWeapon weapon) {
        this.attackTools.remove(weapon);
    }
}
