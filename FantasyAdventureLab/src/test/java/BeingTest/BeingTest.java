package BeingTest;

import beings.adventurers.Knight;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeingTest  {

    Knight knight;
    Knight knightBeingDefended;
    Weapon crossbow;
    Armour shield;
    Armour helmet;

    @Before
    public void before() {
        shield              = new Armour("Shell", 4);
        helmet              = new Armour("Snail", 3);
        crossbow            = new Weapon("Last whisper", 4);
        knight              = new Knight("Sarazor", 15, crossbow, shield);
        knightBeingDefended = new Knight("Lista", 15, crossbow, shield);

    }

    @Test
    public void canGetName() {
        assertEquals("Sarazor", knight.getName());
    }

    @Test
    public void canGetMaxHealth() {
        assertEquals(15, knight.getMaxHealth());
    }

    @Test
    public void canGetMainWeaponValue() {
        assertEquals(4, knight.getMainItem().getDamage());
    }

    @Test
    public void canReceiveAttack() {
        knight.receiveAttack(5);
        assertEquals(14, knight.getCurrentHealth());
    }

    @Test
    public void canAddHealthUpToMax(){

        knight.receiveAttack(10);
        assertEquals(9, knight.getCurrentHealth());

        knight.addHealth(4);
        assertEquals(13, knight.getCurrentHealth());

        knight.addHealth(4);
        assertEquals(15, knight.getCurrentHealth());

    }

    @Test
    public void canAddDefenderWhichThenReceivesAttackInstead(){
        knight.defend(knightBeingDefended);

        assertEquals(15, knight.getCurrentHealth());
        assertEquals(15, knightBeingDefended.getCurrentHealth());

        knightBeingDefended.receiveAttack(6);

        assertEquals(13, knight.getCurrentHealth());
        assertEquals(15, knightBeingDefended.getCurrentHealth());
    }

    @Test
    public void canAddMoreProtection(){

        knight.receiveAttack(10);
        assertEquals(9, knight.getCurrentHealth());

        knight.addHealth(6);
        assertEquals(15, knight.getCurrentHealth());

        knight.addProtection(helmet);

        knight.receiveAttack(10);
        assertEquals(12, knight.getCurrentHealth());

    }

}
