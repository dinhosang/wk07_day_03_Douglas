package itemTests;

import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest  {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Sword", 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Sword", weapon.getName());
    }
}
