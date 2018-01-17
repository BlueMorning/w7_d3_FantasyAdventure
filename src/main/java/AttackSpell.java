public enum AttackSpell {

    FIREBALL(10),
    LIGHTNING(8),
    ICEFREEZE(7);



    int power;

    AttackSpell(int power){
        this.power = power;
    }


    public int getPower() {
        return power;
    }
}
