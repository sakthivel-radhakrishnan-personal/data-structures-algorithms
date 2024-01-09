package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.greedy.CollectingSignatures.optimalPoints;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectingSignaturesTest {
    @Test
    void testOptimalPoints() {
        CollectingSignatures.Segment[] segments1 = generateSegmentArray(new int[]{2, 1, 3}, new int[]{5, 3, 6});
        assertEquals(1, optimalPoints(segments1).size());

        CollectingSignatures.Segment[] segments2 = generateSegmentArray(new int[]{4, 1, 2, 5}, new int[]{7, 3, 5, 6});
        assertEquals(2, optimalPoints(segments2).size());

        CollectingSignatures.Segment[] segments3 = generateSegmentArray(new int[]{9, 4, 1, 2, 5}, new int[]{12, 7, 3, 5, 6});
        assertEquals(3, optimalPoints(segments3).size());

        CollectingSignatures.Segment[] segments4 = generateSegmentArray(new int[]{11, 8, 4, 1, 2, 5}, new int[]{12, 10, 7, 3, 5, 6});
        assertEquals(4, optimalPoints(segments4).size());

        CollectingSignatures.Segment[] segments5 = generateSegmentArray(new int[]{13, 16, 20, 11, 8, 4, 1, 2, 5}, new int[]{14, 20, 25, 12, 10, 7, 3, 5, 6});
        assertEquals(6, optimalPoints(segments5).size());
    }

    static CollectingSignatures.Segment[] generateSegmentArray(int[] startPoints, int[] endPoints) {
        int length = startPoints.length;
        CollectingSignatures.Segment[] segments = new CollectingSignatures.Segment[length];
        for (int i = 0; i < length; i++) {
            segments[i] = new CollectingSignatures.Segment(startPoints[i], endPoints[i]);
        }
        return segments;
    }
}
