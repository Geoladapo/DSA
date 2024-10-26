package Sorting;

public class SelectionSort {
    public void sort(int[] arr){
        for(var i = 0; i < arr.length; i++){
            var minIndex = i;
            for(var j =i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
