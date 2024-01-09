package aceyourcodinginterview.warmup.dynamicprogramming;

public class EditDistance {
    static int findMinNoOfEditsRecursive(String s1, String s2, int i, int j) {
        if (i == 0) {
            return j;
        }

        if (j == 0) {
            return i;
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return findMinNoOfEditsRecursive(s1, s2, i - 1, j - 1);
        } else {
            int insert = findMinNoOfEditsRecursive(s1, s2, i, j - 1);
            int remove = findMinNoOfEditsRecursive(s1, s2, i - 1, j);
            int replace = findMinNoOfEditsRecursive(s1, s2, i - 1, j - 1);
            return 1 + Math.min(replace, Math.min(insert, remove));
        }
    }

    static int findMinNoOfEditsMemoization(String s1, String s2, int i, int j, int[][] table) {
        if (i == 0) {
            return j;
        }

        if (j == 0) {
            return i;
        }

        if (table[i][j] > 0) {
            return table[i][j];
        }

        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return findMinNoOfEditsRecursive(s1, s2, i - 1, j - 1);
        } else {
            int insert = findMinNoOfEditsRecursive(s1, s2, i, j - 1);
            int remove = findMinNoOfEditsRecursive(s1, s2, i - 1, j);
            int replace = findMinNoOfEditsRecursive(s1, s2, i - 1, j - 1);
            return 1 + Math.min(replace, Math.min(insert, remove));
        }
    }

    static int findMinNoOfEditsBottomUp(String s1, String s2, int m, int n) {
        int[][] table = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    table[i][j] = j;
                } else if (j == 0) {
                    table[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1];
                } else {
                    table[i][j] = 1 + Math.min(table[i - 1][j - 1], Math.min(table[i][j - 1], table[i - 1][j]));
                }
            }
        }
        return table[m][n];
    }
}
