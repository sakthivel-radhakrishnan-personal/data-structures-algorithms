package aceyourcodinginterview.warmup.dynamicprogramming;

import java.util.Arrays;

public class SplittingThePirateLoot {

    static int canSplitIntoThreeEqualShares(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }

        int sum = Arrays.stream(nums).sum();

        if (sum % 3 > 0) {
            return 0;
        }

        boolean result = recursiveFind(nums, sum / 3, nums.length);

        return result ? 1 : 0;
    }

    static boolean recursiveFind(int[] nums, int share, int index) {
        if (index == 0) {
            return false;
        }

        if (share == 0) {
            return true;
        }

        if (nums[index-1] > share) {
            return recursiveFind(nums, share, index - 1);
        }

        return recursiveFind(nums, share - nums[index-1], index - 1) || recursiveFind(nums, share, index - 1);
    }
}
