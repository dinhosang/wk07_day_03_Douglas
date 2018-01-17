package items;

import behaviours.IDamage;
import creatures.Enemy;


public class Weapon extends Item implements IDamage<Enemy> {
    
    private final int damage;

    public Weapon(String type, int damage) {
        super(type);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void dealDamage(Enemy target){

    }

}
