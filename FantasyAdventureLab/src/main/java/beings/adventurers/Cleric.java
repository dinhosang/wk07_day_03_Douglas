package beings.adventurers;

import beings.Being;
import items.HealingItem;

public class Cleric extends Adventurer<HealingItem> {


    public Cleric(String name, int maxHealth, HealingItem mainHealingItem) {

        super(name, maxHealth, mainHealingItem);

    }


    public void useMainItem(Being target){

        this.mainItem.heal(target);

    }

}
