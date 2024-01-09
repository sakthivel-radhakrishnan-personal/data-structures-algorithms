package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.greedy.MaxDotProduct.maxDotProduct;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDotProductTest {

    @Test
    void testMaxDotProduct() {
        assertEquals(0, maxDotProduct(new int[]{0}, new int[]{0}));
        assertEquals(1, maxDotProduct(new int[]{1}, new int[]{1}));
        assertEquals(2, maxDotProduct(new int[]{1}, new int[]{2}));
        assertEquals(2, maxDotProduct(new int[]{2}, new int[]{1}));
        assertEquals(4, maxDotProduct(new int[]{2}, new int[]{2}));
        assertEquals(6, maxDotProduct(new int[]{2}, new int[]{3}));

        assertEquals(0, maxDotProduct(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(1, maxDotProduct(new int[]{1, 0}, new int[]{1, 0}));
        assertEquals(2, maxDotProduct(new int[]{1, 0}, new int[]{2, 0}));
        assertEquals(2, maxDotProduct(new int[]{2, 0}, new int[]{1, 0}));
        assertEquals(4, maxDotProduct(new int[]{2, 0}, new int[]{2, 0}));
        assertEquals(6, maxDotProduct(new int[]{2, 0}, new int[]{3, 0}));
        assertEquals(6, maxDotProduct(new int[]{2, 0}, new int[]{3, 1}));
        assertEquals(6, maxDotProduct(new int[]{2, 0}, new int[]{3, 2}));
        assertEquals(6, maxDotProduct(new int[]{2, 0}, new int[]{3, 3}));
        assertEquals(8, maxDotProduct(new int[]{2, 0}, new int[]{3, 4}));

        assertEquals(0, maxDotProduct(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertEquals(1, maxDotProduct(new int[]{1, 0, 0}, new int[]{1, 0, 0}));
        assertEquals(2, maxDotProduct(new int[]{1, 0, 0}, new int[]{2, 0, 0}));
        assertEquals(2, maxDotProduct(new int[]{2, 0, 0}, new int[]{1, 0, 0}));

        assertEquals(1400, maxDotProduct(new int[]{100, 200, 300}, new int[]{1, 2, 3}));
    }
}
