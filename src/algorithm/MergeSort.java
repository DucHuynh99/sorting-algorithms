package algorithm;

public class MergeSort {

    /**
     * Merge Sort
     * Complexity: n.log(n) - n.log(n) - n.log(n)
     * Memory: n
     * Stable: yes
     * Method: merging
     * @param arr array of integer number
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for(j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
