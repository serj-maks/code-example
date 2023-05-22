import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] testArray = {5, 6, 7, 8, 1, 2, 3, 4};
        quickSort(testArray, 0, testArray.length - 1);
        System.out.println(Arrays.toString(testArray));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
