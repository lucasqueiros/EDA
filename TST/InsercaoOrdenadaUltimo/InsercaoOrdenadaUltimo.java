import java.util.Arrays;

import Util.*;

public class InsercaoOrdenadaUltimo {
    
    public static void insercaoOrdenadaUltimo(String texto) {

        int[]array = Util.trataTexto(texto);

        int ultimoIndex = array.length - 1;
        while (ultimoIndex > 0 && array[ultimoIndex] < array[ultimoIndex - 1]) {
            Util.swap(array, ultimoIndex, ultimoIndex - 1);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        teste1 = "2 6 9 11 13 5";
        teste2 = "1 2 3 4";

        insercaoOrdenadaUltimo(teste1);
        insercaoOrdenadaUltimo(teste2);
    }
}
