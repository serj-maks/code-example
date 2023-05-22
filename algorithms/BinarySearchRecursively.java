import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchRecursively {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};

        int recursionResult = runBinarySearchRecursively(testArray, 3, 1, 5);
        System.out.println(recursionResult);

        int arraysClassResult = Arrays.binarySearch(testArray, 3);
        System.out.println(arraysClassResult);

        List<Integer> testList = List.of(1,2,3,4,5,6,7,8,9);
        int collectionsClassResult = Collections.binarySearch(testList, 3);
        System.out.println(collectionsClassResult);
    }

    public static int runBinarySearchRecursively(int[] array, int key, int low, int high) {
        int mid = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }

        if (key < array[mid]) {
            return runBinarySearchRecursively(array, key, low, mid - 1);
        } else if (key > array[mid]) {
            return runBinarySearchRecursively(array, key, mid + 1, high);
        } else {
            return mid;
        }
    }
}
