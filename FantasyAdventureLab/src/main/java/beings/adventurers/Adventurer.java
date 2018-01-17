package beings.adventurers;

import beings.Being;

public abstract class Adventurer<T> extends Being {


    protected T mainWeapon;

    public Adventurer (String name, int maxHealth, T mainWeapon) {
        super(name, maxHealth);
        this.mainWeapon = mainWeapon;
    }

    public abstract void useMainWeapon();

}
