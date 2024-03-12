public class RadixSort {
    
    public static void radixSort(int[] array, int digitos) {
        for (int i = 1; i <= digitos; i++) {
            estableSort(array, i);
        }
    }

    public static void estableSort(int[] array, int digito) {
        //qualquer algoritmo estavel
    }
}
