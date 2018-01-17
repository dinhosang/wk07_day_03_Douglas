package itemTests;

import items.HealingItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingItemTest {

    HealingItem healingItem;

    @Before
    public void before() {
        healingItem = new HealingItem("Potion", 5);
    }

    @Test
    public void canGetHealingValue() {
        assertEquals(5, healingItem.getHealingValue());
    }
}
