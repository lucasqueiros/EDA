package TST.LomutoUltimo;

import java.util.Arrays;

public class LomutoUltimo {
    //usaremos a mesma estratégia de lomuto, porem pegando o ultimo elemento

    public static void lomutoUltimo (int[] array) {

        int pivotIndex = array.length -1;
        // int numTrocas = 0;
        int numTrocas = pivotIndex;

        for (int i = pivotIndex -1; i >= 0; i--) {
            if (array[i] > array[pivotIndex]) {
                // numTrocas ++;
                // swap(array, i, pivotIndex - numTrocas);
                numTrocas--;
                swap(array, i, numTrocas);
                System.out.println(Arrays.toString(array));
            }
        }

        swap(array, pivotIndex, numTrocas);

        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int indice1, int indice2) {
        int aux = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = aux;
    }

    public static void main(String[] args) {
        int[] teste1 = {9, 5, 1, 8, 2, 6};
        int[] teste2 = {9, -1, 2, 3, 7, 11, -3};

        lomutoUltimo(teste1);
        lomutoUltimo(teste2);
    }

}
