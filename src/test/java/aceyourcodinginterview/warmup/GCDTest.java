package aceyourcodinginterview.warmup;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.Util.generateRandomNumber;
import static aceyourcodinginterview.warmup.GCD.iterativeGCD;
import static aceyourcodinginterview.warmup.GCD.recursiveGCD;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GCDTest {
    private static final int MIN = 0;
    private static final int MAX = 10_000_00;

    @Test
    void testRecursiveGCDWithZero() {
        assertEquals(0, recursiveGCD(0, 0));
        assertEquals(1, recursiveGCD(0, 1));
        assertEquals(1, recursiveGCD(1, 0));
    }

    @Test
    void testIterativeGCDWithZero() {
        assertEquals(0, iterativeGCD(0, 0));
        assertEquals(1, iterativeGCD(0, 1));
        assertEquals(1, iterativeGCD(1, 0));
    }
    @Test
    void testRecursiveGCD() {
        assertEquals(1, recursiveGCD(1, 1));
        assertEquals(1, recursiveGCD(1, 2));
        assertEquals(1, recursiveGCD(2, 1));
        assertEquals(17657, recursiveGCD(28851538, 1183019));
        assertEquals(6, recursiveGCD(270, 192));
        assertEquals(4, recursiveGCD(14159572, 63967072));
    }

    @Test
    void testIterativeGCD() {
        assertEquals(1, iterativeGCD(1, 1));
        assertEquals(1, iterativeGCD(1, 2));
        assertEquals(1, iterativeGCD(2, 1));
        assertEquals(17657, iterativeGCD(28851538, 1183019));
        assertEquals(6, iterativeGCD(270, 192));
        assertEquals(4, iterativeGCD(14159572, 63967072));
    }

    @Test
    void compareRecursiveAndIterativeGCD() {
        for (int i = 0; i < 100_000_00; i++) {
            int a = generateRandomNumber(MIN, MAX);
            int b = generateRandomNumber(MIN, MAX);
            assertEquals(recursiveGCD(a, b), iterativeGCD(a, b));
        }
    }
}
