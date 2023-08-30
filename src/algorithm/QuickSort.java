package algorithm;

public class QuickSort {

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int partition(int[] input, int left, int right) {
        int pivot = input[right];
        int low = left, high = right - 1;
        while (true) {
            while (low <= high && input[low] < pivot)
                low++;
            while (high >= low && input[high] > pivot)
                high--;
            if (low >= high)
                break;
            swap(input, low, high);
            low++;
            high--;
        }
        swap(input, low, right);
        return low;
    }

    private static void sort(int[] input, int left, int right) {
        if (left >= right)
            return;
        int pivot = partition(input, left, right);
        sort(input, left, pivot - 1);
        sort(input, pivot + 1, right);
    }

    public static void sort(int[] input) {
        if (input == null || input.length < 2)
            return;
        sort(input, 0, input.length - 1);
    }
}
