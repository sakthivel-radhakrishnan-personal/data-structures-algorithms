package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static aceyourcodinginterview.warmup.greedy.MaximumNumberOfPrizes.findMaxNoOfPrizes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MaximumNumberOfPrizesTest {
    @Test
    void testFindMaxNoOfPrizes() {
        assertTrue(findMaxNoOfPrizes(2).contains(2));
        assertEquals(1, findMaxNoOfPrizes(2).size());
        assertEquals(2, findMaxNoOfPrizes(2).stream().mapToInt(Integer::intValue).sum());

        assertTrue(findMaxNoOfPrizes(6).containsAll(List.of(1, 2, 3)));
        assertEquals(3, findMaxNoOfPrizes(6).size());
        assertEquals(6, findMaxNoOfPrizes(6).stream().mapToInt(Integer::intValue).sum());

        assertTrue(findMaxNoOfPrizes(8).containsAll(List.of(1, 2, 5)));
        assertEquals(3, findMaxNoOfPrizes(8).size());
        assertEquals(8, findMaxNoOfPrizes(8).stream().mapToInt(Integer::intValue).sum());

        assertTrue(findMaxNoOfPrizes(10).containsAll(List.of(1, 2, 3, 4)));
        assertEquals(4, findMaxNoOfPrizes(10).size());
        assertEquals(10, findMaxNoOfPrizes(10).stream().mapToInt(Integer::intValue).sum());

        assertTrue(findMaxNoOfPrizes(20).containsAll(List.of(1, 2, 3, 4, 10)));
        assertEquals(5, findMaxNoOfPrizes(20).size());
        assertEquals(20, findMaxNoOfPrizes(20).stream().mapToInt(Integer::intValue).sum());

        assertTrue(findMaxNoOfPrizes(100).containsAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 22)));
        assertEquals(13, findMaxNoOfPrizes(100).size());
        assertEquals(100, findMaxNoOfPrizes(100).stream().mapToInt(Integer::intValue).sum());

        assertEquals(44720, findMaxNoOfPrizes(1000000000).size());
        assertEquals(1000000000, findMaxNoOfPrizes(1000000000).stream().mapToInt(Integer::intValue).sum());
    }
}
