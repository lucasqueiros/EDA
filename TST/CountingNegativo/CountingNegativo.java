import java.util.Arrays;
public class CountingNegativo{

    public static int[] countingNegativo (int[] A) {

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < minValue) minValue = A[i];
            if (A[i] > maxValue) maxValue = A[i];
        }

        //verificação com operador ternario, se minValue for menor que zero, tiramos o modulo, se for >= 0, transformamos em 0
        //isso serve para acrescentar o valor de minValue ao tamanho do array de frequencias
        minValue = minValue < 0 ? -minValue : 0;

        int[] B = new int[maxValue + minValue + 1];

        //array de frequencias
        for (int i = 0; i < A.length; i++) {
            B[A[i] + minValue] += 1;
        }

        //fazendo a cumulativa
        for (int i = 1; i < B.length; i++) {
            B[i] += B[i - 1];
        }

        //agora vamos colocar no array final C

        int[] C = new int[A.length];

        for(int i = C.length-1; i >= 0; i--) {
            C[B[A[i] + minValue]-1] = A[i];
            B[A[i] + minValue] -= 1;
        }

        return C;

    }
    

    public static void main(String[] args) {
        int[] teste1 = {5, 4, 3, 2, 1};
        int[] teste2 = {-5, -3, 3, 4, 2, 3};

        System.out.println(Arrays.toString(countingNegativo(teste1)));
        System.out.println(Arrays.toString(countingNegativo(teste2)));
    }
}
