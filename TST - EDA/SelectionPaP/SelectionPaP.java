//Escreva um programa que ordena um array de inteiros utilizando o selection sort. Seu programa deve imprimir o status do array a fim de iteração.
//Seu programa irá ler apenas um linha de entrada, que consiste em uma lista de inteiros separados por espaço
//Na saída, imprima o array de entrada a cada fim de iteração. Seu programa deve parar assim que imprimir a sequência ordenada.
//DICA: Use Arrays.toString(array) para imprimir o array.

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

            swap(array, i, indiceMenor);                        //colocamos o menor no primeiro espaço do array
            System.out.println(Arrays.toString(array));
        }
    }
    
    public static void swap(int[] array, int indice1, int indice2) {
        int aux = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = aux;
    }

    public static void main(String[] args) {
        int[] teste = {5, 10, 6, 12, 8, 1, 5, 7};

        selectionSort(teste);

    }
}