package aceyourcodinginterview.warmup.divideandconquer;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.divideandconquer.BinarySearchWithDuplicates.searchWithDuplicates;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchWithDuplicatesTest {
    @Test
    void testSearchWithDuplicates() {
        assertEquals(1, searchWithDuplicates(new int[]{2, 4, 4, 4, 7, 7, 9}, 4));
        assertEquals(4, searchWithDuplicates(new int[]{2, 4, 4, 4, 7, 7, 9}, 7));
        assertEquals(6, searchWithDuplicates(new int[]{2, 4, 4, 4, 7, 7, 9}, 9));
        assertEquals(-1, searchWithDuplicates(new int[]{2, 4, 4, 4, 7, 7, 9}, 90));
    }
}
