package BattleTools;

public enum Potion {

    COFFEE(11),
    REDWINE(7),
    REDBULL(4);



    int healthValue;

    Potion(int healthValue){
        this.healthValue = healthValue;
    }


    public int getHealthValue() {
        return healthValue;
    }
}
