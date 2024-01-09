package aceyourcodinginterview.warmup.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxValueOfLoot {

    record Item(int value, int weight) {
    }

    static double findMaxLootValue(int capacity, int[] values, int[] weights) {
        double totalValue = 0.0;
        if (capacity <= 0) {
            return totalValue;
        }

        List<Item> items = getItemsSortedByValue(values, weights);

        for (Item item : items) {
            if (capacity <= 0) {
                return totalValue;
            } else if ((capacity - item.weight()) >= 0) {
                totalValue += item.value();
            } else {
                totalValue += ((double) item.value() / item.weight()) * capacity;
            }
            capacity = capacity - item.weight();
        }
        return totalValue;
    }

    static List<Item> getItemsSortedByValue(int[] values, int[] weights) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            items.add(new Item(values[i], weights[i]));
        }
        items.sort(Collections.reverseOrder(new ItemSortingComparator()));
        return items;
    }

    static class ItemSortingComparator implements Comparator<Item> {
        @Override
        public int compare(Item o1, Item o2) {
            double rate1 = (double) o1.value() / o1.weight();
            double rate2 = (double) o2.value() / o2.weight();
            return Double.compare(rate1, rate2);
        }
    }
}
