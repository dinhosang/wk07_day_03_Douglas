package items;

import behaviours.IAbsorb;

public class Armour extends Item implements IAbsorb {


    int armourValue;


    public Armour(String type, int armourValue) {
        super(type);
        this.armourValue = armourValue;
    }

    public int getArmourValue() {
        return armourValue;
    }

    public int block(int damageReceived){

        int damageRemaining = damageReceived - this.armourValue;

        if(damageRemaining > 0){
            return damageRemaining;
        }

        return 0;

    }

}
