package aceyourcodinginterview.warmup.greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CookingADinner {
    static String canCookFresh(int[] cookingDurations, int[] freshnessDurations) {
        List<Dish> dishes = getDishesSortedByFreshnessDuration(cookingDurations, freshnessDurations);

        for (int j = 0; j < dishes.size(); j++) {
            reduceFreshnessDurationByCookingDuration(dishes, dishes.get(j), j);
        }

        for (Dish dish : dishes) {
            if (dish.getFreshnessDuration() < 0) {
                return "No";
            }
        }
        return "Yes";
    }

    static void reduceFreshnessDurationByCookingDuration(List<Dish> dishes, Dish currentDish, int toIndex) {
        int remainingFreshnessTime;
        for (int i = 0; i < toIndex; i++) {
            remainingFreshnessTime = dishes.get(i).getFreshnessDuration() - currentDish.getCookingDuration();
            dishes.get(i).setFreshnessDuration(remainingFreshnessTime);
        }
    }

    static List<Dish> getDishesSortedByFreshnessDuration(int[] cookingDurations, int[] freshnessDurations) {
        List<Dish> dishes = new ArrayList<>();
        for (int i = 0; i < cookingDurations.length; i++) {
            dishes.add(new Dish(cookingDurations[i], freshnessDurations[i]));
        }
        dishes.sort(new DishComparator());
        return dishes;
    }

    static class DishComparator implements Comparator<Dish> {
        @Override
        public int compare(Dish d1, Dish d2) {
            return Integer.compare(d2.getFreshnessDuration(), d1.getFreshnessDuration());
        }
    }

    static class Dish {
        private final int cookingDuration;
        private int freshnessDuration;

        public Dish(int cookingDuration, int freshnessDuration) {
            this.cookingDuration = cookingDuration;
            this.freshnessDuration = freshnessDuration;
        }

        public int getCookingDuration() {
            return cookingDuration;
        }

        public int getFreshnessDuration() {
            return freshnessDuration;
        }

        public void setFreshnessDuration(int freshnessDuration) {
            this.freshnessDuration = freshnessDuration;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cookTime = new int[n];
        int[] freshTime = new int[n];
        for (int i = 0; i < n; i++) {
            cookTime[i] = scanner.nextInt();
            freshTime[i] = scanner.nextInt();
        }
        System.out.println(canCookFresh(cookTime, freshTime));
    }
}
