package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.greedy.CarFueling.*;
import static org.junit.jupiter.api.Assertions.*;

class CarFuelingTest {
    @Test
    void testComputeMinRefills() {
        assertEquals(2, computeMinRefills(950, 400, new int[]{200, 375, 550, 750}));
        assertEquals(-1, computeMinRefills(10, 3, new int[]{1, 2, 5, 9}));
        assertEquals(0, computeMinRefills(200, 250, new int[]{100, 150}));
    }

    @Test
    void testTankHasEnoughFuelToCoverDistance() {
        assertTrue(tankHasEnoughFuelToCoverDistance(250, 200));
        assertFalse(tankHasEnoughFuelToCoverDistance(400, 950));
    }

    @Test
    void testNoNearByPetrolStationAvailable() {
        assertTrue(noNearByPetrolStationAvailable(new int[]{100, 400}, 250));
        assertFalse(noNearByPetrolStationAvailable(new int[]{100, 150}, 200));
    }
}
