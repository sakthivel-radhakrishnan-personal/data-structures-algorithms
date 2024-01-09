package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.LongestCommonSubsequence3.findLCSBottomUp;
import static aceyourcodinginterview.warmup.dynamicprogramming.LongestCommonSubsequence3.findLCSRecursive;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequence3Test {
    @Test
    void testFindLCSRecursive() {
        assertEquals(2, findLCSRecursive(new int[]{1, 2, 3}, new int[]{2, 1, 3}, new int[]{1, 3, 5}, 3, 3, 3));
        assertEquals(3, findLCSRecursive(new int[]{8, 3, 2, 1, 7}, new int[]{8, 2, 1, 3, 8, 10, 7}, new int[]{6, 8, 3, 1, 4, 7}, 5, 7, 6));
        assertEquals(0, findLCSRecursive(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{1, 3, 5}, 3, 3, 3));
    }

    @Test
    void testFindLCSBottomUp() {
        assertEquals(2, findLCSBottomUp(new int[]{1, 2, 3}, new int[]{2, 1, 3}, new int[]{1, 3, 5}));
        assertEquals(3, findLCSBottomUp(new int[]{8, 3, 2, 1, 7}, new int[]{8, 2, 1, 3, 8, 10, 7}, new int[]{6, 8, 3, 1, 4, 7}));
        assertEquals(0, findLCSBottomUp(new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{1, 3, 5}));
    }
}
