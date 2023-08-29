import algorithm.MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 9, 4, 3, 2, 6, 5, 7, 8, 2, 1};
        System.out.println("Before: " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}