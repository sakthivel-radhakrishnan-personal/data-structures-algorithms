package aceyourcodinginterview.warmup.greedy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static aceyourcodinginterview.warmup.greedy.MaximumSalary.largestNumberConcatenation;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSalaryTest {
    @Test
    void testNumericComparator() {
        List<String> l1 = new ArrayList<>(List.of("9", "4", "6", "1", "9"));
        l1.sort(Collections.reverseOrder(new MaximumSalary.NumericComparator()));
        assertEquals("99641", String.join("", l1));
        assertEquals("9", l1.get(0));
        assertEquals("9", l1.get(1));
        assertEquals("6", l1.get(2));
        assertEquals("4", l1.get(3));
        assertEquals("1", l1.get(4));

        List<String> l2 = new ArrayList<>(List.of("23", "39", "92"));
        l2.sort(Collections.reverseOrder(new MaximumSalary.NumericComparator()));
        assertEquals("923923", String.join("", l2));
        assertEquals("92", l2.get(0));
        assertEquals("39", l2.get(1));
        assertEquals("23", l2.get(2));

        List<String> l3 = new ArrayList<>(List.of("21", "2"));
        l3.sort(Collections.reverseOrder(new MaximumSalary.NumericComparator()));
        assertEquals("221", String.join("", l3));
        assertEquals("2", l3.get(0));
        assertEquals("21", l3.get(1));
    }

    @Test
    void testLargestNumberConcatenation() {
        assertEquals("99641", largestNumberConcatenation(new String[]{"9", "4", "6", "1", "9"}));
        assertEquals("923923", largestNumberConcatenation(new String[]{"23", "39", "92"}));
        assertEquals("221", largestNumberConcatenation(new String[]{"21", "2"}));
    }
}
