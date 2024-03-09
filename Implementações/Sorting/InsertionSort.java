/**
 * InsertionSort
 */
public class InsertionSort {

    public static void insertionSort(int[] array) {
        
        for (int j = 0; j < array.length; j++) {
            int i = array.length - 1;

            while(i > 0 && array[i] < array[i - 1]) {
                Util.Util.swap(array, i, i - 1);
                i--;
            }
        }
    }
}