package beings;

import behaviours.IAbsorb;
import behaviours.IDefend;

import java.util.ArrayList;

public abstract class Being {

    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected IDefend defender;
    protected ArrayList<IAbsorb> protection;


    public Being(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.protection = new ArrayList<>();
    }

    protected void receiveAttack(int damageReceived){
        if(defender != null){
            ((Being) defender).receiveAttack(damageReceived);
        } else {
            for(IAbsorb element: protection){
                damageReceived = element.block(damageReceived);
            }
            takedamage(damageReceived);
        }
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public void addHealth(int healingValue){

        this.currentHealth += healingValue;

        if(this.currentHealth > this.maxHealth){

            this.currentHealth = this.maxHealth;

        }
    }


    public void takedamage(int damageReceived){
        this.currentHealth -= damageReceived;
    }

    public void addDefender(IDefend defender){
        this.defender = defender;
    }

    public void addProtection(IAbsorb protection){
        this.protection.add(protection);
    }


    public String getName() {
        return name;
    }
}
