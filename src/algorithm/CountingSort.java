package algorithm;

public class CountingSort {

    public static void sort(int[] input, int k) {
        int[] counter = new int[k + 1];
        for (int i : input) {
            counter[i]++;
        }
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i] > 0) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }

    /**
     * Counting Sort
     * Complexity:
     * Memory:
     * Stable:
     * Method:
     * @param input array of integer number
     */
    public static void sort(int[] input) {
        if (input == null || input.length < 2) return;
        // Find max value
        int k = input[0];
        for (int i : input) {
            if (i > k) {
                k = i;
            }
        }
        sort(input, k);
    }
}
