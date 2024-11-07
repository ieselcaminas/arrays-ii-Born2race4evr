package Ejercicios_arrays2;

public class comunes {

    public static String comunes(int[] num1, int[] num2) {
        String res = "";
        for (int i = 0; i < num1.length; i++) {
            for (int n = 0; n < num2.length; n++) {
                if (num1[i] == num2[n]) {
                    res += num1[i] + " ";
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num1  = {4, 5, 7, 9, 4, 2};
        int[] num2  = {4, 6, 2};
        String res = comunes(num1, num2);
        System.out.println(res);
    }
}
