package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.MaximumAmountOfGold.findMaxAmountOfGoldBottomUp;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumAmountOfGoldTest {
    @Test
    void testFindMaxAmountOfGoldBottomUp() {
        // assertEquals(1, findMaxAmountOfGoldBottomUp(10, new int[]{1}));
        // assertEquals(6, findMaxAmountOfGoldBottomUp(10, new int[]{1, 2, 3}));
        assertEquals(6, findMaxAmountOfGoldBottomUp(19, new int[]{5, 7, 12, 18}));
    }
}
