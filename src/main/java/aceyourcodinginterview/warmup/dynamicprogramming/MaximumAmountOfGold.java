package aceyourcodinginterview.warmup.dynamicprogramming;

public class MaximumAmountOfGold {
    static int findMaxAmountOfGoldRecursive(int capacity, int[] goldBars, int index) {
        if (capacity == 0) {
            return 0;
        }

        if (goldBars[index] <= capacity) {
            return goldBars[index];
        }

        return 0;
    }

    static int findMaxAmountOfGoldBottomUp(int capacity, int[] goldBars) {
        int[][] table = new int[goldBars.length][capacity + 1];

        for (int i = 0; i < goldBars.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (j == 0) {
                    table[i][j] = 0;
                } else if (i == 0) {
                    if (j < goldBars[i]) {
                        table[i][j] = 0;
                    } else {
                        table[i][j] = goldBars[i];
                    }
                } else if (j < goldBars[i]) {
                    table[i][j] = table[i-1][j];
                } else {
                    table[i][j] = Math.max(table[i-1][j], goldBars[i] + table[i][j - goldBars[i]]);
                }
            }
        }
        return table[goldBars.length-1][capacity];
    }
}
