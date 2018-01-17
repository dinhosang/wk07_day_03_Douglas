import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest  {

    Item item;

    @Before
    public void before() {
        item = new Item("Sword");
    }

    @Test
    public void canGetName() {
        assertEquals("Sword", item.getName());
    }
}
