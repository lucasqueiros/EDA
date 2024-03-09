/**
 * QuickSort
 */
public class QuickSort {

    //metodo que vai deixar o pivot na posição correta e retorna-lo
    public static int particiona(int[] array, int leftIndex, int rightIndex) {
        //começamos escolhendo o pivot como o primeiro elemento do array
        //int pivotIndex = leftIndex;

        //uma alternativa melhor é escolher um pivot aleatorio e colocar ele na primeira posição e seguimos o código normalmente.
        int range = rightIndex - leftIndex + 1;
        int rand_pivotIndex = (int) (Math.random() * range) + left;
        swap(array, leftIndex, rand_pivotIndex);

        int pivotIndex = leftIndex;
        //setamos tambem o numero de trocas que serão feitas para facilitar
        int numTrocas = leftIndex;

        //iteramos a partir do segundo elemento, procurando termos menores que o pivot
        for (int i = 1; i < rightIndex; i++) {
            //ao encontrarmos, iremos trocar o elemento para a posição pivotIndex + numTrocas, isso coloca o elemento a frente do pivot
            if (array[i] < array[pivotIndex]) {
                numTrocas++;
                swap(array, pivotIndex + numTrocas, i);
            }
        }
        //no final trocamos o pivot com o ultimo elemento menor que ele
        swap(array, pivotIndex, numTrocas);

        return numTrocas;
    }

    //enquanto nao obedecer a condição de parada, chama recursivamente a esquerda e a direita do pivot
    public static void quickSort(int[] array, int leftIndex, int rightIndex) {
        //condição de parada, quando left == right para de chamar recursivamente
        if (leftIndex < rightIndex) {
            //pivot recebe o particiona, que deixou o pivot no indice correto
            int pivotIndex = particiona(array, leftIndex, rightIndex);
            //chamada recursiva a esquerda e a direita do array
            quickSort(array, leftIndex, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, rightIndex);
        }
    }

}