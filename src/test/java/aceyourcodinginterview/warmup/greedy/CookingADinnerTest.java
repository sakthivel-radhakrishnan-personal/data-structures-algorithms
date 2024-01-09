package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.greedy.CookingADinner.canCookFresh;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CookingADinnerTest {

    @Test
    void testWillFoodStayFresh() {
        assertEquals("Yes", canCookFresh(new int[]{3, 2, 1}, new int[]{1, 6, 1}));
        assertEquals("Yes", canCookFresh(new int[]{1}, new int[]{97}));
        assertEquals("Yes", canCookFresh(new int[]{1, 2}, new int[]{1, 2}));
        assertEquals("Yes", canCookFresh(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals("Yes", canCookFresh(new int[]{1, 2, 3}, new int[]{1, 2, 4}));
        assertEquals("Yes", canCookFresh(new int[]{1, 2, 3}, new int[]{1, 3, 4}));
        assertEquals("No", canCookFresh(new int[]{8, 8}, new int[]{1, 7}));
        assertEquals("No", canCookFresh(new int[]{3, 2, 1}, new int[]{1, 1, 1}));
        assertEquals("No", canCookFresh(new int[]{3, 2, 1}, new int[]{1, 1, 2}));
        assertEquals("No", canCookFresh(new int[]{3, 2, 1}, new int[]{1, 2, 2}));
        assertEquals("No", canCookFresh(new int[]{3, 2, 1}, new int[]{2, 2, 2}));
        assertEquals("No", canCookFresh(new int[]{3, 2, 1}, new int[]{2, 2, 3}));
        assertEquals("No", canCookFresh(new int[]{2, 2, 2}, new int[]{2, 2, 2}));
        assertEquals("No", canCookFresh(new int[]{1, 1}, new int[]{0, 0}));
    }
}
