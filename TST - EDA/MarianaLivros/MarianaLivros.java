// Você deve implementar um programa que dada uma entrada com os nomes dos livros que estão naquela estante, retorna os estados parciais (estado atual do array após a ordenação de cada elemento) de ordenação seguindo o algoritmo do insertion sort.
//Entrada: A primeira linha tem o nome de todos os n livros da estante separados por virgula. 0 < n < 20.
//saida: Seu programa deve imprimir uma linha para cada estado parcial da aplicação do algoritmo sobre a estante, incluindo o estado inicial e final (estante devidamente organizada). A impressão de cada linha deve ser formatada separando os nomes dos livros por virgula e espaço ", ".
//Restrições: Para comparação de Strings deve ser utilizado o método String#compareTo.

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