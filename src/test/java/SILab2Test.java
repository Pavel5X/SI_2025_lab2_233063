import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private final String validCard = "1234567890123456";


    @Test
    public void testEveryStatement() {
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(null, validCard));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        List<Item> items = List.of(new Item("Apple", 2, 100, 0.0));
        assertEquals(200.0, SILab2.checkCart(items, validCard));
    }

    @Test
    public void testMultipleCondition() {
        List<Item> items;

        items = List.of(new Item("Item", 1, 100, 0.0));
        assertEquals(100.0, SILab2.checkCart(items, validCard));


        items = List.of(new Item("Item", 1, 350, 0.0));
        assertEquals(320.0, SILab2.checkCart(items, validCard));

        items = List.of(new Item("Item", 1, 100, 0.1));
        assertEquals(90.0 - 30, SILab2.checkCart(items, validCard));

        items = List.of(new Item("Item", 11, 100, 0.0));
        assertEquals(1100.0 - 30, SILab2.checkCart(items, validCard));


        items = List.of(new Item("Item", 1, 400, 0.2));
        assertEquals(320.0 - 30, SILab2.checkCart(items, validCard));


        items = List.of(new Item("Item", 11, 350, 0.0));
        assertEquals(3850.0 - 30, SILab2.checkCart(items, validCard));


        items = List.of(new Item("Item", 11, 100, 0.1));
        assertEquals(990.0 - 30, SILab2.checkCart(items, validCard));


        items = List.of(new Item("Item", 15, 400, 0.1));
        assertEquals(5400.0 - 30, SILab2.checkCart(items, validCard));
    }
}