import algorithm.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 1, 3, 0, 7, 6, 9, 8};
        System.out.println("Before: " + Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}