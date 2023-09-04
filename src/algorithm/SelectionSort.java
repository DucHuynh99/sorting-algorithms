package algorithm;

public class SelectionSort {

    public static void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = input[i];
            input[i] = input[min_idx];
            input[min_idx] = temp;
        }
    }
}
