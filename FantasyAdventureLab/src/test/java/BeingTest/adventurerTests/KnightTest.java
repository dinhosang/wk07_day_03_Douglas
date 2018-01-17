package BeingTest.adventurerTests;

import beings.adventurers.Knight;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {


    Knight knight;
    Knight knightBeingDefendedFirst;
    Knight knightBeingDefendedSecond;
    Weapon crossbow;
    Armour shield;

    @Before
    public void before() {

        shield                      = new Armour("Shell", 4);
        crossbow                    = new Weapon("Last whisper", 4);
        knight                      = new Knight("Sarazor", 15, crossbow, shield);
        knightBeingDefendedFirst    = new Knight("Lista", 15, crossbow, shield);
        knightBeingDefendedSecond   = new Knight("Lucky", 15, crossbow, shield);

    }


    @Test
    public void canAddDefenderWhichThenReceivesAttackInstead(){

        knight.defend(knightBeingDefendedFirst);

        assertEquals(15, knight.getCurrentHealth());
        assertEquals(15, knightBeingDefendedFirst.getCurrentHealth());

        knightBeingDefendedFirst.receiveAttack(6);

        assertEquals(13, knight.getCurrentHealth());
        assertEquals(15, knightBeingDefendedFirst.getCurrentHealth());

    }

    @Test
    public void canOnlyDefendOneAtATime(){

        knight.defend(knightBeingDefendedFirst);
        knightBeingDefendedFirst.receiveAttack(6);

        assertEquals(13, knight.getCurrentHealth());
        assertEquals(15, knightBeingDefendedFirst.getCurrentHealth());
        assertEquals(15, knightBeingDefendedSecond.getCurrentHealth());

        knight.defend(knightBeingDefendedSecond);
        knightBeingDefendedFirst.receiveAttack(6);
        knightBeingDefendedSecond.receiveAttack(6);

        assertEquals(11, knight.getCurrentHealth());
        assertEquals(13, knightBeingDefendedFirst.getCurrentHealth());
        assertEquals(15, knightBeingDefendedSecond.getCurrentHealth());
    }

}
