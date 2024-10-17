package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);

    }

    private static void reverse(int[] array) {
        int maxlength = array.length - 1;
        int halfIndex = maxlength / 2;


        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxlength - i];
            array[maxlength - i] = temp;
            System.out.println(Arrays.toString(array));
        }
    }
}

