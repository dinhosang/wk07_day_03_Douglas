package BeingTest.adventurerTests;

import beings.adventurers.Barbarian;
import beings.adventurers.Knight;
import beings.creatures.Creature;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon sword;
    Creature wildCat;

    Knight knight;
    Weapon crossbow;
    Armour shield;

    @Before
    public void before(){

        sword       = new Weapon("Heavy", 6);
        wildCat     = new Creature();
        barbarian   = new Barbarian("Shulo", 19, sword, wildCat);

        shield      = new Armour("Shell", 4);
        crossbow    = new Weapon("Last whisper", 4);
        knight      = new Knight("Sarazor", 19, crossbow, shield);

    }


    @Test
    public void canUseFuriousSwingsOnceAfterEveryThreeRegularAttack(){

        assertEquals(19, knight.getCurrentHealth());

        barbarian.furiousSwings(knight);
        assertEquals(13, knight.getCurrentHealth());

        barbarian.furiousSwings(knight);
        assertEquals(13, knight.getCurrentHealth());

        barbarian.useMainItem(knight);
        assertEquals(11, knight.getCurrentHealth());
        barbarian.useMainItem(knight);
        assertEquals(9, knight.getCurrentHealth());

        barbarian.furiousSwings(knight);
        assertEquals(9, knight.getCurrentHealth());

        barbarian.useMainItem(knight);
        assertEquals(7, knight.getCurrentHealth());

        barbarian.furiousSwings(knight);
        assertEquals(1, knight.getCurrentHealth());

        barbarian.furiousSwings(knight);
        assertEquals(1, knight.getCurrentHealth());

    }


    @Test
    public void animalPartnerCanAttack(){

    }

}
