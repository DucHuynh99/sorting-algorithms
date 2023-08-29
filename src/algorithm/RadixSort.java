package algorithm;

import java.util.ArrayList;

public class RadixSort {
    private static final int RADIX = 10;

    public static void sort(int[] input) {
        ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < RADIX; i++) {
            bucket.add(i, new ArrayList<>());
        }
        boolean maxLength = false;
        int tmp, placement = 1;
        while (!maxLength) {
            maxLength = true;
            for (Integer i : input) {
                tmp = i / placement;
                bucket.get(tmp % RADIX).add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }
            int a = 0;
            for (ArrayList<Integer> row : bucket) {
                for (Integer b : row) {
                    input[a++] = b;
                }
                row.clear();
            }
            placement *= RADIX;
        }
    }
}
