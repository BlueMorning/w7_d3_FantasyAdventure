package BattleTools;

public enum DefenseWeapon {

    ARMOUR(5),
    SHIELD(7),
    UMBRELLA(1);



    int power;

    DefenseWeapon(int power){
        this.power = power;
    }


    public int getPower() {
        return power;
    }
}
