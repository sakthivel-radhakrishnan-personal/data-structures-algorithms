package aceyourcodinginterview.warmup.divideandconquer;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.divideandconquer.BinarySearch.iterativeSearch;
import static aceyourcodinginterview.warmup.divideandconquer.BinarySearch.recursiveSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void testRecursiveSearch() {
        assertEquals(1, recursiveSearch(new int[]{1, 5, 8, 12, 13}, 5, 0, 4));
        assertEquals(1, iterativeSearch(new int[]{1, 5, 8, 12, 13}, 5));

        assertEquals(2, recursiveSearch(new int[]{1, 5, 8, 12, 13}, 8, 0, 4));
        assertEquals(2, iterativeSearch(new int[]{1, 5, 8, 12, 13}, 8));

        assertEquals(-1, recursiveSearch(new int[]{1, 5, 8, 12, 13}, 80, 0, 4));
        assertEquals(-1, iterativeSearch(new int[]{1, 5, 8, 12, 13}, 80));

        assertEquals(7, recursiveSearch(new int[]{1, 5, 8, 12, 13, 30, 33, 55}, 55, 0, 7));
        assertEquals(7, iterativeSearch(new int[]{1, 5, 8, 12, 13, 30, 33, 55}, 55));

        assertEquals(recursiveSearch(new int[]{1, 5, 8, 12, 13, 30, 33, 55}, 55, 0, 7), iterativeSearch(new int[]{1, 5, 8, 12, 13, 30, 33, 55}, 55));
        assertEquals(recursiveSearch(new int[]{1, 5, 8, 12, 13}, 80, 0, 4), iterativeSearch(new int[]{1, 5, 8, 12, 13}, 80));
    }
}
