package BeingTest;

import beings.adventurers.Knight;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeingTest  {

    Knight knight;
    Weapon crossbow;
    Armour shield;

    @Before
    public void before() {
        shield = new Armour("Shell", 4);
        crossbow = new Weapon("Last whisper", 4);
        knight = new Knight("Sarazor", 15, crossbow, shield);
    }

    @Test
    public void canGetName() {
        assertEquals("Sarazor", knight.getName());
    }

    @Test
    public void canGetMaxHealth() {
        assertEquals(15, knight.getMaxHealth());
    }
}
