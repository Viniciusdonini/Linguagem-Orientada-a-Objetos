import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int N = 2;

        int tamanho = arr.length;
        int[] resultado = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            resultado[(i + N) % tamanho] = arr[i];
        }

        System.out.println(Arrays.toString(resultado));
    }
}