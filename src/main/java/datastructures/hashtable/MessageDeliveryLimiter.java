package datastructures.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageDeliveryLimiter {

    public static List<String> getDeliveryStatus(List<Integer> timeStamp, List<String> messages, int k) {
        Map<String, Integer> statusMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        int existingTimestamp, newTimestamp;
        String message;

        for (int i = 0; i < messages.size(); i++) {
            message = messages.get(i);
            if (statusMap.containsKey(message)) {
                existingTimestamp = statusMap.get(message);
                newTimestamp = timeStamp.get(i);

                if (newTimestamp - existingTimestamp > k) {
                    result.add("true");
                } else {
                    result.add("false");
                }
                statusMap.put(message, newTimestamp);
            } else {
                result.add("true");
                statusMap.put(message, timeStamp.get(i));
            }
        }
        return result;
    }
}
