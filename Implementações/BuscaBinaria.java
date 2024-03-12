public class BuscaBinaria {
    
    //podemos fazer uma variação com um metodo int que retorne o indice do elemento encontrado e -1 se não estiver no array

    public static boolean buscaBinaria(int[] array, int valor, int leftIndex, int rightIndex) {
        int middle = (rightIndex - leftIndex) / 2;
        if (valor == array[middle]) return true;

        if (valor > array[middle]) buscaBinaria(array, valor, middle + 1, rightIndex);
        else buscaBinaria(array, valor, leftIndex, middle - 1);

        return false;
    }
}
