package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.LongestCommonSubsequence2.findLCSBottomUp;
import static aceyourcodinginterview.warmup.dynamicprogramming.LongestCommonSubsequence2.findLCSRecursive;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequence2Test {
    @Test
    void testFindLCSRecursive() {
        assertEquals(2, findLCSRecursive(new int[]{2, 7, 5}, new int[]{2, 5}, 3, 2));
        assertEquals(0, findLCSRecursive(new int[]{7}, new int[]{1, 2, 3, 4}, 1, 4));
        assertEquals(2, findLCSRecursive(new int[]{2, 7, 8, 3}, new int[]{5, 2, 8, 7}, 4, 4));
        assertEquals(1, findLCSRecursive(new int[]{1, 2, 3}, new int[]{3, 2, 1}, 3, 3));
        assertEquals(2, findLCSRecursive(new int[]{2, 3, 9}, new int[]{2, 9, 7, 8}, 3, 4));
    }

    @Test
    void testFindLCSBottomUp() {
        assertEquals(2, findLCSBottomUp(new int[]{2, 7, 5}, new int[]{2, 5}));
        assertEquals(0, findLCSBottomUp(new int[]{7}, new int[]{1, 2, 3, 4}));
        assertEquals(2, findLCSBottomUp(new int[]{2, 7, 8, 3}, new int[]{5, 2, 8, 7}));
        assertEquals(1, findLCSBottomUp(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        assertEquals(2, findLCSBottomUp(new int[]{2, 3, 9}, new int[]{2, 9, 7, 8}));
    }
}
