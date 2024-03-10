/**
 * CountingSort
 */
public class CountingSort {

    public static int[] countingSort(int[] array, int k) {

        int[] C = new int[k];
        
        //frequencia
        for (int i = 0; i < array.length; i++) {
            C[array[i] - 1] += 1;
        }

        //cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }

        int[] B = new int[array.length];

        for (int i = array.length; i >= 0; i--) {
            B[C[array[i] - 1] - 1] = array[i];
            C[array[i] - 1] -= 1;
        }

        return B;
    }
}