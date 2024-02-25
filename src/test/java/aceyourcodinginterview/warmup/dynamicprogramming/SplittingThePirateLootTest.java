package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.SplittingThePirateLoot.canSplitIntoThreeEqualShares;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SplittingThePirateLootTest {
    @Test
    void testCanSplitIntoThreeEqualShares() {
        assertEquals(1, canSplitIntoThreeEqualShares(new int[]{1, 1, 1}));
        assertEquals(0, canSplitIntoThreeEqualShares(new int[]{3, 3, 3, 3}));
        assertEquals(0, canSplitIntoThreeEqualShares(new int[]{30}));
        assertEquals(1, canSplitIntoThreeEqualShares(new int[]{1, 2, 3, 4, 5, 5, 7, 7, 8, 10, 12, 19, 25}));
    }
}
