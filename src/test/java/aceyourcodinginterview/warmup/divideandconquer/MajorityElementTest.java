package aceyourcodinginterview.warmup.divideandconquer;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.divideandconquer.MajorityElement.naiveApproach;
import static aceyourcodinginterview.warmup.divideandconquer.MajorityElement.usingMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest {
    @Test
    void testNaiveApproach() {
        assertEquals(0, naiveApproach(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals(1, naiveApproach(new int[]{2, 3, 9, 2, 2}));
        assertEquals(0, naiveApproach(new int[]{1, 2, 3, 1}));
        assertEquals(0, naiveApproach(new int[]{512766168, 717383758, 5, 126144732, 5, 573799007, 5, 5, 5, 405079772}));
    }

    @Test
    void testUsingMap() {
        assertEquals(0, usingMap(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals(1, usingMap(new int[]{2, 3, 9, 2, 2}));
        assertEquals(0, usingMap(new int[]{1, 2, 3, 1}));
        assertEquals(0, usingMap(new int[]{512766168, 717383758, 5, 126144732, 5, 573799007, 5, 5, 5, 405079772}));
    }

    @Test
    void testCompareNaiveAndMapApproach() {
        assertEquals(naiveApproach(new int[]{1, 2, 3, 4, 5, 6, 7}), usingMap(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals(naiveApproach(new int[]{2, 3, 9, 2, 2}), usingMap(new int[]{2, 3, 9, 2, 2}));
        assertEquals(naiveApproach(new int[]{1, 2, 3, 1}), usingMap(new int[]{1, 2, 3, 1}));
        assertEquals(naiveApproach(new int[]{512766168, 717383758, 5, 126144732, 5, 573799007, 5, 5, 5, 405079772}), usingMap(new int[]{512766168, 717383758, 5, 126144732, 5, 573799007, 5, 5, 5, 405079772}));
    }
}
