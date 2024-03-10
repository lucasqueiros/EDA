//FEITO
import Util.*;
import java.util.Arrays;

/**
 * SelectionPaP
 */
public class SelectionPaP {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {                //primeiro for, para repetir a seleção em todo o array

            int indiceMenor = i;                                //assumimos que o primeiro elemento eh o menor

            for (int j = i + 1; j < array.length; j++) {        //iteramos a partir do segundo elemento, em busca do menor
                if (array[j] < array[indiceMenor])
                    indiceMenor = j;
            }

            Util.swap(array, i, indiceMenor);                        //colocamos o menor no primeiro espaço do array
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] teste = {5, 10, 6, 12, 8, 1, 5, 7};

        selectionSort(teste);

    }
}