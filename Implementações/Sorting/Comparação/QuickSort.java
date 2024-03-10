public class QuickSort {
     

    public static int particionamento(int[] array, int leftIndex, int rightIndex) {
        //usando lomuto, o pivot vai ser o primeiro elemento do array
        int pivotIndex = leftIndex;
        int numTrocas = 0;

        for(int i = leftIndex + 1; i < rightIndex; i++) {
            if (array[i] <= array[pivotIndex]) {
                numTrocas++;
                Util.Util.swap(array, i, numTrocas);
            }
        }

        //troca pivot pelo ultimo elemento trocado
        Util.Util.swap(array, pivotIndex, numTrocas);

        return pivotIndex;
    }

    public static void quickSort(int[] array, int leftIndex, int rightIndex) {

        if(leftIndex < rightIndex) {
            int pivotIndex = particionamento(array, leftIndex, rightIndex);
            quickSort(array, leftIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, rightIndex);
        }
    }
}
