package aceyourcodinginterview.warmup.divideandconquer;

public class BinarySearch {
    static int recursiveSearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return recursiveSearch(arr, target, left, mid - 1);
        } else {
            return recursiveSearch(arr, target, mid + 1, right);
        }
    }

    static int iterativeSearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (right >= left) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
