package Ejercicios_arrays2;
import java.util.Arrays;


public class Iguales {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] clone = original.clone();

        boolean igual = Arrays.equals(original, clone);
        if (igual) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }
}
