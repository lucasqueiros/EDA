package MoveN;

import Util.*;
import java.util.Arrays;


public class MoveN {


    public static void moveN (int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            if (i > 1) {
                if (array[i] < array[i - 1]) {
                    int aux = i;
                    while(aux >= 0 && array[aux] < array[aux - 1]) {
                        Util.swap(array, aux, aux - 1);
                        aux--;
                        System.out.println(Arrays.toString(array));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] teste = {1, 2, 4, 90, 99, 101, 7, 14, 21};

        moveN(teste);
    }
}
