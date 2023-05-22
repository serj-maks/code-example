import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array = {3,5,7,8,1,9,4,6,2};

        System.out.println("before: " + Arrays.toString(array));
        sort(array);
        System.out.println("after: " + Arrays.toString(array));
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int minIndex = i; // minIndex - индекс наименьшего элемента
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            array[minIndex] = array[i];
            array[i] = min; // меняем местами наименьший с array[i]
        }
    }
}
