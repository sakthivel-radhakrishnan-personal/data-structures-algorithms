package aceyourcodinginterview.warmup.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static aceyourcodinginterview.warmup.dynamicprogramming.PrimitiveCalculator.findMinNoOfOperationsRecursive;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimitiveCalculatorTest {
    @Test
    void testFindMinNoOfOperationsRecursive() {
        assertEquals(0, findMinNoOfOperationsRecursive(1));
        System.out.println();
        assertEquals(3, findMinNoOfOperationsRecursive(5));
        System.out.println();
        assertEquals(2, findMinNoOfOperationsRecursive(6));
        System.out.println();
        assertEquals(3, findMinNoOfOperationsRecursive(8));
        System.out.println();
        assertEquals(4, findMinNoOfOperationsRecursive(20));
        System.out.println();
        assertEquals(6, findMinNoOfOperationsRecursive(34));
        System.out.println();
        assertEquals(6, findMinNoOfOperationsRecursive(99));
        System.out.println();
        assertEquals(3, findMinNoOfOperationsRecursive(10));
        System.out.println();
        assertEquals(14, findMinNoOfOperationsRecursive(96234));
    }
}
