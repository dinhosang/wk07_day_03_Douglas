import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon("Sword", 3);
    }

    @Test
    public void canGetDamage() {
        assertEquals(3, weapon.getDamage());
    }
}
