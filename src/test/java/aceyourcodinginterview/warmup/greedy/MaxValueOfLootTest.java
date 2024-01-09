package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static aceyourcodinginterview.warmup.greedy.MaxValueOfLoot.findMaxLootValue;
import static aceyourcodinginterview.warmup.greedy.MaxValueOfLoot.getItemsSortedByValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxValueOfLootTest {

    @Test
    void testGetItemsSortedByValue() {
        List<MaxValueOfLoot.Item> items = getItemsSortedByValue(new int[]{600, 800, 200, 400, 100, 500}, new int[]{100, 100, 100, 100, 100, 100});
        assertEquals(800, items.get(0).value());
        assertEquals(600, items.get(1).value());
        assertEquals(500, items.get(2).value());
        assertEquals(400, items.get(3).value());
        assertEquals(200, items.get(4).value());
        assertEquals(100, items.get(5).value());
    }

    @Test
    void testMaxValueOfLoot() {
        assertEquals(180.0000, findMaxLootValue(50, new int[]{60, 100, 120}, new int[]{20, 50, 30}));
        assertEquals(166.66666666666669, findMaxLootValue(10, new int[]{500}, new int[]{30}));
        assertEquals(500, findMaxLootValue(1000, new int[]{500}, new int[]{30}));

        assertEquals(250.00000000000003, findMaxLootValue(15, new int[]{500}, new int[]{30}));
    }
}
