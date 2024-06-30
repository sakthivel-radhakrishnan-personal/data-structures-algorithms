package datastructures.hashtable;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageDeliveryLimiterTest {

    @Test
    void testGetDeliveryStatus() {
        // Test case 1
        List<Integer> timeStamp1 = List.of(1, 2, 3, 4, 5);
        List<String> messages1 = List.of("a", "b", "a", "a", "b");
        int k1 = 1;
        List<String> expected1 = List.of("true", "true", "true", "false", "true");
        assertEquals(expected1, MessageDeliveryLimiter.getDeliveryStatus(timeStamp1, messages1, k1));

        // Test case 2
        List<Integer> timeStamp2 = List.of(1, 1, 1, 11);
        List<String> messages2 = List.of("a", "a", "b", "a");
        int k2 = 5;
        List<String> expected2 = List.of("true", "false", "true", "true");
        assertEquals(expected2, MessageDeliveryLimiter.getDeliveryStatus(timeStamp2, messages2, k2));

        // Test case 3. Set k = 5
        List<Integer> timeStamp3 = List.of(1, 4, 5, 10, 11, 14);
        List<String> messages3 = List.of("hello", "bye", "bye", "hello", "bye", "hello");
        int k3 = 5;
        List<String> expected3 = List.of("true", "true", "false", "true", "true", "false");
        assertEquals(expected3, MessageDeliveryLimiter.getDeliveryStatus(timeStamp3, messages3, k3));
    }
}
