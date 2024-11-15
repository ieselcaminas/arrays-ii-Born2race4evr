package Ejercicios_arrays2;

import java.util.Arrays;

public class Inverso {
    public static String inversion(int[] original){
        int[] inverso = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }
        return Arrays.toString(inverso);
    }

    public static void main(String[] args) {
        int[] numero;

    }
}
