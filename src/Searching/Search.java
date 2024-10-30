package Searching;

public class Search {
    public int linearSearch(int[] arr, int target) {
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearchRec(int[] arr, int target) {
        return binarySearchRec(arr, 0, arr.length - 1, target);
    }

    private int binarySearchRec(int[] arr, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;
        if (arr[middle] == target) {
            return middle;
        }
        if (target < arr[middle]) {
            return binarySearchRec(arr, target, left, middle - 1);
        }

        return binarySearchRec(arr, target, middle + 1, right);
    }

    public int binarySearch(int[] arr, int target) {
        var left = 0;
        var right = arr.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;
            if (arr[middle] == target) {
                return middle;
            }
            if (target < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public int ternarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int partitionSize = (right - left) / 3;
        int mid1 = left + partitionSize;
        int mid2 = right - partitionSize;


        if (arr[mid1] == target) {
            return mid1;
        }

        if (arr[mid2] == target) {
            return mid2;
        }

        if (target < arr[mid1]) {
            return ternarySearch(arr, target, left, mid1 - 1);
        }

        if (target > arr[mid2]) {
            return ternarySearch(arr, target, mid2 + 1, right);
        }

        return ternarySearch(arr, target, mid1 + 1, mid2 - 1);
    }

    public int jumpSearch(int[] arr, int target) {
        int blockSize = (int) Math.sqrt(arr.length);
        int start = 0;
        int next = blockSize;

        while (start < arr.length && arr[next - 1] < target) {
            start = next;

            next += blockSize;
            if (next > arr.length) {
                next = arr.length;
            }
        }

        for (var i = start; i < next; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int exponentialSearch(int[] array, int target) {
        int bound = 1;
        while (bound < array.length && array[bound] < target) {
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);
        return binarySearchRec(array, target, left, right);
    }
}
