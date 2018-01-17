package beings.adventurers;

import beings.Being;
import beings.creatures.Creature;
import items.Weapon;

public class Barbarian extends Adventurer<Weapon> {


    private Creature animalPartner;
    private int furiousSwingsRecoveryCounter;


    public Barbarian(String name, int maxHealth, Weapon mainWeapon, Creature animalPartner) {

        super(name, maxHealth, mainWeapon);

        this.animalPartner              = animalPartner;
        this.furiousSwingsRecoveryCounter = 0;

    }


    public void useMainItem(Being target) {

        if(this.furiousSwingsRecoveryCounter > 0){
            this.furiousSwingsRecoveryCounter -= 1;
        }

        this.mainItem.dealDamage(target);

    }

    public void furiousSwings(Being target){

        if(this.furiousSwingsRecoveryCounter > 0){

        } else {
            this.furiousSwingsRecoveryCounter = 3;
            this.mainItem.dealDamage(target);
            this.mainItem.dealDamage(target);
            this.mainItem.dealDamage(target);
        }

    }


}
