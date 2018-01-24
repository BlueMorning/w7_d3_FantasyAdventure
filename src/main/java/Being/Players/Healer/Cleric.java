package Being.Players.Healer;

import Item.Potion.Potion;
import Being.Players.Being;

import java.util.ArrayList;

public class Cleric extends Being {


    ArrayList<Potion> healingPotions;

    public Cleric(String name, int healthValue) {
        super(name, healthValue);
        this.healingPotions = new ArrayList<>();
    }

    public ArrayList<Potion> getHealingPotions(){
        return this.healingPotions;
    }

    public int getHealingPotionsCount(){
        return this.healingPotions.size();
    }

    public void setHealingPotions(ArrayList<Potion> healingPotions){
         this.healingPotions = healingPotions;
    }

    public void addPotion(Potion potion){
        this.healingPotions.add(potion);
    }

    public void removePotion(Potion potion){
        this.healingPotions.remove(potion);
    }

    public void removeAllPotions(){
        this.healingPotions.clear();
    }

    public int heal(Potion potion){
        if(healingPotions.contains(potion)){
            healingPotions.remove(potion);
            return potion.getHealthValue();
        }
        else{
            return 0;
        }
    }

}
