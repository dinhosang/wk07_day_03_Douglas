package items;

import behaviours.IHeal;
import beings.Being;

public class HealingItem extends Item implements IHeal {

    private int healingValue;

    public HealingItem(String type, int healingValue) {
        super(type);
        this.healingValue = healingValue;
    }

    public int getHealingValue() {
        return this.healingValue;
    }

    public void heal(Being target) {
        if(target.getCurrentHealth() <= 0) {

        } else {
            target.addHealth(healingValue);
        }
    }



}
