public class Weapon extends Item {
    
    private final int damage;

    public Weapon(String type, int damage) {
        super(type);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
