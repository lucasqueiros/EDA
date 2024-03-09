public class SelectionSort {
    
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            int indiceMenor = 0;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indiceMenor])
                    indiceMenor = j;
            }
            
            Util.Util.swap(array, indiceMenor, i);
        }
    }
}
