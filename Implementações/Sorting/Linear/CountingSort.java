/**
 * CountingSort
 */
public class CountingSort {

    public static int[] countingSort(int[] A, int k) {

        //criamos um array de inteiros de tamanho k
        int[] C = new int[k];
        

        //somaremos 1 no array C, para cada ocorrencia do elemento n no indice n - 1 
        for (int i = 0; i < A.length; i++) {
            C[A[i] - 1] += 1;
        }

        //no proprio array C, calculamos a cumulativa pois nosso intuito não é saber a frequencia
        //e sim saber a quantidade de elementos que são <= a um determinado elemento
        for (int i = 1; i < C.length; i++) {
            //o for começa em 1, pois a cumulativa do indice 0 eh ele mesmo

            //fazemos a cumulatiava somando C[i] com seu anterior C[i - 1]
            C[i] += C[i - 1];
        }

        //agora vamos registrar os elementos de A em B de forma ordenada
        //criamos um array B de tamanho A.length
        int[] B = new int[A.length];

        //vamos ordenar de tras pra frente com o intuito de manter a estabilidade
        for (int i = A.length - 1; i >= 0; i--) {
            //o valor de A[i] - 1 eu vou olhar no array C, isso - 1 vai me dar a posicao que eu preciso encaixar em B
            B[   C[    A[i]   - 1] - 1] = A[i];
            //e depois eu preciso decrementar essa posicao em C
            C[A[i] - 1] -= 1;
        }

        return B;
    }

    /** exemplo:
        Seja o array 
        A = [3, 2, 4, 7, 4, 7, 1, 2, 3]
        construimos o array C, calculamos a frequencia e a cumulativa
        C = [1, 3, 5, 7, 7, 9]
        após isso vamos ordenar de forma decrescente em B, a linha B[C[A[i] - 1] - 1] fala que se pegarmos o ultimo elemento de A, no caso o 3
        subtraindo 1 obtemos a posição dele em C, no caso C[2] = 5, agora colocamos o 3 na posiçao B [5 - 1]
        Após isso, precisamos decrementar C na posição A[i] - 1, para caso houver outra ocorrencia ele ficar na posição certa
        B = [0, 0, 0, 0, 3, 0 ,0 ,0 ,0]     fazendo a mesma coisa para o 2. 
                                            2 - 1 = 1 -> na posição C[1] temos 3, 3 - 1 = 2. guardaremos o 2 na posição b[2] e decrementamos C[A[i] - 1]                                    
        B = [0, 0, 2, 0, 3, 0 ,0 ,0 ,0]     fazendo para o resto do array, ficamos com
        B = [1, 2, 2, 3, 3, 4, 4, 7, 7]     que foi ordenado mantendo a estabilidade


    */
}