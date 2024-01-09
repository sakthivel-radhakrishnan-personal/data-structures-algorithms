package aceyourcodinginterview.warmup.greedy;

import java.util.Arrays;

public class MaxDotProduct {
    static long maxDotProduct(int[] a, int[] b) {
        long result = 0;

        if (a.length == 1 && b.length == 1) {
            return (long) a[0] * (long) b[0];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            result += (long) a[i] * (long) b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxDotProduct(new int[]{2, 3, 9}, new int[]{7, 4, 2}));
    }
}
