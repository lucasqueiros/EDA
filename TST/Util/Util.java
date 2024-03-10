package Util;

public class Util {
    
    public static void swap(int[] array, int indice1, int indice2) {
        int aux = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = aux;
    }
}
