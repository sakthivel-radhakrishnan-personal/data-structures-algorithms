package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.CoinChange.findMinNoOfCoins;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {
    @Test
    void testFindMinNoOfCoins() {
        assertEquals(1, findMinNoOfCoins(1, new int[]{1, 3, 4}));
        assertEquals(1, findMinNoOfCoins(4, new int[]{1, 3, 4}));
        assertEquals(2, findMinNoOfCoins(6, new int[]{1, 3, 4}));
        assertEquals(3, findMinNoOfCoins(9, new int[]{1, 3, 4}));
        assertEquals(3, findMinNoOfCoins(10, new int[]{1, 3, 4}));
        assertEquals(4, findMinNoOfCoins(15, new int[]{1, 3, 4}));
        assertEquals(7, findMinNoOfCoins(26, new int[]{1, 3, 4}));
        assertEquals(9, findMinNoOfCoins(34, new int[]{1, 3, 4}));
    }
}
