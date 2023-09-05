package algorithm;

public class SelectionSort {

    /**
     * Selection Sort
     * Complexity: n^2 - n^2 - n^2
     * Memory: 1
     * Stable: no
     * Method: Selection
     * @param input array of integer number
     */
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
