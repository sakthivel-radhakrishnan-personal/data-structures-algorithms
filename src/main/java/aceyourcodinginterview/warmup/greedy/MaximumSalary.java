package aceyourcodinginterview.warmup.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumSalary {
    static String largestNumberConcatenation(String[] numbers) {
        List<String> numberList = Arrays.asList(numbers);
        numberList.sort(Collections.reverseOrder(new NumericComparator()));
        return String.join("", numberList);
    }

    static class NumericComparator implements Comparator<String> {
        @Override
        public int compare(String num1, String num2) {
            String concat1 = String.format("%s%s", num1, num2);
            String concat2 = String.format("%s%s", num2, num1);
            return concat1.compareTo(concat2);
        }
    }
}
