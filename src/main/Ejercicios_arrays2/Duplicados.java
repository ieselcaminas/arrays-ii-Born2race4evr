package Ejercicios_arrays2;

public class Duplicados {

    public static String duplicados(int[] num1, int[] num2) {
        String res = "";
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num2[0]) {
                res += num1[i] + " ";
                break;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num1 = {4, 5, 7, 9, 4, 2};
        String res = duplicados(num1, num1);
        System.out.println(res);
    }
}
