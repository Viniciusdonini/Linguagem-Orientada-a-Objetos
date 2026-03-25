import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];

        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : numeros) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
    }
}
