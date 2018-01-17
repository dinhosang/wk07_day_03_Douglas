package beings.adventurers;

import behaviours.IDefend;
import beings.Being;
import items.Armour;
import items.Weapon;

public class Knight extends Adventurer<Weapon> implements IDefend {


    private Being beingUnderProtection;


    public Knight(String name, int maxHealth, Weapon mainWeapon, Armour shield) {
        super(name, maxHealth, mainWeapon);
        this.protection.add(shield);
    }

    public void useMainItem(Being target) {
        this.mainItem.dealDamage(target);
    }

    public void defend(Being target){
        if(this.defender != null){
            this.defender.stopDefending();
        }

        if(beingUnderProtection != null) {
            beingUnderProtection.removeDefender();
        }

        beingUnderProtection = target;
        target.addDefender(this);
    }

    public void stopDefending(){
        beingUnderProtection.removeDefender();
        beingUnderProtection = null;
    }


}
