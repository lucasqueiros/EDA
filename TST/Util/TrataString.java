import java.util.Arrays;

public class TrataString {

    public static int[] trataString (String texto) {

        String[] textoSplit = texto.split(" ");         //cria um array de strings com o split()
        int[] numeros = new int[textoSplit.length];           //inicializa um array de inteiros de mesmo tamanho

        for (int i = 0; i < textoSplit.length; i++) {         //itera sobre o array de Strings
            numeros[i] = Integer.parseInt(textoSplit[i]);     //converte pra int e coloca no array de inteiros
        }
        return numeros;
    }
    

    public static void main(String[] args) {
        String teste1 = "1 3 4 6 23 6 34 35432";

        System.out.println(Arrays.toString(trataString(teste1)));
        System.out.println(trataString(teste1).getClass());

    }
}
