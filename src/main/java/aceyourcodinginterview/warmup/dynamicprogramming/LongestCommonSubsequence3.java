package aceyourcodinginterview.warmup.dynamicprogramming;

public class LongestCommonSubsequence3 {
    static int findLCSRecursive(int[] a, int[] b, int[] c, int i, int j, int k) {
        if (i == 0 || j == 0 || k == 0) {
            return 0;
        }

        if (a[i - 1] == b[j - 1] && b[j - 1] == c[k - 1]) {
            return 1 + findLCSRecursive(a, b, c, i - 1, j - 1, k - 1);
        } else {
            return Math.max(findLCSRecursive(a, b, c, i - 1, j, k), Math.max(findLCSRecursive(a, b, c, i, j - 1, k), findLCSRecursive(a, b, c, i, j, k - 1)));
        }
    }

    static int findLCSBottomUp(int[] a, int[] b, int[] c) {
        int m = a.length;
        int n = b.length;
        int o = c.length;

        int[][][] table = new int[m + 1][n + 1][o + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= o; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        table[i][j][k] = 0;
                    } else if (a[i - 1] == b[j - 1] && b[j - 1] == c[k - 1]) {
                        table[i][j][k] = 1 + table[i - 1][j - 1][k - 1];
                    } else {
                        table[i][j][k] = Math.max(table[i - 1][j][k], Math.max(table[i][j - 1][k], table[i][j][k - 1]));
                    }
                }
            }
        }
        return table[m][n][o];
    }
}
