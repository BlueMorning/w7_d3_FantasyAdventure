package BattleTools;

public enum DefenseSpell {

    MAGICSHIELD(8),
    INVISIBILTY(7),
    FASTMOVING(6);



    int power;

    DefenseSpell(int power){
        this.power = power;
    }


    public int getPower() {
        return power;
    }
}
