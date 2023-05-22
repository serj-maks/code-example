import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchIteratively {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        int result = runBinarySearchIteratively(testArray, 3, 1, 5);
        System.out.println(result);

        int arraysClassResult = Arrays.binarySearch(testArray, 3);
        System.out.println(arraysClassResult);

        List<Integer> testList = List.of(1,2,3,4,5,6,7,8,9);
        int collectionsClassResult = Collections.binarySearch(testList, 3);
        System.out.println(collectionsClassResult);
    }

    public static int runBinarySearchIteratively(int[] array, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
