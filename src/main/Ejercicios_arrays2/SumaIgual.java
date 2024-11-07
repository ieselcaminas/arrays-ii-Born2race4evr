package Ejercicios_arrays2;

public class SumaIgual {

    public static String sumaIgual (int[] numeros, int igual){
        String res = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == igual) {
                    res += "[" + numeros[i] + " + " + numeros[j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 5, 7, 9, 4, 2};
        int igual = 10;
        String res = "";

        System.out.println(res);

    }
}




