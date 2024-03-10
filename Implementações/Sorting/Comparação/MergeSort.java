public class MergeSort {
 
    public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        //definindo o meio do array, para poder dividir
        int middleIndex = (rightIndex - leftIndex) / 2;

        //caso base
        if (array.length == 1) 
            return;
        else {
            //DIVIDIR
            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            //CONQUISTAR
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    public static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        //criando um array auxiliar e copiando os valores para ele
        int[] helper = new int[array.length];
        for (int i = leftIndex; i < rightIndex; i++) {
            helper[i] = array[i];
        }

        //criando os indices
        int i = leftIndex;
        int j = middleIndex + 1;
        int k = leftIndex;

        //laço para comparar enquanto os dois arrays ainda tiver elementos
        while( i<= middleIndex && j <= rightIndex) {
            //compara para ver qual é menor
            if(helper[i] < helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        //se a parte final do array acabar antes da inicial, colocamos o restante da parte inicial no array final
        while (i <= middleIndex) {
            array[k] = helper[i];
            i++;
            k++;
        }

        //não precisamos nos preocupar do contrario, pois a parte final já está na posição certa
    }

    /**implementação com listas (feita por Adalberto)
    public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();

        while (left.size() > 0 && right.size() > 0) {
            if (left.getFirst() < right.getFirst()) {
                result.add(left.removeFirst());
            } else {
                result.add(right.removeFirst());
            }
        }

        if (left.size() > 0) result.addAll(left);
        if (right.size() > 0) result.addAll(right);
        return result;
    }/* */

}
