package algorithm;

public class InsertionSort {

    /**
     * Insertion Sort
     * Complexity: n - n^2 - n^2
     * Memory: 1
     * Stable: yes
     * Method: insertion
     * @param input array of integer number
     */
    public static void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = key;
        }
    }
}
