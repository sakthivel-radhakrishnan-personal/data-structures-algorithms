package aceyourcodinginterview.warmup.dynamicprogramming;

// Todo: Implement Memoization approach
public class LongestCommonSubsequence2 {
    static int findLCSRecursive(int[] a, int[] b, int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        }

        if (a[i - 1] == b[j - 1]) {
            return 1 + findLCSRecursive(a, b, i - 1, j - 1);
        } else {
            return Math.max(findLCSRecursive(a, b, i, j - 1), findLCSRecursive(a, b, i - 1, j));
        }
    }

    static int findLCSBottomUp(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int[][] table = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    table[i][j] = 0;
                } else if (a[i - 1] == b[j - 1]) {
                    table[i][j] = 1 + table[i - 1][j - 1];
                } else {
                    table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
                }
            }
        }
        return table[m][n];
    }
}
