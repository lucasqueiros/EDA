//FEITO
import Util.*;
import java.util.Arrays;

/**
 * MarianaLivros
 */
public class MarianaLivros {

    public static void insertionSort(String[] livros) {
        if (livros.length < 0 || livros.length > 20) return;

        for (int i = 1; i < livros.length; i++) {

            int j = i;

            while (j > 0 && livros[j].compareTo(livros[j - 1]) < 0) {

                String aux = livros[j];
                livros[j] = livros[j - 1];
                livros[j - 1] = aux;
                j--;
            }

            System.out.println(Arrays.toString(livros));
        }
    }

    public static void main(String[] args) {
        String[] teste = {"O pequeno principe", "Harry Potter", "Percy Jackson", "Bíblia", "A volta dos que não foram"};

        String[] alfabeto = {"A", "B", "A", "L", "K", "C", "a", "X"};
    
        insertionSort(teste);
        insertionSort(alfabeto);
    }
}