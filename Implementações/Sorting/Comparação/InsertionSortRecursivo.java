public class InsertionSortRecursivo {
    
    public static void insertionSortRecursivo (int[] array) {

        insertionSortRecursivo(array, array.length);
    }


    private static void insertionSortRecursivo(int[] array, int n) {
        if (n == 1) return;

        insertionSortRecursivo(array, n - 1);

        int key = n - 1;

        int j = n - 2;

        while (j > 0 && array[j] < array[key]) {
            array[j + 1] = array[j];
            j--;
        }

        array[j + 1] = array[key];

    }
}
