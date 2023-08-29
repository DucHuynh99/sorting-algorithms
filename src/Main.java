import algorithm.RadixSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{181, 51, 11, 33, 211, 39, 560, 2, 27, 24, 12};
        System.out.println("Before: " + Arrays.toString(arr));
        RadixSort.sort(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}