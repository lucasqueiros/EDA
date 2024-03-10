import Util.*;

public class TopN {
    
    public static void topN(int[] array, int n) {

        for(int j = 0; j <= n - 1; j++) {

            int maiorIndex = j;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[maiorIndex]) {
                    maiorIndex = i;
                }
               Util.swap(array, maiorIndex, j);
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(array[i]);

            if (i < n - 1) System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] teste1 = {9, 3, 1, 7, 34, 22, 101, 7, 300, 1, 45};
        int[] teste2 = {9, 3, 1, 7, 34, 22, 101, 7, 300, 1, 45};

        topN(teste1, 3);
        topN(teste2, 4);
    }
}
