package algorithm;

public class BubbleSort {

    public static void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = input.length - 1; j > i; j--) {
                if (input[i] > input[j]) {
                    swap(input, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
