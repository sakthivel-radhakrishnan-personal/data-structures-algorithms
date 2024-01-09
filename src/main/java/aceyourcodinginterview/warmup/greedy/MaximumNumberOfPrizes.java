package aceyourcodinginterview.warmup.greedy;

import java.util.ArrayList;
import java.util.List;

public class MaximumNumberOfPrizes {
    static List<Integer> findMaxNoOfPrizes(int n) {
        List<Integer> result = new ArrayList<>();
        for (int l = 1; n > 0; l++) {
            if (n <= 2 * l) {
                result.add(n);
                n -= n;
            } else {
                result.add(l);
                n -= l;
            }
        }
        return result;
    }
}
