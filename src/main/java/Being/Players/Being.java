package Being.Players;


import Being.Abilities.IRecoverHealth;

public abstract class Being implements IRecoverHealth {

    protected String name;
    protected int maxHealthValue;
    protected int healthValue;


    public Being(String name, int healthValue){
        this.name           = name;
        this.maxHealthValue = healthValue;
        this.healthValue    = healthValue;
    }


    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getMaxHealthValue() {
        return this.maxHealthValue;
    }

    public void recoverHealth(int health){
        this.healthValue = Math.min(this.healthValue + health, this.maxHealthValue);
    }

    public void takeDamages(int damages) {
        this.healthValue -= damages;
    }

}
