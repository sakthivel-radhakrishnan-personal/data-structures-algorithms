package aceyourcodinginterview.warmup.dynamicprogramming;

// https://docs.google.com/spreadsheets/d/1fB22iErUQff9DC7A54GSWUTj0cmDasIvtzxvecI2GQA/edit#gid=319195408
public class CoinChange {
    static int findMinNoOfCoins(int money, int[] denominations) {
        int[][] minCoins = new int[denominations.length][money + 1];

        for (int i = 0; i < denominations.length; i++) {
            for (int j = 1; j < money + 1; j++) {
                if (i == 0) {
                    minCoins[i][j] = j;
                } else {
                    if ((j - denominations[i]) < 0) {
                        minCoins[i][j] = minCoins[i - 1][j];
                    } else if (j - denominations[i] == 0) {
                        minCoins[i][j] = 1;
                    } else {
                        minCoins[i][j] = Math.min(minCoins[i - 1][j], 1 + minCoins[i][j - denominations[i]]);
                    }
                }
            }
        }
        printTable(minCoins);
        return minCoins[denominations.length - 1][money];
    }

    static void printTable(int[][] table) {
        for (int[] ints : table) {
            for (int j = 1; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
