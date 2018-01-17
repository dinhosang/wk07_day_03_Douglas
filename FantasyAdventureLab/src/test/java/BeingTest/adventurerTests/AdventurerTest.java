package BeingTest.adventurerTests;

import beings.adventurers.Knight;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventurerTest {

    Knight knight;
    Weapon crossbow;
    Weapon sword;
    Armour shield;

    @Before
    public void before() {

        shield      = new Armour("Shell", 4);
        crossbow    = new Weapon("Last whisper", 4);
        sword       = new Weapon("Quiet", 3);
        knight      = new Knight("Sarazor", 15, crossbow, shield);

    }


    @Test
    public void canGetMainItemWhenAWeaponsValue() {
        assertEquals(4, knight.getMainItem().getDamage());
    }

    @Test
    public void canSetNewMainItem(){

        assertEquals(crossbow, knight.getMainItem());

        knight.wieldItem(sword);

        assertEquals(sword, knight.getMainItem());

    }
}
