package aceyourcodinginterview.warmup.divideandconquer;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    static int naiveApproach(int[] arr) {
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return 1;
            }
        }
        return 0;
    }

    static int usingMap(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
            if (countMap.get(i) > arr.length / 2) {
                return 1;
            }
        }
        return 0;
    }
}
