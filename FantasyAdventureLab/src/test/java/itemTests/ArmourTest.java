package itemTests;

import items.Armour;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmourTest {

    Armour armour;

    @Before
    public void before() {
        armour = new Armour("Shield", 2);
    }

    @Test
    public void canGetArmourValue(){
        assertEquals(2, armour.getArmourValue());
    }

    @Test
    public void canBlockDamage(){
        assertEquals(1, armour.block(3));
    }

}
