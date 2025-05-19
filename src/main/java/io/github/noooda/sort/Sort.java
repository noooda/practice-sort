package io.github.noooda.sort;

public class Sort {
    public static int[] bubble(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return array;
    }
}
