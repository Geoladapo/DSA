package Sorting;

public class QuickSort {
    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        // Partition
        var boundary = partition(array, start, end);
        // Sort left
        sort(array, start, boundary);
        // Sort right
        sort(array, boundary + 1, end);

    }

    private int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;

        for (var i = start; i <= end; i++) {
            if (array[i] < pivot) {
                swap(array, i, ++boundary);
            }
        }
        return boundary;
    }

    public void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
