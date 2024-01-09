package aceyourcodinginterview.warmup.divideandconquer;

public class BinarySearchWithDuplicates {

    static int searchWithDuplicates(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (right >= left) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return findFirstOccurance(arr, target, mid);
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int findFirstOccurance(int[] arr, int target, int foundIndex) {
        while(foundIndex > 0 && arr[foundIndex - 1] == target) {
            foundIndex--;
        }
        return foundIndex;
    }
}
