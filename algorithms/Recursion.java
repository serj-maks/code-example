public class Recursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        System.out.println(recursionSum(array, array.length));

        System.out.println(recursionMax(array, array.length-1));
    }

    // нахождение суммы
    public static int recursionSum(int[] array, int index) {
        if (index <= 0) {
            return 0;
        } else {
            return (recursionSum(array, index - 1) + array[index - 1]);
        }
    }

    // нахождение максимального элемента
    public static int recursionMax(int[] array, int index) {
        if (index > 0) {
            return Math.max(array[index], recursionMax(array, index - 1));
        } else {
            return array[0];
        }
    }
}
