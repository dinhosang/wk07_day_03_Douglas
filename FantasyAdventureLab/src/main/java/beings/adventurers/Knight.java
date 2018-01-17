package beings.adventurers;

import items.Armour;
import items.Weapon;

public class Knight <Weapon> extends Adventurer {


    private Armour shield;

    public Knight(String name, int maxHealth, Weapon mainWeapon, Armour shield) {
        super(name, maxHealth, mainWeapon);
        this.shield = shield;
    }

    public void useMainWeapon() {

    }

}
