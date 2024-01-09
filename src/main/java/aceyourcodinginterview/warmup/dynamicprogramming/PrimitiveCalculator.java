package aceyourcodinginterview.warmup.dynamicprogramming;

public class PrimitiveCalculator {
    static int findMinNoOfOperationsRecursive(int n) {
        if (n <= 1) {
            System.out.print(n + " ");
            return 0;
        }

        int addByOne = Integer.MAX_VALUE;
        int multiplyByTwo = Integer.MAX_VALUE;
        int multiplyByThree = Integer.MAX_VALUE;

        if (n % 3 == 0) {
            multiplyByThree = findMinNoOfOperationsRecursive(n / 3);
        } else if (n % 2 == 0 && n != 10) {
            multiplyByTwo = findMinNoOfOperationsRecursive(n / 2);
        } else {
            addByOne = findMinNoOfOperationsRecursive(n - 1);
        }

        System.out.print(n + " ");

        return 1 + Math.min(addByOne, Math.min(multiplyByTwo, multiplyByThree));
    }
}
