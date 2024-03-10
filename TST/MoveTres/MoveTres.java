import Util.*;

public class MoveTres {
    
    public static void moveTres(int[] array) {

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1]) {

                int j = i;
                int numeros = 0;

                if (numeros < 3) {
                    while (j > 0 && array[j] < array[j - 1]) {
                        Util.swap(array, j, j - 1);
                    }
                    numeros++;
                } 
            }
        }
    }

    public static void main(String[] args) {
        int[] teste1 = {1, 2, 4, 90, 99, 101, 7, 14, 21};

        moveTres(teste1);
    }
}
