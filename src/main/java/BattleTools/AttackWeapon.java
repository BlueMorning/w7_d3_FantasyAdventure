package BattleTools;

public enum AttackWeapon {


    SWORD(10),
    CLUB(8),
    AXE(7);



    int power;

    AttackWeapon(int power){
        this.power = power;
    }


    public int getPower() {
        return power;
    }
}
