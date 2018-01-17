package BeingTest.adventurerTests;

import beings.adventurers.Cleric;
import items.HealingItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    HealingItem holySymbol;
    Cleric cleric;


    @Before
    public void before(){

        holySymbol  = new HealingItem("Symbol of Hjalmier", 5);
        cleric      = new Cleric("Sofia", 12, holySymbol);

    }


    @Test
    public void canHealDamage(){

        cleric.receiveAttack(6);
        assertEquals(6, cleric.getCurrentHealth());

        cleric.useMainItem(cleric);
        assertEquals(11, cleric.getCurrentHealth());

    }
}
