import Util.*;

public class DownN {
    
    public static void downN(int[] array, int n) {

        for (int i = 0; i < n; i++) {
            int menorIndex = i;

            for (int j = 0; j < n; i++) {
                if (array[j] < array[menorIndex]) {
                    menorIndex = j;
                }
                Util.swap(array,menorIndex, i);
            }
            System.out.print(array[i]);
            if (i < n -1) System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] teste1 = {9, 3, 1, 7, 34, 22, 101, 7, 300, 1, 45};
        int[] teste2 = {9, 3, 1, 7, 34, 22, 101, 7, 300, 1, 45};

        downN(teste1, 3);
        downN(teste2, 4);
    }
}
