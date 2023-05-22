import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] testArray = {5, 6, 7, 8, 1, 2, 3, 4};
        mergeSort(testArray, testArray.length);
        System.out.println(Arrays.toString(testArray));
    }

    public static void mergeSort(int[] array, int n) {
        if (n < 2) {
            return;
        }

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void merge(
        int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) {
            a[k++] = l[i++];
        }

        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
