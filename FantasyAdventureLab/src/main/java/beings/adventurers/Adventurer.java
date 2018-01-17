package beings.adventurers;

import beings.Being;



public abstract class Adventurer<T> extends Being {


    protected T mainItem;

    public Adventurer (String name, int maxHealth, T mainItem) {
        super(name, maxHealth);
        this.mainItem = mainItem;
    }

    public abstract void useMainItem(Being target);

    public T getMainItem(){
        return this.mainItem;
    }

    public void wieldItem(T newMainItem) {
        this.mainItem = newMainItem;
    }
}
