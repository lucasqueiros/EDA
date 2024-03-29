//FEITO
// algoritmo retirado do video https://www.youtube.com/watch?v=uwV80JaZrPs
import java.util.Arrays;

/**
 * InsertionRecursivo
 */
public class InsertionRecursivo {

    public static void insertionRecursivo(int[] array) {
       insertionRecursivo(array, array.length); 
    }
    
    private static void insertionRecursivo(int[] array, int n) {
        if (n <= 1) return;                             //caso base: array de tamanho 1, já está ordenado

        insertionRecursivo(array, n - 1);               //chamada recursiva para n - 1;

        int key = array[n - 1];                         //key recebe o novo "ultimo elemento"
        int j = n - 2;                                  //j vai ser comparado com key;

        while (j >= 0 && array[j] > key) {              //troca enquanto array[j] < key
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key;                             //atualiza key;
        System.out.println(Arrays.toString(array));     //printa cada etapa do algoritmo
    }

    public static void main(String[] args) {
        int[] teste = {5, 1, 6, 10, 7, 3, 2, 0};
        int[] teste2 = {5, 0, 6, 2};
        int[] teste3 = {4, 3, 2, 1};

        insertionRecursivo(teste);
        insertionRecursivo(teste2);
        insertionRecursivo(teste3);
    }
}