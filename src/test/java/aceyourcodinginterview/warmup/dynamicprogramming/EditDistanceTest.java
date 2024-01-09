package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.EditDistance.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EditDistanceTest {
    @Test
    void testFindMinNoOfEditsRecursive() {
        assertEquals(0, findMinNoOfEditsRecursive("ab", "ab", "ab".length(), "ab".length()));
        assertEquals(3, findMinNoOfEditsRecursive("short", "ports", "short".length(), "ports".length()));
        assertEquals(5, findMinNoOfEditsRecursive("editing", "distance", "editing".length(), "distance".length()));
    }

    @Test
    void testFindMinNoOfEditsMemoization() {
        assertEquals(0, findMinNoOfEditsMemoization("ab", "ab", "ab".length(), "ab".length(), new int["ab".length() + 1]["ab".length() + 1]));
        assertEquals(3, findMinNoOfEditsMemoization("short", "ports", "short".length(), "ports".length(), new int["short".length() + 1]["ports".length() + 1]));
        assertEquals(5, findMinNoOfEditsMemoization("editing", "distance", "editing".length(), "distance".length(), new int["editing".length() + 1]["distance".length() + 1]));
    }

    @Test
    void testFindMinNoOfEditsDP() {
        assertEquals(0, findMinNoOfEditsBottomUp("ab", "ab", "ab".length(), "ab".length()));
        assertEquals(3, findMinNoOfEditsBottomUp("short", "ports", "short".length(), "ports".length()));
        assertEquals(5, findMinNoOfEditsBottomUp("editing", "distance", "editing".length(), "distance".length()));
    }
}
