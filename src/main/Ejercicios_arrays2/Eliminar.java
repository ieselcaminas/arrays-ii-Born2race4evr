package Ejercicios_arrays2;
import java.util.Arrays;
public class Eliminar {

    public static int[] eliminar(int[] numeros, int posicion) {
        int aux  = numeros[posicion];
        for (int i = posicion; i < numeros.length-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = aux;
        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 4, 5, 2, 7};
        int posicion = 2; //1, 4, 2, 7, 5

        System.out.println(Arrays.toString(eliminar(numeros, posicion)));

    }
}